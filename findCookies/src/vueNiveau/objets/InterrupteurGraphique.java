package vueNiveau.objets;

import metier.objets.Interrupteur;
import metier.objets.ObjetMetier;
import utile.observateur.Observateur;

public class InterrupteurGraphique extends ObjetGraphique {

    private Interrupteur interrupteur;

    public InterrupteurGraphique(float posX, float posY, Interrupteur metier) {
        super("interrupteur_ferme.png", posX, posY);
        interrupteur = metier;
    }

    public InterrupteurGraphique(InterrupteurGraphique i) {
        super(i);
        interrupteur = new Interrupteur(i.interrupteur);
    }

    @Override
    public ObjetMetier getObjetMetier() {
        return interrupteur;
    }

    public void actionnerInterrupteur() {
        interrupteur.actionnerInterrupteur();
    }

    public boolean attacher(Observateur o) {
        return interrupteur.attacher(o);
    }

    public boolean detacher(Observateur o) {
        return interrupteur.detacher(o);
    }

    public void notifier() {
        interrupteur.notifier();
    }

}
