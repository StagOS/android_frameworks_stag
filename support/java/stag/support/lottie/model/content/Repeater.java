package stag.support.lottie.model.content;

import android.support.annotation.Nullable;

import stag.support.lottie.LottieDrawable;
import stag.support.lottie.animation.content.Content;
import stag.support.lottie.animation.content.RepeaterContent;
import stag.support.lottie.model.animatable.AnimatableFloatValue;
import stag.support.lottie.model.animatable.AnimatableTransform;
import stag.support.lottie.model.layer.BaseLayer;

public class Repeater implements ContentModel {
  private final String name;
  private final AnimatableFloatValue copies;
  private final AnimatableFloatValue offset;
  private final AnimatableTransform transform;

  public Repeater(String name, AnimatableFloatValue copies, AnimatableFloatValue offset,
      AnimatableTransform transform) {
    this.name = name;
    this.copies = copies;
    this.offset = offset;
    this.transform = transform;
  }

  public String getName() {
    return name;
  }

  public AnimatableFloatValue getCopies() {
    return copies;
  }

  public AnimatableFloatValue getOffset() {
    return offset;
  }

  public AnimatableTransform getTransform() {
    return transform;
  }

  @Nullable @Override public Content toContent(LottieDrawable drawable, BaseLayer layer) {
    return new RepeaterContent(drawable, layer, this);
  }
}
