package com.wade.mvvmdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActMain extends AppCompatActivity {
    Button mBtnViewModel,mBtnLiveData,mBtnDataBinding1,mBtnDataBinding2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        mBtnViewModel = findViewById(R.id.mBtnViewModel);
        mBtnLiveData = findViewById(R.id.mBtnLiveData);
        mBtnDataBinding1 = findViewById(R.id.mBtnDataBinding1);
        mBtnDataBinding2 = findViewById(R.id.mBtnDataBinding2);

        mBtnViewModel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActMain.this,ActViewModel.class);
                startActivity(intent);
            }
        });
        mBtnLiveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActMain.this,ActLiveData.class);
                startActivity(intent);
            }
        });
        mBtnDataBinding1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActMain.this,ActDataBinding.class);
                startActivity(intent);
            }
        });
        mBtnDataBinding2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActMain.this,ActDataBindingXml.class);
                startActivity(intent);
            }
        });
    }
}
