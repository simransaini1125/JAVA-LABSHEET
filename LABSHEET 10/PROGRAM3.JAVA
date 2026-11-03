import java.io.*;

class Q3 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");

            fw.write("Java is easy\n");
            fw.write("Java is powerful\n");
            fw.close();

            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            int lines = 0;
            int words = 0;
            int characters = 0;

            while ((line = br.readLine()) != null) {
                lines++;
                characters += line.length();

                String[] w = line.trim().split("\\s+");

                if (!line.trim().isEmpty()) {
                    words += w.length;
                }
            }

            br.close();

            System.out.println("Total Lines: " + lines);
            System.out.println("Total Words: " + words);
            System.out.println("Total Characters: " + characters);
        }
        catch (IOException e) {
            System.out.println("File error occurred.");
        }
    }
}