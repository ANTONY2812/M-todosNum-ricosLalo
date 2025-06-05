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
