public class Persona {
    private String id;
    private String nombre;
    private int edad;

    // Constructor de Persona
    public Persona(String id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método toString para mostrar info básica
    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Edad: " + edad;
    }

    // --- EL MÉTODO MAIN AQUÍ ADENTRO ---
    public static void main(String[] args) {
        // Creamos los objetos para probar
        Estudiante est = new Estudiante("101", "Lucas Gomez", 20, "2024-ABC");
        Docente prof = new Docente("202", "Marta Sanchez", 45, "Sistemas", 40, 50000);
        Administrativo adm = new Administrativo("303", "Roberto Rico", 50, "Contador", 2000000);

        // Imprimimos los resultados
        System.out.println("=== SISTEMA INSTITUCIONAL ===");
        System.out.println(est);
        System.out.println(prof);
        System.out.println(adm);
    }
}