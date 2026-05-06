public class SingleLinkedList08 {
    NodeMahasiswa08 head;
    NodeMahasiswa08 tail;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa08 tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
            tmp.data.tampilInformasi();
            tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    public void addFirst(Mahasiswa08 input) {
        NodeMahasiswa08 ndInput = new NodeMahasiswa08(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa08 input) {
        NodeMahasiswa08 ndInput = new NodeMahasiswa08(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa08 input) {
        NodeMahasiswa08 ndInput = new NodeMahasiswa08(input, null);
        NodeMahasiswa08 tmp = head;
        do {
            if (tmp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = tmp.next;
                tmp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                } 
                break;
            }
            tmp = tmp.next;
        } while (tmp != null);
    }

    public void insertAt(int idx, Mahasiswa08 input) {
        if (idx < 0) {
            System.out.println("Index Salah");
        } else if (idx == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa08 tmp = head;
            for (int i = 0; i < idx - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = new NodeMahasiswa08(input, tmp.next);
            if (tmp.next.next == null) {
                tail = tmp.next;
            }
        }
    }
}
