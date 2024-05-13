package U9.Entregable2324U9;

public class Main {

    public static void main(String[] args) {
        // Pruebas de consultas
        System.out.println("Empleados de la oficina con más empleados: ");
        Consultas.empleadosOficinaMayor();

        System.out.println("\nProductos no vendidos: ");
        Consultas.productosNoVendidos();

        System.out.println("\nInforme de la categoría 'Planes': ");
        Consultas.informeCategoria("Planes");

        // Pruebas de transacciones (FUNCIONAN LAS DOS)

        //Transacciones.insertarClienteYPagos(112314, "Prueba Probando", "Probando", "Prueba", 12345678, "Calle prueba", "Madrid", "España", "Check1234", "2002-03-20", 200 );

        //Transacciones.insertarOficinaYTraslado("TOK", "Tokyo", "+81 123 456 789", "Calle Oficina Prueba", "Japon", "11202", "Imperio");
    }

}
