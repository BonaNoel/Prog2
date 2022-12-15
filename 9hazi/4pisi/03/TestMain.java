import java.util.List;

public class TestMain {
    
    public static void main(String[] args) {
        givesNumber_range_x_returnsArray();

        givesNumber_range_xy_returnsArray();
        givesNumber_range_xyz_returnsArray();

    }

    public static void givesNumber_range_x_returnsArray() {
        

        List<Integer> result = List.of(0,1,2,3);

        assert PyUtils.range(4) == result;

        System.out.println("1variable ok");
    }

    public static void givesNumber_range_xy_returnsArray() {
        

        List<Integer> result = List.of(2,3,4,5);

        assert PyUtils.range(2,6) == result;

        System.out.println("2variable ok");
    }

    public static void givesNumber_range_xyz_returnsArray() {
        

        List<Integer> result = List.of(2,4,6,8);

        assert PyUtils.range(2,10,2) == result;

        System.out.println("3variable ok");
    }


}
