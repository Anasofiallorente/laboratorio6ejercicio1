public class Estudiante extends Persona {
    private String codigo;

    public Estudiante(String id, String nombre, int edad, String codigo) {
        super(id, nombre, edad);
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return super.toString() + "  Código: " + codigo;
    }
}
