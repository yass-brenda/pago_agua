public class Concepto {

    private String nombreConcepto;
    private String descripcion;
    private  int id = 1;
    private int idNext;


    public Concepto(String nombreConcepto, String descripcion){
        this.nombreConcepto = nombreConcepto;
        this.descripcion = descripcion;
        idNext = id;
        id ++;
    }


    public Concepto(String nombreConcepto){
        this.nombreConcepto = nombreConcepto;
        idNext = id;
        id ++;
    }

    @Override
    public String toString(){
        return  id + " " + nombreConcepto + " " +descripcion + " " ;
    }


}