
class Library
{
    int booksAvailable;

    static String libraryName = "City Library";

    Library(int b)
    {
        booksAvailable = b;
    }

    void issueBook()
    {
        int issue = 1;

        if(booksAvailable >= issue)
        {
            booksAvailable = booksAvailable - issue;
            System.out.println("Book Issued Successfully");
        }
        else
        {
            System.out.println("Books Not Available");
        }
    }

    void returnBook()
    {
        int returned = 1;

        booksAvailable = booksAvailable + returned;

        System.out.println("Book Returned Successfully");
    }

    public static void main(String args[])
    {
        Library l = new Library(10);

        System.out.println("Library Name: " + libraryName);
        System.out.println("Available Books: " + l.booksAvailable);

        l.issueBook();
        System.out.println("Books Left: " + l.booksAvailable);

        l.returnBook();
        System.out.println("Books Available: " + l.booksAvailable);
    }
}
