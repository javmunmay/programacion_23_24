package U4.Tarea2.ej1Lista;

public class ListaMain {
    public static void main(String[] args) {

        Lista l = new Lista();

        l.insertarNumeroFinal(3);
        l.insertarNumeroFinal(7);
        l.insertarNumeroFinal(5);
        l.insertarNumeroFinal(4);
        l.insertarNumeroInicial(2);
        l.insertarNumeroPosicion(2, 9);
        Integer[] lista2 = {8, 1, 3, 4, 5};
        l.insertarListaFinal(lista2);
        l.mostrarLista();
        l.eliminarNumero(2);
        System.out.println(l.obtenerNumero(2));
        l.mostrarLista();
    }
}
