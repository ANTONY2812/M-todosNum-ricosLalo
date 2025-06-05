### 🔙 [← Regresar a T6 - Solución de Ecuaciones Diferenciales](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T6%20-%20Soluci%C3%B3n%20de%20Ecuaciones%20Diferenciales)

#   Tema 6: Método de un paso



## Introducción

Los métodos de un solo paso son técnicas numéricas utilizadas para resolver ecuaciones diferenciales ordinarias (EDO), en las que el siguiente valor de la solución se calcula únicamente a partir del punto actual, sin necesidad de conservar resultados anteriores. Esta simplicidad en la lógica los hace ideales para introducirse en el análisis numérico.

Algunos de los métodos más representativos dentro de esta categoría son:

🔹 Euler, el más simple y directo, aunque con precisión limitada.

🔹 Heun, una versión mejorada también conocida como Runge-Kutta de segundo orden.

🔹 Runge-Kutta de orden 4, uno de los más utilizados por su balance entre precisión y eficiencia.

Cada uno de estos métodos ofrece distintos niveles de aproximación y estabilidad. Aunque pueden requerir pasos pequeños para mantener la precisión, su facilidad de implementación y buen rendimiento en muchos problemas los hacen una herramienta esencial en el estudio de EDOs.

---


##  Pseudocódigo – Método de Heun

```text
Inicio
  Función f(x, y)
    Retornar -2 * x * y
  Fin Función

  Definir a, b, h como reales
  Definir n como entero
  Definir x[n+1], y[n+1] como vectores reales
  Definir i como entero
  Definir k1, k2 como reales

  a = 0.0
  b = 1.0
  h = 0.2
  n = 5
  y[0] = 1.0

  Para i = 0 hasta n
    x[i] = a + i * h
  Fin Para

  Para i = 0 hasta n-1
    k1 = f(x[i], y[i])
    k2 = f(x[i] + h, y[i] + h * k1)
    y[i+1] = y[i] + (h / 2) * (k1 + k2)
  Fin Para

  Para i = 0 hasta n
    Imprimir "x = ", x[i], ", y = ", y[i]
  Fin Para
Fin
```
---

##  Código Base en Java

```java
public class CodigoBaseHeunMethod {
    public static double f(double x, double y) {
        return -2 * x * y;
    }

    public static void main(String[] args) {
        double a = 0.0, b = 1.0, h = 0.2;
        int n = 5;
        double[] x = new double[n + 1];
        double[] y = new double[n + 1];
        y[0] = 1.0;

        for (int i = 0; i <= n; i++) {
            x[i] = a + i * h;
        }

        for (int i = 0; i < n; i++) {
            double k1 = f(x[i], y[i]);
            double k2 = f(x[i] + h, y[i] + h * k1);
            y[i + 1] = y[i] + (h / 2) * (k1 + k2);
        }

        for (int i = 0; i <= n; i++) {
            System.out.println("x = " + x[i] + ", y = " + y[i]);
        }
    }
}
```

---

##  Ejemplo Funcional en Java

```java
public class HeunMethod {
    public static class SolutionPoint {
        public final double x, y;
        public SolutionPoint(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    public static SolutionPoint[] solveHeun(double a, double b, double h, double y0) {
        if (a >= b || h <= 0)
            throw new IllegalArgumentException("El intervalo debe ser a < b y h debe ser positivo");

        int n = (int) Math.ceil((b - a) / h);
        double[] x = new double[n + 1];
        double[] y = new double[n + 1];
        SolutionPoint[] solution = new SolutionPoint[n + 1];

        for (int i = 0; i <= n; i++) {
            x[i] = a + i * h;
            if (i == n && Math.abs(x[i] - b) > 1e-10) x[i] = b;
        }

        y[0] = y0;

        for (int i = 0; i < n; i++) {
            double k1 = f(x[i], y[i]);
            double k2 = f(x[i] + h, y[i] + h * k1);
            y[i + 1] = y[i] + (h / 2) * (k1 + k2);
        }

        for (int i = 0; i <= n; i++) {
            solution[i] = new SolutionPoint(x[i], y[i]);
        }

        return solution;
    }

    public static double f(double x, double y) {
        return -2 * x * y;
    }

    public static void main(String[] args) {
        double a = 0.0, b = 1.0, h = 0.2, y0 = 1.0;

        try {
            SolutionPoint[] solution = solveHeun(a, b, h, y0);
            System.out.printf("Método de Heun (Runge-Kutta de orden 2):%n");
            System.out.printf("Ecuación diferencial: dy/dx = -2xy%n");
            System.out.printf("Condición inicial: y(%.1f) = %.3f%n", a, y0);
            System.out.printf("Intervalo: [%.1f, %.1f], h = %.1f%n", a, b, h);
            System.out.println("Resultados:");
            for (SolutionPoint p : solution) {
                System.out.printf("x = %.1f, y = %.3f%n", p.x, p.y);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

---

##  Caso de prueba

```text
Método de Heun (Runge-Kutta de orden 2):
Ecuación diferencial: dy/dx = -2xy
Condición inicial: y(0.0) = 1.000
Intervalo: [0.0, 1.0], h = 0.2
Resultados:
x = 0.0, y = 1.000
x = 0.2, y = 0.992
x = 0.4, y = 0.938
x = 0.6, y = 0.826
x = 0.8, y = 0.683
x = 1.0, y = 0.548
```

### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)
