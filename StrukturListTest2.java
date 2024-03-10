package Pertemuan_5;
// List (Operasi Remove Mid)
// Latihan 2
public class StrukturListTest2 {
    public static void main(String[] args) {
        // Create list 
        StrukturList list = new StrukturList();

        // menambah elemen list berisi (2, 6, 3, 5, 1)
        list.addTail(2);
        list.addTail(6);
        list.addTail(3);
        list.addTail(5);
        list.addTail(1);

        // menampilkan elemen list
        System.out.println("Elemen List:");
        list.displayElement();

        // menghapus elemen 3 di tengah list
        list.removeMid(3);

        // menampilkan elemen list setelah penghapusan
        System.out.println("Elemen List setelah penghapusan:");
        list.displayElement();

        // Tambahan : menghapus elemen list ditengah
        list.removeMid(5);
        list.removeMid(6);

        // menampilkan elemen list setelah penghapusan tambahan
        System.out.println("Elemen List setelah penghapusan tambahan:");
        list.displayElement();
    }
}
