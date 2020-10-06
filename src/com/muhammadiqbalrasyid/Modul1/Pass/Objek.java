package com.muhammadiqbalrasyid.Modul1.Pass;

public class Objek {
    public static void main(String[] args) {
        //Deklarasi object tanpa sarameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Iqbal");
        mahasiswaTanpa.setNim(1910401);

        //ouput
        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t: " + mahasiswaTanpa.getNim());

        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t: " + mahasiswaTanpa.getNim());

    }
}
