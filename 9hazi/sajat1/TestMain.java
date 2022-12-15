public class TestMain {
    public static void main(String[] args) {
        
        giveNumber_isEven_returnTrue();

        giveNumber_isEven_returnFalse();
    }
    
    public static void giveNumber_isEven_returnTrue() {
        assert Main.isEven(2) == true;

        assert Main.isEven(420) == true;
        assert Main.isEven(666) == true;
        assert Main.isEven(1734632) == true;

        System.out.println("True ok");
    }

    public static void giveNumber_isEven_returnFalse() {
        assert Main.isEven(1) == false;

        assert Main.isEven(421) == false;
        assert Main.isEven(667) == false;
        assert Main.isEven(1734633) == false;

        System.out.println("False ok");
    }



}
