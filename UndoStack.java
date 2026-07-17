import java.util.Stack;

public class UndoStack {

    private Stack<Ingredient> deletedItems;

    public UndoStack() {
        deletedItems = new Stack<>();
    }

    // Save deleted ingredient
    public void push(Ingredient ingredient) {

        deletedItems.push(ingredient);

    }

    // Restore last deleted ingredient
    public Ingredient pop() {

        if (deletedItems.isEmpty()) {

            System.out.println("Nothing to Undo.");
            return null;

        }

        return deletedItems.pop();

    }

    // Check Stack Empty
    public boolean isEmpty() {

        return deletedItems.isEmpty();

    }

}