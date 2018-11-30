package stag.support.lottie.model.content;


import android.support.annotation.Nullable;

import stag.support.lottie.LottieDrawable;
import stag.support.lottie.animation.content.Content;
import stag.support.lottie.model.layer.BaseLayer;

public interface ContentModel {
  @Nullable Content toContent(LottieDrawable drawable, BaseLayer layer);
}
