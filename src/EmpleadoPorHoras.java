public class EmpleadoPorHoras extends Empleado{

    //subclase de empleado con dos nuevos atributos
    private double pagoPorHora;
    private double horasTrabajadas;

    //Construcotr de esta subclase
    public EmpleadoPorHoras(String nombre, double pagoPorHora, double horasTrabajadas) {
        super(nombre);
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    //Method sobreescrito adaptado a la subclase
    @Override
    public double calcularSalario() {
        return horasTrabajadas*pagoPorHora;
    }
}
