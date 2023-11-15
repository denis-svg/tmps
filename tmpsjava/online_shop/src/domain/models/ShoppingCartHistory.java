package domain.models;

import java.util.ArrayList;
import java.util.List;

// Caretaker
public class ShoppingCartHistory {
    private List<ShoppingCartMemento> history = new ArrayList<>();

    public void addToHistory(ShoppingCartMemento memento) {
        history.add(memento);
    }

    public ShoppingCartMemento undo() {
        if (!history.isEmpty()) {
            int lastIndex = history.size() - 1;
            ShoppingCartMemento lastMemento = history.get(lastIndex);
            history.remove(lastIndex);
            return lastMemento;
        }
        return null;
    }
}
