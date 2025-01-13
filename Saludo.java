public class Saludo {
    // Método sobrecargado para un solo argumento (idioma predeterminado: "es")
    public String generarSaludo(String nombre) {
        return generarSaludo(nombre, "es");
    }

    // Método principal que acepta nombre e idioma
    public String generarSaludo(String nombre, String idioma) {
        if (nombre == null || nombre.isEmpty()) {
            nombre = "Invitado";
        }

        switch (idioma.toLowerCase()) {
            case "es":
                return "¡Hola, " + nombre + "!";
            case "en":
                return "Hello, " + nombre + "!";
            case "fr":
                return "Bonjour, " + nombre + "!";
            default:
                return "¡Hola, " + nombre + "!";
        }
    }
}
