import java.util.LinkedList;
import java.util.Queue;

public class KitchenQueue {

    private Queue<String> requests;

    // Constructor
    public KitchenQueue() {

        requests = new LinkedList<>();

    }

    // Add Request
    public void addRequest(String ingredient) {

        requests.offer(ingredient);

        System.out.println("Kitchen Request Added.");

    }

    // Process Request
    public void processRequest() {

        if (requests.isEmpty()) {

            System.out.println("No Pending Requests.");
            return;

        }

        String item = requests.poll();

        System.out.println(item + " Request Completed.");

    }

    // View Queue
    public void viewRequests() {

        if (requests.isEmpty()) {

            System.out.println("No Kitchen Requests.");
            return;

        }

        System.out.println("\n===== Kitchen Requests =====");

        for (String item : requests) {

            System.out.println("- " + item);

        }

    }

}