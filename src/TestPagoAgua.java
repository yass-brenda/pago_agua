public class TestPagoAgua {
    public static void main(String[] args) {
        Cobrador cobrador =  new Cobrador("Ulisses","UlisesB","Barrios");
        System.out.println(cobrador);
        Usuario usuario = new Usuario("Gloria","Becerra","DEL rio");
        System.out.println(usuario);
        Pago pago = new Pago("Pago agua", 500,"Quinientos",5,2020,5,1,usuario,cobrador);
        System.out.println(pago);
    }
}
