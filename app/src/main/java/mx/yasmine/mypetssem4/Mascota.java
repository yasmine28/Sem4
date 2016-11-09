package mx.yasmine.mypetssem4;

/**
 * Created by Yasmine on 27/10/2016.
 */

public class Mascota {
    private String nombre;
    private String tipo;
    private int foto;
    private int raiting;

    public Mascota(String nombre, String tipo, int foto, int raiting) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.foto = foto;
        this.raiting = raiting;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }
}
