import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pago {

    private String nombreConcepto;
    private int conceptoNumero;
    private String conceptoLetra;
    private int numRecibo;
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
    }

    public String getNombreConcepto() {
        return nombreConcepto;
    }

    public void setNombreConcepto(String nombreConcepto) {
        this.nombreConcepto = nombreConcepto;
    }

    public int getConceptoNumero() {
        return conceptoNumero;
    }

    public void setConceptoNumero(int conceptoNumero) {
        this.conceptoNumero = conceptoNumero;
    }

    public String getConceptoLetra() {
        return conceptoLetra;
    }

    public void setConceptoLetra(String conceptoLetra) {
        this.conceptoLetra = conceptoLetra;
    }

    public int getNumRecibo() {
        return numRecibo;
    }

    public void setNumRecibo(int numRecibo) {
        this.numRecibo = numRecibo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "nombreConcepto='" + nombreConcepto + '\'' +
                ", conceptoNumero=" + conceptoNumero +
                ", conceptoLetra='" + conceptoLetra + '\'' +
                ", numRecibo=" + numRecibo +
                ", fecha=" + fecha +
                ", usuario=" + usuario +
                '}';
    }
}
