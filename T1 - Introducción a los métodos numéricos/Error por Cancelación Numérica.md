### 🔙 [← Regresar a T1 - Introducción a los métodos numéricos](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T1%20-%20Introducci%C3%B3n%20a%20los%20m%C3%A9todos%20num%C3%A9ricos)

#  Tema 1: Error por Cancelación Numérica

---

###  ¿Qué es?

La **cancelación numérica** ocurre al restar dos números muy cercanos, causando pérdida significativa de cifras significativas y, por ende, errores en cálculos posteriores. Este problema es común en ciertos algoritmos y puede desestabilizar resultados si no se previene.

Reescribir expresiones algebraicas o usar formulaciones alternativas es fundamental para evitar este error y diseñar algoritmos numéricos estables y confiables.



---

###  Pseudocódigo

```text
Inicio
  Definir a como real
  Definir b como real
  Definir resultado como real
  a = 1.0000001
  b = 1.0000000
  resultado = a - b
  Imprimir "Resultado esperado: 0.0000001"
  Imprimir "Resultado real: ", resultado
  Imprimir "Error por cancelación: ", abs(0.0000001 - resultado)
Fin
```
### 💻 Código Base en Java

```java
public class CodigoBaseCancelacion {
    public static void main(String[] args) {
        double a = 1.0000001;
        double b = 1.0000000;
        double resultado = a - b;

        System.out.println("Resultado esperado: 0.0000001");
        System.out.println("Resultado real: " + resultado);
        System.out.println("Error por cancelación: " + Math.abs(0.0000001 - resultado));
    }
}
```

---

### 🛠 Ejemplo Funcional en Java

```java
public class CancelacionNumerica {
    public static void main(String[] args) {
        double a = 1.0000001;
        double b = 1.0000000;

        double resultado = a - b;
        double esperado = 0.0000001;

        System.out.printf("Resultado calculado: %.7f%n", resultado);
        System.out.printf("Resultado esperado: %.7f%n", esperado);
        System.out.println("Error por cancelación: " + Math.abs(esperado - resultado));
    }
}
```

---

### 📋 Caso de prueba

```text
Resultado calculado: 0.0000001
Resultado esperado: 0.0000001
Error por cancelación: 1.3552527156068805E-15
---

```
### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)
