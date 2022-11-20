public class FizzBuzz {
    private int limit;

    public FizzBuzz(int limit){
        this.setLimit(limit);
    }

    public void setLimit(int value) {
        if (value < 0){
            this.limit = 0;
        }
        else{
            this.limit=value;
        }
    }

    public int getLimit(){
        return this.limit;
    }

    public void start(){
        for (int i = 1; i < limit; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
                continue;
            }
            else if(i % 3 == 0){
                System.out.println("fizz");
            }
            else if(i % 5 == 0){
                System.out.println("buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
