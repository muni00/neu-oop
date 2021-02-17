import java.util.Scanner;

public class Main {

    static Scanner reader = new Scanner(System.in); //girilen veri okumak icin
    static int pr_sayisi, sr_sayisi;//kullanicidan alinacak verileri işleyebilmek icin
    static int by_sayi , kc_sayi;//yas sıralaması icin
    static boolean kontrol=true ;//aramalarda bulunup bulunmadigini kontrol etmek icin

    public static void main(String[] args) {

        int a = 1, dp_sayisi;
        int secim;

        String dp_ad;
        System.out.println("\n<*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*>\n ");//karsilama
        System.out.println("\t\t\t\t\t\t\t\t H O S G E L D I N I Z ");
        System.out.println("\n<*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*>\n ");

        System.out.print("KAC FARKLI DEPARTMAN GIRECEKSINIZ :  ");
        dp_sayisi = reader.nextInt();
        System.out.println("\n<*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*>\n ");

        Departman[] departmanlar = new Departman[dp_sayisi];//boyutla nesne olusturuldu
        for (int i = 0; i < dp_sayisi; i++)//verilen boyut kadar veri isleme
        {
            System.out.print((i + 1) + ". DEPARTMANIN ADINI GIRINIZ : ");
            dp_ad = reader.next();
            System.out.println("____________________________________________________________________________________________\n");

            departmanlar[i] = new Departman(i, dp_ad);

            System.out.print("KAC PERSONEL BILGISI GIRECEKSINIZ :  ");
            pr_sayisi = reader.nextInt();
            System.out.println("____________________________________________________________________________________________\n");
            System.out.print("KAC SERVIS BILGISI GIRECEKSINIZ :  ");
            sr_sayisi = reader.nextInt();
            System.out.println("____________________________________________________________________________________________\n");
            departmanlar[i].PersonelOlustur(pr_sayisi);//alınan boyutlar departman classina gonderiliyor
            departmanlar[i].ServisOlustur(sr_sayisi);
        }

        while (a == 1) {

            for (int i = 0; i < 50; ++i) System.out.println();//her ideye uygun olmasi acisinden terminal temizleme
            System.out.println("<*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*>\n ");//interaktif menü
            System.out.println("\t[1] -> TÜM DEPARTMAN BİLGİLERİNİ LİSTELE ");
            System.out.println("\t[2] -> DEPARTMAN ADINA GÖRE ARAMA YAP ");
            System.out.println("\t[3] -> PERSONEL ADINA GÖRE ARAMA YAP ");
            System.out.println("\t[4] -> SERVİS GÜZERGAHINA GÖRE ARAMA YAP ");
            System.out.println("\t[5] -> YAŞI EN BÜYÜK VE EN KÜÇÜK PERSONELİ BUL ");
            System.out.println("\t[6] -> ÇIKIŞ YAP ");
            System.out.println("\n<*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*> \n");
            System.out.print("\tSECIMINIZ :");
            secim = reader.nextInt();
            System.out.println("\n<*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*> \n");

            switch (secim) {
                case 1://listeleme
                    for (int i = 0; i < departmanlar.length; i++) {
                        System.out.println("Departman No : " + i + " Departman Ad : " + departmanlar[i].getDepAd());
                        System.out.println("Personeller : ");
                        for (int j = 0; j < pr_sayisi; j++) {
                            System.out.print("\t" + (j+1) + " . Personel: " + departmanlar[i].personeller[j].getPerID());
                            System.out.print(" " + departmanlar[i].personeller[j].getPerAd());
                            System.out.print(" " + departmanlar[i].personeller[j].getPerSoyad());
                            System.out.print(" " + departmanlar[i].personeller[j].getPerYas() + "\n");

                        }
                        System.out.println("Servisler : ");
                        for (int j = 0; j < sr_sayisi; j++) {
                            System.out.print("\t" + (j + 1) + " . Servis: " + departmanlar[i].servisler[j].getServisID());
                            System.out.print(" " + departmanlar[i].servisler[j].getServisGuzergah() + "\n");

                        }
                        System.out.println("\n____________________________________________________________________________________________\n");

                    }
                    break;
                case 2://dep. e gore arama

                    System.out.println("ARADIGINIZ DEPARTMANIN ADI :");
                    String dep1 = reader.next();
                    System.out.println("\n____________________________________________________________________________________________\n");

                    for (int i = 0; i < departmanlar.length; i++) {
                        if (departmanlar[i].getDepAd().equals(dep1)) {

                            System.out.println("Departman No : " + i + " Departman Ad : " + departmanlar[i].getDepAd());
                            System.out.println("Personeller : ");
                            for (int j = 0; j < pr_sayisi; j++) {
                                System.out.print("\t" + (j + 1) + " . Personel: " + departmanlar[i].personeller[j].getPerID());
                                System.out.print(" " + departmanlar[i].personeller[j].getPerAd());
                                System.out.print(" " + departmanlar[i].personeller[j].getPerSoyad());
                                System.out.print(" " + departmanlar[i].personeller[j].getPerYas() + "\n");

                            }
                            System.out.println("Servisler : ");
                            for (int j = 0; j < sr_sayisi; j++) {
                                System.out.print("\t" + (j + 1) + " . Servis: " + departmanlar[i].servisler[j].getServisID());
                                System.out.print(" " + departmanlar[i].servisler[j].getServisGuzergah() + "\n");

                            }
                          kontrol=false;
                        }
                    }

                    if(kontrol==true)//bulup bulmadiginin kontrolu
                        System.out.println("ARADIGINIZ KAYIT BULUNMAMAKTADIR...");
                    kontrol=true;
                    break;
                case 3:
                    System.out.println("ARADIGINIZ PERSONELIN ADI:");
                    String dep2 = reader.next();

                    for (int i = 0; i < departmanlar.length; i++) {
                        for (int j = 0; j < pr_sayisi; j++) {
                            if (departmanlar[i].personeller[j].getPerAd().equals(dep2)) {
                                System.out.println("Departman No : " + i + " Departman Ad : " + departmanlar[i].getDepAd());
                                System.out.println("Personeller : ");

                                System.out.print("\t" + (j + 1) + " . Personel: " + departmanlar[i].personeller[j].getPerID());
                                System.out.print(" " + departmanlar[i].personeller[j].getPerAd());
                                System.out.print(" " + departmanlar[i].personeller[j].getPerSoyad());
                                System.out.print(" " + departmanlar[i].personeller[j].getPerYas() + "\n");
                                System.out.println("\n____________________________________________________________________________________________\n");
                                kontrol=false;
                            }
                        }
                    }
                    if(kontrol==true)
                        System.out.println("ARADIGINIZ KAYIT BULUNMAMAKTADIR...");
                    kontrol=true;
                    break;
                case 4:
                    System.out.println("ARADIGINIZ SERVIS GUZERGAHI:");
                    String dep3 = reader.next();

                    for (int i = 0; i < departmanlar.length; i++) {
                        for (int j = 0; j < pr_sayisi; j++) {
                            if (departmanlar[i].servisler[j].getServisGuzergah().equals(dep3)) {
                                System.out.println("Departman No : " + i + " Departman Ad : " + departmanlar[i].getDepAd());
                                System.out.println("Servisler : ");
                                System.out.print("\t" + (j + 1) + " . Servis: " + departmanlar[i].servisler[j].getServisID());
                                System.out.print(" " + departmanlar[i].servisler[j].getServisGuzergah() + "\n");
                                System.out.println("\n____________________________________________________________________________________________\n");
                                kontrol=false;
                            }
                        }
                    }
                    if(kontrol==true)
                        System.out.println("ARADIGINIZ KAYIT BULUNMAMAKTADIR...");
                    kontrol=true;
                    break;
                case 5:
                    kc_sayi=100;
                    by_sayi=0;

                    for (Departman departman : departmanlar) {
                        for (int j = 0; j < pr_sayisi; j++) {
                            int yas = departman.personeller[j].getPerYas();
                            if (yas > by_sayi) {
                                by_sayi = yas;//buyuk sayi atamasi
                            }
                            if (yas < kc_sayi) {
                                kc_sayi = yas;//kucuk sayi atamasi
                            }

                        }

                    }
                    for (int i = 0; i < departmanlar.length; i++)//listeleme
                    {
                        for (int j = 0; j < pr_sayisi; j++)
                        {
                            if (departmanlar[i].personeller[j].getPerYas()==by_sayi || departmanlar[i].personeller[j].getPerYas()==kc_sayi )
                            {
                                System.out.println("Departman No : " + i + " Departman Ad : " + departmanlar[i].getDepAd());
                                System.out.println("Personeller : ");

                                System.out.print("\t" + (j + 1) + " . Personel: " + departmanlar[i].personeller[j].getPerID());
                                System.out.print(" " + departmanlar[i].personeller[j].getPerAd());
                                System.out.print(" " + departmanlar[i].personeller[j].getPerSoyad());
                                System.out.print(" " + departmanlar[i].personeller[j].getPerYas() + "\n");
                                System.out.println("\n____________________________________________________________________________________________\n");

                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Program sonlandırılıyor...");
                    a = 2;
                    break;
                default:
                    System.out.println("Hatali secim! Lütfen dikkatli okuyunuz!");
                    break;
            }

        }


    }


}
