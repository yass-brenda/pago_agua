public class TestPagoAgua {
    public static void main(String[] args) {
        Cobrador cobrador =  new Cobrador("Ulisses","UlisesB","Barrios", "Becerrra");
        System.out.println(cobrador);
        Usuario usuario = new Usuario("Gloria" ,"Becerra");
         boolean result = usuario.registroCobradorSinApPaterno(usuario);
        System.out.println(result);

        Pago pago = new Pago("Pago agua", 500,"",5,2020,5,1,usuario,cobrador);
        System.out.println(pago);

    }
}
