import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Animals {
    // Define pet data (urls of images)
    private static final Map<String, String> petData = new HashMap<>();
    static {
        petData.put("cat", "https://via.placeholder.com/150?text=Cat");
        petData.put("dog", "https://via.placeholder.com/150?text=Dog");
        petData.put("rabbit", "https://via.placeholder.com/150?text=Rabbit");
        petData.put("hamster", "https://via.placeholder.com/150?text=Hamster");
        petData.put("parrot", "https://via.placeholder.com/150?text=Parrot");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedPet = null;

        System.out.println("Select a Pet:");
        // Display radio buttons for each pet type
        for (String pet : petData.keySet()) {
            System.out.println(pet);
        }

        // Loop until a valid pet type is selected
        while (selectedPet == null) {
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine().toLowerCase();
            if (petData.containsKey(choice)) {
                selectedPet = choice;
            } else {
                System.out.println("Invalid choice. Please select a valid pet.");
            }
        }

        // Display selected pet image
        System.out.println("You selected: " + selectedPet);
        System.out.println("Image URL: " + petData.get(selectedPet));
    }
}
