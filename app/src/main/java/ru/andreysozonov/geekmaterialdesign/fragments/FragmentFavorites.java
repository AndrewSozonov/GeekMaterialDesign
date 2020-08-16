package ru.andreysozonov.geekmaterialdesign.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import ru.andreysozonov.geekmaterialdesign.R;

public class FragmentFavorites extends Fragment {


    public static FragmentFavorites newInstance(Bundle bundle){
        FragmentFavorites currentFragment = new FragmentFavorites();
        Bundle args = new Bundle();
        args.putBundle("args", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }

    public FragmentFavorites() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_favorites, container, false);
        return rootView;
    }
}
