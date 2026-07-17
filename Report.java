public class Report {

    public void generateReport(Inventory inventory) {

        int totalItems = inventory.getIngredients().size();

        int totalQuantity = 0;

        int lowStock = 0;

        for (Ingredient ingredient : inventory.getIngredients()) {

            totalQuantity += ingredient.getQuantity();

            if (ingredient.getQuantity() <= ingredient.getMinimumStock()) {

                lowStock++;

            }

        }

        System.out.println("\n========== INVENTORY REPORT ==========");

        System.out.println("Total Ingredients : " + totalItems);

        System.out.println("Total Quantity    : " + totalQuantity);

        System.out.println("Low Stock Items   : " + lowStock);

        System.out.println("======================================");

    }

}