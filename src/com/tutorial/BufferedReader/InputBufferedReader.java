package BufferedReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputBufferedReader {
    public static void main(String[] args) {
        BufferedReader inputBufRead = new BufferedReader(new InputStreamReader(System.in));

        String name = "";
        System.out.println("Nama Anda : ");

        try {
            name = inputBufRead.readLine();
        } catch (IOException e) {
            System.out.println("Wrong!");
        }
        System.out.println("\n Hallo " + name + " Lanjutkan belajarnya pasti jadi programmer java");
    }
}
