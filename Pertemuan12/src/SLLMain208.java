public class SLLMain208 {
    public static void main(String[] args) {
        SingleLinkedList08 sll = new SingleLinkedList08();

        Mahasiswa08 mhs1 = new Mahasiswa08("254107060069", "Farel", "SIB1A", 3.75);
        Mahasiswa08 mhs2 = new Mahasiswa08("254107060070", "Jesyca", "SIB1A", 3.75);
        Mahasiswa08 mhs3 = new Mahasiswa08("254107060071", "Syafiq", "SIB1A", 3.75);
        Mahasiswa08 mhs4 = new Mahasiswa08("254107060072", "Giovandi", "SIB1A", 3.75);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Giovandi", mhs3);
        sll.print();
        sll.insertAt(2, mhs2);
        sll.print();

        // Latihan 2
        System.out.println("data index ke-1");
        sll.getData(1);
        System.out.println();

        System.out.println("Data Mahasiswa an Farel berada pada index: " + sll.indexOf("Farel"));
        System.out.println();

        sll.removeFirst();
        sll.print();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
