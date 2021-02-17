public abstract class Çalışan {
    public int id;
    public String ad;
    public String soyad;
    public int yas;
    public int cs;

    private  static int count =1000;

    public Çalışan(String ad, String soyad, int yas, int cs) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.cs = cs;
        this.id = 2+count ;
    }

    public abstract double ZamaOranıHesapla();
}
