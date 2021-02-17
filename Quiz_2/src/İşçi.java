public class İşçi extends Çalışan implements  Maaş{
    String görev ;
    public İşçi(String ad, String soyad, int yas, int cs) {
        super(ad, soyad, yas, cs);
        this.görev ="İşci";

    }

    @Override
    public double MaasHesapla() {
       double maas;
       maas = ZamaOranıHesapla() + 3000;
        return maas;
    }

    @Override
    public double ZamaOranıHesapla() {
        double zam ;
        zam = (cs*100)+(yas*0.666666667); // 2/3 ü ile çarptım
        return zam;
    }


}
