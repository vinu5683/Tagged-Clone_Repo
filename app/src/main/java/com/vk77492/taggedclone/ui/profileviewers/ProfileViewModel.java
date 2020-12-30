package com.vk77492.taggedclone.ui.profileviewers;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProfileViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ProfileViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Profile Viewers fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}