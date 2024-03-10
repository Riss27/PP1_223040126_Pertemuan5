package Pertemuan_5;
// List (Operasi Remove Head & Tail)
// Latihan 4
public class StrukturListTest1 {
    public static void main(String[] args) {
        StrukturList list = new StrukturList(); // Create list

        // menambahkan elemenn list
        list.addHead(1);
        list.addHead(5);
        list.addHead(3);
        list.addHead(6);
        list.addHead(2);

        // menampilkan elemen list
        System.out.println("Elemen list:");
        list.displayElement();

        // menghapus elemen di akhir list
        list.removeTail();
        // menampilkan elemen list
        System.out.println("Elemen list setelah penghapusan di akhir:");
        list.displayElement();

        // menghapus elemen di awal list
        list.removeHead();
        // menampilkan elemen list
        System.out.println("Elemen list setelah penghapusan di awal:");
        list.displayElement();
    }
}
