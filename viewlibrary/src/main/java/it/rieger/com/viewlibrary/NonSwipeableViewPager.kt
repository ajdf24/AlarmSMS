package it.rieger.com.viewlibrary

import android.annotation.SuppressLint
import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent

/**
 * Implementation of a {@link ViewPager} which can consume all touch events and disables the swipe function.
 */
class NonSwipeableViewPager: ViewPager {

    var disableSwipe: Boolean = false

    constructor(context: Context):super(context)
    constructor(context: Context, attributeSet: AttributeSet):super(context, attributeSet)

    /**
     * Implementation which consumes all touch events.
     */
    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        if(disableSwipe) {
            return super.onTouchEvent(ev)
        }
        return false
    }

    /**
     * Implementation which consumes all touch events.
     */
    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        if(disableSwipe) {
            return super.onInterceptTouchEvent(ev)
        }
        return false
    }
}