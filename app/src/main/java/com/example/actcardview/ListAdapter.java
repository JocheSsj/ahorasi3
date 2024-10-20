package com.example.actcardview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListadoDeElementos> mData;
    private LayoutInflater mInflater;

    public ListAdapter(List<ListadoDeElementos> itemList, Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = itemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.listado, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ListadoDeElementos item = mData.get(position);
        holder.bindData(item);

        holder.btnMoreDetails.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), ActivityDetalles.class);
            intent.putExtra("nombre", item.getNombre());
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNombre, tvCiudad, tvDescripcion;
        ImageView ivLogo;
        Button btnMoreDetails;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNombre = itemView.findViewById(R.id.tvNombre);
            //tvCiudad = itemView.findViewById(R.id.tvCiudad);
            tvDescripcion = itemView.findViewById(R.id.tvDescripcion);
            ivLogo = itemView.findViewById(R.id.ivLogo);
            btnMoreDetails = itemView.findViewById(R.id.btnMoreDetails);
        }

        void bindData(ListadoDeElementos item) {
            tvNombre.setText(item.getNombre());
            //tvCiudad.setText(item.getCiudad());
            tvDescripcion.setText(item.getDescripcion());
            ivLogo.setImageResource(item.getImageResId());
        }
    }
}
