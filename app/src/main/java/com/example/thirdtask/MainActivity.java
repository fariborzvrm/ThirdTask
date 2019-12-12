package com.example.thirdtask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener , onItemclicked {

    Button btnDrawer;
    DrawerLayout drawerLayout;
    RecyclerView recycler;
    Context mContext=MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler=findViewById(R.id.recycler);



        drawerMenuButton();

        ArrayList<String> list =new ArrayList<>();
        list.add("Profile");
        list.add("Dial");



        RecyclerAdapter adapter=new RecyclerAdapter(list);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false));

    }

    void drawerMenuButton(){

        btnDrawer=findViewById(R.id.open_drawer_menu);
        btnDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drawerLayout=findViewById(R.id.drawer_layout);
                if (!drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.openDrawer(GravityCompat.START);
                } else {
                    drawerLayout.closeDrawer(GravityCompat.END);
                }

            }
        });
    }


    @Override
    public void onClick(View view) {

    }

    @Override
    public void onItemClick(int position) {
        switch (position){
            case 0:
                Intent profileActivity = new Intent(mContext,ProfileActivity.class);
                startActivity(profileActivity);

            case 1:
                Intent dialActivity = new Intent(mContext,DialerActivity.class);
                startActivity(dialActivity);

        }
    }
}
