package com.vk77492.taggedclone.ui.likes;

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
import com.vk77492.taggedclone.ui.live.LiveViewModel;
import com.vk77492.taggedclone.ui.profileviewers.ProfileViewModel;

public class LikeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LikeViewModel likeViewModel = new ViewModelProvider(this).get(LikeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_like, container, false);
        return root;
    }
}