import java.util.Scanner;// importamos la clase Sccaner para leer datos del usuario

public class semana2_edad {
    public static void main(String[] args) {
        // creamos un objeto scanner para leer desde el teclado
        Scanner scanner = new Scanner(System.in);
        // pedimos al usuario que introducta su nombre
        System.out.print("Por favor, introduce tu nombre: ");
        // variable tipo string para guardar el nombre del usuario
        String nombre = scanner.nextLine();
        // pedimos al usaurio que introduzca su año de nacimiento
        System.out.print("Por favor, introduce tu año de nacimiento: ");
        // variable tipo int guarda el año de nacimiento
        int birthYear = scanner.nextInt();
        // variable costante (fija)con el año actual
        int currentYear = 2025;
        // Variable que almacena la edad calculada restando el año actual menos el año de nacimiento
        int edad = currentYear - birthYear;
        // Muestra en pantalla el nombre del usuario junto con su edad
        System.out.println(nombre + ", tu edad aproximada es: " + edad + " años");
        //// Cerramos el objeto Scanner
        scanner.close();
}
}
