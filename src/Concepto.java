public class Concepto {

    private String nombreConcepto;
    private String descripcion;
    private  int id ;
    private static int idNext = 1;


    public Concepto(String nombreConcepto, String descripcion){
        this.nombreConcepto = nombreConcepto;
        this.descripcion = descripcion;
         id = idNext;
        idNext++;
    }


    public Concepto(String nombreConcepto){
        this.nombreConcepto = nombreConcepto;
        id = idNext;
        idNext++;
    }

    public int getId(){
        return id;
    }

    public void setNombreConcepto(String nombreConcepto){
        this.nombreConcepto = nombreConcepto;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    @Override
    public String toString(){
        return  id + " " + nombreConcepto + " " +descripcion + " " ;
    }


}
