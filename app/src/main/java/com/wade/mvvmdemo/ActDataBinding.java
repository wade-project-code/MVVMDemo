package com.wade.mvvmdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.database.DatabaseUtils;
import android.os.Bundle;
import android.view.View;

import com.wade.mvvmdemo.databinding.ActivityDataBindingBinding;

public class ActDataBinding extends AppCompatActivity {
    ActivityDataBindingBinding binding;
    MyViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding);

        init();
    }

    private void init(){
        viewModel = new ViewModelProvider(this).get(MyViewModel.class);
        viewModel.getLiveNumber().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                binding.mTextView.setText(String.valueOf(integer));
            }
        });

        binding.mBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.add();
            }
        });
    }
}
