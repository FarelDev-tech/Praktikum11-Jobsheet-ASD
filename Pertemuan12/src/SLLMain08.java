public class SLLMain08 {
    public static void main(String[] args) {
        SingleLinkedList08 sll = new SingleLinkedList08();

        Mahasiswa08 mhs1 = new Mahasiswa08( "254107060069", "Farel Maulana Firdaus", "SIB1A", 3.75);
        Mahasiswa08 mhs2 = new Mahasiswa08("254107060081", "Jesyca Alice Sutanto", "SIB1A", 3.71);
        Mahasiswa08 mhs3 = new Mahasiswa08("254107060082", "Syafiq", "SIB1A", 3.59);
        Mahasiswa08 mhs4 = new Mahasiswa08("254107060083", "Mohammad Giovandi", "SIB1A", 3.59);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Mohammad Giovandi", mhs3);
        sll.print();
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
