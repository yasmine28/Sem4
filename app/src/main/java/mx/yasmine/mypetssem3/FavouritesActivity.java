package mx.yasmine.mypetssem3;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;

import java.util.ArrayList;

public class FavouritesActivity extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);
        listaMascotas = (RecyclerView)findViewById(R.id.rvMascotas);
        Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);

        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //  GridLayoutManager glm = new GridLayoutManager(this,2);
        LinearLayoutManager llmanager = new LinearLayoutManager(this);
        llmanager.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llmanager);
        //listaContactos.setLayoutManager(glm);
        inicializarListaContactos();
        inicializarAdaptador();


    }
    public void inicializarAdaptador(){
        MascotaAdapter adaptador = new MascotaAdapter(mascotas, this);
        listaMascotas.setAdapter(adaptador);


    }
    public void  inicializarListaContactos () {
        mascotas = new ArrayList<>();
        mascotas.add(new Mascota("Hierro", "perro",  R.drawable.perro3,5));
        mascotas.add(new Mascota("Silvano", "perro",  R.drawable.perro2,4));
        mascotas.add(new Mascota("Lula", "gato", R.drawable.gato1,4));
        mascotas.add(new Mascota("Duque", "perro", R.drawable.perro1,3));
        mascotas.add(new Mascota("Pelusa", "gato",  R.drawable.gato_1,2));

   ;
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if(keyCode== KeyEvent.KEYCODE_BACK){
            Intent intent = new Intent(FavouritesActivity.this, MainActivity.class);
            startActivity(intent);
        }
        return super.onKeyDown(keyCode, event);
    }
}
