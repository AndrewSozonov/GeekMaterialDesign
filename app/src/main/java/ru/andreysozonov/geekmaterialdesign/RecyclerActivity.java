package ru.andreysozonov.geekmaterialdesign;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ru.andreysozonov.geekmaterialdesign.adapter.MountainRecyclerViewAdapter;
import ru.andreysozonov.geekmaterialdesign.common.SpaceItemDecoration;
import ru.andreysozonov.geekmaterialdesign.model.MountainCardModel;

public class RecyclerActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<MountainCardModel> mountainList = new ArrayList<MountainCardModel>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        initRecyclerView();


    }

    public void initRecyclerView() {
        recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);

        mountainList.add(new MountainCardModel(R.drawable.everest, "Everest", "Nepal"));
        mountainList.add(new MountainCardModel(R.drawable.fuji, "Fuji", "Japan"));
        mountainList.add(new MountainCardModel(R.drawable.kilimanjaro, "Kilimanjaro", "Kenya"));
        mountainList.add(new MountainCardModel(R.drawable.matterhorn, "Matterhorn", "Switzerland"));

        MountainRecyclerViewAdapter adapter = new MountainRecyclerViewAdapter(mountainList);
        recyclerView.addItemDecoration(new SpaceItemDecoration(30));
        recyclerView.setAdapter(adapter);


    }
}
