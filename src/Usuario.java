public class Usuario {

    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private int id;

    public Usuario(String nombre,String apPaterno){
        this.nombre = nombre;
        this.apPaterno = apPaterno;
    }

    public Usuario(String nombre,String apPaterno,String apMaterno){
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
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
        return "Cobrador{" +
                "nombre='" + nombre + '\'' +
                ", apPaterno='" + apPaterno + '\'' +
                ", apMaterno='" + apMaterno + '\'' +
                '}';
    }
}
