package com.tuki.android_btvn9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.tuki.android_btvn9.Model.WallPaper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    RecyclerViewAdapter mRecyclerViewAdapter;
    ArrayList<WallPaper> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.crvView);
        data = new ArrayList<WallPaper>();
        initData();

        mRecyclerViewAdapter = new RecyclerViewAdapter(data);
        GridLayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 2);

        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mRecyclerViewAdapter);
    }

    private void initData() {
        data.add(new WallPaper(R.drawable.january, "January" ));
        data.add(new WallPaper(R.drawable.february, "February"));
        data.add(new WallPaper(R.drawable.march, "March"));
        data.add(new WallPaper(R.drawable.april, "April"));
        data.add(new WallPaper(R.drawable.may, "May"));
        data.add(new WallPaper(R.drawable.june, "June"));
        data.add(new WallPaper(R.drawable.july, "July"));
        data.add(new WallPaper(R.drawable.august, "August"));
        data.add(new WallPaper(R.drawable.september, "September"));
        data.add(new WallPaper(R.drawable.october, "October"));
        data.add(new WallPaper(R.drawable.november, "November"));
        data.add(new WallPaper(R.drawable.december, "December"));
    }
    }
