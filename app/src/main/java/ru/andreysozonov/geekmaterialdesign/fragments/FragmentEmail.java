package ru.andreysozonov.geekmaterialdesign.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import ru.andreysozonov.geekmaterialdesign.R;

public class FragmentEmail extends Fragment {


    public static FragmentEmail newInstance(Bundle bundle){
        FragmentEmail currentFragment = new FragmentEmail();
        Bundle args = new Bundle();
        args.putBundle("args", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }

    public FragmentEmail() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_email, container, false);
        return rootView;
    }
}