public class TestPagoAgua {
    public static void main(String[] args) {
        Cobrador cobrador =  new Cobrador("Ulisses","UlisesB","Barrios");
        Usuario usuario = new Usuario("Gloria","Becerra","DEL rio");
        Pago pago = new Pago("Pago agua", 500,"Quinientos",5,2020,5,1,usuario,cobrador);

    }
}
