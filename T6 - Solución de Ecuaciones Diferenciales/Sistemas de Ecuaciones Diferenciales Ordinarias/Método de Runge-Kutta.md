### 🔙 [← Regresar a T6 - Solución de Ecuaciones Diferenciales](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T6%20-%20Soluci%C3%B3n%20de%20Ecuaciones%20Diferenciales)

#   Tema 6: Método de Runge-Kutta


---

##  ¿Qué es Método de Runge-Kutta?

El método de Runge-Kutta representa una familia de algoritmos numéricos diseñados para aproximar soluciones de ecuaciones diferenciales ordinarias (EDO) con gran precisión. El más utilizado es el Runge-Kutta de cuarto orden (RK4), reconocido por ofrecer una excelente relación entre exactitud y esfuerzo computacional.

Este método se basa en calcular varias estimaciones intermedias de la pendiente en cada paso y combinarlas para obtener una predicción más precisa del siguiente valor. Aunque realiza más evaluaciones que métodos como Euler, su precisión lo compensa ampliamente, lo que lo hace ideal en aplicaciones científicas y de ingeniería.




---

##  Pseudocódigo

```text
Función f(x, y)
    Retornar -2 * x * y
Fin Función

a = 0.0; b = 1.0; h = 0.2
n = (b - a) / h
y[0] = 1.0

Para i = 0 hasta n
    x[i] = a + i * h
Fin Para

Para i = 0 hasta n-1
    k1 = f(x[i], y[i])
    k2 = f(x[i] + h/2, y[i] + (h/2) * k1)
    k3 = f(x[i] + h/2, y[i] + (h/2) * k2)
    k4 = f(x[i] + h, y[i] + h * k3)
    y[i+1] = y[i] + (h / 6) * (k1 + 2*k2 + 2*k3 + k4)
Fin Para

Para i = 0 hasta n
    Imprimir x[i], y[i]
Fin Para
```

---

##  Código base en Java

```java
public class CodigoBaseRungeKutta {
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
            double k2 = f(x[i] + h/2, y[i] + (h/2) * k1);
            double k3 = f(x[i] + h/2, y[i] + (h/2) * k2);
            double k4 = f(x[i] + h, y[i] + h * k3);
            y[i + 1] = y[i] + (h / 6) * (k1 + 2*k2 + 2*k3 + k4);
        }

        for (int i = 0; i <= n; i++) {
            System.out.println("x = " + x[i] + ", y = " + y[i]);
        }
    }
}
```

---

##  Ejemplo funcional avanzado

```java
public class RungeKutta {
    public static class SolutionPoint {
        public final double x, y, yExact;

        public SolutionPoint(double x, double y, double yExact) {
            this.x = x; this.y = y; this.yExact = yExact;
        }
    }

    public static SolutionPoint[] solveRungeKutta4(double a, double b, double h, double y0) {
        if (a >= b || h <= 0)
            throw new IllegalArgumentException("a < b y h > 0");

        int n = (int) Math.ceil((b - a) / h);
        if (n < 1)
            throw new IllegalArgumentException("Paso h demasiado grande");

        double[] x = new double[n + 1];
        double[] y = new double[n + 1];
        SolutionPoint[] sol = new SolutionPoint[n + 1];

        for (int i = 0; i <= n; i++) {
            x[i] = a + i * h;
            if (i == n && Math.abs(x[i] - b) > 1e-10) x[i] = b;
        }

        y[0] = y0;

        for (int i = 0; i < n; i++) {
            double k1 = f(x[i], y[i]);
            double k2 = f(x[i] + h/2, y[i] + (h/2)*k1);
            double k3 = f(x[i] + h/2, y[i] + (h/2)*k2);
            double k4 = f(x[i] + h, y[i] + h*k3);
            y[i + 1] = y[i] + (h/6)*(k1 + 2*k2 + 2*k3 + k4);
        }

        for (int i = 0; i <= n; i++) {
            double yExact = Math.exp(-x[i]*x[i]); // Solución analítica: y = e^(-x²)
            sol[i] = new SolutionPoint(x[i], y[i], yExact);
        }

        return sol;
    }

    public static double f(double x, double y) {
        return -2 * x * y;
    }

    public static void main(String[] args) {
        double a = 0.0, b = 1.0, h = 0.2, y0 = 1.0;

        try {
            SolutionPoint[] solution = solveRungeKutta4(a, b, h, y0);

            System.out.println(" Método de Runge-Kutta (orden 4)");
            System.out.println("Ecuación: dy/dx = -2xy");
            System.out.printf("Condición inicial: y(%.1f) = %.3f%n", a, y0);
            System.out.printf("Intervalo: [%.1f, %.1f], h = %.1f%n", a, b, h);
            System.out.println("Resultados (numérico vs analítico):");
            System.out.println("----------------------------------------------------");
            System.out.printf("| %-5s | %-10s | %-10s | %-10s |\n", "x", "y_num", "y_exact", "Error");
            System.out.println("----------------------------------------------------");
            for (SolutionPoint p : solution) {
                System.out.printf("| %-5.1f | %-10.3f | %-10.3f | %-10.3e |\n",
                    p.x, p.y, p.yExact, Math.abs(p.y - p.yExact));
            }
            System.out.println("----------------------------------------------------");

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
```

---

##  Caso de prueba

| x   | y\_num | y\_exact | Error     |
| --- | ------ | -------- | --------- |
| 0.0 | 1.000  | 1.000    | 0.000e+00 |
| 0.2 | 0.961  | 0.961    | 1.984e-06 |
| 0.4 | 0.852  | 0.852    | 2.275e-05 |
| 0.6 | 0.697  | 0.698    | 7.161e-05 |
| 0.8 | 0.527  | 0.527    | 1.138e-04 |
| 1.0 | 0.368  | 0.368    | 1.168e-04 |

---

### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)
