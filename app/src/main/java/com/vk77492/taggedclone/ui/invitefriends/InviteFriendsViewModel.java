package com.vk77492.taggedclone.ui.invitefriends;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InviteFriendsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InviteFriendsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is browse fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}