package interface1;

public class Anasayfa {
    public static void main(String[] args) {

        DikUcgen du = new DikUcgen(3,4);
        du.UcgenTipiYazdır();
        du.CevreHesapla();
        du.AlanHesapla();

        EskenarUcgen eu= new EskenarUcgen(4,4,30);

    }
}
