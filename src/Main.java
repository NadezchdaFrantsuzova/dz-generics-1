import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MagicBox<Integer> magicBox1 = new MagicBox<>(5);
        magicBox1.add(20);
        magicBox1.add(150);
        magicBox1.add(200);
        magicBox1.add(10);
        magicBox1.add(170);
        magicBox1.add(300);
        magicBox1.pick();

        MagicBox<String> magicBox2 = new MagicBox<>(3);
        magicBox2.add("Olya");
        magicBox2.add("Petya");
        magicBox2.add("Sveta");
        magicBox2.add("Sacha");
        magicBox2.pick();
    }
}
