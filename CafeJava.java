public class CafeJava {
    public static void main(String[] args) {
        // VARIABLES DE LA APP
        // Líneas de texto que aparecerán en la app 
        String saludoGeneral = "Bienvenido al Café Java, ";
        String mensajePendiente = ", tu pedido estará listo en breve";
        String mensajeListo = ", tu pedido está listo";
        String mensajeMostrarTotal = "Tu total es $";
        
        // Variables de menú (agrega las tuyas a continuación)
        double precioMocha = 3.5;
        double precioCafeFiltro = 3.1;
        double precioCafeConLeche = 3.4;
        double precioCapuchino = 4.2;
    
        // Variables de nombre de cliente (agrega las tuyas a continuación)
        String cliente1 = "Cindhuri";
        String cliente2 = "Sam";
        String cliente3 = "Jimmy";
        String cliente4 = "Noah";

        // Finalizaciones de pedidos (agrega las tuyas a continuación)
        boolean estaListoOrden1 = false;
        boolean estaListoOrden2 = false;
        boolean estaListoOrden3 = true;
        boolean estaListoOrden4 = false;

        // SIMULACIÓN DE INTERACCIÓN DE APP(Agrega tu código para los desafíos a continuación)
        // Ejemplo:
        System.out.println(saludoGeneral + cliente1); // Muestra "Bienvenido a Café Java, Cindhuri"
    	// ** Las sentencias print sobre las interacciones con el cliente irán aquí ** //
        System.out.println("--- Nuevo Pedido ---");
        System.out.println(saludoGeneral + cliente4);
        if (estaListoOrden4 == true) {
            System.out.println(cliente4 + mensajeListo);
            System.out.println(mensajeMostrarTotal + precioCapuchino);
        }
        else {
            System.out.println(cliente4 + mensajePendiente);
        }

        System.out.println("--- Nuevo Pedido ---");
        System.out.println(saludoGeneral + cliente2);
        if (estaListoOrden2 == true) {
            System.out.println(cliente2 + mensajeListo);
            System.out.println(mensajeMostrarTotal + (precioCafeConLeche *2));
        }
        else {
            System.out.println(cliente2 + mensajePendiente);
        }


        System.out.println("--- Nuevo Pedido ---");
        System.out.println(saludoGeneral + cliente3);
        if (estaListoOrden3 == true) {
            System.out.println(cliente3 + mensajeListo);
            System.out.println(mensajeMostrarTotal + (precioCafeConLeche - precioCafeFiltro));
        }
        else {
            System.out.println(cliente3 + mensajePendiente);
        }

    }
}