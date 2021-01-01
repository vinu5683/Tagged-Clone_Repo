package com.vk77492.taggedclone.ui.favorites;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FavoriteViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FavoriteViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}