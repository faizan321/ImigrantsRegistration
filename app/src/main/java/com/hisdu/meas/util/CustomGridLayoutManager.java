package com.hisdu.meas.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.recyclerview.widget.GridLayoutManager;

public class CustomGridLayoutManager extends GridLayoutManager {

    public CustomGridLayoutManager(Context context, AttributeSet attrs, int defStyleAttr,
                                   int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public CustomGridLayoutManager(Context context, int spanCount) {
        super(context, spanCount);
    }

    public CustomGridLayoutManager(Context context, int spanCount, int orientation,
                                   boolean reverseLayout) {
        super(context, spanCount, orientation, reverseLayout);
    }

    @Override
    public View onInterceptFocusSearch(View focused, int direction) {
        int pos = getPosition(focused);
        int count = getItemCount();
        int orientation = getOrientation();


        if (direction == View.FOCUS_DOWN) {
//            View view = getChildAt(getChildCount() - 1);
//            if (view == focused) {
//                return focused;
//            }
            if(pos==count){
                return focused;
            }
        } else if (direction == View.FOCUS_UP) {
//            View view = getChildAt(0);
//            if (view == focused) {
//                return focused;
//            }
            if(pos==count){
                return focused;
            }
        }

        return super.onInterceptFocusSearch(focused, direction);
    }
}