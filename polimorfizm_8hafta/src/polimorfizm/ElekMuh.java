package polimorfizm;

public class ElekMuh extends Muhendis{
    public ElekMuh(String ad, int yas) {
        super(ad, yas);
        this.brans = "Elektrik Muhendisi";
    }
    @Override
    public void BilgileriYazdır()
    {
        System.out.println("-------------------Elektrik Muh. Sınıfı--------------------");
        System.out.println("Muhendis ad :"+this.ad);
        System.out.println("Muhendis yas :"+this.yas);
        System.out.println("Muhendis brans :"+this.brans);
        System.out.println("-------------------------------------------------------");

    }
    @Override
    public int PuanHesapla()
    {
        this.puan=yas*5;
        return  this.puan;
    }
}
