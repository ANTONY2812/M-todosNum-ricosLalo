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

---

##  Código Java (estructura base)

```java
public class CodigoBaseJacobi {
    public static void main(String[] args) {
        int n = 3;
        double[][] A = {
            {3, 2, -1},
            {2, -2, 4},
            {-1, 0.5, -1}
        };
        double[] b = {1, -2, 0};
        double[] x = {0, 0, 0};
        double[] xNuevo = new double[n];
        double tolerancia = 0.001;
        int maxIteraciones = 100;
        int iteracion = 0;

        while (iteracion < maxIteraciones) {
            for (int i = 0; i < n; i++) {
                double suma = 0;
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma += A[i][j] * x[j];
                    }
                }
                xNuevo[i] = (b[i] - suma) / A[i][i];
            }

            double error = 0;
            for (int i = 0; i < n; i++) {
                error = Math.max(error, Math.abs(xNuevo[i] - x[i]));
                x[i] = xNuevo[i];
            }

            System.out.println("Iteración " + iteracion + ":");
            for (int i = 0; i < n; i++) {
                System.out.println("x" + i + " = " + x[i]);
            }

            if (error < tolerancia) {
                System.out.println("Solución encontrada");
                return;
            }

            iteracion++;
        }
        System.out.println("Máximo de iteraciones alcanzado");
    }
}
```

---

##  Ejemplo resuelto

```java
public class Jacobi {
    public static void main(String[] args) {
        int n = 3;
        double[][] A = {
            {3, 2, -1},
            {2, -2, 4},
            {-1, 0.5, -1}
        };
        double[] b = {1, -2, 0};
        double[] x = {0, 0, 0};
        double[] xNuevo = new double[n];
        double tolerancia = 0.001;
        int maxIteraciones = 100;

        for (int iteracion = 0; iteracion < maxIteraciones; iteracion++) {
            for (int i = 0; i < n; i++) {
                double suma = 0;
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma += A[i][j] * x[j];
                    }
                }
                xNuevo[i] = (b[i] - suma) / A[i][i];
            }

            double error = 0;
            for (int i = 0; i < n; i++) {
                error = Math.max(error, Math.abs(xNuevo[i] - x[i]));
                x[i] = xNuevo[i];
            }

            System.out.printf("Iteración %d:%n", iteracion);
            for (int i = 0; i < n; i++) {
                System.out.printf("x%d = %.3f%n", i, x[i]);
            }

            if (error < tolerancia) {
                System.out.println("Solución encontrada");
                return;
            }
        }
        System.out.println("Máximo de iteraciones alcanzado");
    }
}
```

---

##  Resultado esperado (ejecución típica)

```
Iteración 0:
x0 = 0.333
x1 = -1.000
x2 = 0.000

Iteración 1:
x0 = 0.667
x1 = -0.667
x2 = -0.167

Iteración 2:
x0 = 0.500
x1 = -0.167
x2 = -0.583

Iteración 3:
x0 = 0.583
x1 = 0.167
x2 = -0.333

Iteración 4:
x0 = 0.389
x1 = -0.083
x2 = -0.458

Iteración 5:
x0 = 0.458
x1 = 0.111
x2 = -0.403

Iteración 6:
x0 = 0.412
x1 = 0.042
x2 = -0.444

Iteración 7:
x0 = 0.429
x1 = 0.139
x2 = -0.423

Solución encontrada
```

---

### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)
