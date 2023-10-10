
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Solution {
    public static void main(String[] args) {
        long ans = 1;

        try {
            FileReader fileReader = new FileReader("./input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String numString = bufferedReader.readLine();
                if (numString == null)
                    break;
                ans *= Long.parseLong(numString);

            }
            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
        try {
            FileWriter fileWriter = new FileWriter("./result.txt", false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(ans + "");
            bufferedWriter.close();
        } catch (Exception e) {
            
        }
    }
}
