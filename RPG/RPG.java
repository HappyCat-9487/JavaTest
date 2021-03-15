public class RPG {
    public static void main(String[] args){

        SwordMan swordMan = new SwordMan();
        swordMan.setName("Justin");
        swordMan.setLevel(1);
        swordMan.setBlood(200);
        showBlood(swordMan);
    
        Magician magician = new Magician();
        magician.setName("James");
        magician.setLevel(100);
        magician.setBlood(100);
        showBlood(magician);

        drawFight(swordMan);
        drawFight(magician);
    }

    static void showBlood(Role role){
        System.out.println(role.toString());
    }

    static void drawFight(Role role){
        System.out.print(role.getName());
        System.out.print("\t");
        role.fight();
    }
}