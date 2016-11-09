package layout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import mx.yasmine.mypetssem4.Mascota;
import mx.yasmine.mypetssem4.MascotaAdapter;
import mx.yasmine.mypetssem4.R;


public class HomeFragment extends Fragment {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home,container,false);
        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);



        LinearLayoutManager llmanager = new LinearLayoutManager(getActivity());
        llmanager.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llmanager);
       // listaMascotas = (RecyclerView)v.findViewById(R.id.rvMascotas);


         //listaContactos.setLayoutManager(glm);




        inicializarListaMascotas();
        inicializarAdaptador();


        return v;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }
    public void inicializarAdaptador(){
        MascotaAdapter adaptador = new MascotaAdapter(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);


    }
    public void  inicializarListaMascotas() {
        mascotas = new ArrayList<>();
        mascotas.add(new Mascota("Lula", "gato", R.drawable.gato1,1));
        mascotas.add(new Mascota("Duque", "perro", R.drawable.perro1,3));
        mascotas.add(new Mascota("Pelusa", "gato",  R.drawable.gato_1,2));
        mascotas.add(new Mascota("Silvano", "perro",  R.drawable.perro2,4));
        mascotas.add(new Mascota("Solovino", "gato",  R.drawable.morris_cat,0));
        mascotas.add(new Mascota("Hierro", "perro",  R.drawable.perro3,5));
    }
}

