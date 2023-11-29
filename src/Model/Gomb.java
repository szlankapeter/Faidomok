package Model;

public class Gomb extends Faidom{
    
    private double sugar;

    public Gomb(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public double terfogat() {
        return (4*Math.pow(sugar, 3)*Math.PI)/3;
    }

    @Override
    public String toString() {
        return super.toString() + "Gomb{" + "sugar=" + sugar + '}' + '}';
    }
    
    
}
