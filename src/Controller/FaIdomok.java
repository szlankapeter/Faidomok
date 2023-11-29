package Controller;

import Model.Faidom;
import Model.Gomb;
import Model.Hasab;
import java.util.ArrayList;
import java.util.List;

public class FaIdomok {

    private List<Faidom> idomok;

    public static void main(String[] args) {
        new FaIdomok();
    }

    public FaIdomok() {
        this.idomok = new ArrayList<>();
        run();
    }

    public void run() {
        this.idomok.add(new Gomb(2));
        this.idomok.add(new Gomb(3));
        this.idomok.add(new Gomb(5.5));
        this.idomok.add(new Hasab(2, 3, 4));
        this.idomok.add(new Hasab(5, 5.5, 10));
        this.idomok.add(new Hasab(2.2, 1, .5));
        
        for(Faidom idom : idomok){
            System.out.println(idom.toString());
        }
        
        System.out.printf("Az össz súly: %.2f\n", osszSuly());
        System.out.printf("A gömbök össz súlya: %.2f\n", osszGombSuly());
        System.out.print("minV: " + minV());
        System.out.printf(", típusa: %s\n", minV().getClass().getSimpleName());
        System.out.print("maxV: " + maxV());
        System.out.printf(", típusa: %s\n", maxV().getClass().getSimpleName());
    }

    public double osszSuly() {
        double ossz = 0;
        for(Faidom idom : idomok){
            ossz += idom.suly();
        }
        return ossz;
    }

    public double osszGombSuly() {
        double gombokSulya = 0;
        for (Faidom faIdom : idomok) {
            if (faIdom instanceof Gomb) {
                gombokSulya += faIdom.suly();
            }
        }
        return gombokSulya;
    }

    public Faidom minV() {
        int minIndex = 0;
        for (int i = 0; i < idomok.size(); i++) {
            if (idomok.get(minIndex).terfogat() > idomok.get(i).terfogat()) {
                minIndex = i;
            }
        }
        return idomok.get(minIndex);
    }

    public Faidom maxV() {
        int maxIndex = 0;
        for (int i = 0; i < idomok.size(); i++) {
            if (idomok.get(maxIndex).terfogat() < idomok.get(i).terfogat()) {
                maxIndex = i;
            }
        }
        return idomok.get(maxIndex);
    }

}
