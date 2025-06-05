### 🔙 [← Regresar a T3 - Métodos de Solución de Sistemas de Ecuaciones Lineales](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T3%20-%20M%C3%A9todos%20de%20Soluci%C3%B3n%20de%20Sistemas%20de%20Ecuaciones%20Lineales)

#  Tema 3: Método de Gauss-Seidel

##  ¿Qué es el Método de Gauss-Seidel?

El método de Gauss-Seidel es una técnica numérica iterativa para resolver sistemas de ecuaciones lineales. Comienza con una estimación inicial para las incógnitas y, mediante sucesivas aproximaciones, va actualizando estos valores utilizando directamente las ecuaciones del sistema.

A diferencia del método de Jacobi, el método de Gauss-Seidel emplea inmediatamente los valores recién calculados dentro de la misma iteración, lo que generalmente conduce a una convergencia más rápida.

Este método es especialmente adecuado para sistemas grandes y dispersos, comunes en áreas como simulaciones estructurales, dinámica de fluidos o análisis térmico. Para garantizar que el método converja, la matriz de coeficientes debe ser diagonalmente dominante o simétrica definida positiva.

---

##  Pseudocódigo del Método

```plaintext
Inicio
  Definir n, A[n][n], b[n], x[n], xNuevo[n]
  Inicializar x con ceros
  Definir tolerancia y máximo número de iteraciones

  Mientras no se alcance la tolerancia o el máximo de iteraciones:
    Para cada variable i:
      Calcular la suma de A[i][j] * x[j] para j ≠ i
      Actualizar xNuevo[i] = (b[i] - suma) / A[i][i]
      Calcular el error con respecto al valor anterior
      Asignar x[i] = xNuevo[i]

    Mostrar valores de x[i] en la iteración actual
    Si el error < tolerancia, detener
Fin
```
