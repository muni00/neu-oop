package Generic2;

public class Ogrenci {

    public String ad;
    public String soyad;
    public int no;

    public Ogrenci(String ad, String soyad, int no) {
        this.ad = ad;
        this.soyad = soyad;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", no=" + no +
                '}';
    }
}
