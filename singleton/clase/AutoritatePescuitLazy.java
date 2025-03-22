package clase;

public class AutoritatePescuitLazy {
    private String denumire;
    private String website;
    private int nrAngajati;
    private int nrAutoritatiEmise;

    private static AutoritatePescuitLazy instance=null;

    public AutoritatePescuitLazy(String denumire, String website, int nrAngajati, int nrAutoritatiEmise) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
        this.nrAutoritatiEmise = nrAutoritatiEmise;
    }


    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public int getNrAutoritatiEmise() {
        return nrAutoritatiEmise;
    }

    public void setNrAutoritatiEmise(int nrAutoritatiEmise) {
        this.nrAutoritatiEmise = nrAutoritatiEmise;
    }

    public static void setInstance(AutoritatePescuitLazy instance) {
        AutoritatePescuitLazy.instance = instance;
    }

    @Override
    public String toString() {
        return "clase.AutoritatePescuitLazy{" +
                "denumire='" + denumire + '\'' +
                ", website='" + website + '\'' +
                ", nrAngajati=" + nrAngajati +
                ", nrAutoritatiEmise=" + nrAutoritatiEmise +
                '}';
    }

    void angajeaza(int nr){
        this.nrAngajati+=nr;
    }
    void concediaza(int nr){
        this.nrAngajati-=nr;
    }

    //get instance
    public static synchronized AutoritatePescuitLazy getInstance(String denumire, String website, int nrAngajati, int nrAutoritatiEmise){
        if(instance==null){
            instance=new AutoritatePescuitLazy(denumire, website, nrAngajati, nrAutoritatiEmise);
        }
        return instance;
    }
}
