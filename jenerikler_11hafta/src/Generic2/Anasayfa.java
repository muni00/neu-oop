package Generic2;

public class Anasayfa {
    public static <T> String Bilgiler(T nesne)
    {
        System.out.println("Sınıf bilgisi :"+nesne.getClass().getName());
        return  nesne.toString();
    }
    public static void main(String[] args) {

        Ogrenci ogr = new Ogrenci("Eda","Ada",1014);
        Ogretmen ogret = new Ogretmen("mehmet","kılı","resim",30);

        System.out.println(Bilgiler(ogr));
        System.out.println(Bilgiler(ogret));
    }
}
