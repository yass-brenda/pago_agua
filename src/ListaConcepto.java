import java.util.ArrayList;
import java.util.ListIterator;

public class ListaConcepto {
    private Concepto concepto;
    private ArrayList<Concepto> listaConcepto;
    private ListIterator<Concepto> itConcepto;


    public ListaConcepto(){
        listaConcepto = new ArrayList<Concepto>();
    }

    public boolean agregarConcepto(Concepto concepto){
        return listaConcepto.add(concepto);
    }

    public boolean eliminar(int id){
        itConcepto = listaConcepto.listIterator();
        while (itConcepto.hasNext()){
            Concepto conceptoActual = itConcepto.next();
            if(conceptoActual.getId() == id){
                listaConcepto.remove(conceptoActual);
                return true;
            }
        }
        return false;
    }

    public void imprimir(){
        for (Concepto concepto: listaConcepto)  {
            System.out.println(concepto);
        }
    }

    public Concepto editarNombre(int id, String nombre){
        itConcepto = listaConcepto.listIterator();
        while (itConcepto.hasNext()){
            Concepto conceptoActual = itConcepto.next();
            if(conceptoActual.getId() == id){
                conceptoActual.setNombreConcepto(nombre);
                return conceptoActual;
            }
        }
        return null;
    }

    public Concepto editarDescripcion(int id, String descripcion){
        itConcepto = listaConcepto.listIterator();
        while (itConcepto.hasNext()){
            Concepto conceptoActual = itConcepto.next();
            if(conceptoActual.getId() == id){
                conceptoActual.setDescripcion(descripcion);
                return conceptoActual;
            }
        }
        return null;
    }


}
