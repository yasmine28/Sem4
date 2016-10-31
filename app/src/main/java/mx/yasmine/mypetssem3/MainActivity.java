package mx.yasmine.mypetssem3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    Activity favActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
      setSupportActionBar(miActionBar);
       // getSupportActionBar().setTitle("Petagram");

        listaMascotas = (RecyclerView)findViewById(R.id.rvMascotas);

        //  GridLayoutManager glm = new GridLayoutManager(this,2);
        LinearLayoutManager llmanager = new LinearLayoutManager(this);
        llmanager.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llmanager);
        //listaContactos.setLayoutManager(glm);
        inicializarListaContactos();
        inicializarAdaptador();

        ImageView favoritosImg = (ImageView)findViewById(R.id.imgFav);


       favoritosImg.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Mascotas Favoritas!!!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, FavouritesActivity.class);

               startActivity(intent);
            }
        });
    }
    public void inicializarAdaptador(){
        MascotaAdapter adaptador = new MascotaAdapter(mascotas, this);
        listaMascotas.setAdapter(adaptador);


    }
    public void  inicializarListaContactos () {
        mascotas = new ArrayList<>();
        mascotas.add(new Mascota("Lula", "gato", R.drawable.gato1,1));
        mascotas.add(new Mascota("Duque", "perro", R.drawable.perro1,3));
        mascotas.add(new Mascota("Pelusa", "gato",  R.drawable.gato_1,2));
        mascotas.add(new Mascota("Silvano", "perro",  R.drawable.perro2,4));
        mascotas.add(new Mascota("Solovino", "gato",  R.drawable.morris_cat,0));
        mascotas.add(new Mascota("Hierro", "perro",  R.drawable.perro3,5));
    }

    public void IrSegundaActividad(){
        Intent intent =new Intent(this,FavouritesActivity.class);
        startActivity(intent);
    }
}
