package Main.predicate;

import java.util.function.Function;

public class Ejemplo {
    public static void main(String[] args) {
        Estudiante estudiante01 = new Estudiante("Flor", 12.4, 12.2, 11.0, 9.2);
        double sumaNotas = estudiante01.getNota01() + estudiante01.getNota02() + estudiante01.getNota03()
                + estudiante01.getNota04();

        Function<Double, Double> calcularPromedio = t -> t / 4;
        estudiante01.setPromedio(calcularPromedio.apply(sumaNotas));
        System.out.println(estudiante01.toString());

    }
}
