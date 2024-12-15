package Main.predicate;

public class Estudiante {

    private String nombre;
    private double nota01;
    private double nota02;
    private double nota03;
    private double nota04;
    private double promedio;

    public Estudiante(String nombre, double nota01, double nota02, double nota03, double nota04) {
        this.nombre = nombre;
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.nota03 = nota03;
        this.nota04 = nota04;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota01() {
        return nota01;
    }

    public void setNota01(double nota01) {
        this.nota01 = nota01;
    }

    public double getNota02() {
        return nota02;
    }

    public void setNota02(double nota02) {
        this.nota02 = nota02;
    }

    public double getNota03() {
        return nota03;
    }

    public void setNota03(double nota03) {
        this.nota03 = nota03;
    }

    public double getNota04() {
        return nota04;
    }

    public void setNota04(double nota04) {
        this.nota04 = nota04;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "{" + "\nnombre :" + nombre +
                "\nNota01 :" + nota01 +
                "\nNota02 :" + nota02 +
                "\nNota03 :" + nota03 +
                "\nNota04 :" + nota04 +
                "\nPromedio: " + promedio +
                "}";
    }

}
