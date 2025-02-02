import java.util.ArrayList;

public class HorseBarnRunner {
    public static void main(String[] args) {
        HorseBarn barn = new HorseBarn();
        ArrayList<Horse> barnSpaces = barn.getSpaces();

        // Calculate total weight
        double totalWeight = 0;
        for (Horse horse : barnSpaces) {
            totalWeight += horse.getWeight();
        }

        // Calculate average weight
        double averageWeight = totalWeight / barnSpaces.size();

        // List horses above average weight
        System.out.println("Horses above average weight:");
        for (Horse horse : barnSpaces) {
            if (horse.getWeight() > averageWeight) {
                System.out.println(horse.getName() + " - " + horse.getWeight());
            }
        }

        // Find the horse with the highest weight
        Horse highestWeightHorse = barnSpaces.get(0);
        for (Horse horse : barnSpaces) {
            if (horse.getWeight() > highestWeightHorse.getWeight()) {
                highestWeightHorse = horse;
            }
        }

        // Find the horse with the lowest weight
        Horse lowestWeightHorse = barnSpaces.get(0);
        for (Horse horse : barnSpaces) {
            if (horse.getWeight() < lowestWeightHorse.getWeight()) {
                lowestWeightHorse = horse;
            }
        }

        // Print highest and lowest weight horses
        System.out.println("Horse with the highest weight: " + highestWeightHorse.getName() + " - " + highestWeightHorse.getWeight());
        System.out.println("Horse with the lowest weight: " + lowestWeightHorse.getName() + " - " + lowestWeightHorse.getWeight());
    }
}
