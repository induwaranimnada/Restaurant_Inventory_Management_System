public class Ingredient {

    private int id;
    private String name;
    private String category;
    private int quantity;
    private int minimumStock;

    // Constructor
    public Ingredient(int id, String name, String category, int quantity, int minimumStock) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.minimumStock = minimumStock;
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getMinimumStock() {
        return minimumStock;
    }

    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Display Ingredient Details
    public void display() {

        System.out.println("----------------------------------------");
        System.out.println("Ingredient ID : " + id);
        System.out.println("Name          : " + name);
        System.out.println("Category      : " + category);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Minimum Stock : " + minimumStock);
        System.out.println("----------------------------------------");
    }
}