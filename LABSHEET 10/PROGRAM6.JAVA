import java.io.*;
import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("notes.txt");
            fw.write("Java is easy. Java is interesting. I love Java.");
            fw.close();

            FileReader fr = new FileReader("notes.txt");
            BufferedReader br = new BufferedReader(fr);

            System.out.print("Enter word to search: ");
            String word = sc.nextLine();

            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String w : words) {
                    w = w.replaceAll("[^a-zA-Z0-9]", "");

                    if (w.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }

            br.close();

            if (count > 0) {
                System.out.println("Word found.");
                System.out.println("Occurrences: " + count);
            } else {
                System.out.println("Word not found.");
            }
        }
        catch (IOException e) {
            System.out.println("File error occurred.");
        }

        sc.close();
    }
}