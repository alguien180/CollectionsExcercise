package Queues.LinkedList;

public class Array {
    private int size;
    private int[] datos;

    public Array() {
    }

    public Array(int size) {
        this.size = size;
        this.datos = new int[this.size];
    }

    public int[] getDatos() {
        return datos;
    }

    public void setDatos(int[] datos) {
        this.datos = datos;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Array{" + "tamano=" + size + ", datos=" + this.printDatos() + '}';
    }

    public boolean revisar_limites(int index) {
        boolean valido = false;
        if (index >= 0 && index < this.size) {
            valido = true;
        }
        return valido;
    }

    public int get_elemento(int index) throws ArrayIndexOutOfBoundsException {
        return this.datos[index];
    }

    public void set_elemento(int index, int valor) {
        if (this.revisar_limites(index)) {
            this.datos[index] = valor;
        } else {
            System.out.println("Erro de límites en index");
        }
    }

    public void limpiar(int valor) {
        for (int i = 0; i < this.size; i++) {
            this.datos[i] = valor;
        }
    }

    public String printDatos() {
        String chain = "[";
        for (int contenido : this.datos) {
            chain += (contenido + ",");
        }
        chain = chain.substring(0, chain.length() - 1);
        chain += "]";
        System.out.println(chain);
        return chain;
    }

    public static void main(String[] args) {
        System.out.println("Probando arreglo");
        Array mi_array = new Array(10);

        for (int i = 0; i < mi_array.getSize(); i++) {
            System.out.println("Actual = " + mi_array.get_elemento(i));
            mi_array.set_elemento(i, (i + 1) * 2);
        }
        mi_array.printDatos();

        mi_array.get_elemento(22);

        mi_array.limpiar(-1);
        mi_array.printDatos();
    }

}

