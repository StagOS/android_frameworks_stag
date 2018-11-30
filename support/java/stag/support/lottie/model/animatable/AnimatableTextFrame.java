package stag.support.lottie.model.animatable;

import stag.support.lottie.value.Keyframe;
import stag.support.lottie.animation.keyframe.TextKeyframeAnimation;
import stag.support.lottie.model.DocumentData;

import java.util.List;

public class AnimatableTextFrame extends BaseAnimatableValue<DocumentData, DocumentData> {

  public AnimatableTextFrame(List<Keyframe<DocumentData>> keyframes) {
    super(keyframes);
  }

  @Override public TextKeyframeAnimation createAnimation() {
    return new TextKeyframeAnimation(keyframes);
  }
}
