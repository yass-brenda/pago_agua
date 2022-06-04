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


    // eliminar
    // editar

}
