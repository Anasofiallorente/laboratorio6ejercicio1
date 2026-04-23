   public static void main(String[] args) {
        
        Estudiante est = new Estudiante("101", "Lucas Gomez", 20, "2024-ABC");
        Docente prof = new Docente("202", "Marta Sanchez", 45, "Sistemas", 40, 50000);
        Administrativo adm = new Administrativo("303", "Roberto Rico", 50, "Contador", 2000000);

     
        System.out.println("=== SISTEMA INSTITUCIONAL ===");
        System.out.println(est);
        System.out.println(prof);
        System.out.println(adm);
    }
}
