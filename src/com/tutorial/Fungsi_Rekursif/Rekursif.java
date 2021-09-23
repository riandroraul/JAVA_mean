package Fungsi_Rekursif;

public class Rekursif {
    public static void main(String[] args) {

        int result = fungsiRekursif(10);

        System.out.println(result);

        int result2 = rekursifKedua(5, 10);
        System.out.println(result2);
    }

    static int fungsiRekursif(int angka) {
        if (angka > 0) {
            return angka + fungsiRekursif(angka - 1);
        } else {
            return 0;
        }
    }

    static int rekursifKedua(int angka1, int angka2) {
        if (angka2 > angka1) {
            return angka2 + rekursifKedua(angka1, angka2 - 1);
        } else {
            return 0;
        }
    }

}
