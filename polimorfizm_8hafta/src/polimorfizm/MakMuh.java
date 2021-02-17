package polimorfizm;

public class MakMuh extends Muhendis {
    public MakMuh(String ad, int yas) {
        super(ad, yas);
        this.brans = "Makine Muhendisi";
    }
    @Override
    public void BilgileriYazdır()
    {
        System.out.println("-------------------Makine Muh. Sınıfı--------------------");
        System.out.println("Muhendis ad :"+this.ad);
        System.out.println("Muhendis yas :"+this.yas);
        System.out.println("Muhendis brans :"+this.brans);
        System.out.println("-------------------------------------------------------");

    }

}
