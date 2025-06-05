

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

