public class TestPagoAgua {
    public static void main(String[] args) {
        Cobrador cobrador = new Cobrador("Gloria" ,"Becerra","Gloria Becerra");
        Usuario usuario = new Usuario("Diego Ulisses" ,"Barrios","Becerr");

        Pago pago = new Pago("Pago agua", 500,"nbb",5,2020,5,usuario,cobrador);
        Pago pago2 = new Pago("Pago agua", 500,"nbb",5,2020,5,usuario,cobrador);
        Pago pago3 = new Pago("Pago agua", 500,"nbb",5,2020,5,usuario,cobrador);

        System.out.println(pago);
        System.out.println(pago2);
        System.out.println(pago3);

        /**


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

         Concepto concepto =  new Concepto("Pago agua","Pago de agua mensual");
         Concepto concepto1 =  new Concepto("cuota 50","Pago para pagar el pozo ");

         ListaConcepto listaConcepto = new ListaConcepto();
         listaConcepto.agregarConcepto(concepto1);
         listaConcepto.agregarConcepto(concepto);

         System.out.println("--------------------------------------");
         listaConcepto.imprimir();
         System.out.println("--------------------------------------");

         listaConcepto.editarNombre(1 ,"Luz");


         System.out.println("--------------------------------------");
         listaConcepto.imprimir();
        **/




    }
}
