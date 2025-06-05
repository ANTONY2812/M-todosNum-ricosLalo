# Tema 4: Método del Trapecio

## ¿Qué es el Método del Trapecio?

El método del trapecio es una técnica sencilla y muy utilizada en integración numérica. Consiste en aproximar el área bajo la curva de una función mediante trapecios en lugar de rectángulos. Esto se logra uniendo cada par de puntos consecutivos de la función con una línea recta y calculando el área del trapecio formado entre esa línea y el eje x.

Este método puede aplicarse tanto en un único intervalo como dividiendo el rango total en varios subintervalos, mejorando así la precisión; a esta versión se le conoce como método del trapecio compuesto. Aunque no es tan exacto como métodos más avanzados como Simpson, su simplicidad y facilidad de implementación lo hacen muy útil en diversas aplicaciones prácticas.

El error en la aproximación depende del tamaño de los subintervalos y de la curvatura de la función. Si la función es lineal o casi lineal, la aproximación es bastante precisa. Sin embargo, cuando la función presenta curvaturas pronunciadas, es necesario usar un mayor número de subintervalos pequeños para obtener buenos resultados. A pesar de estas limitaciones, el método del trapecio sigue siendo un método fundamental por su balance entre simplicidad y precisión.

---


##  Pseudocódigo

```plaintext
Inicio
  Función f(x)
    Retornar exp(x)
  Fin Función

  Definir a, b como reales
  Definir n como entero
  Definir h, suma, x, integral como reales
  Definir i como entero

  a = 0.0
  b = 1.0
  n = 4

  h = (b - a) / n
  suma = f(a) + f(b)

  Para i = 1 hasta n-1
    x = a + i * h
    suma = suma + 2 * f(x)
  Fin Para

  integral = (h / 2) * suma
  Imprimir "Integral aproximada: ", integral
Fin
```
