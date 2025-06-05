### 🔙 [← Regresar a T1 - Introducción a los métodos numéricos](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T1%20-%20Introducci%C3%B3n%20a%20los%20m%C3%A9todos%20num%C3%A9ricos)

#  Tema 1: Tipos de Errores Numéricos

## Error de Redondeo

---

###  ¿Qué es?

El error de redondeo ocurre porque las computadoras no pueden representar con exactitud todos los números reales, ya que trabajan con una cantidad limitada de bits. Esto significa que muchos decimales se ajustan al valor más cercano posible, generando una pequeña diferencia respecto al valor real.

Aunque estos errores suelen ser muy pequeños, cuando se realizan muchas operaciones matemáticas, pueden acumularse y afectar significativamente el resultado final. Por ello, al trabajar con métodos numéricos es importante utilizar algoritmos estables que reduzcan la propagación de estos errores durante los cálculos.


---

###  Pseudocódigo

```text
Inicio
  Definir a como real
  Definir b como real
  a = 1.0 / 3.0
  b = a * 3.0
  Imprimir "Resultado teórico: 1.0"
  Imprimir "Resultado real: ", b
  Imprimir "Error de redondeo: ", (1.0 - b)
Fin
```
---

###  Código Base en Java

```java
public class CodigoBaseRedondeo {
    public static void main(String[] args) {
        double a = 1.0 / 3.0;
        double b = a * 3.0;

        System.out.println("Resultado teórico: 1.0");
        System.out.println("Resultado real: " + b);
        System.out.println("Error de redondeo: " + (1.0 - b));
    }
}
```

---

###  Ejemplo Funcional en Java

```java
public class ErrorRedondeo {
    public static void main(String[] args) {
        double resultado = (1.0 / 3.0) * 3.0;
        double esperado = 1.0;

        System.out.println("Resultado calculado: " + resultado);
        System.out.println("Resultado esperado: " + esperado);
        System.out.println("Error de redondeo: " + Math.abs(esperado - resultado));
    }
}
```

---

###  Caso de prueba

```
Resultado calculado: 0.9999999999999999  
Resultado esperado: 1.0  
Error de redondeo: 1.1102230246251565E-16
---

### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)

---
