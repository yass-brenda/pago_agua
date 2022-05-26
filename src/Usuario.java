import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private int id;
    private static int idNext = 1;


    public Usuario(String nombre,String apMaterno){
        this.nombre = nombre;
        this.apMaterno= apMaterno;
        id  = idNext;
        idNext++;
    }

    public Usuario(String nombre,String apPaterno,String apMaterno){
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        id  = idNext;
        idNext++;

    }

    public String getNombre(){
        return nombre;
    }

    public String getApPaterno(){
        return apPaterno;
    }

    public String getApMaterno(){
        return apMaterno;
    }

    public int getId(){
        return id;
    }


    public String getFullName() {
        if (apPaterno == null) {
            return nombre + " "  + apMaterno;
        } else {
            return nombre + " " + apPaterno + " " + apMaterno;
        }

    }

    public boolean guardarSinApPaterno(){
        if(nombre == null && apMaterno == null)
            return false;
        return true;
    }

    public boolean guardarConApPaterno(Usuario usuario){
        if(nombre == null && apMaterno == null )
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Usuario: " +
                "id:" + id + " " +
                "nombre='" + nombre + '\'' +
                ", apPaterno='" + apPaterno + '\'' +
                ", apMaterno='" + apMaterno + '\'';
    }
}
