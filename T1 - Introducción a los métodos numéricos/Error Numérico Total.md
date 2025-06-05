### 🔙 [← Regresar a T1 - Introducción a los métodos numéricos](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T1%20-%20Introducci%C3%B3n%20a%20los%20m%C3%A9todos%20num%C3%A9ricos)

# Tema 1: Tipos de Errores Numéricos  
 
---

## Error Numérico Total

### ¿Qué es?

El **Error Numérico Total** representa la diferencia global entre el valor real (o exacto) y el valor aproximado obtenido a través de métodos numéricos. Este error es inevitable en cálculos digitales y se compone de varios tipos:

- 🔹 **Error de redondeo:** causado por la limitación del número de cifras decimales al almacenar o procesar.
- 🔹 **Error de truncamiento:** surge al sustituir un proceso matemático por una aproximación (por ejemplo, derivadas con diferencias finitas).
- 🔹 **Errores del modelo:** cuando el modelo matemático usado no representa completamente el fenómeno real.
- 🔹 **Cancelación:** pérdida de precisión cuando se restan números muy cercanos entre sí.



---

###  Pseudocódigo para calcular el Error Numérico Total

```java
Inicio
  Definir real, aproximado, errorTotal como reales

  real = sqrt(2)
  aproximado = 1.414
  errorTotal = abs(real - aproximado)

  Imprimir "Valor real: ", real
  Imprimir "Valor aproximado: ", aproximado
  Imprimir "Error numérico total: ", errorTotal
Fin
```

---

###  Código Base en Java

```java
public class ErrorNumerico {
    public static void main(String[] args) {
        double real = Math.sqrt(2);
        double aproximado = 1.414;
        double errorTotal = Math.abs(real - aproximado);

        System.out.println("Valor real: " + real);
        System.out.println("Valor aproximado: " + aproximado);
        System.out.println("Error numérico total: " + errorTotal);
    }
}
```

---

###  Ejemplo Completo con Salida Formateada

```java
public class ErrorTotal {
    public static void main(String[] args) {
        double valorReal = Math.sqrt(2);
        double valorAproximado = 1.4142;

        double error = Math.abs(valorReal - valorAproximado);

        System.out.printf("Valor real: %.4f%n", valorReal);
        System.out.printf("Valor aproximado: %.4f%n", valorAproximado);
        System.out.printf("Error numérico total: %.6f%n", error);
    }
}
```

---

###  Salida Esperada

```
Valor real: 1.4142  
Valor aproximado: 1.4142  
Error numérico total: 0.000014
### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)

`````
[← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)
```
