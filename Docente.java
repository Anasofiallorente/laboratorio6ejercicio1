public class Docente extends Persona {
    private String especialidad;
    private int horas;
    private double valorHora;

    public Docente(String id, String nombre, int edad, String esp, int h, double v) {
        super(id, nombre, edad);
        this.especialidad = esp;
        this.horas = h;
        this.valorHora = v;
    }

    public double calcularPago() {
        return (horas * valorHora) * 0.88;
    }

    @Override
    public String toString() {
        return super.toString() + " / Especialidad: " + especialidad + " / Pago: " + calcularPago();
    }
}