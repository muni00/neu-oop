public class Servis {

    private int depNo;
    private int servisID;
    private String servisGuzergah;

    private static int count=0;

    public Servis(int depNo,String servisGuzergah)
    {
        this.depNo = depNo;
        this.servisGuzergah = servisGuzergah;
        this.servisID = ++count;

    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Servis.count = count;
    }

    public int getDepNo() {
        return depNo;
    }

    public void setDepNo(int depNo) {
        this.depNo = depNo;
    }

    public int getServisID() {
        return servisID;
    }

    public void setServisID(int servisID) {
        this.servisID = servisID;
    }

    public String getServisGuzergah() {
        return servisGuzergah;
    }

    public void setServisGuzergah(String servisGuzergah) {
        this.servisGuzergah = servisGuzergah;
    }
}
