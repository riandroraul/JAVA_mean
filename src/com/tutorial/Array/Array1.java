package Array;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int array1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // int array2[] = new int[8];

        array1[0] = 125;

        // printArray(array1, "");

        // for (int i = 0; i < array1.length; i++) {
        // array2[i] = array1[i];
        // }
        // System.out.println("mengkopi dengan loopinng");
        // printArray(array2);

        // System.out.println("mengkopi array dengan copyOf");
        // int array3[] = new int[8];
        // array3 = Arrays.copyOf(array2, 8);
        // printArray(array3);
        // System.out.println("alamat = " + array3);
        // array3 = Arrays.copyOf(array2, 5);
        // printArray(array3);
        // System.out.println("alamat = " + array3);

        // System.out.println("mengkopi array dengan copyOfRange");
        // int array4[] = Arrays.copyOfRange(array1, 3, 6);
        // printArray(array4);

        // System.out.println("mengisi array dengan fill");
        // int array5[] = new int[10];
        // printArray(array5);
        // Arrays.fill(array5, 10);
        // printArray(array5);

        // System.out.println("membandingkan array / komparasi");
        // int array6[] = { 1, 2, 3, 4, 5, 6, 7 };
        // int array7[] = { 1, 2, 3, 4, 5, 6, 8 };
        // System.out.println(Arrays.equals(array6, array7));

        // System.out.println("cek array mana yang lebih besar ?");
        // System.out.println(Arrays.compare(array6, array7));

        // System.out.println("cek index yang beda pada 2 array");
        // System.out.println(Arrays.mismatch(array6, array7));

        // System.out.println("sorting array");
        int array8[] = { 3, 5, 6, 8, 6, 4, 2, 1, 22, 44, 55, 43, 78, 90 };
        // printArray(array8);
        // Arrays.sort(array8);
        // printArray(array8);

        System.out.println("Binary search / mencari");
        int cari = 44;
        int posisi = Arrays.binarySearch(array8, cari);
        System.out.println("angka yang dicari " + cari + " ada di index = " + posisi);

        System.out.println("Sorting Array Descending");
        int array9[] = { 11, 4, 9, 5, 4, 22, 15, 56, 34, 44, 21, 14, 19 };
        int array10[] = { 15, 4, 8, 9, 5, 25, 18, 11, 31, 40, 23, 12, 29 };
        int hasilJumlah[] = new int[array10.length];

        for (int i = 0; i < array9.length; i++) {
            hasilJumlah[i] = array9[i] + array10[i];
        }
        System.out.println("Penjumlahan Array");
        System.out.println("Array 9 : " + Arrays.toString(array9));
        System.out.println("Array 10 : " + Arrays.toString(array10));
        printArray(hasilJumlah, "Hasil jumlah Array : ");

        Arrays.sort(hasilJumlah);
        printArray(hasilJumlah, "Hasil Sorting Ascending : ");

        int arrayBuffer[] = Arrays.copyOf(hasilJumlah, hasilJumlah.length);
        for (int i = 0; i < hasilJumlah.length; i++) {
            hasilJumlah[i] = arrayBuffer[(arrayBuffer.length - i) - 1];
        }
        printArray(hasilJumlah, "hasil Sorting Descending : ");
        int tempor;
        for (int i = 0; i < array9.length; i++) {
            for (int j = 0; j < array9.length; j++) {
                if (array9[j] == array9.length) {
                    if (array9[j] > array9[j + 1]) {
                        tempor = array9[j];
                        array9[j] = array9[j + 1];
                        array9[j + 1] = tempor;
                        break;
                    }
                }
            }
        }

        printArray(array9, "bubble sort : ");
        sort2(hasilJumlah, "Sorting dengan sort2 : ");
    }

    public static void sort2(int[] printArray, String message) {
        Arrays.sort(printArray);
        int tempor;
        for (int i = 0; i < printArray.length / 2; i++) {
            tempor = printArray[i];
            printArray[i] = printArray[(printArray.length - 1) - i];
            printArray[(printArray.length - 1) - i] = tempor;
        }
        System.out.println(message + Arrays.toString(printArray));
    }

    private static void printArray(int dataArray[], String message) {
        System.out.println(message + Arrays.toString(dataArray));
    }
}
