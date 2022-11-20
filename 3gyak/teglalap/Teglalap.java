public class Teglalap {
    private double a;
    private double b;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public Teglalap(double a, double b) {
        this.setA(a);
        this.setB(b);
    }

    public double kerulet() {
        return 2 * (a + b);
    }

    public double terulet() {
        return a * b;
    }

    @Override
    public String toString(){
        return String.format("a: %.2f, b: %.2f", a, b);
    }
}
