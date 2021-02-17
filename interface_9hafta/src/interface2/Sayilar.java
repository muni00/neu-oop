package interface2;

public abstract class Sayilar implements BasamakToplamiHesapla{
    public int sayi;

    public Sayilar(int sayi) {
        this.sayi = sayi;
    }
    public  abstract  void SayiBilgisi();
}
