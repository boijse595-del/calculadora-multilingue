# 1. DELEGACIÓN DE TAREAS EN FUNCIONES INDEPENDIENTES
sumar <- function(a, b) {
  return(a + b)
}

restar <- function(a, b) {
  return(a - b)
}

multiplicar <- function(a, b) {
  return(a * b)
}

dividir <- function(a, b) {
  # Estructura condicional para prevenir la división por cero
  if (b == 0) {
    return("Error: No se puede dividir entre cero.")
  }
  return(a / b)
}

# 2. FUNCIÓN PRINCIPAL CON EL BUCLE CONTINUO
ejecutar_calculadora <- function() {
  # Bucle continuo (en R se usa while con TRUE en mayúsculas)
  while (TRUE) {
    cat("\n=== CALCULADORA MULTILINGÜE (R) ===\n")
    cat("1. Sumar\n")
    cat("2. Restar\n")
    cat("3. Multiplicar\n")
    cat("4. Dividir\n")
    cat("5. Salir del programa\n")
    
    # Leer la opción del usuario
    opcion <- readline(prompt = "Selecciona una opción (1-5): ")
    
    # Condicional para salir de forma segura
    if (opcion == "5") {
      cat("Saliendo de la aplicación. ¡Hasta luego!\n")
      break
    }
    
    if (opcion %in% c("1", "2", "3", "4")) {
      # Definición precisa de variables (convertimos la entrada a tipo numérico)
      num1 <- as.numeric(readline(prompt = "Ingresa el primer número: "))
      num2 <- as.numeric(readline(prompt = "Ingresa el segundo número: "))
      
      # Validación por si el usuario no introduce un número válido
      if (is.na(num1) || is.na(num2)) {
        cat("Error: Por favor, ingresa solo números válidos.\n")
        next # Salta al inicio del bucle
      }
      
      # Discriminación de operaciones usando condicionales
      if (opcion == "1") {
        cat("Resultado de la suma:", sumar(num1, num2), "\n")
      } else if (opcion == "2") {
        cat("Resultado de la resta:", restar(num1, num2), "\n")
      } else if (opcion == "3") {
        cat("Resultado de la multiplicación:", multiplicar(num1, num2), "\n")
      } else if (opcion == "4") {
        cat("Resultado:", dividir(num1, num2), "\n")
      }
    } else {
      cat("Opción no válida. Por favor, selecciona un número del 1 al 5.\n")
    }
  }
}

# Iniciar la aplicación
ejecutar_calculadora()
