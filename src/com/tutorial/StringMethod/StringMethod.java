package StringMethod;

import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        char nama[] = { 'R', 'i', 'a', 'n', 'd', 'r', 'o' };
        String string1 = "riandro RAUL";
        String string2 = "raul";
        String string3 = "hello";
        String string4 = " ";
        String string5 = new String();

        Scanner userInput = new Scanner(System.in);

        // System.out.println(string1.charAt(3));
        // System.out.println(string1.codePointAt(1));
        // System.out.println(string1.compareTo(string2));
        // System.out.println(string1.compareToIgnoreCase(string2));
        // System.out.println(string1.concat(string2));
        // System.out.println(string3.contains("hi")); -> //cek apakah di string3 ada
        // "hi" ? output = false
        // System.out.println(string3.contentEquals("hello"));
        // String name = "";
        // System.out.println(name.copyValueOf(nama, 0, 7)); // ->menyalin char pada
        // array kedalam string
        // System.out.println(string1.startsWith("dro")); // ->chek apakah string1
        // diawaali dengan "dro" ? false
        // System.out.println(string1.endsWith(" "));
        // String nama2;
        // System.out.println("nama : ");
        // nama2 = userInput.next();
        // System.out.println(string1.equals(nama2));
        // System.out.println(string1.equalsIgnoreCase(nama2));

        // char kosong[] = new char[7];
        // string1.getChars(0, 7, kosong, 0);// -> ambil setiap karakter yang ada di
        // string1 dan masukan ke array kosong
        // System.out.println(kosong);
        // System.out.println(string4.isEmpty());

        // System.out.println(string1.replace("o", "o raul"));
        // System.out.println(string1.replaceAll("riandro", "ignasius riandro raul"));
        // String spasi = " ignasius";
        // System.out.println(spasi.trim()); // ->menghapus spasi

        // int angka1 = 30;
        // double angka2 = 3.14;
        // boolean cek = false;

        // String hasilInteger = String.valueOf(angka1 * 2);
        // String hasilDouble = String.valueOf(angka2 * 3);
        // String hasilBoolean = String.valueOf(!cek);

        // System.out.println("hasil integer : " + hasilInteger);
        // System.out.println("hasil integer : " + hasilDouble);
        // System.out.println("hasil integer : " + hasilBoolean);

        System.out.println(string1.toUpperCase());
        System.out.println(string1.toLowerCase());

    }
}
