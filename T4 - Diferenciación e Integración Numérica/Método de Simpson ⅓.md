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

### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)
