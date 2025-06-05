

#   Tema 6: Método de Euler


---

## ¿Qué es Método de Euler?

El método de Euler es una técnica numérica básica utilizada para resolver ecuaciones diferenciales ordinarias (EDO) de forma aproximada. Su funcionamiento consiste en utilizar la pendiente de la solución (es decir, la derivada) en un punto conocido para estimar el valor de la función en el siguiente punto.

Este método asume que, dentro de pequeños intervalos, la solución puede aproximarse con una línea recta, permitiendo avanzar paso a paso en la construcción de la solución. Es ampliamente empleado como herramienta introductoria debido a su sencillez conceptual y facilidad de codificación.

Aun cuando no ofrece gran precisión —especialmente con pasos grandes o funciones muy variables—, el método de Euler sigue siendo un pilar en la enseñanza de métodos numéricos, sirviendo como base para comprender y desarrollar algoritmos más sofisticados como Runge-Kutta o multietapas.

---



##  Pseudocódigo

```text
Inicio
  Función f(x, y)
    Retornar -2 * x * y
  Fin Función

  Definir a, b, h, n, i
  Definir vectores x[n+1], y[n+1]

  a = 0.0; b = 1.0; h = 0.2; n = 5; y[0] = 1.0

  Para i = 0 hasta n
    x[i] = a + i * h
  Fin Para

  Para i = 0 hasta n-1
    y[i+1] = y[i] + h * f(x[i], y[i])
  Fin Para

  Para i = 0 hasta n
    Imprimir "x = ", x[i], ", y = ", y[i]
  Fin Para
Fin
```

