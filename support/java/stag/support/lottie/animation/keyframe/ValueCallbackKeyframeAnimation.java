package stag.support.lottie.animation.keyframe;

import stag.support.lottie.value.Keyframe;
import stag.support.lottie.value.LottieFrameInfo;
import stag.support.lottie.value.LottieValueCallback;

import java.util.Collections;

public class ValueCallbackKeyframeAnimation<K, A> extends BaseKeyframeAnimation<K, A> {
  private final LottieFrameInfo<A> frameInfo = new LottieFrameInfo<>();

  public ValueCallbackKeyframeAnimation(LottieValueCallback<A> valueCallback) {
    super(Collections.<Keyframe<K>>emptyList());
    setValueCallback(valueCallback);
  }

  /**
   * If this doesn't return 1, then {@link #setProgress(float)} will always clamp the progress
   * to 0.
   */
  @Override float getEndProgress() {
    return 1f;
  }

  @Override public void notifyListeners() {
    if (this.valueCallback != null) {
      super.notifyListeners();
    }
  }

  @Override public A getValue() {
    //noinspection ConstantConditions
    return valueCallback.getValueInternal(
        0f, 0f, null, null, getProgress(), getProgress(), getProgress());
  }

  @Override A getValue(Keyframe<K> keyframe, float keyframeProgress) {
    return getValue();
  }
}
