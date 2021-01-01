package com.vk77492.taggedclone.ui.friends;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FriendsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FriendsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is browse fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}