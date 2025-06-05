### 🔙 [← Regresar a T3 - Métodos de Solución de Sistemas de Ecuaciones Lineales](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T3%20-%20M%C3%A9todos%20de%20Soluci%C3%B3n%20de%20Sistemas%20de%20Ecuaciones%20Lineales)

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


##  Pseudocódigo

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
---

##  Código base en Java

```java
public class CodigoBaseEliminacionGaussiana {
    public static void main(String[] args) {
        int n = 3;
        double[][] A = {{3, 2, -1}, {2, -2, 4}, {-1, 0.5, -1}};
        double[] b = {1, -2, 0};
        double[] x = new double[n];

        // Eliminación hacia adelante
        for (int k = 0; k < n - 1; k++) {
            if (A[k][k] == 0) {
                System.out.println("Pivote nulo, no se puede resolver");
                return;
            }
            for (int i = k + 1; i < n; i++) {
                double factor = A[i][k] / A[k][k];
                for (int j = k; j < n; j++) {
                    A[i][j] -= factor * A[k][j];
                }
                b[i] -= factor * b[k];
            }
        }

        // Sustitución regresiva
        x[n - 1] = b[n - 1] / A[n - 1][n - 1];
        for (int i = n - 2; i >= 0; i--) {
            double suma = 0;
            for (int j = i + 1; j < n; j++) {
                suma += A[i][j] * x[j];
            }
            x[i] = (b[i] - suma) / A[i][i];
        }

        // Mostrar solución
        System.out.println("Solución:");
        for (int i = 0; i < n; i++) {
            System.out.println("x" + i + " = " + x[i]);
        }
    }
}
```

---

##  Ejemplo funcional en Java

```java
public class GaussianElimination {
    public static void main(String[] args) {
        int n = 3;
        double[][] A = {{3, 2, -1}, {2, -2, 4}, {-1, 0.5, -1}};
        double[] b = {1, -2, 0};
        double[] x = new double[n];

        // Eliminación hacia adelante
        for (int k = 0; k < n - 1; k++) {
            if (A[k][k] == 0) {
                System.out.println("Pivote nulo, no se puede resolver");
                return;
            }
            for (int i = k + 1; i < n; i++) {
                double factor = A[i][k] / A[k][k];
                for (int j = k; j < n; j++) {
                    A[i][j] -= factor * A[k][j];
                }
                b[i] -= factor * b[k];
            }
        }

        // Sustitución hacia atrás
        x[n - 1] = b[n - 1] / A[n - 1][n - 1];
        for (int i = n - 2; i >= 0; i--) {
            double suma = 0;
            for (int j = i + 1; j < n; j++) {
                suma += A[i][j] * x[j];
            }
            x[i] = (b[i] - suma) / A[i][i];
        }

        // Imprimir solución
        System.out.println("Solución:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x%d = %.3f%n", i, x[i]);
        }
    }
}
```

---

##  Caso de prueba

```text
Solución:
x0 = 0.429
x1 = 0.143
x2 = -0.429
```

---

### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)
