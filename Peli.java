import java.util.ArrayList;
import java.util.Random;

public class Peli {

    private ArrayList<String> sanalista;
    private String arvattavaSana;
    private int laskuri;
    private Random random;
    private Tulosta tulosta;
    private String viivat;

    public Peli() {
        this.sanalista = new ArrayList<>();
        this.arvattavaSana = "";
        this.laskuri = 0;
        this.random = new Random();
        this.viivat = sanaViivoina();
    }

    public void lisaa(String sana) {
        this.sanalista.add(sana.toUpperCase());
    }

    public void arvoSana() {
        this.arvattavaSana = this.sanalista.get(random.nextInt(this.sanalista.size()));
       /* Random random = new Random();
         String sana = lista.get(random.nextInt(lista.size()));*/
        sanaViivoina();
    }

    public void arvaa(String arvaus) {
        String tarkistus = "";
        for (int i = 0; i < this.arvattavaSana.length(); i++) {
            if (this.arvattavaSana.charAt(i) == arvaus.toUpperCase().charAt(0)) {
                tarkistus += arvaus.toUpperCase().charAt(0); 
            } else if (viivat.toUpperCase().charAt(i) != '_') {
                tarkistus += this.arvattavaSana.charAt(i);
            } else {
                tarkistus += "_";
            }
        }

        if (this.viivat.equals(tarkistus.toUpperCase())) {
            laskuri++;
            tulosta.tulosta(laskuri);
        } else {
            this.viivat = tarkistus.toUpperCase();
        }


        if (this.viivat.toUpperCase().equals(this.arvattavaSana)) {
            System.out.println("Oikein! Arvasit sanan " + this.arvattavaSana.toUpperCase() + "!");
        }
    }

    public String sanaViivoina() {
        String viivoja = this.arvattavaSana.replaceAll("[A-Ö]", "_ ");
        return viivoja;
    }

    public int getVaaratArvaukset() {
        //if (!arvattavaSana.equals(arvaus)){ //
          //  laskuri++;
        //}
        return laskuri;
    }


}
// Nice code bro
// thanks bro
//adawdas