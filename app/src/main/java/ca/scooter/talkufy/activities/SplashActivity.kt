package ca.scooter.talkufy.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ca.scooter.talkufy.R
import ca.scooter.talkufy.utils.FirebaseUtils
import com.vungle.warren.*
import com.vungle.warren.error.VungleException

class SplashActivity : AppCompatActivity() {


    lateinit var showInterstitialBtn: Button
    lateinit var showBannerBtn: Button
    lateinit var bannerAdContainer: ViewGroup
     var vungleBanner: VungleBanner? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        showInterstitialBtn = findViewById(R.id.showInterstitialBtn)
        showBannerBtn = findViewById(R.id.showBannerBtn)
        bannerAdContainer = findViewById<View>(R.id.bannerAdContainer) as LinearLayout
        Vungle.init("62100352dc45844bb7201a01", applicationContext, object : InitCallback {
            override fun onSuccess() {
                Toast.makeText(this@SplashActivity, "Vungle SDK initialized successfully", Toast.LENGTH_SHORT).show()
            }

            override fun onError(exception: VungleException) {
                Toast.makeText(this@SplashActivity, exception.localizedMessage, Toast.LENGTH_SHORT).show()
            }

            override fun onAutoCacheAdAvailable(placementId: String) {}
        })
        showInterstitialBtn.setOnClickListener(View.OnClickListener {
            Vungle.loadAd("INTERSTITIAL-0691395", object : LoadAdCallback {
                override fun onAdLoad(id: String) {
                    if (Vungle.canPlayAd("INTERSTITIAL-0691395")) {
                        Vungle.playAd("INTERSTITIAL-0691395", null, null)
                    }
                }

                override fun onError(id: String, exception: VungleException) {
                    Toast.makeText(this@SplashActivity, exception.toString(), Toast.LENGTH_SHORT).show()
                }
            })
        })
        showBannerBtn.setOnClickListener(View.OnClickListener {
            Banners.loadBanner("BANNER-0956739", AdConfig.AdSize.BANNER, object : LoadAdCallback {
                override fun onAdLoad(id: String) {
                    if (Banners.canPlayAd("BANNER-0956739", AdConfig.AdSize.BANNER)) {
                        vungleBanner = Banners.getBanner("BANNER-0956739", AdConfig.AdSize.BANNER, null)!!
                        bannerAdContainer!!.removeAllViews()
                        bannerAdContainer!!.addView(vungleBanner)
                    }
                }

                override fun onError(id: String, exception: VungleException) {
                    Toast.makeText(this@SplashActivity, exception.toString(), Toast.LENGTH_SHORT).show()
                }
            })
        })
    }

    override fun onDestroy() {
        vungleBanner?.destroyAd()
        super.onDestroy()



        if(FirebaseUtils.isLoggedIn()){
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

    }


    fun onGetStartedClick(v: View){
        startActivity(Intent(this, MobileLoginActivity::class.java))
    }
}