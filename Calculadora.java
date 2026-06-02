import java.util.Scanner; // Importamos esta herramienta para poder leer lo que el usuario teclea

public class Calculadora {

    // 1. DELEGACIÓN DE TAREAS EN FUNCIONES INDEPENDIENTES (Aquí se llaman "Métodos")
    // Usamos 'static' para poder usarlas directamente en el flujo principal
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Usamos 'void' porque esta función imprime el resultado ella misma y no regresa un dato
    public static void dividir(double a, double b) {
        // Estructura condicional para prevenir la división por cero
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
        } else {
            System.out.println("Resultado de la división: " + (a / b));
        }
    }

    // 2. FUNCIÓN PRINCIPAL (El punto de partida obligatorio en todo programa Java)
    public static void main(String[] args) {
        // Creamos un objeto 'scanner' para recibir datos desde la consola
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2;

        // Bucle continuo para prevenir el reinicio abrupto
        while (true) {
            System.out.println("\n=== CALCULADORA MULTILINGÜE (Java) ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir del programa");
            System.out.print("Selecciona una opción (1-5): ");
            
            opcion = scanner.nextInt(); // Lee un número entero

            // Condicional para romper el bucle y salir de forma segura
            if (opcion == 5) {
                System.out.println("Saliendo de la aplicación. ¡Hasta luego!");
                break;
            }

            // Estructuras condicionales para discriminar la operación deseada
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer número: ");
                num1 = scanner.nextDouble(); // Lee un número decimal
                System.out.print("Ingresa el segundo número: ");
                num2 = scanner.nextDouble();

                if (opcion == 1) {
                    System.out.println("Resultado de la suma: " + sumar(num1, num2));
                } else if (opcion == 2) {
                    System.out.println("Resultado de la resta: " + restar(num1, num2));
                } else if (opcion == 3) {
                    System.out.println("Resultado de la multiplicación: " + multiplicar(num1, num2));
                } else if (opcion == 4) {
                    dividir(num1, num2);
                }
            } else {
                System.out.println("Opción no válida. Por favor, selecciona un número del 1 al 5.");
            }
        }
        
        scanner.close(); // Cerramos el lector para liberar memoria
    }
}
