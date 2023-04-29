package Queues.LinkedList;


public class DriverList {
    //you can have several mains but the manifest must theclare the "main" one
    //    el principal
    public static void main(String[] args) {
        LinkedListADT<String> lista = new LinkedListADT<String>();
        System.out.println("Vacia? "+ lista.estaVacia());
        lista.agregarAlFinal("Jose");
        lista.agregarAlFinal("Diana");
        System.out.println("Vacia? "+ lista.estaVacia());
        //este siguiente imprime todo lo presente en la lista
        // en estructuras de datos, el metodo que imprime todo
        //  usualmente se le llama transveral
        lista.transversal();
        lista.agregarAlInicio("Jesus");
        lista.transversal();
        lista.AgregarDespuesDe("Jose", "Diego");
        lista.transversal();
    }
}
