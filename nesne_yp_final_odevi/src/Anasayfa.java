import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Anasayfa {

    static int id,yas;
    static String adSoyad;


    public static void main(String[] args)throws IOException {

        Scanner scan = new Scanner(System.in);
        int secim;

        ArrayList<Kursiyer> kursiyerler = new ArrayList<Kursiyer>();
        ArrayList<Kurs> kurslar = new ArrayList<Kurs>();

        boolean döngü = true;

        FileReader fr = new FileReader("kurs.txt");
        BufferedReader br = new BufferedReader(fr);
        while(br.ready()) //kursları kaydetmek için
        {
            String satir=br.readLine();
            int yst = satir.indexOf("-");
            Kurs krs = new Kurs(Integer.parseInt(satir.substring(0,yst)),satir.substring(yst+1));
            kurslar.add(krs);

        }
        fr.close();
        FileReader frb = new FileReader("kursiyer.txt");
        BufferedReader brb = new BufferedReader(frb);
        while(brb.ready()) //kursiyerleri kaydetmek için
        {
            String sharp="#",yildiz="*";
            String satir=brb.readLine();
            int ilk = satir.indexOf("-");
            int son = satir.lastIndexOf("-");

            if(sharp.equals(String.valueOf(satir.charAt(0))))
            {
                id = Integer.parseInt(satir.substring(1,ilk));
                adSoyad = satir.substring(ilk+1,son);
                yas = Integer.parseInt(satir.substring(son+1));
                Kursiyer kr = new Kursiyer(id,adSoyad,yas);
                kursiyerler.add(kr);

            }
            if(yildiz.equals(String.valueOf(satir.charAt(0))))
            {
                for(Kursiyer krs:kursiyerler)
                {
                    if(krs.getKursiyerId()==id)
                    {
                        Kurs kurs_alma = new Kurs(Integer.parseInt(satir.substring(1,ilk)),satir.substring(ilk+1));
                        krs.alinanKurslar.add(kurs_alma);
                    }

                }
            }

        }
        frb.close();

        while (döngü)
        {
            System.out.println("-------------------------------------------------------");
            System.out.println("[1]-Kurs Ekle");
            System.out.println("[2]-Kurs Listele");
            System.out.println("[3]-Kursiyer Ekle");
            System.out.println("[4]-Kursiyer Ara");
            System.out.println("[5]-Kursiyer Sil");
            System.out.println("[6]-Kursiyer Listele");
            System.out.println("[7]-Kursiyer Ayrıntılı Listele");
            System.out.println("[8]-Kursiyer Aylık Ödeyeceği Tutarı Hesapla");
            System.out.println("[9]-Çıkış");
            System.out.println("-------------------------------------------------------");

            secim = scan.nextInt();

            switch (secim)
            {
                case 1:
                    System.out.println("Ekleyeceğiniz kursun id'sini giriniz : ");
                    int kid=scan.nextInt();
                    System.out.println("Ekleyeceğiniz kursun adını giriniz : ");
                    String kad =scan.next();
                    int c=0;
                    for(Kurs kurs:kurslar)
                    {
                        if(kid==kurs.getKursId())
                        {
                            c++;
                        }
                    }
                    if(c==0)
                    {
                        Kurs eklenenkurs = new Kurs(kid,kad);
                        kurslar.add(eklenenkurs);
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Kurs Id     Kurs Adı");
                    for(Kurs kurs:kurslar)
                    {
                        System.out.println(kurs.getKursId()+"\t\t"+kurs.getKursAd());

                    }
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Ekleyeceğiniz kursiyerin id'sini giriniz : ");
                    int kuid=scan.nextInt();
                    int d=0;
                    for(Kursiyer kursiyer:kursiyerler)
                    {
                        if(kuid==kursiyer.getKursiyerId())
                        {
                            d++;
                            break;
                        }
                    }
                    if(d==0)
                    {
                        System.out.println("Ekleyeceğiniz kursiyerin adını giriniz : ");
                        String kuad =scan.next();
                        System.out.println("Ekleyeceğiniz kursiyerin soyadını giriniz : ");
                        String kusad =scan.next();
                        System.out.println("Ekleyeceğiniz kursiyerin yasini giriniz : ");
                        int kuyas=scan.nextInt();
                        Kursiyer eklenenkursiyer = new Kursiyer(kuid,kuad+" "+kusad,kuyas);
                        System.out.println("Ekleyeceğiniz kursiyere kaç kurs gireceksiniz : ");
                        int kurs_sayisi =scan.nextInt();
                        for (int i=0;i<kurs_sayisi;i++)
                        {
                                    System.out.println("Ekleyeceğiniz kursun id'sini giriniz : ");
                                    kid=scan.nextInt();
                                    System.out.println("Ekleyeceğiniz kursun adını giriniz : ");
                                    kad =scan.next();
                                    Kurs eklenenkurs = new Kurs(kid,kad);
                                    eklenenkursiyer.alinanKurslar.add(eklenenkurs);

                        }
                        kursiyerler.add(eklenenkursiyer);
                    }
                    else
                    {
                        System.out.println("girdiğiniz id ile daha önceden tanımlama yapılmıştır lütfen farklı bir id giriniz..");
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.print("Aradığınız kursiyerin adını giriniz :");
                    String ad =scan.next();
                    System.out.print("Aradığınız kursiyerin soyadını giriniz :");
                    String soyad =scan.next();
                    int a=0;
                    for(Kursiyer krs:kursiyerler)
                    {
                        if(krs.getKursiyerAdSoyad().contains(ad+" "+soyad))
                        {
                            System.out.println(krs.getKursiyerId()+" "+krs.getKursiyerAdSoyad()+" "+krs.getKursiyerYas());
                            for (Kurs kkrs:krs.alinanKurslar)
                            {
                                System.out.println("-\t"+kkrs.getKursId()+" "+kkrs.getKursAd());
                            }
                            a++;
                        }
                    }
                    if (a==0)
                    {
                        System.out.println("Aradığınız isimde bir kursiyer bulunmamaktadır");
                    }
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.print("Silinecek kursiyerin id'sini  giriniz :");
                    int aid =scan.nextInt();
                    int b=0;

                        Iterator<Kursiyer> it = kursiyerler.iterator();
                        while (it.hasNext()) {
                            if (it.next().getKursiyerId()==aid) {
                                it.remove();
                                b++;
                            }
                        }
                    if (b==0)
                    {
                        System.out.println("Aradığınız isimde bir kursiyer bulunmamaktadır");
                    }
                    System.out.println("\n");
                    break;
                case 6:
                    System.out.println("Tüm Kursiyerler");
                    for(Kursiyer krs:kursiyerler)
                    {
                        System.out.println(krs.getKursiyerId()+" "+krs.getKursiyerAdSoyad()+" "+krs.getKursiyerYas());
                    }
                    System.out.println("\n");
                    break;
                case 7:
                    System.out.println("Tüm Kursiyerler ve Aldıkları Kurslar");
                    for(Kursiyer krs:kursiyerler)
                    {
                        System.out.println(krs.getKursiyerId()+" "+krs.getKursiyerAdSoyad()+" "+krs.getKursiyerYas());
                        for (Kurs kkrs:krs.alinanKurslar)
                        {
                            System.out.println("-\t"+kkrs.getKursId()+" "+kkrs.getKursAd());
                        }
                    }
                    System.out.println("\n");
                    break;
                case 8:
                    System.out.println("Aylik ödenecek tutarının hesaplanacağı  kursiyerin id'sini giriniz : ");
                    int id = scan.nextInt();
                    int e=0;
                    double kurs_ucreti_a;
                    for(Kursiyer kursiyer:kursiyerler)
                    {
                        if(id==kursiyer.getKursiyerId())
                        {
                           int k_sayisi = kursiyer.alinanKurslar.size();
                           if(k_sayisi==2)
                           {
                               kurs_ucreti_a=400+(400-(400*0.15));
                               System.out.println("Kursiyerin aylik odeyecegi tutar : "+kurs_ucreti_a+"\nKursiyer Kampanya 1 'den faydalanmıştır.");
                           }
                           else if(k_sayisi==3)
                           {
                               kurs_ucreti_a=400+(400-(400*0.15));
                               System.out.println("Kursiyerin aylik odeyecegi tutar : "+kurs_ucreti_a+"\nKursiyer Kampanya 2 'den faydalanmıştır.");
                           }
                           else if(k_sayisi>3)
                           {
                               kurs_ucreti_a=(400-(400*0.10))*k_sayisi;
                               System.out.println("Kursiyerin aylik odeyecegi tutar : "+kurs_ucreti_a+"\nKursiyer Kampanya 3 'den faydalanmıştır.");
                           }
                           else
                           {
                               System.out.println("Kursiyerin aylik odeyecegi tutar : "+400+"\nTek kurs aldigi icin herhangi bir kampanyadan faydalanilamadi...");
                           }
                            e++;
                        }
                    }
                    if(e==0)
                    {
                        System.out.println("girdiğiniz id ile tanımlanmış bir kayıt mevcut değildir");
                    }
                    System.out.println("\n");
                    break;
                case 9:
                    File file =new File("kursiyer.txt");
                    if (!file.exists())
                    {
                        file.createNewFile();
                    }
                    FileWriter flt = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(flt);
                    for (Kursiyer krsyaz :kursiyerler)
                    {
                        bw.write("#"+krsyaz.getKursiyerId()+"-"+krsyaz.getKursiyerAdSoyad()+"-"+krsyaz.getKursiyerYas()+"\n");
                        for (Kurs kryaz:krsyaz.alinanKurslar)
                        {
                            bw.write("*"+kryaz.getKursId()+"-"+kryaz.getKursAd()+"\n");
                        }

                    }
                    bw.close();
                    File filek =new File("kurs.txt");
                    if (!filek.exists())
                    {
                        filek.createNewFile();
                    }
                    FileWriter fltk = new FileWriter(filek);
                    BufferedWriter bwk = new BufferedWriter(fltk);
                    for (Kurs kryaz :kurslar)
                    {
                        bwk.write(kryaz.getKursId()+"-"+kryaz.getKursAd()+"\n");
                    }
                    bwk.close();
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
