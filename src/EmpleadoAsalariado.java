public class EmpleadoAsalariado extends Empleado {

    //subclase de empleado que incorpora el atributo salario mensual
    private double salarioMensual;

    //constructor de la subclase
    public EmpleadoAsalariado(String nombre, double salarioMensual) {
        super(nombre);
        this.salarioMensual = salarioMensual;
    }

    //method sobreescrito
    @Override
    public double calcularSalario() {
        return salarioMensual;
    }
}
