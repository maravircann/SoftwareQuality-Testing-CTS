package clase;

public class AutoritatePescuitEager {
    private String denumire;
    private String website;
    private int nrAngajati;
    private int nrAutorizatiiTrimise;

    public AutoritatePescuitEager(String denumire, String website, int nrAngajati, int nrAutorizatiiTrimise) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
        this.nrAutorizatiiTrimise = nrAutorizatiiTrimise;
    }

    private static AutoritatePescuitEager instance=new AutoritatePescuitEager();

    private AutoritatePescuitEager(){
        this.denumire="ANPA";
        this.website="www.anpa.ro";
        this.nrAngajati=10;
        this.nrAutorizatiiTrimise=100;
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

    public int getNrAutorizatiiTrimise() {
        return nrAutorizatiiTrimise;
    }

    public void setNrAutorizatiiTrimise(int nrAutorizatiiTrimise) {
        this.nrAutorizatiiTrimise = nrAutorizatiiTrimise;
    }

    public static void setInstance(AutoritatePescuitEager instance) {
        AutoritatePescuitEager.instance = instance;
    }

    @Override
    public String toString() {
        return "clase.AutoritatePescuitEager{" +
                "denumire='" + denumire + '\'' +
                ", website='" + website + '\'' +
                ", nrAngajati=" + nrAngajati +
                ", nrAutorizatiiTrimise=" + nrAutorizatiiTrimise +
                '}';
    }


    // get instance
    public static AutoritatePescuitEager getInstance(){
    return instance;
    }
}
