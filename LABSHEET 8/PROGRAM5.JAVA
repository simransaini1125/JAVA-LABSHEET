
class Product<T, U>
{
    T id;
    U price;

    Product(T i, U p)
    {
        id = i;
        price = p;
    }

    void display()
    {
        System.out.println("Product ID: " + id + " Price: " + price);
    }

    public static void main(String args[])
    {
        Product<Integer, Double> p1 = new Product<Integer, Double>(101, 250.50);
        Product<Integer, Double> p2 = new Product<Integer, Double>(102, 500.75);
        Product<Integer, Double> p3 = new Product<Integer, Double>(103, 750.00);

        p1.display();
        p2.display();
        p3.display();
    }
}
