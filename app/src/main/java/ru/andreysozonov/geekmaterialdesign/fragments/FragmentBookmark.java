package ru.andreysozonov.geekmaterialdesign.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import ru.andreysozonov.geekmaterialdesign.R;

public class FragmentBookmark extends Fragment {


    public static FragmentBookmark newInstance(Bundle bundle){
        FragmentBookmark currentFragment = new FragmentBookmark();
        Bundle args = new Bundle();
        args.putBundle("args", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }

    public FragmentBookmark() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bookmarks, container, false);
        return rootView;
    }
}
