package ru.andreysozonov.geekmaterialdesign.fragments;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import ru.andreysozonov.geekmaterialdesign.R;


public class Fragment2 extends Fragment {


    public static Fragment2 newInstance(Bundle bundle){
        Fragment2 currentFragment = new Fragment2();
        Bundle args = new Bundle();
        args.putBundle("args", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }

    public Fragment2() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment2, container, false);
        return rootView;
    }
}
