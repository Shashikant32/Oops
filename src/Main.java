import java.sql.SQLOutput;
import  java.util.ArrayList;

public class Main {
    public static void repairCamera(Camera c)
    {
        c.saveToMemory();
        System.out.println("Repairing camera");
    }
    public static void main(String[] args)
    {
//        car c1 = new car("Mercedes");
//        c1.start();
//
//        System.out.println("hello world");
        FaceBookAccount fb = new FaceBookAccount();
        repairCamera(new SamsungCamera());


    }
}