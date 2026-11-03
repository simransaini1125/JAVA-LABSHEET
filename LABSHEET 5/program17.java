interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class MultiFunctionMachine implements Printer, Scanner {
    private String machineName;
    private int machineId;

    void setData(String name, int id) {
        machineName = name;
        machineId = id;
    }

    String getName() {
        return machineName;
    }

    int getId() {
        return machineId;
    }

    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }

    public static void main(String[] args) {
        MultiFunctionMachine m = new MultiFunctionMachine();

        m.setData("HP Printer", 101);

        System.out.println("Machine Name: " + m.getName());
        System.out.println("Machine ID: " + m.getId());

        m.print();
        m.scan();
    }
}