import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Lab7 {

    public static void main(String[] args) throws FileNotFoundException {
        // Load dataset from CSV file
        double[][] dataset = loadDataset("iris.csv");
        
              // Calculate summary statistics for each attribute
        double[] sepalLengths = getAttribute(dataset, 0);
        double[] sepalWidths = getAttribute(dataset, 1);
        double[] petalLengths = getAttribute(dataset, 2);
        double[] petalWidths = getAttribute(dataset, 3);

        // Calculate summary statistics for overall dataset
        System.out.println("Overall Summary Statistics:");
        printSummaryStats(sepalLengths, "SepalLengthCm");
        printSummaryStats(sepalWidths, "SepalWidthCm");
        printSummaryStats(petalLengths, "PetalLengthCm");
        printSummaryStats(petalWidths, "PetalWidthCm");

        // Calculate summary statistics for each species
        double[][] setosaData = filterBySpecies(dataset, "Iris-setosa");
        double[][] versicolorData = filterBySpecies(dataset, "Iris-versicolor");
        double[][] virginicaData = filterBySpecies(dataset, "Iris-virginica");

        System.out.println("Summary Statistics for Iris-setosa:");
        printSummaryStats(getAttribute(setosaData, 0), "SepalLengthCm");
        printSummaryStats(getAttribute(setosaData, 1), "SepalWidthCm");
        printSummaryStats(getAttribute(setosaData, 2), "PetalLengthCm");
        printSummaryStats(getAttribute(setosaData, 3), "PetalWidthCm");

        System.out.println("Summary Statistics for Iris-versicolor:");
        printSummaryStats(getAttribute(versicolorData, 0), "SepalLengthCm");
        printSummaryStats(getAttribute(versicolorData, 1), "SepalWidthCm");
        printSummaryStats(getAttribute(versicolorData, 2), "PetalLengthCm");
        printSummaryStats(getAttribute(versicolorData, 3), "PetalWidthCm");

        System.out.println("Summary Statistics for Iris-virginica:");
        printSummaryStats(getAttribute(virginicaData, 0), "SepalLengthCm");
        printSummaryStats(getAttribute(virginicaData, 1), "SepalWidthCm");
        printSummaryStats(getAttribute(virginicaData, 2), "PetalLengthCm");
        printSummaryStats(getAttribute(virginicaData, 3), "PetalWidthCm");
    }

    private static double[][] loadDataset(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        double[][] dataset = new double[150][4];
        int i = 0;
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split(",");
            for (int j = 0; j < 4; j++) {
                dataset[i][j] = Double.parseDouble(line[j]);
            }
            i++;
        }
        scanner.close();
        return dataset;
    }

    private static double[] getAttribute(double[][] dataset, int attributeIndex) {
        double[] attribute = new double[dataset.length];
         for (int i = 0; i < dataset.length; i++) {
            attribute[i] = dataset[i][attributeIndex];
        }
        return attribute;
    }

    private static double[][] filterBySpecies(double[][] dataset, String string) {
        double[][] filteredData = new double[50][4];
        int count = 0;
        for (int i = 0; i < dataset.length; i++) {
            if (dataset[i][4] == string) {
                filteredData[count] = Arrays.copyOf(dataset[i], 4);
                count++;
            }
        }
        return Arrays.copyOf(filteredData, count);
    }
    
    private static void printSummaryStats(double[] attribute, String attributeName) {
        double mean = calculateMean(attribute);
        double median = calculateMedian(attribute);
        double mode = calculateMode(attribute);
        double min = calculateMin(attribute);
        double max = calculateMax(attribute);
        System.out.printf("%s: Mean=%.2f, Median=%.2f, Mode=%.2f, Min=%.2f, Max=%.2f%n", 
            attributeName, mean, median, mode, min, max);
    }
    
    private static double calculateMean(double[] attribute) {
        double sum = 0;
        for (double value : attribute) {
            sum += value;
        }
        return sum / attribute.length;
    }
    
    private static double calculateMedian(double[] attribute) {
        Arrays.sort(attribute);
        int middle = attribute.length / 2;
        if (attribute.length % 2 == 0) {
            return (attribute[middle - 1] + attribute[middle]) / 2.0;
        } else {
            return attribute[middle];
        }
    }
    
    private static double calculateMode(double[] attribute) {
        int modeCount = 0;
        double mode = 0;
        for (int i = 0; i < attribute.length; i++) {
            int count = 0;
            for (int j = 0; j < attribute.length; j++) {
                if (attribute[j] == attribute[i]) {
                    count++;
                }
            }
            if (count > modeCount) {
                modeCount = count;
                mode = attribute[i];
            }
        }
        return mode;
    }
    
    private static double calculateMin(double[] attribute) {
        double min = Double.MAX_VALUE;
        for (double value : attribute) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
    
    private static double calculateMax(double[] attribute) {
        double max = Double.MIN_VALUE;
        for (double value : attribute) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}    