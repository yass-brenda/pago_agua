public class Usuario {

    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private int id;

    public Usuario(String nombre,String apMaterno){
        this.nombre = nombre;
        this.apMaterno= apMaterno;
    }

    public Usuario(String nombre,String apPaterno,String apMaterno){
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
    }

    public String getNombre(){
        return nombre;
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

    @Override
    public String toString() {
        return "Usuario: " +
                "nombre='" + nombre + '\'' +
                ", apPaterno='" + apPaterno + '\'' +
                ", apMaterno='" + apMaterno + '\'';
    }
}
