package com.wade.mvvmdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActViewModel extends AppCompatActivity {
    MyViewModel viewModel;
    TextView mTextView;
    Button mBtn1,mBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_model);

        init();
    }

    private void init(){
        viewModel = new ViewModelProvider(this).get(MyViewModel.class);
        mTextView = findViewById(R.id.mTextView);
        mBtn1 = findViewById(R.id.mBtn1);
        mBtn2 = findViewById(R.id.mBtn2);

        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.number++;
                mTextView.setText(String.valueOf(viewModel.number));
            }
        });

        mBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.number--;
                mTextView.setText(String.valueOf(viewModel.number));
            }
        });
    }
}
