package stag.support.lottie.model.animatable;

import android.graphics.Path;

import stag.support.lottie.value.Keyframe;
import stag.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import stag.support.lottie.animation.keyframe.ShapeKeyframeAnimation;
import stag.support.lottie.model.content.ShapeData;

import java.util.List;

public class AnimatableShapeValue extends BaseAnimatableValue<ShapeData, Path> {

  public AnimatableShapeValue(List<Keyframe<ShapeData>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<ShapeData, Path> createAnimation() {
    return new ShapeKeyframeAnimation(keyframes);
  }
}
