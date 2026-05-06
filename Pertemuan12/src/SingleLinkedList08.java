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

    // Latihan 2
    public void getData(int idx) {
        NodeMahasiswa08 tmp = head;
        for (int i = 0; i < idx; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi();
    }

    public int indexOf(String key) {
        NodeMahasiswa08 tmp = head;
        int idx = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            idx++;
        }

        if (tmp == null) {
            return -1;
        } else {
            return idx;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa08 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else {
            NodeMahasiswa08 temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                    this.removeFirst();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)) { 
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa08 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }

    
}
