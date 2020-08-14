package ru.andreysozonov.geekmaterialdesign.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ru.andreysozonov.geekmaterialdesign.R;
import ru.andreysozonov.geekmaterialdesign.model.MountainCardModel;

public class MountainRecyclerViewAdapter extends RecyclerView.Adapter<MountainRecyclerViewAdapter.CardViewHolder> {

    private List<MountainCardModel> mountainList;

    public MountainRecyclerViewAdapter(List mList) {
        mountainList = mList;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_card, null);
        CardViewHolder cardViewHolder = new CardViewHolder(v);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        MountainCardModel mountainCardModel = mountainList.get(position);
        holder.imgView.setImageResource(mountainCardModel.getImageId());
        holder.nameTextView.setText(mountainCardModel.getName());
        holder.locationTextView.setText(mountainCardModel.getLocation());

    }

    @Override
    public int getItemCount() {
        return mountainList.size();
    }

    public static class CardViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgView;
        public TextView nameTextView;
        public TextView locationTextView;

        public CardViewHolder(View view) {
            super(view);
            imgView = view.findViewById(R.id.card_image_view);
            nameTextView = view.findViewById(R.id.card_name_text_view);
            locationTextView = view.findViewById(R.id.card_location_text_view);

        }

    }
}
