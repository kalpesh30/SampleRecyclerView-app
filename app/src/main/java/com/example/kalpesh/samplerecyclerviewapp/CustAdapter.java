package com.example.kalpesh.samplerecyclerviewapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class CustAdapter extends RecyclerView.Adapter<CustAdapter.CustViewHolder> {

    private String data[];
    String imageurl;
    Context context ;
    CustAdapter(String[] data,Context context){
        this.context = context ;
        this.data = data ;
        //this.imageurl = imageurl ;
        Log.v("Data got -> ","construtur called");
    }

    @NonNull
    @Override
    public CustViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext()) ;
        View view = inflater.inflate(R.layout.list_view_item,parent,false) ;
        Log.v("Data got -> ","Views populated");
        return new CustViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CustViewHolder holder, int position) {
        String tite = data[position] ;
        holder.textView.setText(tite);
        Glide.with(context).load("https://media1.ausbt.com.au/1040,588-5972de7185904975884b18b2dd799463-language-apps-920a.jpg").into(holder.imageView);
        //Glide.with(getApplicationContext).load(imageurl).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public class CustViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView ;
        public CustViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_img) ;
            textView = itemView.findViewById(R.id.tv_name);
        }
    }
}
