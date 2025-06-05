#  Tema 2: Método de Punto Fijo


---

##  ¿Qué es el Método de Punto Fijo?

El método de punto fijo es una técnica numérica utilizada para encontrar soluciones aproximadas de ecuaciones. Su enfoque consiste en transformar la ecuación original en una nueva forma que permite calcular sucesivamente valores, esperando que cada nuevo valor se acerque más a la solución real.

La idea principal es comenzar con una estimación inicial y, mediante una función iterativa, generar nuevos valores a partir del anterior. Si el proceso cumple ciertas condiciones, los valores convergen hacia una solución estable conocida como punto fijo.

Este método es sencillo de aplicar y útil en muchos contextos, aunque su éxito depende de que la función utilizada cumpla ciertos criterios de convergencia. En caso contrario, puede no acercarse a la solución deseada.

```


##  Pseudocódigo

```java
Inicio
  Función f(x) → Retornar x³ - x - 2
  Función g(x) → Retornar (x + 2)^(1/3)

  Inicializar: x = 1.5, tolerancia = 0.001, maxIter = 100
  iteracion = 0

  Mientras iteracion < maxIter:
    xNuevo = g(x)
    Mostrar iteración, xNuevo, f(xNuevo)

    Si |xNuevo - x| < tolerancia → Retornar xNuevo como raíz

    x = xNuevo
    iteracion++
Fin
````

