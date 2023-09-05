import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        System.out.println("**** Aplicación Calculadora ****");
        while(true){
            // Show menu
            showMenu();

            try {
                var operacion = Integer.parseInt(consola.nextLine());
                // Revisar que este dentro de las opciones mencionadas
                if (operacion >= 1 && operacion <= 4) {
                    // Ejecutamos la operación deseada
                    operationAritmetic(operacion, consola); // Pasamos los argumentos al constructor

                } else if (operacion == 5) { //Salir
                    System.out.println("Hasta pronto!");
                    break;

                } else {
                    System.out.println("Opcion erronea:" + operacion);
                }
                // Imprimimos un salto antes de repetir el ciclo
                System.out.println();
            } // Fin try
            catch (Exception e){
                System.out.println("Ocurrior un error: " + e.getMessage());

            }
        }// Fin de while

    } // Fin del metodo main

    private static void showMenu(){

        // System.out.println("1. Suma \n2.Resta \n3.Multiplicación \n4.");
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    """);
        System.out.println("Operación a realizar");

    }

    private static void operationAritmetic(int operacion, Scanner consola) {

        // Operando 1
        System.out.print("Proporciona valor operando 1:");
        var operando1 = Double.parseDouble(consola.nextLine());

        // Operando 2
        System.out.print("Proporciona valor operando 2:");
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado;
        switch (operacion) {
            case 1 -> { // Suma
                resultado = operando1 + operando2;
                System.out.println("Resultado de la suma: " + resultado);
            }
            case 2 -> { // Resta
                resultado = operando1 - operando2;
                System.out.println("Resultado de la resta:  " + resultado);
            }
            case 3 -> { // Multiplicacion
                resultado = operando1 * operando2;
                System.out.println("Resultado de la Multiplicación: " + resultado);
            }
            case 4 -> { // Division
                resultado = operando1 / operando2;
                System.out.println("Resultado de  la División: " + resultado);
            }
            default ->
                    System.out.println("** Opción errónea ** \nSe recibe el valor:" + operacion);

        }


    }

} // Fin de class
