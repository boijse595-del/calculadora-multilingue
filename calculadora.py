# 1. DELEGACIÓN DE TAREAS EN FUNCIONES INDEPENDIENTES
def sumar(a, b):
    return a + b

def restar(a, b):
    return a - b

def multiplicar(a, b):
    return a * b

def dividir(a, b):
    # Estructura condicional para prevenir la división por cero
    if b == 0:
        return "Error: No se puede dividir entre cero."
    return a / b

# 2. FUNCIÓN PRINCIPAL CON EL BUCLE CONTINUO
def ejecutar_calculadora():
    # Bucle continuo que previene el reinicio abrupto
    while True:
        print("\n=== CALCULADORA MULTILINGÜE (Python) ===")
        print("1. Sumar")
        print("2. Restar")
        print("3. Multiplicar")
        print("4. Dividir")
        print("5. Salir del programa")
        
        # Estructura condicional para discriminar la operación deseada
        opcion = input("Selecciona una opción (1-5): ")
        
        if opcion == '5':
            print("Saliendo de la aplicación. ¡Hasta luego!")
            break  # Rompe el bucle continuo y cierra el programa de forma segura
            
        if opcion in ['1', '2', '3', '4']:
            # Definición precisa de variables (convertimos el texto introducido a números decimales)
            try:
                num1 = float(input("Ingresa el primer número: "))
                num2 = float(input("Ingresa el segundo número: "))
            except ValueError:
                print("Error: Por favor, ingresa solo números válidos.")
                continue # Regresa al inicio del bucle si el usuario se equivoca al teclear
            
            # Discriminación de operaciones usando condicionales (if / elif)
            if opcion == '1':
                print(f"Resultado de la suma: {sumar(num1, num2)}")
            elif opcion == '2':
                print(f"Resultado de la resta: {restar(num1, num2)}")
            elif opcion == '3':
                print(f"Resultado de la multiplicación: {multiplicar(num1, num2)}")
            elif opcion == '4':
                print(f"Resultado: {dividir(num1, num2)}")
        else:
            print("Opción no válida. Por favor, selecciona un número del 1 al 5.")

# Iniciar la aplicación
if __name__ == "__main__":
    ejecutar_calculadora()
