import java.time.temporal.JulianFields;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListaUsuario {
    private List<Usuario> listUsuarios;
    ListIterator<Usuario> itUsuario;

    public ListaUsuario(){
        listUsuarios = new ArrayList<Usuario>();
    }

    public boolean guardarUsuario( Usuario usuario) {
        return listUsuarios.add(usuario);
    }


    public boolean eliminarUsuario(int id) {
        itUsuario = listUsuarios.listIterator();
        while(itUsuario.hasNext()){
            int idUserActual  = itUsuario.next().getId();
            if(idUserActual == id){
                itUsuario.remove();
                return true;
            }
        }
        return false;
    }

    public boolean buscarName(String nombre){
        itUsuario = listUsuarios.listIterator();
        while(itUsuario.hasNext()){
            String nameUserActual = itUsuario.next().getNombre();
            if(nameUserActual.equals(nombre)){
                return true;
            }
        }
        return false;
    }

    public void imprimirLista(){
        for (Usuario usuario: listUsuarios) {
            System.out.println(usuario);
        }
    }

}
