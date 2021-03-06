// Generated by data binding compiler. Do not edit!
package ca.scooter.talkufy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import ca.scooter.talkufy.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SentAudioPlaceholderItemBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout bubble;

  @NonNull
  public final TextView dateTextView;

  @NonNull
  public final ProgressBar progressbar;

  @NonNull
  public final ProgressBar uploadProgressBar;

  @Bindable
  protected Integer mPosition;

  protected SentAudioPlaceholderItemBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ConstraintLayout bubble, TextView dateTextView, ProgressBar progressbar,
      ProgressBar uploadProgressBar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bubble = bubble;
    this.dateTextView = dateTextView;
    this.progressbar = progressbar;
    this.uploadProgressBar = uploadProgressBar;
  }

  public abstract void setPosition(@Nullable Integer position);

  @Nullable
  public Integer getPosition() {
    return mPosition;
  }

  @NonNull
  public static SentAudioPlaceholderItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.sent_audio_placeholder_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SentAudioPlaceholderItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SentAudioPlaceholderItemBinding>inflateInternal(inflater, R.layout.sent_audio_placeholder_item, root, attachToRoot, component);
  }

  @NonNull
  public static SentAudioPlaceholderItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.sent_audio_placeholder_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SentAudioPlaceholderItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SentAudioPlaceholderItemBinding>inflateInternal(inflater, R.layout.sent_audio_placeholder_item, null, false, component);
  }

  public static SentAudioPlaceholderItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static SentAudioPlaceholderItemBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (SentAudioPlaceholderItemBinding)bind(component, view, R.layout.sent_audio_placeholder_item);
  }
}
