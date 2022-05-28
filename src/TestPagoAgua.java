public class TestPagoAgua {
    public static void main(String[] args) {
        Cobrador cobrador =  new Cobrador("Ulisses","UlisesB","Barrios", "Becerrra");
        //Pago pago = new Pago("Pago agua", 500,"nbb",5,2020,5,1,usuario,cobrador);


        Usuario usuario = new Usuario("Gloria" ,"Becerra");
        Usuario usuario2 = new Usuario("Diego" ,"Becerra");


        ListaUsuario lista = new ListaUsuario();
        boolean r =  lista.guardarUsuario(usuario);
        boolean r2 =  lista.guardarUsuario(usuario2);


        System.out.println(lista.buscarName("Gloria"));

        boolean e = lista.eliminarUsuario(1);





    }
}
