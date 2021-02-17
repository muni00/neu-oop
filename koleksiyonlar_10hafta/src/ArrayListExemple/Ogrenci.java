package ArrayListExemple;

public class Ogrenci {
    private int no;
    private String ad;
    private  String soyad;
    private int vize_not;
    private int final_not;
    private double gecme_notu;

    private  static int count =0;

    public Ogrenci(String ad, String soyad, int vize_not, int final_not) {
        this.ad = ad;
        this.soyad = soyad;
        this.vize_not = vize_not;
        this.final_not = final_not;
        this.no=++count;
        this.gecme_notu=(vize_not*0.4)+(final_not*0.6);
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public double getGecme_notu() {
        return gecme_notu;
    }

    public void setGecme_notu(double gecme_notu) {
        this.gecme_notu = gecme_notu;
    }
}
