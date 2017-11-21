package com.androiddev.mvppeershape.service;

import android.util.Log;


public class Helper {

    public boolean value = true;


    public boolean setType(boolean type){
        value=type;

        Log.d("Siddi0",Boolean.toString(value));

        return value;
    }

    public boolean setType2(){

        Log.d("Siddi1",Boolean.toString(value));

        return value;
    }

    public String getValue() {

        if (value == true) {
            return "ABC";
        } else {
            return "DEF";
        }

    }

}
