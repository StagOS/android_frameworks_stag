package stag.support.lottie.model.content;

import android.graphics.PointF;

import stag.support.lottie.LottieDrawable;
import stag.support.lottie.animation.content.Content;
import stag.support.lottie.animation.content.RectangleContent;
import stag.support.lottie.model.animatable.AnimatableFloatValue;
import stag.support.lottie.model.animatable.AnimatablePointValue;
import stag.support.lottie.model.animatable.AnimatableValue;
import stag.support.lottie.model.layer.BaseLayer;

public class RectangleShape implements ContentModel {
  private final String name;
  private final AnimatableValue<PointF, PointF> position;
  private final AnimatablePointValue size;
  private final AnimatableFloatValue cornerRadius;

  public RectangleShape(String name, AnimatableValue<PointF, PointF> position,
      AnimatablePointValue size, AnimatableFloatValue cornerRadius) {
    this.name = name;
    this.position = position;
    this.size = size;
    this.cornerRadius = cornerRadius;
  }

  public String getName() {
    return name;
  }

  public AnimatableFloatValue getCornerRadius() {
    return cornerRadius;
  }

  public AnimatablePointValue getSize() {
    return size;
  }

  public AnimatableValue<PointF, PointF> getPosition() {
    return position;
  }

  @Override public Content toContent(LottieDrawable drawable, BaseLayer layer) {
    return new RectangleContent(drawable, layer, this);
  }

  @Override public String toString() {
    return "RectangleShape{position=" + position +
        ", size=" + size +
        '}';
  }
}
