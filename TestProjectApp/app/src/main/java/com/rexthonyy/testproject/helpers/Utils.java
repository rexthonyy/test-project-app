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

public static boolean isInteger(String str){
        if(str == null){
            return false;
        }
        int length = str.length();
        if(length == 0){
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-'){
            if(length == 1){
                return false;
            }
            i = 1;
        }
        for(; i < length; i++){
            char c = str.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }
}
