import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {//Funcion Principal
    static Scanner scanner = new Scanner(System.in);
    Literatura literatura1 = new Literatura("Drama", "Gabriel Garcia Marquez", 2006, 4, "Mil y una noches");
    Literatura literatura2 = new Literatura("Romance", "Sheakspear", 1970, 1, "Romeo y Julieta");
    Literatura literatura3 = new Literatura("Cientifico", "Newton", 1720, 1, "Algebra");
    Literatura literatura4 = new Literatura("Ficcion", "John Hammond", 2006, 3, "Jurasick Park");
    Literatura literatura5 = new Literatura("Ciencias", "Charles Darwin", 1960, 1, "La evolucion de las especies");

    public static void Menu_Opciones(String[] args) {//Menu de opciones
        int opcion;
        System.out.println("Elija la opcion de Literatura que desea visualizar: ");
        System.out.println("1.) Drama");
        System.out.println("2.) Romance");
        System.out.println("3.) Cientifico");
        System.out.println("4.) Ficcion");
        System.out.println("5.) ciencias");
        System.out.println("1.) Drama");
        System.out.print("Digite la opcion seleccionada: ");
        opcion = scanner.nextInt();
        while (opcion < 1 || opcion > 5) {
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Detalles de la literatura");
                        mostrardetalle(libro1);
                    } while (opcion == 1);
                    break;
                case 2:
                    do {
                        System.out.println("Detalles de la literatura");
                        mostrardetalle(libro2);
                    } while (opcion == 2);
                    break;
                case 3:
                    do {
                        System.out.println("Detalles de la literatura");
                        mostrardetalle(libro3);
                    } while (opcion == 3);
                    break;
                case 4:
                    do {
                        System.out.println("Detalles de la literatura");
                        mostrardetalle(libro4);
                    } while (opcion == 4);
                    break;
                case 5:
                    do {
                        System.out.println("Detalles de la literatura");
                        mostrardetalle(libro5);
                    } while (opcion == 5);
                    break;
                case 6:
                    System.out.println("Salir");
                    break;
                default:
            }

        }

    }
//Mostrar detalles de la Literatura
public static void mostrardetalle(Literatura libro){
    System.out.println("Detalles de la pelicula");
    System.out.println("Tipo: " +libro.getTipo());
    System.out.println("Autor: " +libro.getAutor());
    System.out.println("Año: " +libro.getAnio());
    System.out.println("Edicion: " +libro.getEdicion());
    System.out.println("Titulo: " +libro.getTitulo());
    }
}

