public class Seaplane implements Flyer, Swimmer {
    private String name;

    public Seaplane(String name){
        this.name = name;
    }

    @Override
    public void fly(){
        System.out.printf("海上飛機 %s 在飛%n", name);
    }

    @Override
    public void swim(){
        System.out.printf("海上飛機 %s 在海面滑行%n", name);
    }
}
