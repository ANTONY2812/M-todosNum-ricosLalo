### 🔙 [← Regresar a T2 - Métodos de Solución de Ecuaciones](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T2%20-%20M%C3%A9todos%20de%20Soluci%C3%B3n%20de%20Ecuaciones)


#  Tema 2: Método de Bisección

---

##  ¿En qué consiste?

El método de bisección es una técnica numérica empleada para localizar las raíces de una función cuando no es posible hallar una solución exacta. Este método consiste en dividir repetidamente un intervalo en dos mitades y determinar en cuál de ellas la función cambia de signo, lo que indica que la raíz se encuentra dentro de ese subintervalo. Así, se reduce progresivamente el intervalo hasta aproximar la raíz con la precisión deseada.

---

##  Pseudocódigo

```java
Inicio
  Función f(x) -> Retornar x^3 - x - 2

  Inicializar: a = 1.0, b = 2.0, tolerancia = 0.001, maxIter = 100
  Calcular: fa = f(a), fb = f(b)

  Si fa * fb >= 0 → Error: No hay cambio de signo

  Mientras iteración < maxIter:
    p = (a + b) / 2
    fp = f(p)
    Si |fp| < tolerancia o |b - a| < tolerancia:
        Retornar p como raíz aproximada
    Si fa * fp < 0:
        b = p
    Sino:
        a = p
  FinMientras
Fin
````
---

## 🧪 Código base en Java

```java
public class CodigoBaseBiseccion {
    public static double f(double x) {
        return Math.pow(x, 3) - x - 2;
    }

    public static void main(String[] args) {
        double a = 1.0, b = 2.0, tolerancia = 0.001;
        int maxIter = 100;
        double fa = f(a), fb = f(b);

        if (fa * fb >= 0) {
            System.out.println("No se cumple el criterio para aplicar bisección");
            return;
        }

        for (int i = 0; i < maxIter; i++) {
            double p = (a + b) / 2;
            double fp = f(p);

            System.out.printf("Iteración %d: x = %.3f, f(x) = %.3f%n", i, p, fp);

            if (Math.abs(fp) < tolerancia || Math.abs(b - a) < tolerancia) {
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

## ✅ Ejecución esperada

```text
Iteración 0: x = 1.500, f(x) = -0.125
Iteración 1: x = 1.750, f(x) = 1.859
Iteración 2: x = 1.625, f(x) = 0.701
Iteración 3: x = 1.563, f(x) = 0.256
Iteración 4: x = 1.531, f(x) = 0.059
Iteración 5: x = 1.516, f(x) = -0.034
Iteración 6: x = 1.523, f(x) = 0.012
Iteración 7: x = 1.520, f(x) = -0.011
Iteración 8: x = 1.522, f(x) = 0.000
✅ Raíz encontrada: 1.522
```

---

### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)
