package com.example.thirdtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileForResultActivity extends PublicMethods {

    TextView txtName,txtFamily,txtAge,txtAddress;
    String   name,family,age,address;
    Button   btnEdit,btnOk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_for_result);

        txtName = findViewById(R.id.txtName);
        txtFamily = findViewById(R.id.txtFamily);
        txtAge = findViewById(R.id.txtAge);
        txtAddress = findViewById(R.id.txtAddress);

        name = getIntent().getStringExtra("name");
        family = getIntent().getStringExtra("family");
        age = getIntent().getStringExtra("age");
        address = getIntent().getStringExtra("address");

        txtName.setText(name);
        txtFamily.setText(family);
        txtAge.setText(age);
        txtAddress.setText(address);

        btnOk=findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myToast("Your information has been saved");
            }
        });

        btnEdit = findViewById(R.id.btnEdit);
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent editIntent = new Intent(ProfileForResultActivity.this,ProfileActivity.class);
                startActivity(editIntent);
                finish();

            }
        });

    }





}
