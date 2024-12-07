public class car {
    int wheels =4;
    String name;
    int steringwheels=1;

    public void acceleter(){

    }
    car()
    {
        System.out.println("Inside default constructor");
    }
    car(String name)
    {
//        System.out.println("x");  // error
        this();
        this.name = name;
        System.out.println("param const");
    }
    public void stop()
    {

    }
    public void start()
    {

    }
}
