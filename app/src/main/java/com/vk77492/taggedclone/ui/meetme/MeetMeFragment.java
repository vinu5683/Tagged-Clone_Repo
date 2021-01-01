package com.vk77492.taggedclone.ui.meetme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.vk77492.taggedclone.R;

public class MeetMeFragment extends Fragment  {

    private MeetMeViewModel galleryViewModel;

@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
}
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(MeetMeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_meetme, container, false);

        return root;
    }
}