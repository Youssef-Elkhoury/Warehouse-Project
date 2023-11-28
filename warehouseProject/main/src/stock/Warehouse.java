package stock;
import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private int id;
    private List<Item> items;

    public Warehouse(int id) {
        this.id = id;q
        this.items = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public int occupancy() {
        return items.size();
    }

    public Item search(String name) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }
}