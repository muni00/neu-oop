import java.util.Scanner;

public class Departman {

    private int depNo;
    private String depAd;
    Personel[] personeller;
    Servis [] servisler;

    static Scanner reader = new Scanner(System.in);

    public Departman()//bos constructor isime yaramadi ama güzel duruyo
    {

    }
    public Departman(int depNo,String depAd)//asil constructor
    {
        this.depNo=depNo;
        this.depAd=depAd;

    }

    public void PersonelOlustur(int pr_sayisi)//gelen boyut ile dizi elemanlari giriliyor
    {
         personeller = new Personel[pr_sayisi] ;
        for (int j=0;j<pr_sayisi;j++)
        {
            System.out.println((j+1)+ ". Personel Ad : ");
            String pr_ad = reader.next();
            System.out.println((j+1)+ ". Personel Soyad : ");
            String pr_soyad = reader.next();
            System.out.println((j+1)+ ". Personel Yas : ");
            int pr_yas = reader.nextInt();
            personeller[j] = new Personel(this.depNo,pr_ad,pr_soyad,pr_yas);
            System.out.println("\n____________________________________________________________________________________________\n");

        }
    }

    public void ServisOlustur(int sr_sayisi)//gelen boyut ile dizi elemanlari giriliyor
    {
        servisler = new Servis[sr_sayisi] ;
        for (int j=0;j<sr_sayisi;j++)
        {
            System.out.println((j+1)+ ". Servis Guzergahi : ");
            String sr_guzergah = reader.next();
            System.out.println("\n");

            servisler[j] = new Servis(this.depNo,sr_guzergah);

        }
        System.out.println("____________________________________________________________________________________________\n");

    }




    public int getDepNo() {
        return depNo;
    }

    public void setDepNo(int depNo) {
        this.depNo = depNo;
    }

    public String getDepAd() {
        return depAd;
    }

    public void setDepAd(String depAd) {
        this.depAd = depAd;
    }//get setler
}
