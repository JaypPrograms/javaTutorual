package javaTutorial;
import java.util.Scanner;
import java.util.ArrayList;

public class Training {
    static Scanner input= new Scanner(System.in);
    String best="hello";
    static Integer number=233;
    public static void main(String[] args) {
        
        ArrayList<poly> name=new ArrayList<poly>();
        name.add(new poly("jayp"));
        name.add(new poly("ali"));

        for(poly names: name){
            System.out.println(names.getName());
        }

}       
} 