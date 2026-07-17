import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Inventory inventory = new Inventory();
        KitchenQueue kitchenQueue = new KitchenQueue();
        Report report = new Report();

        // Simple Login
        String username, password;

        System.out.println("====================================");
        System.out.println(" Restaurant Inventory Management ");
        System.out.println("====================================");

        System.out.print("Username : ");
        username = input.nextLine();

        System.out.print("Password : ");
        password = input.nextLine();

        if (!username.equals("admin") || !password.equals("1234")) {

            System.out.println("\nInvalid Login!");
            

        }

        System.out.println("\nLogin Successful!");

        int choice;

        do {

            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Add Ingredient");
            System.out.println("2. View Ingredients");
            System.out.println("3. Search Ingredient");
            System.out.println("4. Delete Ingredient");
            System.out.println("5. Stock In");
            System.out.println("6. Stock Out");
            System.out.println("7. Add Kitchen Request");
            System.out.println("8. Process Kitchen Request");
            System.out.println("9. View Kitchen Requests");
            System.out.println("10. Undo Delete");
            System.out.println("11. Low Stock Report");
            System.out.println("12. Inventory Report");
            System.out.println("13. Exit");

            System.out.print("Enter Choice : ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Ingredient ID : ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Ingredient Name : ");
                    String name = input.nextLine();

                    System.out.print("Category : ");
                    String category = input.nextLine();

                    System.out.print("Quantity : ");
                    int quantity = input.nextInt();

                    System.out.print("Minimum Stock : ");
                    int minimum = input.nextInt();

                    inventory.addIngredient(
                            new Ingredient(id, name, category, quantity, minimum));

                    break;

                case 2:

                    inventory.viewIngredients();

                    break;

                case 3:

                    System.out.print("Enter Ingredient Name : ");
                    String search = input.nextLine();

                    Ingredient ingredient = inventory.searchIngredient(search);

                    if (ingredient != null) {

                        ingredient.display();

                    } else {

                        System.out.println("Ingredient Not Found.");

                    }

                    break;

                case 4:

                    System.out.print("Ingredient Name : ");
                    inventory.deleteIngredient(input.nextLine());

                    break;

                case 5:

                    System.out.print("Ingredient Name : ");
                    String stockInName = input.nextLine();

                    System.out.print("Quantity : ");
                    int stockInQty = input.nextInt();

                    inventory.stockIn(stockInName, stockInQty);

                    break;

                case 6:

                    System.out.print("Ingredient Name : ");
                    String stockOutName = input.nextLine();

                    System.out.print("Quantity : ");
                    int stockOutQty = input.nextInt();

                    inventory.stockOut(stockOutName, stockOutQty);

                    break;

                case 7:

                    System.out.print("Ingredient Request : ");
                    kitchenQueue.addRequest(input.nextLine());

                    break;

                case 8:

                    kitchenQueue.processRequest();

                    break;

                case 9:

                    kitchenQueue.viewRequests();

                    break;

                case 10:

                    inventory.undoDelete();

                    break;

                case 11:

                    inventory.lowStockReport();

                    break;

                case 12:

                    report.generateReport(inventory);

                    break;

                case 13:

                    System.out.println("\nThank You!");

                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        } while (choice != 13);

        input.close();

    }

}