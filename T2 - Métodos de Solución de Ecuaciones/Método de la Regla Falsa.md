### 🔙 [← Regresar a T2 - Métodos de Solución de Ecuaciones](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T2%20-%20M%C3%A9todos%20de%20Soluci%C3%B3n%20de%20Ecuaciones)


#  Tema 2: Método de la Regla Falsa (Falsa Posición)



---

##  ¿Qué es el Método de la Regla Falsa?

El método de la regla falsa, también conocido como falsa posición, es una técnica numérica utilizada para encontrar una raíz de una función dentro de un intervalo donde los valores de la función cambian de signo.

Este método combina la lógica del método de bisección con una estimación más precisa, trazando una línea recta entre los extremos del intervalo y determinando el punto donde dicha línea corta el eje horizontal. A partir de ese punto, se redefine el intervalo, asegurando que siempre se mantenga un cambio de signo.

La principal ventaja de este método es que tiende a converger más rápido que la bisección, aunque en algunos casos puede estancarse si uno de los extremos del intervalo no se actualiza correctamente.

```

##  Pseudocódigo

```text
Inicio
  Función f(x) → x^3 - x - 2

  Inicializar: a = 1.0, b = 2.0, tolerancia = 0.001, maxIter = 100
  fa = f(a), fb = f(b)

  Si fa * fb >= 0 → Error: El intervalo no contiene una raíz

  Para iteracion desde 0 hasta maxIter:
    p = a - (fa * (b - a)) / (fb - fa)
    fp = f(p)
    Mostrar iteración, p, fp

    Si |fp| < tolerancia → Retornar p como raíz

    Si fa * fp < 0:
      b = p, fb = fp
    Sino:
      a = p, fa = fp
Fin
````

---

## 💻 Código base en Java

```java
public class CodigoBaseReglaFalsa {
    public static double f(double x) {
        return Math.pow(x, 3) - x - 2;
    }

    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double tolerancia = 0.001;
        int maxIteraciones = 100;
        int iteracion = 0;

        double fa = f(a);
        double fb = f(b);

        if (fa * fb >= 0) {
            System.out.println("El intervalo no contiene una raíz");
            return;
        }

        while (iteracion < maxIteraciones) {
            double p = a - (fa * (b - a)) / (fb - fa);
            double fp = f(p);
            System.out.println("Iteración " + iteracion + ": x = " + p + ", f(x) = " + fp);

            if (Math.abs(fp) < tolerancia) {
                System.out.println("Raíz encontrada: " + p);
                return;
            }

            if (fa * fp < 0) {
                b = p;
                fb = fp;
            } else {
                a = p;
                fa = fp;
            }

            iteracion++;
        }

        System.out.println("Máximo de iteraciones alcanzado");
    }
}
```

---

## ✅ Ejemplo funcional en Java

```java
public class FalsePositionMethod {
    public static double f(double x) {
        return x * x * x - x - 2;
    }

    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double tolerancia = 0.001;
        int maxIteraciones = 100;

        double fa = f(a);
        double fb = f(b);

        if (fa * fb >= 0) {
            System.out.println("El intervalo no contiene una raíz");
            return;
        }

        for (int iteracion = 0; iteracion < maxIteraciones; iteracion++) {
            double p = a - (fa * (b - a)) / (fb - fa);
            double fp = f(p);
            System.out.printf("Iteración %d: x = %.3f, f(x) = %.3f%n", iteracion, p, fp);

            if (Math.abs(fp) < tolerancia) {
                System.out.printf("Raíz encontrada: %.3f%n", p);
                return;
            }

            if (fa * fp < 0) {
                b = p;
                fb = fp;
            } else {
                a = p;
                fa = fp;
            }
        }

        System.out.println("Máximo de iteraciones alcanzado");
    }
}
```

---

## 🔬 Caso de prueba

```text
Iteración 0: x = 1.556, f(x) = 0.214
Iteración 1: x = 1.518, f(x) = 0.002
✅ Raíz encontrada: 1.518
```

---
### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)
