package ru.andreysozonov.geekmaterialdesign;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import ru.andreysozonov.geekmaterialdesign.adapter.MainFragmentPageAdapter;
import ru.andreysozonov.geekmaterialdesign.fragments.Fragment1;
import ru.andreysozonov.geekmaterialdesign.fragments.Fragment2;
import ru.andreysozonov.geekmaterialdesign.fragments.Fragment3;
import ru.andreysozonov.geekmaterialdesign.fragments.FragmentBookmark;
import ru.andreysozonov.geekmaterialdesign.fragments.FragmentEmail;
import ru.andreysozonov.geekmaterialdesign.fragments.FragmentFavorites;

public class TabActivity extends AppCompatActivity {

    FrameLayout containerFrame;
    FragmentManager mFragmentManager;
    FragmentEmail fragmentEmail;
    FragmentBookmark fragmentBookmark;
    FragmentFavorites fragmentFavorites;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        Fragment1 fragment1 = Fragment1.newInstance(null);
        Fragment2 fragment2 = Fragment2.newInstance(null);
        Fragment3 fragment3 = Fragment3.newInstance(null);
        fragmentEmail = FragmentEmail.newInstance(null);
        fragmentBookmark = FragmentBookmark.newInstance(null);
        fragmentFavorites = FragmentFavorites.newInstance(null);

        containerFrame = findViewById(R.id.containerFrame);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(listener);

        mFragmentManager = getSupportFragmentManager();


        MainFragmentPageAdapter mainFragmentPageAdapter = new MainFragmentPageAdapter(getSupportFragmentManager());
        mainFragmentPageAdapter.addFragment(fragment1, "tab1");
        mainFragmentPageAdapter.addFragment(fragment2, "tab2");
        mainFragmentPageAdapter.addFragment(fragment3, "tab3");

        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(mainFragmentPageAdapter);
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }

    BottomNavigationView.OnNavigationItemSelectedListener listener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.action_email:
                    FragmentTransaction fragmentTransactionE = mFragmentManager.beginTransaction();
                    fragmentTransactionE.replace(R.id.containerFrame, fragmentEmail);
                    fragmentTransactionE.commit();
                    return true;
                case R.id.action_bookmark:
                    FragmentTransaction fragmentTransactionM = mFragmentManager.beginTransaction();
                    fragmentTransactionM.replace(R.id.containerFrame, fragmentBookmark);
                    fragmentTransactionM.commit();
                    return true;
                case R.id.action_favorites:
                    FragmentTransaction fragmentTransactionF = mFragmentManager.beginTransaction();
                    fragmentTransactionF.replace(R.id.containerFrame, fragmentFavorites);
                    fragmentTransactionF.commit();
                    return true;
            }
            return false;
        }
    };
}
