package Karyawan;

public class Anak extends Induk{
    int nomorpegawai = 333333;
    String nama = "diah";
    String posisi = "admin";

    public void cetak(){
        System.out.println("Berikut Identitas Pegawai: ");
        System.out.println("Nama: "+nama);
        System.out.println("Jenis Kelamin: "+super.kelamin);
        System.out.println("Nomor Pegawai: "+nomorpegawai);
        System.out.println("Bekerja di bagian "+ posisi);
        System.out.println("Gaji Utama: "+super.gajiutama);
    }
}
