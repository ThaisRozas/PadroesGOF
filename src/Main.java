package src;

import src.patoPeruAdapter.Pato;
import src.patoPeruAdapter.PatoReal;

public class Main {

    public static void main(String[] args){
        coisasDePato(new PatoReal());
    }

    public static void coisasDePato(Pato pato){
        pato.grasnar();
        pato.voar();
    }
}
