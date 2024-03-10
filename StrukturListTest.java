package Pertemuan_5;

// List (Operasi Remove Head & Tail)
// Latihan 2
public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList(); // Create list

        // menambahkan elemen 2 di awal list
        list.addHead(2);
        // menambahkan elemen 9 di awal list
        list.addHead(9);
        // menambahkan elemen 7 di awal list
        list.addHead(7);

        // menampilkan elemen list
        System.out.println("Elemen list sebelum penghapusan:");
        list.displayElement();

        // menghapus elemen list di awal list
        list.removeHead();
        // menampilkan elemen list
        System.out.println("Elemen list setelah penghapusan:");
        list.displayElement();

        // menghapus elemen list di awal list 3x
        for (int i = 0; i < 3; i++) {
            list.removeHead();
            System.out.println("Elemen list setelah penghapusan ke-" + (i + 1) + ":");
            list.displayElement();
        }
    }
}
