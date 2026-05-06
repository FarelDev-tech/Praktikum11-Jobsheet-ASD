import java.util.Scanner;

public class SLLMain08 {
    public static void main(String[] args) {
        SingleLinkedList08 sll = new SingleLinkedList08();
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("==================================");
            System.out.println("Menu Program");
            System.out.println("1. Tambah Data di Awal (addFirst)");
            System.out.println("2. Tambah Data di Akhir (addLast)");
            System.out.println("3. Tambah Data Setelah Nama Tertentu (insertAfter)");
            System.out.println("4. Tambah Data pada Indeks Tertentu (insertAt)");
            System.out.println("5. Tampilkan Semua Data");
            System.out.println("6. Keluar");
            System.out.println("==================================");
            System.out.print("Pilih menu (1-6): ");
            menu = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer agar tidak menyangkut

            Mahasiswa08 mhsBaru = null;

            // Jika menu 1-4, meminta input data dasar mahasiswa terlebih dahulu
            if (menu >= 1 && menu <= 4) {
                System.out.println("--- Input Data Mahasiswa Baru ---");
                System.out.print("Masukkan NIM: ");
                String nim = sc.nextLine();
                System.out.print("Masukkan Nama: ");
                String nama = sc.nextLine();
                System.out.print("Masukkan Kelas: ");
                String kelas = sc.nextLine();
                System.out.print("Masukkan IPK: ");
                double ipk = sc.nextDouble();
                sc.nextLine();

                // Buat objek mahasiswa baru
                mhsBaru = new Mahasiswa08(nim, nama, kelas, ipk);
            }

            switch (menu) {
                case 1:
                    sll.addFirst(mhsBaru);
                    System.out.println("Data berhasil ditambahkan di awal");
                    break;
                
                case 2:
                    sll.addLast(mhsBaru);
                    System.out.println("Data berhasil ditambahkan di akhir");
                    break;
                
                case 3:
                    System.out.print("Masukkan Nama Mahasiswa sebelumnya (sebagai patokan): ");
                    String key = sc.nextLine();
                    sll.insertAfter(key, mhsBaru);
                    System.out.println("Data berhasil ditambahkan setelah " + key);
                    break;
                
                case 4:
                    System.out.print("Masukkan Indeks tujuan (dimulai dari 0): ");
                    int idx = sc.nextInt();
                    sc.nextLine(); // Membersihkan buffer
                    sll.insertAt(idx, mhsBaru);
                    System.out.println("Data berhasil ditambahkan pada indeks ke-" + idx);
                    break;
                
                case 5:
                    System.out.println("--- Data Mahasiswa Saat Ini ---");
                    sll.print();
                    break;
                
                case 6:
                    System.out.println("Terima kasih! Program Selesai.");
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-6");
                    break;
            }
        } while (menu != 6);
        sc.close();
    }
}