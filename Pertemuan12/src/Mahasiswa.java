public class Mahasiswa {
    String nim;
    String nama;
    String keperluan;

    public Mahasiswa(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void tampilData() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Keperluan: " + keperluan);
    }
}