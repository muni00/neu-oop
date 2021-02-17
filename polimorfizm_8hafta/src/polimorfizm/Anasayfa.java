package polimorfizm;

import java.util.Scanner;

public class Anasayfa {
    public static  void BilgileriListele(Muhendis muhendis)
    {
        System.out.println(" ");
        muhendis.BilgileriYazdır();
    }
    public static  void PuanlarıYazdır(Muhendis[] muhler)
    {
        System.out.println(" ");
        for(int i =0; i<muhler.length;i++)
        {
            System.out.println((i+1)+"muhendisin branşı :"+muhler[i].brans+"yası : "+muhler[i].yas+" puanı : "+muhler[i].PuanHesapla());
        }
    }
    public static void main(String[] args) {
        String ad;
        int yas;
        int toplam,bs,es,mas;
        Scanner scan = new Scanner(System.in);

        System.out.println("Bilgisayar mühendisliği sayısını giriniz :");
        bs=scan.nextInt();
        System.out.println("Bilgisayar mühendisliği sayısını giriniz :");
        es=scan.nextInt();
        System.out.println("Bilgisayar mühendisliği sayısını giriniz :");
        mas=scan.nextInt();

        toplam = bs+es+mas;
        Muhendis[] muhendisler = new Muhendis[toplam];

        for (int i =0 ; i<bs;i++)
        {
            System.out.println((i+1)+" . sırada olan mühendisin adını giriniz :");
            ad = scan.next();
            System.out.println((i+1)+" . sırada olan mühendisin yasını giriniz :");
            yas = scan.nextInt();

            muhendisler[i] = new BilMuh(ad,yas);
        }
        System.out.println(" ");
        for (int i = bs ; i<bs+es;i++)
        {
            System.out.println((i+1)+" . sırada olan mühendisin adını giriniz :");
            ad = scan.next();
            System.out.println((i+1)+" . sırada olan mühendisin yasını giriniz :");
            yas = scan.nextInt();

            muhendisler[i] = new ElekMuh(ad,yas);
        }
        System.out.println(" ");
        for (int i = bs+es ; i<toplam;i++)
        {
            System.out.println((i+1)+" . sırada olan mühendisin adını giriniz :");
            ad = scan.next();
            System.out.println((i+1)+" . sırada olan mühendisin yasını giriniz :");
            yas = scan.nextInt();

            muhendisler[i] = new MakMuh(ad,yas);
        }
        for (int i=0 ;i<toplam;i++)
        {
            BilgileriListele(muhendisler[i]);
        }
    }
}
