
import java.util.List;

class Box<T extends Fruit> {
    private List<T> Frutis;

    public Box(List<T> Frutis) {
        this.Frutis = Frutis;
    }

    public void put(T item) {
        Frutis.add(item);
    }

    public List<T> getFrutis() {
        return Frutis;
    }
}
