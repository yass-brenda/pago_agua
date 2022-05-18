public class Cobrador {

    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String firma;
    private int id;

    public Cobrador(String nombre,String firma,String apPaterno){
        this.nombre = nombre;
        this.firma = firma;
        this.apPaterno = apPaterno;
    }

    public Cobrador(String nombre,String firma,String apPaterno,String apMaterno){
        this.nombre = nombre;
        this.firma = firma;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
    }

    public String getNombre(){
       return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getFirma(){
        return firma;
    }

    public void setFirma(String firma){
        this.firma =  firma;
    }

    public String getApPaterno(){
        return apPaterno;
    }

    public void setApPaterno(String apPaterno){
        this.apPaterno = apPaterno;
    }

    public String getApMaterno(){
        return apMaterno;
    }

    public void setApMaterno(String apMaterno){
        this.apMaterno = apMaterno;
    }

    @Override
    public String toString() {
        return "Cobrador : " +
                "nombre='" + nombre + '\'' +
                ", apPaterno='" + apPaterno + '\'' +
                ", apMaterno='" + apMaterno + '\'' +
                ", firma='" + firma + '\'' +
                '.';
    }
}
