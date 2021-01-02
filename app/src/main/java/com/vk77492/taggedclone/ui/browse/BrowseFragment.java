package com.vk77492.taggedclone.ui.browse;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.vk77492.taggedclone.FavoriteActivity;
import com.vk77492.taggedclone.R;

public class BrowseFragment extends Fragment implements View.OnClickListener {

    private BrowseViewModel browseViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        browseViewModel =
                new ViewModelProvider(this).get(BrowseViewModel.class);
        View root = inflater.inflate(R.layout.fragment_browse, container, false);
        CardView cardView1 = root.findViewById(R.id.cv1);
        cardView1.setOnClickListener(this);
        CardView cardView2 = root.findViewById(R.id.cv2);
        cardView2.setOnClickListener(this);
        CardView cardView3 = root.findViewById(R.id.cv3);
        cardView3.setOnClickListener(this);
        CardView cardView4 = root.findViewById(R.id.cv4);
        cardView4.setOnClickListener(this);
        CardView cardView5 = root.findViewById(R.id.cv5);
        cardView5.setOnClickListener(this);
        CardView cardView6 = root.findViewById(R.id.cv6);
        cardView6.setOnClickListener(this);
        CardView cardView7 = root.findViewById(R.id.cv7);
        cardView7.setOnClickListener(this);
        CardView cardView8 = root.findViewById(R.id.cv8);
        cardView8.setOnClickListener(this);
        CardView cardView9 = root.findViewById(R.id.cv9);
        cardView9.setOnClickListener(this);
        CardView cardView10 = root.findViewById(R.id.cv10);
        cardView10.setOnClickListener(this);

        return root;
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.cv1:
                intent = new Intent(getActivity(), FavoriteActivity.class);
                intent.putExtra("line1", "Sanvi");
                intent.putExtra("line2", "35, Las Vegas, California");
                intent.putExtra("pic", "girl10");
                startActivity(intent);
                break;
            case R.id.cv2:
                intent = new Intent(getActivity(), FavoriteActivity.class);
                intent.putExtra("line1", "Redpassion");
                intent.putExtra("line2", "30/F/Chicago,USA");
                intent.putExtra("pic", "girl2");
                startActivity(intent);
                break;
            case R.id.cv3:
                intent = new Intent(getActivity(), FavoriteActivity.class);
                intent.putExtra("line1", "Nisha");
                intent.putExtra("line2", "26/F/Bangalore,IN");
                intent.putExtra("pic", "girl3");
                startActivity(intent);
                break;
            case R.id.cv4:
                intent = new Intent(getActivity(), FavoriteActivity.class);
                intent.putExtra("line1", "Sunitha J");
                intent.putExtra("line2", "23,Meerut,IN");
                intent.putExtra("pic", "girl4");
                startActivity(intent);
                break;
            case R.id.cv5:
                intent = new Intent(getActivity(), FavoriteActivity.class);
                intent.putExtra("line1", "Aarohi");
                intent.putExtra("line2", "20/F/Noida,IN");
                intent.putExtra("pic", "girl5");
                startActivity(intent);
                break;
            case R.id.cv6:
                intent = new Intent(getActivity(), FavoriteActivity.class);
                intent.putExtra("line1", "Kushi Keerthana");
                intent.putExtra("line2", "24 / F / Hyderabad, IN");
                intent.putExtra("pic", "girl6");
                startActivity(intent);
                break;

            case R.id.cv7:
                intent = new Intent(getActivity(), FavoriteActivity.class);
                intent.putExtra("line1", "Tonia Joshi");
                intent.putExtra("line2", "27 / F / Gujarat,IN");
                intent.putExtra("pic", "girl7");
                startActivity(intent);
                break;
            case R.id.cv8:
                intent = new Intent(getActivity(), FavoriteActivity.class);
                intent.putExtra("line1", "Riya");
                intent.putExtra("line2", "26/F/Kolkata,IN");
                intent.putExtra("pic", "girl8");
                startActivity(intent);
                break;

            case R.id.cv9:
                intent = new Intent(getActivity(), FavoriteActivity.class);
                intent.putExtra("line1", "Rashmika_M");
                intent.putExtra("line2", "26 / F / Karnataka, IN");
                intent.putExtra("pic", "girl9");
                startActivity(intent);
                break;
            case R.id.cv10:
                intent = new Intent(getActivity(), FavoriteActivity.class);
                intent.putExtra("line1", "Danny");
                intent.putExtra("line2", "23 / F / NewYork, USA");
                intent.putExtra("pic", "girl1");
                startActivity(intent);
                break;
        }
    }
}