package interface1;

import java.text.DecimalFormat;

public class EskenarUcgen  extends Ucgen implements Alan{
    public int aci;
    public EskenarUcgen(int kenar1, int kenar2,int aci) {
        super(kenar1, kenar2);
        this.aci = aci;
    }

    @Override
    public void AlanHesapla() {
        double alan;
        alan = (kenar1*kenar2*Math.sin(aci))/2 ;
        if(alan<0)
        {
            alan = alan*(-1);
        }
        System.out.println("Eşkenar üçgenin alanı : "+new DecimalFormat(".##").format(alan));


    }

    @Override
    public void UcgenTipiYazdır() {
        System.out.println("Bu bir eşkenar üçgendir");
    }
}
