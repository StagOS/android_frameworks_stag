package stag.support.lottie.model.animatable;

import stag.support.lottie.value.Keyframe;
import stag.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import stag.support.lottie.animation.keyframe.GradientColorKeyframeAnimation;
import stag.support.lottie.model.content.GradientColor;

import java.util.List;

public class AnimatableGradientColorValue extends BaseAnimatableValue<GradientColor,
    GradientColor> {
  public AnimatableGradientColorValue(
      List<Keyframe<GradientColor>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<GradientColor, GradientColor> createAnimation() {
    return new GradientColorKeyframeAnimation(keyframes);
  }
}
