package com.vk77492.taggedclone.ui.pets;

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
import com.vk77492.taggedclone.ui.meetme.MeetMeViewModel;

public class PetFragment extends Fragment {

    private PetViewModel petViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        petViewModel =
                new ViewModelProvider(this).get(PetViewModel.class);
        View root = inflater.inflate(R.layout.fragment_pets, container, false);

        return root;
    }
}