//deklarasi kelas Car yang merupakan turunan dari kelas Vehicle

public class Car extends Vehicle {

    //deklarasi variabel bertipe String bernama carType dengan modifier private
    private String carType;
    //deklarasi variabel bertipe int bernama entertainmentSystem dengan modifier private
    private int entertainmentSystem; 
    
    //memanggil konstruktor dari kelas induk (Vehicle) dengan keyword super
    public Car(String type, String brand, String name, String license, int topSpeed, int gasCap, int wheel, String carType, int entertainmentSystem) { //deklarasi konstruktor dengan parameter
        super(type, brand, name, license, topSpeed, gasCap, wheel); 
        //set variabel carType dengan nilai parameter carType
        this.carType = carType; 
        //set variabel entertainmentSystem dengan nilai parameter entertainmentSystem
        this.entertainmentSystem = entertainmentSystem; 
    }
    
    //deklarasi method bernama getCarType() yang mengembalikan nilai String
    public String getCarType() { 
        //mengembalikan nilai dari variabel carType
        return carType; 
    }
    
    //deklarasi method bernama setCarType() yang tidak mengembalikan nilai dan memiliki parameter carType bertipe String
    public void setCarType(String carType) { 
        //set variabel carType dengan nilai parameter carType
        this.carType = carType; 
    }

    //deklarasi method bernama getEntertainmentSystem() yang mengembalikan nilai int
    public int getEntertainmentSystem() { 
        //mengembalikan nilai dari variabel entertainmentSystem
        return entertainmentSystem; 
    }

    //deklarasi method bernama setEntertainmentSystem() yang tidak mengembalikan nilai dan memiliki parameter entertainmentSystem bertipe int
    public void setEntertainmentSystem(int entertainmentSystem) { 
        //set variabel entertainmentSystem dengan nilai parameter entertainmentSystem
        this.entertainmentSystem = entertainmentSystem; 
    }

    //deklarasi method bernama turnOnEntertainmentSystem() yang tidak mengembalikan nilai
    public void turnOnEntertainmentSystem() { 
        //menampilkan pesan "Turning on entertainment system..." di konsol
        System.out.println("Turning on entertainment system..."); 
    }

    //deklarasi method bernama boost() yang tidak mengembalikan nilai
    public void boost() { 
        //menampilkan pesan "Boosting!" di konsol
        System.out.println("Boosting!"); 
    }

    //implementasi method abstract showSpecialFeatures() dari kelas Vehicle
    @Override
    public void showSpecialFeatures() { 
        //melempar exception UnsupportedOperationExcetion dengan pesan "Not supported yet."
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
