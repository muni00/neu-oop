package polimorfizm;

public class BilMuh  extends Muhendis{
    public BilMuh(String ad, int yas) {
        super(ad, yas);
        this.brans = "Bilgisayar Muhendisi";
    }
    @Override
    public void BilgileriYazdır()
    {
        System.out.println("-------------------Muhendis Sınıfı--------------------");
        System.out.println("Muhendis ad :"+this.ad);
        System.out.println("Muhendis yas :"+this.yas);
        System.out.println("Muhendis brans :"+this.brans);
        System.out.println("-------------------------------------------------------");

    }
    @Override
    public int PuanHesapla()
    {
        this.puan=yas*3;
        return  this.puan;
    }
}
