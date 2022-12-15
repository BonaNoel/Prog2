public class Monster implements CanAttack, CanFly, CanSwim {
    
    private String type;

    public Monster(String type) {
        this.type = type;
    }

    @Override
    public void swim() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void attack() {
        System.out.printf("támads");        
    }


}
