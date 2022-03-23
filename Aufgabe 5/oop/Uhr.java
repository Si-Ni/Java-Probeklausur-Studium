package oop;

public class Uhr implements Steuerung{

    private Uhrwerk uhrwerk;
    private Anzeige anzeige;

    public Uhr(Uhrwerk u, Anzeige a){
        uhrwerk = u;
        anzeige = a;
    }

    @Override
    public void aktivieren() {
        anzeige.setUhrwerk(uhrwerk);
        anzeige.zeigeZeit();
    }

    @Override
    public void beenden() {
        
    }

    
}
