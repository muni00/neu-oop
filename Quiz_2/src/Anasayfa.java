import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Anasayfa {


    public static void main(String[] args) throws IOException {

        String ad,soyad;
        Scanner scan = new Scanner(System.in);
        int yas,cs,ic;
        ArrayList<İşçi> isciler = new ArrayList<İşçi>();

        System.out.println("kaç işçi bilgisi gireceksiniz : ");
        ic=scan.nextInt();

        for (int i = 0; i<ic ; i++)
        {
            System.out.println("işcinin adını giriniz : ");
            ad=scan.next();
            System.out.println("işcinin soyadını giriniz : ");
            soyad=scan.next();
            System.out.println("işcinin yaşını giriniz : ");
            yas=scan.nextInt();
            System.out.println("işcinin çocuk sayısını giriniz giriniz : ");
            cs=scan.nextInt();
            İşçi isci = new İşçi(ad,soyad,yas,cs);
            isciler.add(isci);
        }
        for(İşçi işçi:isciler)
        {
            System.out.println(" "+işçi.id+ " "+işçi.ad+" "+işçi.soyad+" "+işçi.MaasHesapla()+" "+işçi.görev);
        }

        File file =new File("işçiler.txt");
        if (!file.exists())
        {
            file.createNewFile();
        }
        FileWriter flt = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(flt);
        for (İşçi i̇şçi :isciler)
        {

            bw.write(i̇şçi.id+ " "+i̇şçi.ad+" "+i̇şçi.soyad+" "+i̇şçi.MaasHesapla()+" "+i̇şçi.görev+" \n");

        }
        bw.close();
        System.out.println("Çıkış Yapılıyor.....");


    }
}
