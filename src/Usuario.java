import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private static int idNext = 1;
    private int id;
    public List<Usuario>listUsuarios = new ArrayList<Usuario>();


    public Usuario(String nombre,String apMaterno){
        this.nombre = nombre;
        this.apMaterno= apMaterno;
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


    public String getFullName() {
        if (apPaterno == null) {
            return nombre + " "  + apMaterno;
        } else {
            return nombre + " " + apPaterno + " " + apMaterno;
        }

    }

    public boolean registroCobradorSinApPaterno(Usuario usuario){
        if(usuario.nombre == null && usuario.apMaterno == null ){
            return false;
        } else {
            listUsuarios.add(usuario);
            return true;
        }
    }

    public boolean registroCobradorConApPaterno(){
        if(nombre == null && apMaterno == null && apPaterno== null )
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
