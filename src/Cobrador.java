public class Cobrador {

    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String firma;
    private int id;

    public Cobrador(String nombre,String firma,String apMaterno){
        this.nombre = nombre;
        this.firma = firma;
        this.apMaterno = apMaterno;
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
    public String getFirma(){
        return firma;
    }
    public String getApPaterno(){
        return apPaterno;
    }
    public String getApMaterno(){
        return apMaterno;
    }

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
                "nombre='" + nombre + '\'' +
                ", apPaterno='" + apPaterno + '\'' +
                ", apMaterno='" + apMaterno + '\'' +
                ", firma='" + firma + '\'' +
                '.';
    }
}
