package com.wade.mvvmdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ActLiveData extends AppCompatActivity {
    MyViewModel viewModel;
    TextView mTextView;
    ImageView mImgView1,mImgView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_data);

        init();
    }

    private void init(){
        mTextView = findViewById(R.id.mTextView);
        mImgView1 = findViewById(R.id.mImgView1);
        mImgView2 = findViewById(R.id.mImgView2);
        viewModel = new ViewModelProvider(this).get(MyViewModel.class);
        viewModel.getLiveNumber().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                mTextView.setText(String.valueOf(integer));
            }
        });

        mImgView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.setLiveNumber(1);
            }
        });

        mImgView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.setLiveNumber(-1);
            }
        });
    }
}
