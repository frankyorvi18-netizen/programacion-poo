package pe.edu.upeu;

public class persona {
    public int codigo;
    protected String nombre;
    protected int edad;

    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("nombre "+ nombre);
        System.out.println("nombre"+edad);
        System.out.println("nombre"+codigo);
    }
}
