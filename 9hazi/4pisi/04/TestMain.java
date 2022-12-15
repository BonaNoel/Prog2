import java.util.List;

public class TestMain {
    
    public static void main(String[] args) {
        givenNewVerem_toString_returnsEmptyVerem();
        givenNewVerem_size_returnsEmptyVeremsize();
        givenNewVerem_isEmpty_returnsEmptyVerem();

        giveVeremWithValuse_toString_returnsVerem();
        giveVeremWithValuse_size_returnsVerem();
        giveVeremWithValuse_isEmpty_returnsVerem();
        
        giveVeremWithValuse_pop_returnsTopValue();
        giveVeremWithValuse_popThenTosTring_returnsTopValue();
        giveVeremWithValuse_popThenSize_returnsTopValue();
        

    }

    public static void givenNewVerem_toString_returnsEmptyVerem() {

        Verem verem = new Verem();

        assert verem.toString() == "[";

        System.out.println("ok 1");
    }

    public static void givenNewVerem_size_returnsEmptyVeremsize() {

        Verem verem = new Verem();

        assert verem.size() == 0;

        System.out.println("ok 2");
    }

    public static void givenNewVerem_isEmpty_returnsEmptyVerem() {

        Verem verem = new Verem();

        assert verem.isEmpty() == true;

        System.out.println("ok 3");
    }

    public static void giveVeremWithValuse_toString_returnsVerem() {

        Verem verem = new Verem(List.of(3,5,6));

        assert verem.toString() == "[3, 5, 6";

        System.out.println("ok 4");
    }


    public static void giveVeremWithValuse_size_returnsVerem() {

        Verem verem = new Verem(List.of(3,5,6));

        assert verem.size() == 3;

        System.out.println("ok 5");
    }

    public static void giveVeremWithValuse_isEmpty_returnsVerem() {

        Verem verem = new Verem(List.of(3,5,6));

        assert verem.isEmpty() == false ;

        System.out.println("ok 6");
    }

    public static void giveVeremWithValuse_pop_returnsTopValue() {

        Verem verem = new Verem(List.of(3,5,6));

        assert verem.pop() == 6;

        System.out.println("ok 7");
    }

    public static void giveVeremWithValuse_popThenTosTring_returnsTopValue() {

        Verem verem = new Verem(List.of(3,5,6));

        verem.pop();

        assert verem.toString() == "[3, 5";

        System.out.println("ok 8");
    }

    public static void giveVeremWithValuse_popThenSize_returnsTopValue() {

        Verem verem = new Verem(List.of(3,5,6));

        verem.pop();

        assert verem.size() == 2;

        System.out.println("ok 9");
    }


}
