package interface2;

public class IkiBasamakliSayi extends Sayilar {
    public int bs;
    public IkiBasamakliSayi(int sayi) {
        super(sayi);
        bs=2;
    }

    @Override
    public void SayiBilgisi() {

    }

    @Override
    public void Topla() {
        int toplam = 0;
        int[] dizi;
        dizi= SayiBul();

        for(int i=0;i<dizi.length;i++)
        {
            toplam = toplam + dizi[i];
        }

        System.out.println("Sayının rakamları toplamı : "+ toplam);
    }

    @Override
    public int[] SayiBul() {
        int[] dizi = new int[bs];
        int kalan,syc=0;

        while (sayi>0)
        {
            kalan = sayi%10;
            sayi=sayi%10;
            dizi[syc]=kalan;
        }
        return new int[0];
    }
}
