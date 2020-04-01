package Tehtävä_5_Singleton;

public class Työtön {
    private float tili;
    private String nimi;
    private Kela kela;

    public Työtön(String nimi, float tili) {
        this.tili = tili;
        this.nimi = nimi;
        kela = Kela.getInstance();
    }

    public void ostaRuokaa(float hinta) {
        if (hinta <= tili) {
            setTili(tili - hinta);
            System.out.printf("%sn ostosten hinta: %.2f€ | Tilillä rahaa: %.2f€\n", nimi, hinta, tili);
        } else {
            System.out.printf("%sn tilillä ei ole tarpeeksi rahaa ruuan ostamiseen.\n", nimi);
        }
    }

    public void ostaViinaa(float hinta) {
        if (hinta <= tili) {
            setTili(tili - hinta);
            System.out.printf("%sn ostosten hinta: %.2f€ | Tilillä rahaa: %.2f€\n", nimi, hinta, tili);
        } else {
            System.out.printf("%sn tilillä ei ole tarpeeksi rahaa viinan ostamiseen.\n", nimi);
        }
    }

    public void haeKelaTukia() {
        float f = kela.myönnäTukia(this);
        if (f != 0) {
            System.out.printf("%s sai kelatukia %.2f€\n", nimi, f);
            setTili(tili + f);
        } else {
            System.out.printf("%s yritti hankkia lisää kelatukia mutta on jo saanut tämän kuukauden tuet\n", nimi);
        }
    }

    public void getTili() {
        System.out.printf("%sn tilillä raha %.2f€\n", nimi, tili);
    }

    public String getName() {
        return this.nimi;
    }

    public float setTili(Float tili) {
        this.tili = tili;
        return tili;
    }
}
