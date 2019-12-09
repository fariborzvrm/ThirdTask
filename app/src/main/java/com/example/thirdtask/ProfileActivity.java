package com.example.thirdtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Context;
import android.content.Intent;
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

                Intent profileIntent = new Intent(mContext,ProfileForResultActivity.class);

                profileIntent.putExtra("name",name);
                profileIntent.putExtra("family",family);
                profileIntent.putExtra("age",age);
                profileIntent.putExtra("address",address);

                startActivity(profileIntent);



            }
        });

    }


}
