public abstract class Empleado {

    //superclase con un atributo
    protected String nombre;

    //Constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    //method abstracto
    public abstract double calcularSalario();
}
