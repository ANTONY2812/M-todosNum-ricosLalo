#  Tema 4: Método de Simpson 3/8

##  ¿Qué es el Método de Simpson 3/8?

El método de Simpson 3/8 es una variante del método de Simpson diseñada para integraciones donde el número de subintervalos es múltiplo de tres. A diferencia del método 1/3, este utiliza polinomios cúbicos (de tercer grado) para aproximar la función, lo que puede proporcionar una mejor adaptación a la curva en ciertos casos.

Este método divide el intervalo en tres partes iguales y aplica una fórmula que asigna diferentes pesos a los valores de la función en los puntos extremos y en los puntos interiores.

Aunque no es tan popular como el método 1/3, resulta especialmente útil cuando el número de subintervalos no es compatible con el método 1/3 o cuando se requiere mayor precisión en ciertos segmentos.

La precisión del método 3/8 es comparable a la del método 1/3 e, incluso, en algunos casos puede superarla, dependiendo de la función y del tamaño de los subintervalos.

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
  n = 3

  Si n mod 3 != 0
    Imprimir "El número de subintervalos debe ser múltiplo de 3"
    Retornar
  Fin Si

  h = (b - a) / n
  suma = f(a) + f(b)

  Para i = 1 hasta n - 1
    x = a + i * h
    Si i mod 3 = 0
      suma = suma + 2 * f(x)
    Sino
      suma = suma + 3 * f(x)
    Fin Si
  Fin Para

  integral = (3 * h / 8) * suma
  Imprimir "Valor aproximado de la integral: ", integral
Fin
```
