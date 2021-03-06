package clock;

import observateur.ObservateurGenerique;
import temps.BoucleTemporelle;
import temps.GenerateurTick;
import observateurs.Observateur;

import static java.lang.Thread.sleep;

public class TestClock {

    public static void main(String args[]) {

        // mise en place de la clock, avec boucle temporelle de 2 secondes
        GenerateurTick t = new GenerateurTick();
        BoucleTemporelle b = new BoucleTemporelle(2 * 1000 / t.getIntervalleEntreTicks());
        t.attacher(b); // on attache la boucle temporelle au générateur du tick

        // création de quelques objets a attacher
        Observateur o = new ObservateurGenerique("observateur 1");
        b.attacher(o);
        Observateur o1 = new ObservateurGenerique("observateur 2");
        b.attacher(o1);

        try {
            sleep(5000);
        } catch (InterruptedException e) {
            System.err.println("error ");
        }

        t.interrompreGenerateur();
        System.out.println("generateur arreté");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("generateur repris après 4 secondes!");
        t.reprendreGenerateur();

        try {
            sleep(5000);
        } catch (InterruptedException e) {
            System.err.println("error ");
        }
        t.interrompreGenerateur();
    }
}
