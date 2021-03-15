
import java.util.Scanner;

public class Guest {
    public static void main(String[] args){
        ArrayList names = new ArrayList();
        collection(names);
        System.out.println("訪客名單：");
        printUpperCase(names);
    }

    static void collection(ArrayList names){
        Scanner console = new Scanner(System.in);
        while(true){
            System.out.print("訪客名稱：");
            String name = console.nextLine();
            if(name.equals("quit"))
                break;
            
            names.add(name);
        }
    }

    static void printUpperCase(ArrayList names){
        for(int i = 0; i < names.size(); i++){
            String name = (String) names.get(i);
            System.out.println(name.toUpperCase());
        }
    }
}