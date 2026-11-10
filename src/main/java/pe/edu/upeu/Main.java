package pe.edu.upeu;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner fran = new Scanner(System.in);
        ArrayList<alumno> listaalumnos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n---- SISTEMA ALUMNOS ----");
            System.out.println("1. Registrar alumnos");
            System.out.println("2. listar alunmos");
            System.out.println("3. Modificar alumnos");
            System.out.println("4. Eliminar alumnos");
            System.out.println("5. Salir");
            System.out.println("Elija una opcion:");
            opcion = fran.nextInt();
            fran.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el codigo del alumno:");
                    int codigo = fran.nextInt();
                    fran.nextLine();
                    System.out.println("Ingresa el nombre del alumno:");
                    String nombre = fran.nextLine();
                    System.out.println("Ingresa la edad del alumno:");
                    int edad = fran.nextInt();

                    // Creando el objeto
                    alumno nuevo = new alumno(nombre, edad, codigo);
                    listaalumnos.add(nuevo);
                    System.out.println("alumno registrado correctamente!");
                    break;

                case 2:
                    if (listaalumnos.isEmpty()) {
                        System.out.println("No hay alumnos registrados.");
                    } else {
                        System.out.println("\n--- LISTA DE ALUMNOS ---");
                        for (int i = 0; i < listaalumnos.size(); i++) {
                            System.out.print("[" + i + "] "); // Muestra el índice opcional
                            listaalumnos.get(i).mostrarDatos();
                        }
                    }
                    break;

                case 3:
                    System.out.println("ingrese el codigo del alumno a modificar:");
                    int buscarMod = fran.nextInt();
                    fran.nextLine(); // Limpiar buffer
                    boolean encontradoMod = false;

                    for (int i = 0; i < listaalumnos.size(); i++) {
                        if (listaalumnos.get(i).getCodigo() == buscarMod) {
                            System.out.println("ingrese nuevo nombre:");
                            listaalumnos.get(i).nombre = fran.nextLine();

                            System.out.println("ingrese nueva edad:");
                            listaalumnos.get(i).edad = fran.nextInt();

                            System.out.println("ingrese nuevo codigo:");
                            listaalumnos.get(i).codigo = fran.nextInt();

                            System.out.println("alumno modificado correctamente!");
                            encontradoMod = true;
                            break;
                        }
                    }
                    if (!encontradoMod) {
                        System.out.println("alumno no encontrado con ese codigo.");
                    }
                    break;

                case 4:
                    System.out.println("ingrese el codigo del alumno a eliminar:");
                    int buscarEliminar = fran.nextInt();
                    boolean encontradoEliminar = false;

                    for (int i = 0; i < listaalumnos.size(); i++) {
                        if (listaalumnos.get(i).getCodigo() == buscarEliminar) {
                            listaalumnos.remove(i);
                            System.out.println("alumno eliminado correctamente");
                            encontradoEliminar = true;
                            break;
                        }
                    }
                    if (!encontradoEliminar) {
                        System.out.println("Alumno no encontrado con ese codigo.");
                    }
                    break;

                case 5:
                    System.out.println("saliendo del sistema...");
                    break;

                default:
                    System.out.println("opcion no valida. intente de nuevamente :(6taifaiuastpt");
            }

        } while (opcion != 5);

    }
}
