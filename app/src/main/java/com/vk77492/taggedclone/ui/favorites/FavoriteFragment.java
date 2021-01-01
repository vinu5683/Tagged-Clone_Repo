package com.vk77492.taggedclone.ui.favorites;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.vk77492.taggedclone.FavoriteActivity;
import com.vk77492.taggedclone.R;


public class FavoriteFragment extends Fragment implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);

    }
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FavoriteViewModel favoriteViewModel = new ViewModelProvider(this).get(FavoriteViewModel.class);
        View root = inflater.inflate(R.layout.fragment_favorites, container, false);
        CardView cardView1 = root.findViewById(R.id.card1);
        cardView1.setOnClickListener(this);
        CardView cardView2 = root.findViewById(R.id.card2);
        cardView2.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.card1:
                intent = new Intent(getActivity(), FavoriteActivity.class);
                intent.putExtra("line1", "Redpassion");
                intent.putExtra("line2","30/F/Chicago,IL");
                intent.putExtra("pic","girl2");
                startActivity(intent);
                break;
            case R.id.card2:
                intent = new Intent(getActivity(), FavoriteActivity.class);
                intent.putExtra("line1", "Nisha");
                intent.putExtra("line2","26/F/Bangalore,IN");
                intent.putExtra("pic","girl3");
                startActivity(intent);
        }
    }
}