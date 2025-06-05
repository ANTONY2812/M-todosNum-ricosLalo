### 🔙 [← Regresar a T4 - Diferenciación e Integración Numérica](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T4%20-%20Diferenciaci%C3%B3n%20e%20Integraci%C3%B3n%20Num%C3%A9rica)

#   Tema 4: Método de Simpson 1/3

##  ¿Qué es el Método de Simpson 1/3?

El método de Simpson 1/3 es una técnica de integración numérica que estima el valor de una integral definida utilizando una combinación ponderada de los valores de la función evaluados en puntos equidistantes.

Este método aproxima el área bajo la curva mediante parábolas (polinomios de segundo grado) que se ajustan en cada par de subintervalos del dominio de integración. Para ello, el intervalo se divide en un número par de subintervalos y se aplica una fórmula que otorga mayor peso a los puntos medios.

Debido a su precisión y sencillez, es muy utilizado en ingeniería, física y otras ciencias aplicadas, especialmente cuando la función es continua y suave.

---

##  Pseudocódigo del Método

```plaintext
Inicio
  Definir función f(x) = exp(x)

  Definir a, b como reales
  Definir n como entero (n debe ser par)
  Definir h = (b - a) / n
  Definir suma = f(a) + f(b)

  Para i desde 1 hasta n - 1:
    x = a + i * h
    Si i es par:
      suma = suma + 2 * f(x)
    Sino:
      suma = suma + 4 * f(x)
  Fin Para

  integral = (h / 3) * suma
  Imprimir integral aproximada
Fin
```

---

##  Código Java (estructura base)

```java
public class CodigoBaseSimpsonOneThird {
    public static double f(double x) {
        return Math.exp(x);
    }

    public static void main(String[] args) {
        double a = 0.0;
        double b = 1.0;
        int n = 4;

        if (n % 2 != 0) {
            System.out.println("El número de subintervalos debe ser par");
            return;
        }

        double h = (b - a) / n;
        double suma = f(a) + f(b);

        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            if (i % 2 == 0) {
                suma += 2 * f(x);
            } else {
                suma += 4 * f(x);
            }
        }

        double integral = (h / 3) * suma;
        System.out.println("Integral aproximada: " + integral);
    }
}
```

---

##  Ejemplo funcional en Java

```java
public class SimpsonOneThird {
    public static double f(double x) {
        return Math.exp(x);
    }

    public static void main(String[] args) {
        double a = 0.0;
        double b = 1.0;
        int n = 4;

        if (n % 2 != 0) {
            System.out.println("El número de subintervalos debe ser par");
            return;
        }

        double h = (b - a) / n;
        double suma = f(a) + f(b);

        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            if (i % 2 == 0) {
                suma += 2 * f(x);
            } else {
                suma += 4 * f(x);
            }
        }

        double integral = (h / 3) * suma;
        System.out.printf("Integral aproximada: %.3f%n", integral);
    }
}
```

---

##  Resultado esperado

```
Integral aproximada: 1.718
```

### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)
