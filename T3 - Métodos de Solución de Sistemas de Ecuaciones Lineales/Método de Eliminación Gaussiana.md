#  Tema 3: Método de Eliminación Gaussiana


---

##  ¿Qué es la Eliminación Gaussiana?

La eliminación gaussiana es un procedimiento algebraico para resolver sistemas de ecuaciones lineales, que consiste en transformar la matriz aumentada del sistema en una forma escalonada mediante una serie de operaciones elementales sobre las filas:

Intercambiar dos filas entre sí.

Multiplicar una fila por un número distinto de cero.

Sumar o restar a una fila un múltiplo de otra fila.

Una vez obtenida la matriz en forma escalonada, se utiliza la sustitución regresiva para calcular las soluciones del sistema.

 Este método es muy efectivo para sistemas de tamaño pequeño o mediano. Sin embargo, para sistemas grandes o con condiciones numéricas delicadas, se recomienda emplear técnicas adicionales como el pivoteo parcial o total para mejorar la estabilidad y precisión del cálculo.



---


## 🧾 Pseudocódigo

```text
Inicio
  Definir A[n][n] y b[n]
  Inicializar matriz aumentada y vector de términos independientes

  // Eliminación hacia adelante
  Para k = 0 hasta n-2
    Si A[k][k] = 0
      Mostrar "Pivote nulo"
      Terminar
    Fin Si
    Para i = k+1 hasta n-1
      factor = A[i][k] / A[k][k]
      Para j = k hasta n-1
        A[i][j] -= factor * A[k][j]
      Fin Para
      b[i] -= factor * b[k]
    Fin Para
  Fin Para

  // Sustitución regresiva
  x[n-1] = b[n-1] / A[n-1][n-1]
  Para i = n-2 hasta 0 con paso -1
    suma = 0
    Para j = i+1 hasta n-1
      suma += A[i][j] * x[j]
    Fin Para
    x[i] = (b[i] - suma) / A[i][i]
  Fin Para

  Mostrar solución x
Fin
````

