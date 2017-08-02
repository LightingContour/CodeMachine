package com.lightingcontour.codemechine;

import android.animation.ObjectAnimator;
import android.widget.Button;

/**
 * Created by lich6389 on 2017/7/25.
 */

/*
* 各种动画集合Class.
* */
public class AnimatorClass {
    //按钮点击动画.
    public final void buttonclickAnimator(Button button)
    {
        ObjectAnimator animatorX = ObjectAnimator.ofFloat(button,"scaleX",1f,1.1f,1f);
        ObjectAnimator animatorY = ObjectAnimator.ofFloat(button,"scaleY",1f,1.1f,1f);
        animatorX.setDuration(500);
        animatorX.start();
        animatorY.setDuration(500);
        animatorY.start();
    }
}
