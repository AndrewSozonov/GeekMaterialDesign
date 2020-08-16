package ru.andreysozonov.geekmaterialdesign.fragments;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import ru.andreysozonov.geekmaterialdesign.R;


public class Fragment3 extends Fragment {


    public static Fragment3 newInstance(Bundle bundle){
        Fragment3 currentFragment = new Fragment3();
        Bundle args = new Bundle();
        args.putBundle("args", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }

    public Fragment3() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment3, container, false);
        return rootView;
    }
}
