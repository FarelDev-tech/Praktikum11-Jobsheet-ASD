import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan kapasitas maksimal antrian hari ini: ");
        int kapasitas = sc.nextInt();
        sc.nextLine(); // Membersihkan buffer

        Queue antrianLayanan = new Queue(kapasitas);
        int menu;

        do {
            System.out.println("======================================");
            System.out.println("Menu Program Mahasiswa");
            System.out.println("1. Daftar Antrian Baru (Enqueue)");
            System.out.println("2. Panggil Antrian (Dequeue)");
            System.out.println("3. Cek Antrian Terdepan");
            System.out.println("4. Cek Antrian Paling Akhir");
            System.out.println("5. Cek Jumlah Antrian");
            System.out.println("6. Tampilkan Semua Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Cek Status Penuh/Kosong");
            System.out.println("9. Keluar");
            System.out.println("======================================");
            System.out.print("Pilih menu (1-9): ");
            menu = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer

            switch (menu) {
                case 1:
                    if (!antrianLayanan.isFull()) {
                        System.out.println("--- Pendaftaran Antrian ---");
                        System.out.print("Masukkan NIM: ");
                        String nim = sc.nextLine();
                        System.out.print("Masukkan Nama: ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan Keperluan: ");
                        String keperluan = sc.nextLine();
                        
                        Mahasiswa mhsBaru = new Mahasiswa(nim, nama, keperluan);
                        antrianLayanan.enqueue(mhsBaru);
                    } else {
                        System.out.println("Antrian sudah penuh! Tidak dapat mendaftar.");
                    }
                    break;
                case 2:
                    System.out.println("--- Pemanggilan ---");
                    antrianLayanan.dequeue();
                    break;
                case 3:
                    System.out.println("--- Info Antrian Terdepan ---");
                    antrianLayanan.peekFront();
                    break;
                case 4:
                    System.out.println("--- Info Antrian Paling Akhir ---");
                    antrianLayanan.peekRear();
                    break;
                case 5:
                    System.out.println("--- Status Jumlah Antrian ---");
                    antrianLayanan.printInfo();
                    break;
                case 6:
                    antrianLayanan.printQueue();
                    break;
                case 7:
                    antrianLayanan.clear();
                    break;
                case 8:
                    System.out.println("--- Cek Status ---");
                    System.out.println("Apakah antrian kosong? " + (antrianLayanan.isEmpty() ? "Ya" : "Tidak"));
                    System.out.println("Apakah antrian penuh?  " + (antrianLayanan.isFull() ? "Ya" : "Tidak"));
                    break;
                case 9:
                    System.out.println("Terima kasih menggunakan sistem antrian!");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid!");
                    break;
            }
        } while (menu != 9);
        
        sc.close();
    }
}