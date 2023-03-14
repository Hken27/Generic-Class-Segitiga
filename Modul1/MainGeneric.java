package Modul1;

import java.util.*;

public class MainGeneric {
    public static void main(String[] args) {

        try {
            int pilih;
            char lagi;

            do {

                Segitiga<Integer> luasTipeInt = new Segitiga<>();
                Segitiga<Double> luasTipeDouble = new Segitiga<>();
                Scanner sc = new Scanner(System.in);

                System.out.println("______________________________");
                System.out.println(" Perhitungan Luas Segitiga \n");
                System.out.println("\t1. Hasil Dari Integer");
                System.out.println("\t2. Hasil Dari Double");
                System.out.println("______________________________");
                System.out.print("Masukkan pilihan 1/2  ");
                pilih = sc.nextInt();

                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan Nilai Alas dan Tinggi Secara Beruntun : ");
                        luasTipeInt.setAlas(sc.nextInt());
                        luasTipeInt.setTinggi(sc.nextInt());
                        System.out.println("Hasil dari perhitungan INTEGER = " + luasTipeInt.getResultAsInt());
                        break;

                    case 2:
                        System.out.print("Masukkan Nilai Alas dan Tinggi Secara Beruntun : ");
                        luasTipeDouble.setAlas(sc.nextDouble());
                        luasTipeDouble.setTinggi(sc.nextDouble());
                        System.out.println("Hasil dari perhitungan INTEGER = " + luasTipeDouble.getResultAsDouble());
                        break;

                    default:
                        System.out.println("Gak Ada Bosss");

                }
                System.out.println();
                System.out.print("Apakah ingin memilih lagi Y/t ? ");
                lagi = sc.next().charAt(0);
                System.out.println();

            } while (lagi != 't');
            System.out.println("Terima kasih :) ");

        } catch (Exception e) {
            System.out.println("\nSeng Genah ta CAKK......\n");
        }

    }

}
