import java.util.ArrayList;
import java.util.Iterator;
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

    public List<Usuario> buscarFullName(String cadena){
        itUsuario = listUsuarios.listIterator();
        List<Usuario> listaConCadena  = new ArrayList<Usuario>();
        while (itUsuario.hasNext()){
            Usuario usuarioActual = itUsuario.next();
            if(usuarioActual.getFullName().contains(cadena)){
                listaConCadena.add(usuarioActual);
            }
        }
        return listaConCadena;
    }


    public boolean editarNombre(int id,String nombre){
        itUsuario = listUsuarios.listIterator();
        while(itUsuario.hasNext()){
            Usuario userActual = itUsuario.next(); // Guardo donde esta el puntero
            if(userActual.getId() == id){
                userActual.setNombre(nombre);
                return true;
            }
        }
        return false;
    }

    public boolean editarApMaterno(int id, String apMaterno){
        itUsuario = listUsuarios.listIterator();
        while(itUsuario.hasNext()){
            Usuario usuarioActual = itUsuario.next();
            if(usuarioActual.getId() == id){
                usuarioActual.setApMaterno(apMaterno);
                return true;
            }
        }
        return false;
    }

    public boolean editarApPaterno(int id, String apPaterno){
        itUsuario = listUsuarios.listIterator();
        while (itUsuario.hasNext()){
            Usuario usuarioActual = itUsuario.next();
            if(usuarioActual.getId() == id){
                usuarioActual.setApPaterno(apPaterno);
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
