package com.wade.mvvmdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.wade.mvvmdemo.databinding.ActivityDataBindingXmlBinding;

public class ActDataBindingXml extends AppCompatActivity {
    ActivityDataBindingXmlBinding binding;
    MyViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding_xml);

        init();
    }

    private void init(){
        viewModel = new ViewModelProvider(this).get(MyViewModel.class);
        binding.setData(viewModel);
        binding.setLifecycleOwner(this);
    }
}
