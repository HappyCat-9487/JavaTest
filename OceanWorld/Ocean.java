public class Ocean {
    public static void main(String[] args){
        doSwim(new Anemonefish("尼莫"));
        doSwim(new Shark("藍尼"));
        doSwim(new Human("樂樂"));
        doSwim(new Submarine("潛艦一號"));
        doSwim(new Seaplane("滑行飛機"));
        doSwim(new FlyingFish("蘭嶼"));
    }

    static void doSwim(Swimmer swimmer){
        swimmer.swim();
    }
}
