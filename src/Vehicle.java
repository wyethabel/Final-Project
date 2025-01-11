import java.io.FileWriter;

public class Vehicle {
    private String vin;
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;
    // Included vin for itemization regardless of requirements

    // Default Constructor
    public Vehicle() {
        this.vin = "Not Provided";
        this.make = "Not Provided";
        this.model = "Not Provided";
        this.color = "Not Provided";
        this.year = 0;
        this.mileage = 0;
    }

    // Parameterized Constructor
    public Vehicle(String vin, String make, String model, String color,
                   int year, int mileage) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    public String addVehicle(String vin, String make, String model,
                             String color, int year, int mileage) {
        try {
            this.vin = vin;
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "This vehicle has been added.";
        } catch (Exception i) {
            return "This vehicle has not been added due to: " + i.getMessage();
        }
    }

    public String removeVehicle() {
        try {
            this.vin = "Not Provided";
            this.make = "Not Provided";
            this.model = "Not Provided";
            this.color = "Not Provided";
            this.year = 0;
            this.mileage = 0;
            return "This vehicle has been removed.";
        } catch (Exception i) {
            return "This vehicle has not been removed due to: " + i.getMessage();
        }
    }

    public String updateVehicle(String vin, String make, String model,
                                String color, int year, int mileage) {
        try {
            this.vin = vin;
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "This vehicle has been updated.";
        } catch (Exception i) {
            return "This vehicle has not been updated due to: " + i.getMessage();
        }
    }

    public String[] vehicleInfo() {
        return new String[]{
                "vin: " + this.vin,
                "make: " + this.make,
                "model: " + this.model,
                "color: " + this.color,
                "year: " + this.year,
                "mileage: " + this.mileage
        };
    }

    public String saveInfo(String path) {
        try (FileWriter writer = new FileWriter(path)) {
            for (String info : this.vehicleInfo()) {
                writer.write(info + "\n");
            }
            return "Info has been saved to file: " + path;
        } catch (Exception i) {
            return "Vehicle info was unable to be saved due to: " + i.getMessage();
        }
    }
}
