public class EjemploCicloWhile {

    public static void main(String[] args) {

        int contador = 0;
        int contadorAcumulado=0;

        // mientras que condicion sea verdadero
        System.out.println("Ciclo While");
        while (contador <= 10) {

            System.out.println(contador);
            contador++;
            contadorAcumulado=contadorAcumulado+contador;

        }

        System.out.println("El valor acumulado es:"+contadorAcumulado);

        System.out.println("Ciclo for");
        for (int i = 0; i <= 10; i++) {

            System.out.println(i);

        }

    }

}
