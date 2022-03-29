import java.util.Scanner;

public class Kayttoliittyma {
    private Peli peli;
    private Scanner lukija;

    public Kayttoliittyma(Peli peli, Scanner lukija) {
        this.peli = peli;
        this.lukija = lukija;
    }
    public void kaynnista() { 
        System.out.println("Tervetuloa pelaamaan hirsipuupeliä!");
        System.out.println("Komennot:");
        System.out.println("lisaa - Lisää sanan, tyhjä lopettaa");
        System.out.println("sekoita - Sekoittaa sanat");
        System.out.println("lopeta - Lopettaa pelin");

        while (true) {
        
        String syote = lukija.nextLine();
            if (syote.equals("lopeta")) {
                System.out.println("Peli lopetettu.");
                break;
            }
            if (syote.equals("lisaa")) {
                System.out.println("Lisättävä sana:");
                String lisattava = lukija.nextLine();
                peli.lisaa(lisattava);
            }
            if (syote.equals("sekoita")) {
                peli.arvoSana();
            }
            if (syote.isEmpty()) {
                kaynnista();
            }
        }
    }
}
//Kaikki scanner asiat tänne