public class Administrativo extends Persona {
    private String cargo;
    private double salarioFijo;

    public Administrativo(String id, String nombre, int edad, String cargo, double salario) {
        super(id, nombre, edad);
        this.cargo = cargo;
        this.salarioFijo = salario;
    }

    public double calcularPago() {
        return salarioFijo * 0.88;
    }

    @Override
    public String toString() {
        return super.toString() + " / Cargo: " + cargo + " / Pago: " + calcularPago();
    }
}