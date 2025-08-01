import java.util.Scanner;

public class notasestudiantes {

    // Función que calcula el promedio de 3 notas
    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    // Función booleana que determina si el estudiante aprueba
    public static boolean estaAprobado(double promedio) {
        return promedio >= 61;
    }

    // Procedimiento para mostrar el resumen de los estudiantes
    public static void mostrarResumen(String[] nombres, double[] promedios, String[] estados, int cantidad) {
        System.out.println("\nResumen de estudiantes:");
        System.out.println("------------------------");
        for (int i = 0; i < cantidad; i++) {
            System.out.printf("Nombre: %-10s Promedio: %.2f     Estado: %s\n",
                    nombres[i], promedios[i], estados[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_ESTUDIANTES = 5;

        System.out.print("¿Cuántos estudiantes desea ingresar? (Máximo 5): ");
        int cantidadEstudiantes = scanner.nextInt();
        scanner.nextLine(); // 🔧 Esta línea limpia el salto de línea pendiente

        // Validar que no se exceda el límite
        if (cantidadEstudiantes < 1 || cantidadEstudiantes > MAX_ESTUDIANTES) {
            System.out.println("Cantidad inválida. Debe ser entre 1 y 5.");
            return;
        }

        // Arreglos para guardar la información
        String[] nombres = new String[cantidadEstudiantes];
        double[] promedios = new double[cantidadEstudiantes];
        String[] estados = new String[cantidadEstudiantes];

        // Recolección de datos
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("\nIngrese el nombre del estudiante #" + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.print("Ingrese la primera nota: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Ingrese la segunda nota: ");
            double nota2 = scanner.nextDouble();
            System.out.print("Ingrese la tercera nota: ");
            double nota3 = scanner.nextDouble();
            scanner.nextLine(); // 🔧 Limpia el buffer para evitar errores al pedir el próximo nombre

            double promedio = calcularPromedio(nota1, nota2, nota3);
            boolean aprobado = estaAprobado(promedio);

            promedios[i] = promedio;
            estados[i] = aprobado ? "Aprobado" : "Reprobado";
        }

        // Mostrar el resumen
        mostrarResumen(nombres, promedios, estados, cantidadEstudiantes);

        scanner.close();
    }
}
