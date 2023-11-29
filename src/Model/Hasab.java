package Model;

public class Hasab extends Faidom{
    private double a, b, magassag;

    public Hasab(double a, double b, double magassag) {
        this.a = a;
        this.b = b;
        this.magassag = magassag;
    }
    
    @Override
    public double terfogat(){
        return a * b * magassag;
    }

    @Override
    public String toString() {
        return super.toString() + "Hasab{" + "a=" + a + ", b=" + b + ", magassag=" + magassag + '}' + '}';
    }
}
