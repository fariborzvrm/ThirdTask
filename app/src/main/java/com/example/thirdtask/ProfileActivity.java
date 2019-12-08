package com.example.thirdtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfileActivity extends PublicMethods {

    EditText edtName,edtFamily,edtAge,edtAddress;
    Button   btnSave;

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

                String name= edtName.getText().toString();
                String family = edtFamily.getText().toString();
                String age = edtAge.getText().toString();
                String address = edtAddress.getText().toString();

                myToast(name);



            }
        });

    }


}
