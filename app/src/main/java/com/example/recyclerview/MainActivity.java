package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView r1;
    String s1[], s2[];
    int imageResource[] = {R.drawable.cat_icon, R.drawable.dog_icon, R.drawable.cat_icon, R.drawable.dog_icon, R.drawable.cat_icon, R.drawable.dog_icon, R.drawable.cat_icon, R.drawable.dog_icon};

    MyOwnAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        r1 = findViewById(R.id.myRecycler);

        s1 = getResources().getStringArray(R.array.pet_name);
        s2 = getResources().getStringArray(R.array.desc);

        ad = new MyOwnAdapter(this, s1, s2, imageResource);

        r1.setAdapter(ad);
        r1.setLayoutManager(new LinearLayoutManager(this));
    }
}