package polimorfizm;

public class Muhendis {

    public String ad;
    public String brans;
    public int yas;
    public int puan;
    public  Muhendis (String ad , int yas ){
        super();
        this.ad=ad;
        this.yas=yas;
        this.brans = "Muhendis";
    }
    public  void BilgileriYazdır(){
        System.out.println("-------------------Muhendis Sınıfı--------------------");
        System.out.println("Muhendis ad :"+this.ad);
        System.out.println("Muhendis yas :"+this.yas);
        System.out.println("Muhendis brans :"+this.brans);
        System.out.println("-------------------------------------------------------");

    }
    public int  PuanHesapla(){
        this.puan = yas *4;
        return  this.puan;

    }
}
