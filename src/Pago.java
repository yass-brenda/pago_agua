
import java.util.Date;
import java.util.GregorianCalendar;
public class Pago {

    private String nombreConcepto;
    private Integer conceptoNumero;
    private String conceptoLetra;
    private Integer numRecibo;
    private Date fecha;
    private Usuario usuario;
    private Cobrador cobrador;

    public Pago(String nombreConcepto, int conceptoNumero, String conceptoLetra, int numRecibo, int year,int month,int day, Usuario usuario,Cobrador cobrador){
        this.nombreConcepto = nombreConcepto;
        this.conceptoLetra = conceptoLetra;
        this.conceptoNumero = conceptoNumero;
        this.numRecibo = numRecibo;
        this.usuario  = usuario;
        this.cobrador =  cobrador;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        fecha = calendar.getTime();

        if (this.nombreConcepto.equals("") || this.conceptoLetra.equals("") || this.usuario.equals("") || this.cobrador.equals("") || this.fecha.equals(""))
            System.out.println("Alguno de tus datos esta vacio");

    }

    public String getNombreConcepto() {
        return nombreConcepto;
    }

    public int getConceptoNumero() {
        return conceptoNumero;
    }

    public String getConceptoLetra() {
        return conceptoLetra;
    }

    public int getNumRecibo() {
        return numRecibo;
    }

    public Date getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Cobrador getCobrador() {
        return cobrador;
    }

    public boolean registroCompletado(){
        if(nombreConcepto == null && conceptoLetra == null && conceptoNumero == null && numRecibo==null &&  usuario ==null && cobrador== null && fecha== null)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "nombreConcepto='" + nombreConcepto + '\'' +
                ", conceptoNumero=" + conceptoNumero +
                ", conceptoLetra='" + conceptoLetra + '\'' +
                ", numRecibo=" + numRecibo +
                ", fecha=" + fecha +" " + usuario.toString() + " " + cobrador.toString() +
                '}';
    }
}
