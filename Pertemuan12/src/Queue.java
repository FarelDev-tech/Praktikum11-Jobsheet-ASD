public class Queue {
    Node head, tail;
    int size;
    int capacity; // cek antrian jika penuh

    public Queue(int capacity) {
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.capacity = capacity;
    }

    // Cek antrian kosong
    public boolean isEmpty() {
        return head == null;
    }

    // Cek antrian penuh (berdasarkan kapasitas yang ditentukan)
    public boolean isFull() {
        return size == capacity;
    }

    // Mengosongkan antrian
    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    // Menambahkan antrian (Enqueue)
    public void enqueue(Mahasiswa data) {
        if (isFull()) {
            System.out.println("Mohon maaf, antrian sudah penuh!");
        } else {
            Node newNode = new Node(data, null);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
            System.out.println("Mahasiswa a.n " + data.nama + " berhasil masuk ke antrian.");
        }
    }

    // Memanggil antrian (Dequeue)
    public Mahasiswa dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong, tidak ada yang bisa dipanggil.");
            return null;
        } else {
            Mahasiswa dataPanggilan = head.data;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            System.out.println("Memanggil antrian: " + dataPanggilan.nama);
            return dataPanggilan;
        }
    }

    // Menampilkan antrian terdepan
    public void peekFront() {
        if (!isEmpty()) {
            System.out.println("Antrian Terdepan:");
            head.data.tampilData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    // Menampilkan antrian paling akhir
    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian Paling Akhir:");
            tail.data.tampilData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    // Menampilkan jumlah mahasiswa yang masih mengantre
    public void printInfo() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size + " orang.");
    }

    // Melihat seluruh isi antrean
    public void printQueue() {
        if (!isEmpty()) {
            Node tmp = head;
            int i = 1;
            System.out.println("--- Daftar Antrian Saat Ini ---");
            while (tmp != null) {
                System.out.print(i + ". ");
                tmp.data.tampilData();
                tmp = tmp.next;
                i++;
            }
        } else {
            System.out.println("Antrian kosong.");
        }
    }
}