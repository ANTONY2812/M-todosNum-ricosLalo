### 🔙 [← Regresar a T3 - Métodos de Solución de Sistemas de Ecuaciones Lineales](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T3%20-%20M%C3%A9todos%20de%20Soluci%C3%B3n%20de%20Sistemas%20de%20Ecuaciones%20Lineales)

#  Tema 3: Método de Gauss-Jordan

##  ¿Qué es el Método de Gauss-Jordan?

El método de Gauss-Jordan es una extensión del método de eliminación de Gauss. Mientras que este último transforma la matriz aumentada en una forma escalonada, el método de Gauss-Jordan la lleva hasta su forma reducida por filas, eliminando también los elementos fuera de la diagonal principal. El resultado es que la matriz de coeficientes se convierte en una matriz identidad, lo que permite obtener las soluciones del sistema de manera directa.

Gracias a este proceso, se evita la necesidad de realizar sustitución regresiva y además se pueden lograr otros objetivos importantes, como:

Resolver sistemas de ecuaciones de forma más sencilla y directa.

Calcular la inversa de una matriz con facilidad.

Identificar claramente si un sistema no tiene solución o tiene infinitas soluciones.claridad.


---

## ⚙️ Pseudocódigo

```plaintext
Inicio
  Definir n, A[n][n], b[n], x[n]
  Inicializar matriz A y vector b con los valores del sistema

  Para cada fila k de 0 a n-1:
    Si el pivote A[k][k] es cero:
      Mostrar error y terminar
    Normalizar la fila k dividiendo por el pivote
    Aplicar eliminación a todas las demás filas para anular la columna k

  Al finalizar, el vector b contiene las soluciones
  Mostrar el resultado
Fin
```
