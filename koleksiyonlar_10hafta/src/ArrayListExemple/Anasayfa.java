package ArrayListExemple;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Anasayfa {
    public static void main(String[] args) throws IOException {

        String ad,soyad;
        Scanner scan = new Scanner(System.in);
        int secim,vn,fn;
        ArrayList<Ogrenci> liste = new ArrayList<Ogrenci>();
        boolean döngü = true;

        while (döngü)
        {
            System.out.println("1-Öğrenci Ekle");
            System.out.println("2-Öğrencileri Listele");
            System.out.println("3-Öğrenci Ara");
            System.out.println("4-Öğrenci Sil");
            System.out.println("5-Çıkış");
            secim = scan.nextInt();

            switch (secim)
            {
                case 1:
                    System.out.println("Öğrencinin adını giriniz : ");
                    ad=scan.next();
                    System.out.println("Öğrencinin soyadını giriniz : ");
                    soyad=scan.next();
                    System.out.println("Öğrencinin vize notunu giriniz : ");
                    vn=scan.nextInt();
                    System.out.println("Öğrencinin final notunu giriniz : ");
                    fn=scan.nextInt();
                    Ogrenci ogr = new Ogrenci(ad,soyad,vn,fn);
                    liste.add(ogr);
                    break;
                case 2:
                    System.out.println("Listedeki öğrenciler :");
                    for(Ogrenci ogrenci:liste)
                    {
                        System.out.println("No : "+ogrenci.getNo()+"Ad : "+ogrenci.getAd()+"Soyad : "+ogrenci.getSoyad()+"Geçme notu : "+ogrenci.getGecme_notu());
                    }
                    break;
                case 3:
                    String aranacak_ad;
                    System.out.println("Aradığınız öğrencinin adını giriniz  : ");
                    aranacak_ad=scan.next();
                    int count =0;
                    for(Ogrenci ogrenci:liste)
                    {
                        if(aranacak_ad.equals(ogrenci.getAd()))
                        {
                            System.out.println("Aranan öğrencinin bilgileri : ");
                            System.out.println("No : "+ogrenci.getNo()+"Ad : "+ogrenci.getAd()+"Soyad : "+ogrenci.getSoyad()+"Geçme notu : "+ogrenci.getGecme_notu());
                            count++;
                        }

                    }
                    if (count==0)
                        System.out.println("Aranan öğrenci bulunamadı...");
                    break;
                case 4:
                    String silinecek_ad;
                    System.out.println("Silinecek öğrencinin adını giriniz  : ");
                    silinecek_ad=scan.next();
                    for(Ogrenci ogrenci:liste)
                    {
                        if(silinecek_ad.equals(ogrenci.getAd()))
                        {
                           liste.remove(ogrenci);
                        }

                    }
                    break;
                case 5:
                    File file =new File("ogrenciler.txt");
                    if (!file.exists())
                    {
                        file.createNewFile();
                    }
                    FileWriter flt = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(flt);
                    for (Ogrenci ogrenci :liste)
                    {
                        bw.write(ogrenci.getNo()+" "+ogrenci.getAd()+" "+ogrenci.getSoyad()+" "+ogrenci.getGecme_notu()+" \n");

                    }
                    bw.close();
                    System.out.println("Çıkış Yapılıyor.....");
                    döngü=false;
                    break;
                default:
                    System.out.println("Hatalı bir seçim yaptınız ....");
                    break;
            }
        }
    }
}
