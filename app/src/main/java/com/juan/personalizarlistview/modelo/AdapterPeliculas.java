package com.juan.personalizarlistview.modelo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.juan.personalizarlistview.R;

import java.util.List;

public class AdapterPeliculas extends BaseAdapter {

    Context context;
    List<Peliculas> listaPelicula;
    public AdapterPeliculas(Context context, List<Peliculas> listaPelicula)
    {
        this.context=context;
        this.listaPelicula=listaPelicula;
    }
    @Override
    public int getCount() {
        return listaPelicula.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View vista= View.inflate(context, R.layout.items,null);
        TextView txtTitulo= vista.findViewById(R.id.txtTitulo);
        TextView txtDescripcion= vista.findViewById(R.id.txtDescripcion);
        ImageView avatar= vista.findViewById(R.id.imgAvatar);

        txtTitulo.setText(listaPelicula.get(position).getTitulo());
        txtDescripcion.setText(listaPelicula.get(position).getDescripcion());
        avatar.setImageResource(listaPelicula.get(position).getImagen());
        return vista;
    }
}
