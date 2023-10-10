
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter fileWriter = new FileWriter("./result.txt", false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            System.out.println("University name?");
            bufferedWriter.write("University name= " + scanner.nextLine() + "\n");

            System.out.println("Founded on?");
            bufferedWriter.write("Founded on= " + scanner.nextLine() + "\n");

            System.out.println("Area in acres?");
            bufferedWriter.write("Area= " + scanner.nextLine() + " (acres)\n");

            System.out.println("Number of facculties?");
            bufferedWriter.write(scanner.nextLine() + " Facculties\n");

            System.out.println("Number of Departments?");
            bufferedWriter.write(scanner.nextLine() + " Departments\n");

            System.out.println("Number of Students?");
            bufferedWriter.write(scanner.nextLine() + " Students\n");

            System.out.println("Current VC?");
            bufferedWriter.write("Current VC= " + scanner.nextLine() + " \n");

            System.out.println("Number of active teachers?");
            bufferedWriter.write(scanner.nextLine() + " active teachers\n");

            System.out.println("Number of academic buildings?");
            bufferedWriter.write(scanner.nextLine() + " academic buildings\n");
            System.out.println("Number of libraries?");
            bufferedWriter.write(scanner.nextLine() + " libraries\n");
            System.out.println("Done!");

            bufferedWriter.close();
        } catch (Exception e) {
        }
        scanner.close();
    }
}