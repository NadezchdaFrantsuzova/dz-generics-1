import java.util.Random;

public class MagicBox<T> {
    protected int max;
    protected T[] items;
    protected int totalI;

    public MagicBox(int max) {
        this.items = (T[]) new Object[max];
    }
    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("В коробке лежит: " + items[i]);
                totalI++;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (totalI < items.length) {
                throw new RuntimeException("Коробка не полна и осталось ещё " + (items.length - totalI) + " ячеек заполнить");
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        System.out.println();
        System.out.println("МАГИЧЕСКАЯ КОРОБКА выбрала: " + items[randomInt]);
        System.out.println();
        return items[randomInt];
    }
}






