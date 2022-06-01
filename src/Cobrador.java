public class Cobrador {

    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String firma;
    private static int idNext = 1;
    private int id;

    public Cobrador(String nombre,String apMaterno,String firma){
        this.nombre = nombre;
        this.firma = firma;
        this.apMaterno = apMaterno;
        id = idNext;
        idNext++;

    }

    public Cobrador(String nombre,String firma,String apPaterno,String apMaterno){
        this.nombre = nombre;
        this.firma = firma;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        id = idNext;
        idNext++;
    }

    public String getNombre(){
       return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFirma(){
        return firma;
    }

    public void setFirma(String firma){
        this.firma = firma;
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

    public int getId(){ return id;}

    public String getFullName() {
        if (apPaterno == null) {
            return nombre + " "  + apMaterno;
        } else {
            return nombre + " " + apPaterno + " " + apMaterno;
        }

    }

    public boolean registroCobradorSinApPaterno(){
        if(nombre == null && firma == null && apMaterno == null )
            return false;
        return true;
    }

    public boolean registroCobradorConApPaterno(){
        if(nombre == null && firma == null && apMaterno == null && apPaterno== null )
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Cobrador : " +
                "id= " + id + " " +
                "nombre= " + nombre + '\'' +
                ", apPaterno='" + apPaterno + '\'' +
                ", apMaterno='" + apMaterno + '\'' +
                ", firma='" + firma + '\'' +
                '.';
    }
}
