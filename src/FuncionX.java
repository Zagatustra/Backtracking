public class FuncionX {
            private static void FuncionX() {
            // Bloque 1
            System.out.println("Bloque 1");

            // Bloque 2
            System.out.println("Bloque 2");

            // Bloque 3
            System.out.println("Bloque 3");

            try {
                // Bloque 4 (intento provocar una excepción aritmética)
                int resultado = 10 / 2; // Se cambió el divisor para evitar la excepción

                // Bloque 4 - No hay excepción aritmética
                System.out.println("Bloque 4 - No hay excepción aritmética");
            }catch(ArithmeticException e1){
                // Bloque 5
                System.out.println("Bloque 5");

                // Bloque 6
                System.out.println("Bloque 6");

                try {
                    // Bloque 7 (intento provocar una excepción de puntero nulo)
                    String cadena = "Ejemplo";
                    int longitud = cadena.length();

                    // Bloque 7 - No hay excepción de puntero nulo
                    System.out.println("Bloque 7 - No hay excepción de puntero nulo");
                } catch (NullPointerException e2) {
                    // Bloque 8
                    System.out.println("Bloque 8 - Excepción de puntero nulo: " + e2.getMessage());
                }

                // Bloque 9
                System.out.println("Bloque 9");

                try {
                    // Bloque 10
                    System.out.println("Bloque 10");
                } catch (ArrayIndexOutOfBoundsException e3) {
                    // Bloque 11
                    System.out.println("Bloque 11");
                }

                // Bloque 12
                System.out.println("Bloque 12");

            }
            catch (ArrayIndexOutOfBoundsException e4) {
                // Bloque 13
                System.out.println("Bloque 13");

            } catch (Exception e) {
                // Bloque 14
                System.out.println("Bloque 14");

            } finally {
                // Bloque 15
                System.out.println("Bloque 15");
            }
            // Bloque 16
            System.out.println("Bloque 16");
        }


    public static void main(String[] args) {
        // Llamada a la función para probar los bloques de código
        FuncionX();
    }
}
