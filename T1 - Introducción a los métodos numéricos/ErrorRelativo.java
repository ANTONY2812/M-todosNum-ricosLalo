package errorrelativo;

public class ErrorRelativo {
     public static void main(String[] args) {
        System.out.println("===== ERROR RELATIVO =====");

        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }

    public static void ejercicio1() {
        double[] datos = {20.1, 21.3, 19.8, 22.0, 20.5, 21.1, 19.9, 20.4, 21.2, 20.0};
        imprimirErrores("Ejercicio 1", datos);
    }

    public static void ejercicio2() {
        double[] datos = {90, 85, 88, 92, 87, 89, 91, 86, 93, 88};
        imprimirErrores("Ejercicio 2", datos);
    }

    public static void ejercicio3() {
        double[] datos = {2.5, 2.8, 3.0, 2.7, 2.9, 2.6, 2.4, 2.9, 3.1, 2.7};
        imprimirErrores("Ejercicio 3", datos);
    }

    public static void ejercicio4() {
        double[] datos = {15.2, 16.1, 14.8, 15.9, 16.4, 15.0, 15.6, 16.2, 15.3, 15.7};
        imprimirErrores("Ejercicio 4", datos);
    }

    public static void ejercicio5() {
        double[] datos = {32, 30, 28, 35, 33, 31, 34, 29, 36, 30};
        imprimirErrores("Ejercicio 5", datos);
    }

    public static void imprimirErrores(String titulo, double[] datos) {
        System.out.println(titulo);
        double promedio = calcularPromedio(datos);
        for (double val : datos) {
            double errorRel = Math.abs((val - promedio) / promedio);
            System.out.printf("Valor: %.2f | Error relativo: %.6f\n", val, errorRel);
        }
        System.out.println();
    }

    public static double calcularPromedio(double[] datos) {
        double suma = 0;
        for (double val : datos) suma += val;
        return suma / datos.length;
    }
}
