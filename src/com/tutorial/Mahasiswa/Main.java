package Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setName("Riandro Raul");
        mahasiswa.setNim("191011450014");
        mahasiswa.setKelas("04TPLE001");

        Get_Info_Mahasiswa getInfo = new Get_Info_Mahasiswa();
        getInfo.cetakInfoMhs(mahasiswa);

    }
}