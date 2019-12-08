package com.example.thirdtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class DialerActivity extends AppCompatActivity {

    ImageView imgDial;
    EditText  edtPhoneNumber;
    String phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialer);

        phone=PreferenceManager.getDefaultSharedPreferences(DialerActivity.this).getString("phone","");
        edtPhoneNumber=findViewById(R.id.edtPhoneNumber);
        edtPhoneNumber.setText(phone);
        click();
    }

    public void click(){

        imgDial=findViewById(R.id.imgDial);
        edtPhoneNumber=findViewById(R.id.edtPhoneNumber);

        imgDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String phoneNumber=edtPhoneNumber.getText().toString();

                PreferenceManager.getDefaultSharedPreferences(DialerActivity.this).edit().putString("phone",phoneNumber).apply();


                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",phoneNumber,null));
                startActivity(intent);

            }
        });

    }
}
