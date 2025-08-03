import java.util.Scanner;

public class notasestudiantes {

    // Método para obtener el promedio de tres calificaciones
    public static double obtenerPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    // Verifica si un estudiante aprueba con el promedio dado
    public static String verificarEstado(double promedio) {
        return promedio >= 61 ? "Aprobado" : "Reprobado";
    }

    // Imprime los resultados finales
    public static void imprimirResultados(String[] estudiantes, double[] promedios, String[] resultados) {
        System.out.println("\n--- Resultados Finales ---");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.printf("Estudiante: %-12s | Promedio: %.2f | Estado: %s\n",
                    estudiantes[i], promedios[i], resultados[i]);
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int LIMITE = 5;

        System.out.print("Ingrese la cantidad de estudiantes (1 a 5): ");
        int total = entrada.nextInt();
        entrada.nextLine(); // limpiar buffer

        if (total < 1 || total > LIMITE) {
            System.out.println("Número no permitido. Intente de nuevo con un valor entre 1 y 5.");
            return;
        }

        String[] alumnos = new String[total];
        double[] medias = new double[total];
        String[] estadoFinal = new String[total];

        for (int i = 0; i < total; i++) {
            System.out.println("\nEstudiante #" + (i + 1));
            System.out.print("Nombre: ");
            alumnos[i] = entrada.nextLine();

            double[] notas = new double[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[j] = entrada.nextDouble();
            }
            entrada.nextLine(); // limpiar salto de línea

            double promedioActual = obtenerPromedio(notas);
            medias[i] = promedioActual;
            estadoFinal[i] = verificarEstado(promedioActual);
        }

        imprimirResultados(alumnos, medias, estadoFinal);
        entrada.close();
    }
}
