package interface1;

public class DikUcgen extends Ucgen implements Alan,Cevre{

    public int aci;

    public DikUcgen(int kenar1, int kenar2) {
        super(kenar1, kenar2);
        aci=90;
        kenar3=(int) Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
    }

    @Override
    public void AlanHesapla() {

        double alan ;
        alan=(kenar1*kenar2)/2;
        System.out.println("Dik çgenin alanı :"+alan);
    }

    @Override
    public void CevreHesapla() {

        System.out.println("Üçgenin çevresi :"+(kenar1+kenar2+kenar3));
    }

    @Override
    public void UcgenTipiYazdır() {

        System.out.println("Bu bir dik üçgendir");
    }
}
