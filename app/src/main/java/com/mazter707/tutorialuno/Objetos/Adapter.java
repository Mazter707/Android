package com.mazter707.tutorialuno.Objetos;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mazter707.tutorialuno.R;

import java.util.List;

/**
 * Created by LAP on 5/28/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.CochesviewHolder> {

    List<Coche> coches;

    public Adapter(List<Coche> coches) {
        this.coches = coches;
    }

    @Override
    public CochesviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_recycler, parent, false);
        CochesviewHolder holder = new CochesviewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(CochesviewHolder holder, int position) {
        Coche coche = coches.get(position);
        holder.textViewMarca.setText(coche.getMarca());
        holder.textViewPropietario.setText(coche.getPropietario());

    }

    @Override
    public int getItemCount() {
        return coches.size();
    }

    public static class CochesviewHolder extends RecyclerView.ViewHolder{

        TextView textViewMarca, textViewPropietario;


        public CochesviewHolder(View itemView) {
            super(itemView);

            textViewMarca = (TextView) itemView.findViewById(R.id.textview_marca);
            textViewPropietario = (TextView) itemView.findViewById(R.id.textview_propietario);
        }
    }
}
