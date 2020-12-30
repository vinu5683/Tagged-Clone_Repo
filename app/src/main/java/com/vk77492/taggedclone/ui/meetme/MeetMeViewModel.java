package com.vk77492.taggedclone.ui.meetme;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MeetMeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MeetMeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Meet Me fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}