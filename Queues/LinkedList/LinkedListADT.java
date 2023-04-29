package Queues.LinkedList;
public class LinkedListADT<T> {
    //T es que entra cualqueir tipo
    private Nodo<T> head;
    private int tamaño;

    public LinkedListADT() {

    }

    public boolean estaVacia() {
        return this.head == null;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void agregarAlFinal(T dato) {
        Nodo<T> nuevo = new Nodo(dato);
        if (this.head == null) {

            this.head = nuevo;
        } else {
            Nodo<T> auxiliar = head;
            //es para mover al final solo pon que hasta que lea un null
            while (auxiliar.getSiguiente()!= null) {
                auxiliar = auxiliar.getSiguiente();

            }
            //una vez que llegue al final y se salga del while. agrega un nuevo nodo
            auxiliar.setSiguiente(nuevo);
            this.tamaño++;
        }
    }
    //para ver como funciona usamos el metodo transversal
    public void transversal(){
        Nodo<T> auxiliar = head;
        while(auxiliar != null){
            System.out.print(auxiliar.getDato() + " --> ");
            auxiliar = auxiliar.getSiguiente();
        }
        System.out.println("");
    }
    public void agregarAlInicio(T dato){
        Nodo <T> nuevo = new Nodo<>(dato);
        if (this.head == null) {
            // si la lista esta vacia el puntero head es asignado directamente
            //    a este nuevo nodo
            this.head = nuevo;
        } else {
            //asignamos head como el siguiente
            //este le asigna el puntero para que sea el nuevo head
            nuevo.setSiguiente(head);
            //este le asigna a este nuevo head el nodo introducido
            head = nuevo;
        }
    }
    //para cuando quieres meter un nodo enmedio de otro
    public void AgregarDespuesDe(T referencia, T dato){
        //primero buscamos la referencia
        // siempre que se recorre se crea en el metodo un auxiliar
        //  se iguala a head para que empiece desde head
        Nodo auxiliarRecorrido = head;
        while (auxiliarRecorrido!=null){

            //si el while llega a encontrar el nodo de referencia....
            if (auxiliarRecorrido.getDato().equals(referencia)){
                //imrpime el nodo q encontro
                System.out.println("igual" + auxiliarRecorrido.getDato());
                //usamos el constructor Nodo que incluye dato y nodo y usamos la posicion del if
                Nodo <T> nuevo = new Nodo<>(dato, auxiliarRecorrido.getSiguiente());
                //ahora para eliminar la anterior referencia igualamos auxiliar a nuevo.
                auxiliarRecorrido.setSiguiente(nuevo);
                //terminamos el ciclo con un return. El puntero sigue en la posicion correcta
                return;
            }
            //este permite moverse al siguiente en caso
            auxiliarRecorrido= auxiliarRecorrido.getSiguiente();
        }
        //este es por si el while termina sin nada
        System.out.println("El dato de referencia no existe");
    }
}