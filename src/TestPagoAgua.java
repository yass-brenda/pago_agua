public class TestPagoAgua {
    public static void main(String[] args) {

        //Pago pago = new Pago("Pago agua", 500,"nbb",5,2020,5,1,usuario,cobrador);

        Cobrador cobrador = new Cobrador("Gloria" ,"Becerra","Gloria Becerra");
        Cobrador cobrador1 = new Cobrador("Diego Ulisses" ,"Barrios","Becerra", "D. Ulisses B.B");
        Cobrador cobrador3 =  new Cobrador("Ulisses","UlisesB","Barrios", "Becerrra");

        ListaCobrador listaCobrador = new ListaCobrador();
        listaCobrador.guardarCobrador(cobrador);
        listaCobrador.guardarCobrador(cobrador1);
        listaCobrador.guardarCobrador(cobrador3);

        System.out.println("..............");
        System.out.println(listaCobrador.editarFirma(1,"U"));

        System.out.println("............................................");
        listaCobrador.imprimir();





    }
}
