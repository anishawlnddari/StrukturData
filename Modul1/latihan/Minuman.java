package Modul1.latihan;

public class Minuman extends Hidangan{
    @Override
    public String disantap() {
        return this.getNamaHidangan()+ " diminum";
    }
}
