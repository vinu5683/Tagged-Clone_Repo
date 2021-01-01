package com.vk77492.taggedclone.ui.invitefriends;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.vk77492.taggedclone.R;

public class InviteFriendsFragment extends Fragment {

    private InviteFriendsViewModel inviteFriendsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        inviteFriendsViewModel =
                new ViewModelProvider(this).get(InviteFriendsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_invitefriends, container, false);

        return root;
    }
}