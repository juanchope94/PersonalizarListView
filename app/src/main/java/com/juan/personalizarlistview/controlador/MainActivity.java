package com.juan.personalizarlistview.controlador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.juan.personalizarlistview.R;
import com.juan.personalizarlistview.modelo.AdapterPeliculas;
import com.juan.personalizarlistview.modelo.Peliculas;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listaPeliculas;
    TextView txtTitulo;
    TextView txtDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaPeliculas=(ListView) findViewById(R.id.listaPeliculas);
        AdapterPeliculas adapterPeliculas= new AdapterPeliculas(this,llenar());
        listaPeliculas.setAdapter(adapterPeliculas);

    }
    private List<Peliculas> llenar()
    {
        ArrayList<Peliculas> peliculas= new ArrayList<>();
        peliculas.add(new Peliculas("Toy story 4", "Infantil",R.drawable.toy));
        peliculas.add(new Peliculas("Rapido y furioso 8", "Accion",R.drawable.furioso));
        peliculas.add(new Peliculas("Avengers", "Accion",R.drawable.aven));
        peliculas.add(new Peliculas("Pearl Harbor", "Accion",R.drawable.pearl));

        return peliculas;

    }
}
