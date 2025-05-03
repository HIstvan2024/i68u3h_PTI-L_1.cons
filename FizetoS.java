 public class FizetoS {
    private String nev;
    private String aNeve;
    private String lakCim;
    private String szakma;
    private String muHe;
    private int kor;
    private int gyeSza;
    private int fizetes;
    private boolean statusz_Hazassag;
    private boolean statusz_Tanulo;

    // Full konstruktor
    public FizetoS(String nev, String aNeve, String lakCim, String szakma, String muHe, int kor, int gyeSza, int fizetes, boolean statusz_Hazassag, boolean statusz_Tanulo) {
        this.nev = nev;
        this.aNeve = aNeve;
        this.lakCim = lakCim;
        this.szakma = szakma;
        this.muHe = muHe;
        this.kor = kor;
        this.gyeSza = gyeSza;
        this.fizetes = fizetes;
        this.statusz_Hazassag = statusz_Hazassag;
        this.statusz_Tanulo = statusz_Tanulo;
    }

    // Abstract konstruktor
    public FizetoS(String nev, String aNeve, String lakCim, String szakma, String muHe, int kor, int fizetes) {
        this(nev, aNeve, lakCim, szakma, muHe, kor, 0, fizetes, false, true);
    }

    @Override
    public String toString() {
        return "\n Név: " + nev +
                "\n Anyja neve: " + aNeve +
                "\n Lakcíme: " + lakCim +
                "\n Szakma: " + szakma +
                "\n Munkahelye: " + muHe +
                "\n Kor: " + kor +
                "\n Fizetés: " + fizetes;
    }

    public String getNev() {
        return nev;
    }
    public void setNev(String nev) {
        this.nev = nev;
    }
    public String getANeve() {
        return aNeve;
    }
    public void setANeve(String aNeve) {
        this.aNeve = aNeve;
    }
    public String getLakCim() {
        return lakCim;
    }
    public void setLakCim(String lakCim) {
        this.lakCim = lakCim;
    }
    public String getSzakma() {
        return szakma;
    }
    public void setSzakma(String szakma) {
        this.szakma = szakma;
    }
    public String getMuHe() {
        return muHe;
    }
    public void setMuHe(String muHe) {
        this.muHe = muHe;
    }
    public int getKor() {
        return kor;
    }
    public void setKor(int kor) {
        this.kor = kor;
    }
    public int getGyeSza() {
        return gyeSza;
    }
    public void setGyeSza(int gyeSza) {
        this.gyeSza = gyeSza;
    }
    public int getFizetes() {
        return fizetes;
    }
    public void setFizetes(int fizetes) {
        this.fizetes = fizetes;
    }
    public boolean isStatusz_Hazassag() {
        return statusz_Hazassag;
    }
    public void setStatusz_Hazassag(boolean statusz_Hazassag) {
        this.statusz_Hazassag = statusz_Hazassag;
    }
    public boolean isStatusz_Tanulo() {
        return statusz_Tanulo;
    }
    public void setStatusz_Tanulo(boolean statusz_Tanulo) {
        this.statusz_Tanulo = statusz_Tanulo;
    }

    public boolean felnottKoru() {
        if (kor >= 18) return true;
        return false;
    }

    public FizetoS magasabbE(FizetoS a, FizetoS b) {
        if (a.fizetes > b.fizetes) {
            return a;
        }
        return b;
    }

    public boolean nagyCsa(FizetoS a) {
        if (a.gyeSza >= 3 && statusz_Hazassag)
        {
            return true;
        }
        return false;
    }
 }

