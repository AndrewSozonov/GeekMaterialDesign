package ru.andreysozonov.geekmaterialdesign;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;


public class NavigationDrawerActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private DrawerLayout drawer;
    private ProgressBar bar;
    private Button buttonProgress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        drawer = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        bar = findViewById(R.id.progress);
        buttonProgress = findViewById(R.id.button_Progress);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        buttonProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showProgressBar();
            }
        });
    }

    public void showProgressBar() {
        buttonProgress.setClickable(false);
        bar.setVisibility(View.VISIBLE);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int progress = 0;
                bar.setProgress(progress);
                for (int i = 0; i < 100; i++) {
                    try {
                        Thread.sleep(10);
                        bar.setProgress(progress += 1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                buttonProgress.setClickable(true);
            }
        });
        thread.start();
    }
}

