package com.rexthonyy.testproject.helpers;

import android.content.Context;
import android.content.res.TypedArray;
import android.widget.Toast;

public class Utils {
    public static void toast(Context context, int stringResId){
        Toast.makeText(context, stringResId, Toast.LENGTH_SHORT).show();
    }

    public static int getResId(Context context, int attrResId){
        int[] attrs = new int[]{attrResId};
        TypedArray typedArray = context.obtainStyledAttributes(attrs);
        int resId = typedArray.getResourceId(0, 0);
        typedArray.recycle();
        return resId;
    }
}
