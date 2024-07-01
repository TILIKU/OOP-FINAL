package finalexam.task1;

public class Computer {

    private String brand;
    private int memory; // in GB
    private int ssd;    // in GB
    private int hdd;    // in GB

    // Constructor to initialize all fields
    public Computer(String brand, int memory, int ssd, int hdd) {
        this.brand = brand;
        this.memory = memory;
        this.ssd = ssd;
        this.hdd = hdd;
    }

    // Getter and Setter for brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter and Setter for memory
    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    // Getter and Setter for ssd
    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    // Getter and Setter for hdd
    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    // Overriding the toString() method to provide a string representation of the Computer object
    @Override
    public String toString() {
        return "Computer [Brand=" + brand + ", Memory=" + memory + "GB, SSD=" + ssd + "GB, HDD=" + hdd + "GB]";
    }
}