### 🔙 [← Regresar a T3 - Métodos de Solución de Sistemas de Ecuaciones Lineales](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T3%20-%20M%C3%A9todos%20de%20Soluci%C3%B3n%20de%20Sistemas%20de%20Ecuaciones%20Lineales)

#  Tema 3: Método de Jacobi

##  ¿Qué es el Método de Jacobi?

El método de Jacobi es una técnica iterativa para resolver sistemas de ecuaciones lineales que parte de una estimación inicial y actualiza simultáneamente cada variable usando únicamente los valores de la iteración anterior.

A diferencia del método de Gauss-Seidel, no utiliza los valores recién calculados dentro de la misma iteración, sino que espera a que todas las variables sean actualizadas para pasar al siguiente paso. Esto lo convierte en un método ideal para paralelizar los cálculos, aunque generalmente su convergencia es más lenta.

Para asegurar que el método converja, la matriz de coeficientes debe ser diagonalmente dominante o cumplir condiciones similares.

Cuando estas condiciones se cumplen, el método es fácil de implementar y de paralelizar.
Sin embargo, su velocidad de convergencia puede ser menor y no siempre está garantizada.

---

##  Pseudocódigo del Método

```plaintext
Inicio
  Definir n, A[n][n], b[n], x[n], xNuevo[n]
  Inicializar x con ceros
  Definir tolerancia y máximo número de iteraciones

  Mientras no se alcance la tolerancia o máximo de iteraciones:
    Para cada variable i:
      suma = 0
      Para cada j ≠ i:
        suma += A[i][j] * x[j]
      xNuevo[i] = (b[i] - suma) / A[i][i]

    Calcular error máximo entre xNuevo y x
    Actualizar x con valores de xNuevo

    Mostrar valores de x en la iteración actual
    Si error < tolerancia, detener
Fin
```


