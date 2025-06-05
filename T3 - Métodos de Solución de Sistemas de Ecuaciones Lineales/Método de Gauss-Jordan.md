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

---

##  Código Java - Base

```java
public class CodigoBaseGaussJordan {
    public static void main(String[] args) {
        int n = 3;
        double[][] A = {{3, 2, -1}, {2, -2, 4}, {-1, 0.5, -1}};
        double[] b = {1, -2, 0};
        double[] x = new double[n];

        for (int k = 0; k < n; k++) {
            if (A[k][k] == 0) {
                System.out.println("Pivote nulo, no se puede resolver");
                return;
            }

            double factor = A[k][k];
            for (int j = 0; j < n; j++) {
                A[k][j] /= factor;
            }
            b[k] /= factor;

            for (int i = 0; i < n; i++) {
                if (i != k) {
                    factor = A[i][k];
                    for (int j = 0; j < n; j++) {
                        A[i][j] -= factor * A[k][j];
                    }
                    b[i] -= factor * b[k];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            x[i] = b[i];
        }

        System.out.println("Solución:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x%d = %.3f%n", i, x[i]);
        }
    }
}
```

---

##  Ejemplo resuelto

```java
public class GaussJordan {
    public static void main(String[] args) {
        int n = 3;
        double[][] A = {{3, 2, -1}, {2, -2, 4}, {-1, 0.5, -1}};
        double[] b = {1, -2, 0};
        double[] x = new double[n];

        for (int k = 0; k < n; k++) {
            if (A[k][k] == 0) {
                System.out.println("Pivote nulo, no se puede resolver");
                return;
            }

            double factor = A[k][k];
            for (int j = 0; j < n; j++) {
                A[k][j] /= factor;
            }
            b[k] /= factor;

            for (int i = 0; i < n; i++) {
                if (i != k) {
                    factor = A[i][k];
                    for (int j = 0; j < n; j++) {
                        A[i][j] -= factor * A[k][j];
                    }
                    b[i] -= factor * b[k];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            x[i] = b[i];
        }

        System.out.println("Solución:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x%d = %.3f%n", i, x[i]);
        }
    }
}
```

---

##  Resultado esperado

```
Entrada:
A = [[3, 2, -1], [2, -2, 4], [-1, 0.5, -1]]
b = [1, -2, 0]

Salida:
x0 = 0.429
x1 = 0.143
x2 = -0.429
```

### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)
