package Modul1.latihan;

public class Makanan extends Hidangan{
    @Override
    public String disantap() {
        return this.getNamaHidangan() +" dimakan";
    }
}
