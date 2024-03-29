package Modul1.latihan;

public class Kota<E> {
    private E element;

    public Kota(E kota){
        element = kota;
    }

    public E getElement(){
        return element;
    }

    public static void main(String[] args) {
        Kota<Integer> jumlahKota = new Kota<Integer>(9);
        Kota<String > namaKota = new Kota<String>(" Malang ");
        System.out.println("Jumlah Kota di Jawa Timur : " + jumlahKota.getElement() + " Kota");
        System.out.println("Salah satu Kota di Jawa Timur : Kota " + namaKota.getElement());
    }
}