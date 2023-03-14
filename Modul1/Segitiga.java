package Modul1;

public class Segitiga<T> {

    private T alas;
    private T tinggi;

    public T getAlas() {
        return alas;
    }

    public T getTinggi() {
        return tinggi;
    }

    public void setAlas(T alas) {
        this.alas = alas;
    }

    public void setTinggi(T tinggi) {
        this.tinggi = tinggi;
    }

    public <T> int getResultAsInt() {
        int Luas = (int) alas * (int) tinggi / 2;
        return Luas;

    }

    public <T> double getResultAsDouble() {
        // double Luass = (double) alas * (double) tinggi / 2;
        return (double) alas * (double) tinggi / 2;

    }

}