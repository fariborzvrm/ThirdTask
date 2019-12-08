package com.example.thirdtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfileActivity extends PublicMethods {

    EditText edtName,edtFamily,edtAge,edtAddress;
    Button   btnSave;
    String   name,family,age,address;
    Context mContext=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        name=   PreferenceManager.getDefaultSharedPreferences(mContext).getString("edtName","");
        edtName=findViewById(R.id.edtName);
        edtName.setText(name);

        family= PreferenceManager.getDefaultSharedPreferences(mContext).getString("edtFamily","");
        edtFamily=findViewById(R.id.edtFamily);
        edtFamily.setText(family);

        age=    PreferenceManager.getDefaultSharedPreferences(mContext).getString("edtAge","");
        edtAge=findViewById(R.id.edtAge);
        edtAge.setText(age);

        address=PreferenceManager.getDefaultSharedPreferences(mContext).getString("edtAddress","");
        edtAddress=findViewById(R.id.edtAddress);
        edtAddress.setText(address);


        save();
    }



    void save(){

        btnSave=findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               edtName=findViewById(R.id.edtName);
               edtFamily=findViewById(R.id.edtFamily);
                edtAge=findViewById(R.id.edtAge);
                edtAddress=findViewById(R.id.edtAddress);

                name= edtName.getText().toString();
                 family = edtFamily.getText().toString();
                 age = edtAge.getText().toString();
                 address = edtAddress.getText().toString();

                 PreferenceManager.getDefaultSharedPreferences(mContext).edit().putString("name",name).apply();
                PreferenceManager.getDefaultSharedPreferences(mContext).edit().putString("family",family).apply();
                PreferenceManager.getDefaultSharedPreferences(mContext).edit().putString("age",age).apply();
                PreferenceManager.getDefaultSharedPreferences(mContext).edit().putString("address",address).apply();




                myToast(name);



            }
        });

    }


}
