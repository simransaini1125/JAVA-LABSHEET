
class WordCounter
{
    static String language = "English";

    void countWords(String str)
    {
        int count = 0;

        str = str.trim();

        if(str.length() > 0)
        {
            String words[] = str.split("\\s+");
            count = words.length;
        }

        System.out.println("Total Words: " + count);
    }

    public static void main(String args[])
    {
        WordCounter w = new WordCounter();

        System.out.println("Language: " + language);
        w.countWords("Java is an easy programming language");
    }
}
