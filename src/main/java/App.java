import com.clover.test.basedrop.HelloSayer;
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {

    public String getGreeting() {
        return "Hello world.";
    }
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }

    public String sayHello() {
        HelloSayer sayer = new HelloSayer();
        return sayer.say(); }
}