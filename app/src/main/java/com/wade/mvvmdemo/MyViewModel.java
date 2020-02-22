package com.wade.mvvmdemo;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Created by Wade on 2020/2/14
 */
public class MyViewModel extends ViewModel {
    public int number = 0;

    private MutableLiveData<Integer> liveNumber;

    public MutableLiveData<Integer> getLiveNumber() {
        if(liveNumber == null){
            liveNumber = new MutableLiveData<>();
            liveNumber.setValue(0);
        }

        return liveNumber;
    }

    public void setLiveNumber(int n) {
        this.liveNumber.setValue(this.liveNumber.getValue() + n);
    }

    public void add(){
        liveNumber.setValue(liveNumber.getValue() + 1);
    }
}
