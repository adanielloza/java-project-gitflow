public class Main {
    public static void main(String[] args) {
        Saludo saludo = new Saludo();
        Despedida despedida = new Despedida();
        System.out.println(saludo.generarSaludo("Mundo"));
        System.out.println("Versión 1.0.0 lista para producción.");
        System.out.println(despedida.generarDespedida("Mundo"));
        System.out.println("***************");
        System.out.println("* JAVA PROJECT *");
        System.out.println("***************");
    }
}