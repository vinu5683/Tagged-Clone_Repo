package com.vk77492.taggedclone.ui.chat;



import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.vk77492.taggedclone.R;

public class ChatViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ChatViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Chat fragment");

    }

    public LiveData<String> getText() {
        return mText;
    }
}