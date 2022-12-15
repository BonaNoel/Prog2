public class Circle {
   public static int circleCount = 0; // osztalyvaltozo - static
   
    private double r;

    public Circle(double r) {
        this.setR(r);

        circleCount++;
    }

    public void setR(double value) {
        if (value < 0) {
            this.r = 0.0;
        } else {
            this.r = value;
        }
    }

    public double getR() {
        return this.r;
    }

    public double Kerulet() {
        return 2 * r * Math.PI;
    }

    public double Terulet() {
        return r * r * Math.PI;
    }

    public boolean isSmallerThen(Circle other) {
        return this.r < other.r;
    }

    @Override
    public String toString() {
        return String.format("Circle: %f", this.r);
    }
}
