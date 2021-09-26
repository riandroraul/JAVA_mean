import Programmer.ProgrammerStory;

interface Tenaga {
    public int setPower(int angka);
}

interface Price {
    public void setHarga();
}

abstract class Game {
    public abstract String namaGame();
}

class MobileLegend extends Game implements Tenaga, Price {
    public String namaGame() {
        return "game ini mobile legend";
    }

    public int setPower(int angka) {
        return angka;
    }

    public void setHarga() {
        System.out.println("Harga Game ini Rp. 20.000.000");
    }

    public static void staticMethod() {
        System.out.println("test static method");
    }
}

public class Main {
    public static void main(String[] args) {
        String nama = "";

        // nama = JOptionPane.showInputDialog(null, "Nama : ");
        // String message = "Hallo " + nama + " Jangan lupa istirahat ya!";
        // JOptionPane.showMessageDialog(null, message);

        ProgrammerStory programmer1 = new ProgrammerStory();

        programmer1.setGalau("He now listening music");
        programmer1.setHappy("He now ngoding happiness now");
        programmer1.setBored("He now playing games");
        programmer1.setGirlfriend("He now waiting for someone");

        // System.out.println(programmer1.getGalau());
        // System.out.println(programmer1.getHappy());
        // System.out.println(programmer1.getBored());
        // System.out.println(programmer1.getGirlfriend());

        // MobileLegend ml = new MobileLegend();

        // System.out.println(ml.namaGame());
        // System.out.println(ml.setPower(5));
        // ml.setHarga();

        MobileLegend.staticMethod();

    }
}
