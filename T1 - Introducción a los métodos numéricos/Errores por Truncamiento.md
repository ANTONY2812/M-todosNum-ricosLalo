### 🔙 [← Regresar a T1 - Introducción a los métodos numéricos](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T1%20-%20Introducci%C3%B3n%20a%20los%20m%C3%A9todos%20num%C3%A9ricos)

#  Tema 1: Error de Truncamiento

---

### ¿Qué es?

El error de truncamiento aparece cuando se limita una operación matemática que, en teoría, debería continuar indefinidamente. Esto sucede, por ejemplo, al aproximar funciones mediante series como la de Taylor y se decide cortar la serie después de cierto número de términos. Al omitir los términos restantes, se introduce un error inevitable.

Este tipo de error está directamente relacionado con la cantidad de términos considerados: mientras más términos se usen, más precisa será la aproximación, pero también aumentará el trabajo computacional. Por eso, en muchos casos es necesario buscar un balance entre la exactitud y el rendimiento del cálculo, dependiendo del contexto del problema que se quiere resolver.

---

###  Pseudocódigo

```text
Inicio
  Función funciónReal(x)
    Retornar exp(x)
  Fin Función

  Función aproximacionTaylor(x, n)
    Definir suma como real
    Definir i como entero
    suma = 0
    Para i = 0 hasta n
      suma = suma + (x^i) / factorial(i)
    Fin Para
    Retornar suma
  Fin Función

  Definir x como real
  Definir n como entero
  Definir real como real
  Definir aproximado como real
  x = 1.0
  n = 3
  real = funciónReal(x)
  aproximado = aproximacionTaylor(x, n)
  Imprimir "Valor real: ", real
  Imprimir "Aproximación: ", aproximado
  Imprimir "Error de truncamiento: ", abs(real - aproximado)
Fin
```

### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)
