package com.example.kuis_1;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class Ke_lAdapter extends RecyclerView.Adapter<Ke_lAdapter.KeluargaViewHolder> {

    private ArrayList<Keluarga> dataList;

    public Ke_lAdapter(ArrayList<Keluarga> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public Ke_lAdapter.KeluargaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_list, parent, false);
        return new KeluargaViewHolder(view);
    }

    public void onBindViewHolder(KeluargaViewHolder holder, int position) {
        holder.image.setImageDrawable(dataList.get(position).getImage_kuh());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtStatus.setText(dataList.get(position).getStatus());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class KeluargaViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView txtNama, txtStatus;

        public KeluargaViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.myPict);
            txtNama = (TextView) itemView.findViewById(R.id.nama);
            txtStatus = (TextView) itemView.findViewById(R.id.status);
        }
    }
}
