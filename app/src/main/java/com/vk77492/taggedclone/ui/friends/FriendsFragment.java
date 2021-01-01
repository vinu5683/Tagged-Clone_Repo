package com.vk77492.taggedclone.ui.friends;

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

public class FriendsFragment extends Fragment implements View.OnClickListener{

    private FriendsViewModel inviteFriendsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        inviteFriendsViewModel =
                new ViewModelProvider(this).get(FriendsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_friends, container, false);
        CardView cardView1 = root.findViewById(R.id.card1);
        cardView1.setOnClickListener(this);
        CardView cardView2 = root.findViewById(R.id.card2);
        cardView2.setOnClickListener(this);
        CardView cardView3 = root.findViewById(R.id.card3);
        cardView3.setOnClickListener(this);
        CardView cardView4 = root.findViewById(R.id.card4);
        cardView4.setOnClickListener(this);
        CardView cardView5 = root.findViewById(R.id.card5);
        cardView5.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.card1:
                intent = new Intent(getActivity(), FavoriteActivity.class);
                intent.putExtra("line1", "Redpassion");
                intent.putExtra("line2","30/F/Chicago,USA");
                intent.putExtra("pic","girl2");
                startActivity(intent);
                break;
            case R.id.card2:
                intent = new Intent(getActivity(), FavoriteActivity.class);
                intent.putExtra("line1", "Nisha");
                intent.putExtra("line2","26/F/Bangalore,IN");
                intent.putExtra("pic","girl3");
                startActivity(intent);
                break;
            case R.id.card3:
                intent = new Intent(getActivity(), FavoriteActivity.class);
                intent.putExtra("line1", "Sunitha J");
                intent.putExtra("line2","23,Meerut,IN");
                intent.putExtra("pic","girl4");
                startActivity(intent);
                break;
            case R.id.card4:
                intent = new Intent(getActivity(), FavoriteActivity.class);
                intent.putExtra("line1", "Aarohi");
                intent.putExtra("line2","20/F/Noida,IN");
                intent.putExtra("pic","girl5");
                startActivity(intent);
                break;
            case R.id.card5:
                intent = new Intent(getActivity(), FavoriteActivity.class);
                intent.putExtra("line1", "Riya");
                intent.putExtra("line2","26/F/Kolkata,IN");
                intent.putExtra("pic","girl8");
                startActivity(intent);
                break;
        }
    }
}