public class Main {

    public static void main(String[] args) {
        mascota[] mascotas = new mascota[4];

        mascotas[0] = new mascota("luna", "perro", 28.5,  9);
        mascotas[1] = new mascota("michi", "gato", 4.2,  3);
        mascotas[2] = new mascota("rocky", "perro", 12.0,  5);
        mascotas[3] = new mascota("pepa", "conejo", 2.1,  6);

        int totalRecaudado = 0;

        for (int i = 0; i < mascotas.length; i++) {

            System.out.println("mascota:" + mascotas[i].descripcion());
            System.out.println("valor de consulta:$" + mascotas[i].valorConsulta());
            System.out.println("------------------------------------------------");
            totalRecaudado += mascotas[i].valorConsulta();
        }
        System.out.println("TOTAL RECAUDADO:$" + totalRecaudado);
        System.out.println("\nprueba de modificacion de michi:");
        System.out.println("antes:" + mascotas[1].descripcion());

        mascotas[1].setPeso(-3);

        System.out.println("despues:" + mascotas[1].descripcion());


    }
}