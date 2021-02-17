package Generic1;

public class Anasayfa {

    public static void main(String[] args) {

        Ogrenci ogr = new Ogrenci("Ali","Kılınç",1001);
        Jenerik<Integer> nesne1 = new Jenerik<Integer>(10);
        Jenerik<String> nesne2=new Jenerik<String>("Ayşe");
        Jenerik<Double> nesne3 = new Jenerik<Double>(10.8);
        Jenerik<Ogrenci> nesne4 = new Jenerik<Ogrenci>(ogr);

        nesne1.NesneBilgileriniGoruntule();
        nesne2.NesneBilgileriniGoruntule();
        nesne3.NesneBilgileriniGoruntule();
        nesne4.NesneBilgileriniGoruntule();

    }
}
