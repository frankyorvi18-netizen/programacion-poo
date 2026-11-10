package pe.edu.upeu;

public class alumno extends persona{

    int codigo;

    public alumno(String nombre, int edad, int codigo) {
        super(nombre, edad);
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo = codigo;

    }
    @Override
    public void mostrarDatos(){
        System.out.println("codigo: "+ codigo);
        super.mostrarDatos();
        System.out.println("------------");
    }
}
