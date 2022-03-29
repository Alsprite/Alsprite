public class Tulosta {
    private int laskuri;
    private Peli peli;

    public Tulosta (int laskuri){
        this.laskuri = laskuri;
    }

    public void tulosta(int laskuri){
        if (peli.getVaaratArvaukset() == 1){
            System.out.println("Arvasit väärin! Yritä uudelleen!");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("__|__");
        } else if (peli.getVaaratArvaukset() == 2){
            System.out.println("Arvasit väärin! Yritä uudelleen!");
            System.out.println();
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("__|__");
        } else if (peli.getVaaratArvaukset() == 3){
            System.out.println("Arvasit väärin! Yritä uudelleen!");
            System.out.println("  __________");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("__|__");
        } else if (peli.getVaaratArvaukset() == 4){
            System.out.println("Arvasit väärin! Yritä uudelleen!");
            System.out.println("  __________");
            System.out.println("  |        |");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("__|__");
        } else if (peli.getVaaratArvaukset() == 5){
            System.out.println("Arvasit väärin! Yritä uudelleen!");
            System.out.println("  __________");
            System.out.println("  |       _|_");
            System.out.println("  |      |___|");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("__|__");
        } else if (peli.getVaaratArvaukset() == 6){
            System.out.println("Arvasit väärin! Yritä uudelleen!");
            System.out.println("  __________");
            System.out.println("  |       _|_");
            System.out.println("  |      |___|");
            System.out.println("  |        |");
            System.out.println("  |        |");
            System.out.println("  |        |");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("__|__");
        } else if (peli.getVaaratArvaukset() == 7){
            System.out.println("Arvasit väärin! Yritä uudelleen!");
            System.out.println("  __________");
            System.out.println("  |       _|_");
            System.out.println("  |      |___|");
            System.out.println("  |       /| \\");
            System.out.println("  |      / |  \\");
            System.out.println("  |        |");
            System.out.println("  |  ");
            System.out.println("  |  ");
            System.out.println("__|__");
        } else if (peli.getVaaratArvaukset() == 8){
            System.out.println("Hävisit!");
            System.out.println("  __________");
            System.out.println("  |       _|_");
            System.out.println("  |      |___|");
            System.out.println("  |       /| \\");
            System.out.println("  |      / |  \\");
            System.out.println("  |        |");
            System.out.println("  |       / \\");
            System.out.println("  |      /   \\");
            System.out.println("__|__ ");
        }
        
}
}