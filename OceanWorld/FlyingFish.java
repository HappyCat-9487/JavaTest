public class FlyingFish extends Fish implements Flyer {
    public FlyingFish(String name){
        super(name);
    }

    @Override
    public void swim(){
        System.out.printf("飛魚 %s 游泳", name);
    }

    @Override
    public void fly(){
        System.out.printf("飛魚 %s 在飛", name);
    }
}
