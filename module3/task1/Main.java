package module3.task1;

/**
 * Created by Илья on 10.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Bird eagle = new Bird("Eagle", "brown");
        System.out.println(eagle.walk());
        System.out.println(eagle.fly());
        System.out.println(eagle.sing());
        System.out.println(eagle.getClassName());
    }
}
