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

    public Usuario buscarName(String nombre){
        itUsuario = listUsuarios.listIterator();
        while(itUsuario.hasNext()){
            String nameUserActual = itUsuario.next().getNombre();
            if(nameUserActual.equals(nombre)){
                return itUsuario.previous();
            }
        }
        return null;
    }

    public Usuario buscarApMaterno(String apMaterno){
        itUsuario = listUsuarios.listIterator();
        while (itUsuario.hasNext()){
            String apMaternoActual = itUsuario.next().getApMaterno();
            if (apMaternoActual.equals(apMaterno)){
                return itUsuario.previous();
            }
        }
        return null;
    }


    public boolean editarNombre(int id,String nombre){
        itUsuario = listUsuarios.listIterator();
        while(itUsuario.hasNext()){
            int idactual = itUsuario.next().getId();
            if(idactual == id){
                itUsuario.previous().setNombre(nombre);
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
