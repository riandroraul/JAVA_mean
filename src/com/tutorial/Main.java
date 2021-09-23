
import javax.swing.JOptionPane;

import ProgrammerStory.ProgrammerStory;

public class Main {
    public static void main(String[] args) {
        String nama = "";

        nama = JOptionPane.showInputDialog(null, "Nama : ");
        String message = "Hallo " + nama + " Jangan lupa istirahat ya!";
        JOptionPane.showMessageDialog(null, message);

        ProgrammerStory programmer1 = new ProgrammerStory();

        programmer1.setGalau("He now listening music");
        programmer1.setHappy("He now ngoding happiness now");
        programmer1.setBored("He now playing games");
        programmer1.setGirlfriend("He now waiting for someone");

        System.out.println(programmer1.getGalau());
        System.out.println(programmer1.getHappy());
        System.out.println(programmer1.getBored());
        System.out.println(programmer1.getGirlfriend());

    }
}
