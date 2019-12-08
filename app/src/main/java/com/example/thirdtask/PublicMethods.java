package com.example.thirdtask;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

public class PublicMethods extends AppCompatActivity {

    Context mContext=this;


    public void preferenceManager(String key, String value, String defValue){

        PreferenceManager.getDefaultSharedPreferences(mContext).getString(key,defValue);
        PreferenceManager.getDefaultSharedPreferences(mContext).edit().putString(key,value).apply();


    }

    public void preferenceManagerGet(String key,String defValue){

        PreferenceManager.getDefaultSharedPreferences(mContext).getString(key,defValue);



    }

    public void myToast (String msg){

        Toast.makeText(mContext,msg,Toast.LENGTH_SHORT).show();


    }


}
