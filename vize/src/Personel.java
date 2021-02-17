public class Personel {

   // Departman dept = new Departman();
    private int depNo;
    private int perID;
    private String perAd;
    private String perSoyad;
    private int perYas;

    private static int count=0;


    public Personel(int depNo,String perAd,String perSoyad,int perYas)
    {
        this.depNo=depNo;
        this.perID=++count;
        this.perAd=perAd;
        this.perSoyad=perSoyad;
        this.perYas=perYas;

    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Personel.count = count;
    }

    public int getDepNo() {
        return depNo;
    }

    public void setDepNo(int depNo) {
        this.depNo = depNo;
    }

    public int getPerID() {
        return perID;
    }

    public void setPerID(int perID) {
        this.perID = perID;
    }

    public String getPerAd() {
        return perAd;
    }

    public void setPerAd(String perAd) {
        this.perAd = perAd;
    }

    public String getPerSoyad() {
        return perSoyad;
    }

    public void setPerSoyad(String perSoyad) {
        this.perSoyad = perSoyad;
    }

    public int getPerYas() {
        return perYas;
    }

    public void setPerYas(int perYas) {
        this.perYas = perYas;
    }
}
