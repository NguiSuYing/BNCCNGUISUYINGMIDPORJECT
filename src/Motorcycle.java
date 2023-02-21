// Deklarasi kelas Motorcycle yang merupakan turunan dari kelas Vehicle
public class Motorcycle extends Vehicle {

    // Deklarasi variabel bertipe String bernama motorcycleType dengan modifier private
    private String motorcycleType;
    // Deklarasi variabel bertipe int bernama helmet dengan modifier private
    private int helmet;
    // Deklarasi variabel bertipe int bernama helmet_price dengan modifier private
    private int helmet_price;

    // Deklarasi konstruktor dengan parameter
    public Motorcycle(String type, String brand, String name, String license, int topSpeed, int gasCap, int wheel, String motorcycleType, int helmet) {
        // Memanggil konstruktor dari kelas induk (Vehicle) dengan keyword super
        super(type, brand, name, license, topSpeed, gasCap, wheel);
        // Set variabel motorcycleType dengan nilai parameter motorcycleType
        this.motorcycleType = motorcycleType;
        // Set variabel helmet dengan nilai parameter helmet
        this.helmet = helmet;
    }

    // Deklarasi method bernama getMotorcycleType() yang mengembalikan nilai String
    public String getMotorcycleType() {
        // Mengembalikan nilai dari variabel motorcycleType
        return motorcycleType;
    }

    // Deklarasi method bernama setMotorcycleType() yang tidak mengembalikan nilai dan memiliki parameter motorcycleType bertipe String
    public void setMotorcycleType(String motorcycleType) {
        // Set variabel motorcycleType dengan nilai parameter motorcycleType
        this.motorcycleType = motorcycleType;
    }

    // Deklarasi method bernama getHelmet() yang mengembalikan nilai int
    public int getHelmet() {
        // Mengembalikan nilai dari variabel helmet
        return helmet;
    }

    // Deklarasi method bernama setHelmet() yang tidak mengembalikan nilai dan memiliki parameter helmet bertipe int
    public void setHelmet(int helmet) {
        // Set variabel helmet dengan nilai parameter helmet
        this.helmet = helmet;
    }

    // Deklarasi method bernama stand() yang tidak mengembalikan nilai
    public void stand() {
        // Menampilkan pesan "Nama kendaraan (getName()) is standing!" di konsol
        System.out.println(getName() + " is standing!");
    }

    // Deklarasi method bernama getHelmetPrice() yang mengembalikan nilai int
    public int getHelmetPrice() {
        // Mengembalikan nilai dari variabel helmet_price
        return helmet_price;
    }

    // Deklarasi method bernama setHelmetPrice() yang tidak mengembalikan nilai dan memiliki parameter price bertipe int
    public void setHelmetPrice(int price) {
        // Set variabel helmet_price dengan nilai parameter price
        this.helmet_price = price;
    }

    // Implementasi method abstract showSpecialFeatures() dari kelas Vehicle
    @Override
    public void showSpecialFeatures() {
        // Melempar exception UnsupportedOperationExcetion dengan pesan "Not supported yet."
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
