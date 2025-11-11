public class Main {
    public static void main(String[] args) {

        //creamos una instancia de cada subclase
        Empleado empleado1 = new EmpleadoAsalariado("Luffy", 1400);
        Empleado empleado2 = new EmpleadoPorHoras("Goku", 30, 30);

        //imprimimos nombre de empleado y su salario
        System.out.println(empleado1.nombre + " - Salario: "  + empleado1.calcularSalario());
        System.out.println(empleado2.nombre + " - Salario: "  + empleado2.calcularSalario());
    }
}
