import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {

        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

    

    //néhány szabály amit érdemes betartani
    // vagy mind a két metódust(equals,hashcode) felulirjuk vagy egyiket sem
    // 2 objektum összehasonlitásakor a legtobb esetben a ket objektumot az erteke alapjan akarom ossszehasonlitani ehez szükség van az equals metoduf felülirasahoz
    
    // 2 objektum az equals szerint azonossak akkor a hashcode juk is egyezzen meg

}
