package com.example.thirdtask;

import android.content.Context;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

public class PublicMethods extends AppCompatActivity {

   public Context mContext=this;


    public void preferenceManager(String key, String value){
        PreferenceManager.getDefaultSharedPreferences(mContext).edit().putString(key,value).apply();


    }

    public String preferenceManagerGet(String key, String defValue,Context context){

        PreferenceManager.getDefaultSharedPreferences(context).getString(key,defValue);


        return defValue;
    }

    public  String getPreference(String pref,String key,String defValue){

        pref=PreferenceManager.getDefaultSharedPreferences(mContext).getString(key,defValue);
        return pref;
    }

    public void myToast (String msg){

        Toast.makeText(mContext,msg,Toast.LENGTH_SHORT).show();


    }


}
