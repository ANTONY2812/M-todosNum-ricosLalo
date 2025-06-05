### 🔙 [← Regresar a T1 - Introducción a los métodos numéricos](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T1%20-%20Introducci%C3%B3n%20a%20los%20m%C3%A9todos%20num%C3%A9ricos)

#  Tema 1: Errores por Equivocación

---

###  ¿Qué es?

Los errores humanos, también conocidos como errores por equivocación, suceden cuando cometemos fallas durante el desarrollo o aplicación de un método numérico. Estos errores pueden surgir al introducir mal los datos, escribir una fórmula de forma incorrecta, elegir un método inapropiado para el problema o incluso al interpretar de forma errónea los resultados obtenidos.

Aunque este tipo de errores no forman parte directa del método numérico en sí, su efecto puede ser muy significativo. Por eso, es clave verificar cuidadosamente cada paso del proceso, revisar el código, comprobar las entradas y analizar con atención las salidas. Una validación adecuada ayuda a detectar a tiempo estos errores y a evitar que afecten las conclusiones del análisis.

---

### Pseudocódigo

```text
Inicio
  Definir areaCorrecta como real
  Definir areaConError como real
  areaCorrecta = π * (5^2)
  areaConError = π * (10^2)
  Imprimir "Área correcta: ", areaCorrecta
  Imprimir "Área con error: ", areaConError
  Imprimir "Diferencia por equivocación: ", abs(areaCorrecta - areaConError)
Fin
```
---

### 💻 Código base en Java

```java
public class CodigoBaseEquivocacion {
    public static void main(String[] args) {
        double areaCorrecta = Math.PI * Math.pow(5, 2);
        double areaConError = Math.PI * Math.pow(10, 2);

        System.out.println("Área correcta: " + areaCorrecta);
        System.out.println("Área con error: " + areaConError);
        System.out.println("Diferencia por equivocación: " + Math.abs(areaCorrecta - areaConError));
    }
}
```

---

### 🛠 Ejemplo funcional en Java

```java
public class ErrorEquivocacion {
    public static void main(String[] args) {
        double radio = 5.0;
        double areaIncorrecta = Math.PI * radio * 2;
        double areaCorrecta = Math.PI * Math.pow(radio, 2);
        double diferencia = Math.abs(areaCorrecta - areaIncorrecta);

        System.out.printf("Área incorrecta: %.3f%n", areaIncorrecta);
        System.out.printf("Área correcta: %.3f%n", areaCorrecta);
        System.out.printf("Diferencia por equivocación: %.3f%n", diferencia);
    }
}
```

---

### 📋 Caso de prueba:

```text
Área incorrecta: 31.416
Área correcta: 78.540
Diferencia por equivocación: 47.124
```

### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)
