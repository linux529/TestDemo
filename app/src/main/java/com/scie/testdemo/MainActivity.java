package com.scie.testdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.scie.testdemo.recyclerview.sample.TestAdapter;
import com.scie.testdemo.recyclerview.sample.TestHolderAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private TestAdapter mAdapter;
    private TestHolderAdapter mTestAdapter;
    private List<String> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_test);
        mDatas = getDatas();
        mAdapter = new TestAdapter(mDatas);
        mTestAdapter = new TestHolderAdapter(mDatas);
        mRecyclerView.setAdapter(mTestAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<String> getDatas(){
        List<String> datas = new ArrayList<>();
        for(int i = 0;i<30;i++){
            datas.add(i + "");
        }
        return datas;
    }
}
