package com.instagram_clone.mtavarez.instagramclone

import android.content.Context
import android.content.Intent
import android.support.design.widget.BottomNavigationView
import android.util.Log
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx

/**
 * Created by mtavarez on 9/16/17.
 */

object BottomNavigationUtils {

    var TAG = "BottomNavigationViewUtils"

    fun setUpBottomNavigationView(context: Context, bottomNavigationViewEx: BottomNavigationViewEx) {
        Log.d(TAG, "Setup in Utils Class")
        bottomNavigationViewEx.enableAnimation(false)
        bottomNavigationViewEx.enableItemShiftingMode(false)
        bottomNavigationViewEx.enableShiftingMode(false)
        bottomNavigationViewEx.setTextVisibility(false)
        BottomNavigationUtils.setUpBottomNavigationView(context, bottomNavigationViewEx)
    }
}