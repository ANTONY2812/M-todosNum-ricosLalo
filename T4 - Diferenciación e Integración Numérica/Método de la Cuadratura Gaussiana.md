#  Tema 4: Método de Cuadratura Gaussiana

##  ¿Qué es el Método de Cuadratura Gaussiana ?

La cuadratura gaussiana es un método avanzado de integración numérica que destaca por su alta precisión utilizando un número reducido de evaluaciones de la función. A diferencia de métodos clásicos como el trapecio o Simpson, que evalúan la función en puntos equidistantes, la cuadratura gaussiana selecciona de forma estratégica los puntos y pesos para minimizar el error de aproximación.

Este método calcula la integral como una suma ponderada de los valores de la función en puntos específicos, llamados puntos de Gauss. Estos puntos, que no están distribuidos uniformemente, junto con sus pesos, se determinan a partir de los ceros de polinomios ortogonales (como los polinomios de Legendre) en el intervalo de integración. Gracias a esta selección óptima, el método alcanza una precisión sobresaliente con pocas evaluaciones.

Por su eficiencia y exactitud, la cuadratura gaussiana se utiliza ampliamente en problemas científicos e ingenieriles complejos, tales como simulaciones físicas, análisis de elementos finitos y cálculos numéricos avanzados. Sin embargo, su implementación requiere conocimientos previos para obtener o calcular los puntos y pesos adecuados, lo que la hace más sofisticada que los métodos básicos.
---

##  Pseudocódigo

```plaintext
Inicio
  Función f(x)
    Retornar exp(x)
  Fin Función

  Definir a, b como reales
  Definir n como entero
  Definir puntos como vector de reales [n]
  Definir pesos como vector de reales [n]
  Definir suma, t, x, integral como reales
  Definir i como entero

  a = 0.0
  b = 1.0
  n = 3
  puntos = [-0.774596669, 0.0, 0.774596669]
  pesos = [0.555555556, 0.888888889, 0.555555556]

  suma = 0
  Para i = 0 hasta n - 1
    t = puntos[i]
    x = ((b - a) * t + (b + a)) / 2
    suma = suma + pesos[i] * f(x)
  Fin Para

  integral = ((b - a) / 2) * suma
  Imprimir "Valor aproximado de la integral: ", integral
Fin
```
