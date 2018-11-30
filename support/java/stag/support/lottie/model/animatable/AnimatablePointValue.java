package stag.support.lottie.model.animatable;

import android.graphics.PointF;

import stag.support.lottie.value.Keyframe;
import stag.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import stag.support.lottie.animation.keyframe.PointKeyframeAnimation;

import java.util.List;

public class AnimatablePointValue extends BaseAnimatableValue<PointF, PointF> {
  public AnimatablePointValue(List<Keyframe<PointF>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<PointF, PointF> createAnimation() {
    return new PointKeyframeAnimation(keyframes);
  }
}
