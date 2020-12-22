package com.example.bucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.zip.Inflater;

public class BucketListEntryAdapter extends RecyclerView.Adapter<BucketListEntryAdapter.BucketListEntryViewHolder> {

    BucketListEntry[] entries;

    public BucketListEntryAdapter(BucketListEntry[] entries) {
        this.entries = entries;
    }

    @NonNull
    @Override
    public BucketListEntryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bucketlist_entry,parent,false);

        return new BucketListEntryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BucketListEntryViewHolder holder, int position) {
        holder.bind(entries[position],position);
    }

    @Override
    public int getItemCount() {
        return entries.length;
    }

    static class BucketListEntryViewHolder extends RecyclerView.ViewHolder{
        private ImageView image;
        private TextView headingText;
        private TextView DescText;
        private RatingBar rating;
        public BucketListEntryViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.image_view_item);
            headingText=itemView.findViewById(R.id.text_view_title);
            DescText=itemView.findViewById((R.id.text_view_description));
            rating=itemView.findViewById(R.id.rating_bar);


        }

        public void bind(BucketListEntry entry,int position){
            image.setImageResource(entry.image);
            String headString= position+1+". "+entry.heading;
            headingText.setText(entry.heading);
            DescText.setText(entry.Description);
            rating.setRating(entry.rating);




        }
    }



}
