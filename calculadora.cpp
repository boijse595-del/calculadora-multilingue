#include <iostream>

using namespace std;

// 1. DELEGACIÓN DE TAREAS EN FUNCIONES INDEPENDIENTES
double sumar(double a, double b) {
    return a + b;
}

double restar(double a, double b) {
    return a - b;
}

double multiplicar(double a, double b) {
    return a * b;
}

// Estructura condicional interna para prevenir la división por cero
void dividir(double a, double b) {
    if (b == 0) {
        cout << "Error: No se puede dividir entre cero." << endl;
    } else {
        cout << "Resultado de la division: " << (a / b) << endl;
    }
}

// Función principal donde corre el flujo del programa
int main() {
    int opcion;
    double num1, num2;

    // 2. BUCLE CONTINUO
    while (true) {
        cout << "\n=== CALCULADORA MULTILINGUE (C++) ===" << endl;
        cout << "1. Sumar" << endl;
        cout << "2. Restar" << endl;
        cout << "3. Multiplicar" << endl;
        cout << "4. Dividir" << endl;
        cout << "5. Salir del programa" << endl;
        cout << "Selecciona una opcion (1-5): ";
        cin >> opcion;

        // Condicional para salir del bucle continuo de forma segura
        if (opcion == 5) {
            cout << "Saliendo de la aplicacion. ¡Hasta luego!" << endl;
            break; 
        }

        // Estructuras condicionales para discriminar la operacion deseada
        if (opcion >= 1 && opcion <= 4) {
            cout << "Ingresa el primer numero: ";
            cin >> num1;
            cout << "Ingresa el segundo numero: ";
            cin >> num2;

            if (opcion == 1) {
                cout << "Resultado de la suma: " << sumar(num1, num2) << endl;
            } else if (opcion == 2) {
                cout << "Resultado de la resta: " << restar(num1, num2) << endl;
            } else if (opcion == 3) {
                cout << "Resultado de la multiplicacion: " << multiplicar(num1, num2) << endl;
            } else if (opcion == 4) {
                dividir(num1, num2);
            }
        } else {
            cout << "Opcion no valida. Por favor, selecciona un numero del 1 al 5." << endl;
        }
    }

    return 0;
}
