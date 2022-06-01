import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListaCobrador {
    private List<Cobrador> listCobradores;
    private ListIterator<Cobrador> itCobradores;

    public ListaCobrador(){
        listCobradores = new ArrayList<Cobrador>();
    }

    public boolean guardarCobrador(Cobrador cobrador){
        return listCobradores.add(cobrador);
    }

    public void imprimir(){
        for (Cobrador cobrador: listCobradores){
            System.out.println(cobrador);
        }
    }

    public boolean eliminarCobrador(int id){
        itCobradores = listCobradores.listIterator();
        while (itCobradores.hasNext()){
            int idActual = itCobradores.next().getId();
            if(idActual == id){
                itCobradores.remove();
                return true;
            }

        }
        return false;
    }

    public List<Cobrador> buscarFullName(String cadena){
        itCobradores = listCobradores.listIterator();
        List<Cobrador> listCoincidencias= new ArrayList<Cobrador>();
        while (itCobradores.hasNext()){
            Cobrador cobradorActual = itCobradores.next();
            if(cobradorActual.getFullName().contains(cadena)){
                listCoincidencias.add(cobradorActual);
            }
        }
        return listCoincidencias;
    }

    public boolean editarNombre(int id,String name){
        itCobradores = listCobradores.listIterator();
        while (itCobradores.hasNext()){
            Cobrador itCobrador = itCobradores.next();
            int idActual = itCobrador.getId();
            if(id == idActual){
                itCobrador.setNombre(name);
                return true;
            }
        }
        return false;
    }

    public boolean editarApPaterno(int id , String apPaterno){
        itCobradores = listCobradores.listIterator();
        while(itCobradores.hasNext()){
            Cobrador itCobrador = itCobradores.next();
            if(itCobrador.getId() == id){
                itCobrador.setApPaterno(apPaterno);
                return true;
            }
        }
        return false;
    }

    public boolean editarApMaterno(int id, String apMaterno){
        itCobradores = listCobradores.listIterator();
        while (itCobradores.hasNext()){
            Cobrador itCobrador = itCobradores.next();
            if(itCobrador.getId() == id){
                itCobrador.setApMaterno(apMaterno);
                return true;
            }
        }
        return false;
    }

    public boolean editarFirma(int id,String firma){
        itCobradores = listCobradores.listIterator();
        while (itCobradores.hasNext()){
            Cobrador itCobrador = itCobradores.next();
            if(itCobrador.getId() == id){
                itCobrador.setFirma(firma);
                return true;
            }
        }
        return false;
    }
}

