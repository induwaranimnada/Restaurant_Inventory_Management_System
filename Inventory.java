import java.util.LinkedList;

public class Inventory {

    private LinkedList<Ingredient> ingredients;
    private UndoStack undoStack;

    // Constructor
    public Inventory() {
        ingredients = new LinkedList<>();
        undoStack = new UndoStack();
    }

    // Add Ingredient
    public void addIngredient(Ingredient ingredient) {

        ingredients.add(ingredient);

        System.out.println("Ingredient Added Successfully!");
    }

    // View All Ingredients
    public void viewIngredients() {

        if (ingredients.isEmpty()) {
            System.out.println("\nNo Ingredients Available.");
            return;
        }

        System.out.println("\n===== Ingredient List =====");

        for (Ingredient ingredient : ingredients) {
            ingredient.display();
        }
    }

    // Search Ingredient
    public Ingredient searchIngredient(String name) {

        for (Ingredient ingredient : ingredients) {

            if (ingredient.getName().equalsIgnoreCase(name)) {

                return ingredient;

            }

        }

        return null;
    }

    // Delete Ingredient
    public void deleteIngredient(String name) {

        Ingredient ingredient = searchIngredient(name);

        if (ingredient != null) {

            undoStack.push(ingredient);

            ingredients.remove(ingredient);

            System.out.println("Ingredient Deleted Successfully.");

        } else {

            System.out.println("Ingredient Not Found.");

        }

    }

    // Undo Delete
    public void undoDelete() {

        Ingredient ingredient = undoStack.pop();

        if (ingredient != null) {

            ingredients.add(ingredient);

            System.out.println("Ingredient Restored Successfully.");

        }

    }

    // Stock In
    public void stockIn(String name, int quantity) {

        Ingredient ingredient = searchIngredient(name);

        if (ingredient != null) {

            ingredient.setQuantity(
                    ingredient.getQuantity() + quantity
            );

            System.out.println("Stock Updated Successfully.");

        } else {

            System.out.println("Ingredient Not Found.");

        }

    }

    // Stock Out
    public void stockOut(String name, int quantity) {

        Ingredient ingredient = searchIngredient(name);

        if (ingredient != null) {

            if (ingredient.getQuantity() >= quantity) {

                ingredient.setQuantity(
                        ingredient.getQuantity() - quantity
                );

                System.out.println("Stock Issued Successfully.");

            } else {

                System.out.println("Not Enough Stock.");

            }

        } else {

            System.out.println("Ingredient Not Found.");

        }

    }

    // Low Stock Report
    public void lowStockReport() {

        System.out.println("\n===== Low Stock Items =====");

        boolean found = false;

        for (Ingredient ingredient : ingredients) {

            if (ingredient.getQuantity() <= ingredient.getMinimumStock()) {

                ingredient.display();

                found = true;

            }

        }

        if (!found) {

            System.out.println("No Low Stock Items.");

        }

    }

    // Return Ingredient List
    public LinkedList<Ingredient> getIngredients() {

        return ingredients;

    }

}