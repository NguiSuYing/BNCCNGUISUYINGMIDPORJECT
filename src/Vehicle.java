public abstract class Vehicle { //deklarasi kelas abstract bernama Vehicle
    private String type; //deklarasi variabel bertipe String bernama type dengan modifier private
    private String brand; //deklarasi variabel bertipe String bernama brand dengan modifier private
    private String name; //deklarasi variabel bertipe String bernama name dengan modifier private
    private String licensePlate; //deklarasi variabel bertipe String bernama licensePlate dengan modifier private
    private int topSpeed; //deklarasi variabel bertipe int bernama topSpeed dengan modifier private
    private int gasCap; //deklarasi variabel bertipe int bernama gasCap dengan modifier private
    private int wheel; //deklarasi variabel bertipe int bernama wheel dengan modifier private

    public Vehicle(String type, String brand, String name, String licensePlate, int topSpeed, int gasCap, int wheel) { //deklarasi konstruktor dengan parameter
        this.type = type; //set variabel type dengan nilai parameter type
        this.brand = brand; //set variabel brand dengan nilai parameter brand
        this.name = name; //set variabel name dengan nilai parameter name
        this.licensePlate = licensePlate; //set variabel licensePlate dengan nilai parameter licensePlate
        this.topSpeed = topSpeed; //set variabel topSpeed dengan nilai parameter topSpeed
        this.gasCap = gasCap; //set variabel gasCap dengan nilai parameter gasCap
        this.wheel = wheel; //set variabel wheel dengan nilai parameter wheel
    }

    public String getType() { //deklarasi method bernama getType() yang mengembalikan nilai String
        return type; //mengembalikan nilai dari variabel type
    }

    public String getBrand() { //deklarasi method bernama getBrand() yang mengembalikan nilai String
        return brand; //mengembalikan nilai dari variabel brand
    }

    public String getName() { //deklarasi method bernama getName() yang mengembalikan nilai String
        return name; //mengembalikan nilai dari variabel name
    }

    public String getLicensePlate() { //deklarasi method bernama getLicensePlate() yang mengembalikan nilai String
        return licensePlate; //mengembalikan nilai dari variabel licensePlate
    }

    public int getTopSpeed() { //deklarasi method bernama getTopSpeed() yang mengembalikan nilai int
        return topSpeed; //mengembalikan nilai dari variabel topSpeed
    }

    public int getGasCap() { //deklarasi method bernama getGasCap() yang mengembalikan nilai int
        return gasCap; //mengembalikan nilai dari variabel gasCap
    }

    public int getWheel() { //deklarasi method bernama getWheel() yang mengembalikan nilai int
        return wheel; //mengembalikan nilai dari variabel wheel
    }

    public abstract void showSpecialFeatures(); //deklarasi method abstract bernama showSpecialFeatures()

    public void startEntertainmentSystem() { //deklarasi method bernama startEntertainmentSystem() yang tidak mengembalikan nilai
        System.out.println("Turning on entertainment system..."); //menampilkan pesan "Turning on entertainment system..." di konsol
    }
}
