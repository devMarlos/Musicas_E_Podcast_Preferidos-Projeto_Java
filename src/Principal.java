import Models.Musica;
import Models.Podcast;
import Models.Preferencias;

public class Principal {
    public static void main(String[] args) {

        Musica msc = new Musica();
        Podcast pdc = new Podcast();

        msc.setTitulo("Deixe-me-ir");
        msc.setArtista("1Kilo");

        for (int i = 0; i < 3000; i++) {
            msc.reproduz();
        }

        for (int i = 0; i < 200; i++) {
            msc.curte();
        }

        pdc.setTitulo("Dia a dia de um programador");
        pdc.setApresentador("Marlos");


        for (int i = 0; i < 500; i++) {
            pdc.reproduz();
        }

        for (int i = 0; i < 450; i++){
            pdc.curte();
        }

        Preferencias pre = new Preferencias();

        System.out.println(msc.getTitulo());
        System.out.println(msc.getTotalCurtidas());
        pre.inclui(msc);

        System.out.println();

        System.out.println(pdc.getTitulo());
        System.out.println(pdc.getApresentador());
        pre.inclui(pdc);



    }
}