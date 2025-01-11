import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Vehicle vehicle1 = new Vehicle("00000000000000001", "Toyota",
                    "Camry", "White", 2003, 97000);

            System.out.println("--------------------------");
            System.out.println("First vehicle info: ");
            for (String info : vehicle1.vehicleInfo()) {
                System.out.println(info);
            }

            System.out.println("--------------------------");
            System.out.println(vehicle1.removeVehicle());

            System.out.println("--------------------------");
            System.out.println(vehicle1.addVehicle("00000000000000002", "Ford",
                    "Bronco", "Brown", 2021, 23000));

            System.out.println("--------------------------");
            System.out.println("Added vehicle info from vehicleInfo method: ");
            for (String info : vehicle1.vehicleInfo()) {
                System.out.println(info);
            }

            System.out.println("--------------------------");
            System.out.println(vehicle1.updateVehicle("00000000000000002", "Ford",
                    "Bronco", "Green", 2021, 25000));

            System.out.println("--------------------------");
            System.out.println("Updated vehicle info from the vehicleInfo method: ");
            for (String info : vehicle1.vehicleInfo()) {
                System.out.println(info);
            }

            System.out.println("--------------------------");
            System.out.print("Do you want to save this info? (Y/N): ");
            String userInput = input.nextLine();
            if (userInput.equals("Y")) {
                String path = "Vehicles.txt";
                String attempt = vehicle1.saveInfo(path);
                System.out.println(attempt);
            } else {
                System.out.println("Unable to save");
            }
        } catch (Exception i) {
            System.out.println("Unable to process method tests due to: " + i.getMessage());
        } finally {
            System.out.println("--------------------------");
            System.out.println("Method Tests Complete");
        }
    }
}
