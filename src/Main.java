
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // membuat objek scanner untuk membaca input dari user
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(); // membuat arraylist untuk menyimpan objek Vehicle

        boolean run = true; // variabel boolean untuk mengontrol apakah program masih berjalan atau sudah selesai
        while (run) { // loop selama run = true
            System.out.println("Menu:"); // menampilkan menu
            System.out.println("1. Input vehicle");
            System.out.println("2. View vehicles");
            System.out.println("3. Exit");
            System.out.print("Your Choice: "); // menampilkan pesan untuk meminta input dari user
            int choice = scanner.nextInt(); // membaca input dari user
            scanner.nextLine(); // membaca karakter newline yang tidak terbaca oleh nextInt()

            if (choice == 1) { // jika user memilih input vehicle
                System.out.print("Input type [Car | Motorcycle]:"); // menampilkan pesan untuk meminta input dari user
                String type = scanner.nextLine(); // membaca input dari user

                System.out.print("Input brand [>=5]:"); // menampilkan pesan untuk meminta input dari user
                String brand = scanner.nextLine(); // membaca input dari user
                while (brand.length() < 5) { // loop selama brand < 5 karakter
                    System.out.print("Brand should be at least 5 characters long. Please input again:"); // menampilkan pesan kesalahan
                    brand = scanner.nextLine(); // membaca input dari user
                }

                System.out.print("Input name [>=5]:"); // menampilkan pesan untuk meminta input dari user
                String name = scanner.nextLine(); // membaca input dari user
                while (name.length() < 5) { // loop selama name < 5 karakter
                    System.out.print("Name should be at least 5 characters long. Please input again:"); // menampilkan pesan kesalahan
                    name = scanner.nextLine(); // membaca input dari user
                }

                System.out.print("Input license :"); // menampilkan pesan untuk meminta input dari user
                String licenseNumber = scanner.nextLine(); // membaca input dari user

                System.out.print("Input top speed [100 <= topSpeed <= 250]:"); // menampilkan pesan untuk meminta input dari user
                int topSpeed = scanner.nextInt(); // membaca input dari user
                while (topSpeed < 100 || topSpeed > 250) { // loop selama topSpeed tidak sesuai range
                    System.out.print("Top speed should be between 100 and 250. Please input again:"); // menampilkan pesan kesalahan
                    topSpeed = scanner.nextInt(); // membaca input dari user
                }

                System.out.print("Input gas capacity [30<= gasCap <= 60]:"); // menampilkan pesan untuk meminta input dari user
                int gasCap = scanner.nextInt(); // membaca input dari user
                while (gasCap < 30 || gasCap > 60) { // loop selama GasCapacitu tidak sesaui range
                    System.out.print("Gas capacity should be between 30 and 60. Please input again:");
                    gasCap = scanner.nextInt();
                }

                // Memeriksa apakah tipe kendaraan yang diinputkan adalah Car
                if (type.equals("Car") || type.equals("car")) {

                    // Meminta inputan jumlah roda kendaraan
                    System.out.print("Input wheel [4 <= wheel <= 6]:");
                    int wheel = scanner.nextInt();
                    while (wheel < 4 || wheel > 6) {
                        System.out.print("Car wheel should be between 4 and 6. Please input again:");
                        wheel = scanner.nextInt();
                    }

                    // Meminta inputan tipe mobil
                    System.out.print("Input type [SUV | Supercar | Minivan]:");
                    String carType = scanner.next();

                    // Meminta inputan jumlah sistem hiburan kendaraan
                    System.out.print("Input entertainment system amount [>=1]:");
                    int entertainmentSystemAmount = scanner.nextInt();
                    while (entertainmentSystemAmount < 1) {
                        System.out.print("Entertainment system amount should be at least 1. Please input again:");
                        entertainmentSystemAmount = scanner.nextInt();
                    }

                    // Membuat objek Car baru berdasarkan inputan pengguna dan menambahkan ke ArrayList vehicles
                    Car car = new Car(type, brand, name, licenseNumber, topSpeed, gasCap, wheel, carType, entertainmentSystemAmount);
                    vehicles.add(car);

                } else if (type.equals("Motorcycle") || type.equals("motorcycle")) {

                    // Meminta inputan jumlah roda kendaraan
                    System.out.print("Input wheel [2 <= wheel <= 3]:");
                    int wheel = scanner.nextInt();
                    while (wheel < 2 || wheel > 3) {
                        System.out.print("Motorcycle wheel should be between 2 and 3. Please input again:");
                        wheel = scanner.nextInt();
                    }

                    // Meminta inputan tipe motor
                    System.out.print("Input type [Automatic | Manual]:");
                    String motorcycleType = scanner.next();

                    // Meminta inputan jumlah helm yang dimiliki pengguna
                    System.out.print("Input helmet amount [>=1]:");
                    int helmetAmount = scanner.nextInt();
                    while (helmetAmount < 1) {
                        System.out.print("Helmet amount should be at least 1. Please input again:");
                        helmetAmount = scanner.nextInt();
                    }

                    // Membuat objek Motorcycle baru berdasarkan inputan pengguna dan menambahkan ke ArrayList vehicles
                    Motorcycle motorcycle = new Motorcycle(type, brand, name, licenseNumber, topSpeed, gasCap, wheel, motorcycleType, helmetAmount);
                    vehicles.add(motorcycle);

                }

                // Menampilkan pesan untuk kembali ke menu
                System.out.println("Enter to return");

                // Membersihkan scanner dengan membaca inputan newline
                scanner.nextLine();
            } else if (choice == 2) {
                System.out.println("--------------------------");
                System.out.println("No | Type       | Name"); // menampilkan header tabel
                System.out.println("--------------------------");

                int i = 1;
                for (Vehicle vehicle : vehicles) { // loop melalui list kendaraan dan menampilkan informasi kendaraan
                    String type = vehicle instanceof Car ? "Car" : "Motorcycle";
                    String name = vehicle.getName();

                    System.out.printf("%-2d | %-10s | %-10s\n", i, type, name); // menampilkan nomor kendaraan, tipe, dan nama
                    i++;
                }
                System.out.println("--------------------------");
                System.out.print("Pick a vehicle number to test drive [Enter '0' to exit]:"); // meminta input nomor kendaraan untuk di-test drive
                int chosenVehicleIndex = scanner.nextInt();
                if (chosenVehicleIndex == 0) { // jika user memilih untuk keluar, kembali ke menu utama
                    continue;
                }

                Vehicle chosenVehicle = vehicles.get(chosenVehicleIndex - 1); // dapatkan kendaraan yang dipilih dari list kendaraan
                if (chosenVehicle instanceof Car) { // jika kendaraan yang dipilih adalah mobil
                    Car car = (Car) chosenVehicle; // ubah kendaraan menjadi objek Car
                    System.out.println("--------------------------------");
                    System.out.println("Brand         : " + car.getBrand()); // tampilkan informasi mobil yang dipilih
                    System.out.println("Name          : " + car.getName());
                    System.out.println("License Plate : " + car.getLicensePlate());
                    System.out.println("Type          : " + car.getCarType());
                    System.out.println("Gas Capacity  : " + car.getGasCap());
                    System.out.println("Top Speed     : " + car.getTopSpeed());
                    System.out.println("Wheel(s)      : " + car.getWheel());
                    System.out.println("Entertainment System : " + car.getEntertainmentSystem());
                    car.turnOnEntertainmentSystem(); // nyalakan sistem hiburan
                    if (car.getCarType().equals("Supercar")) { // jika mobil adalah supercar, berikan boost
                        car.boost();
                    }
                    System.out.println("--------------------------------");
                } else if (chosenVehicle instanceof Motorcycle) { // jika kendaraan yang dipilih adalah motor
                    Motorcycle motorcycle = (Motorcycle) chosenVehicle; // ubah kendaraan menjadi objek Motorcycle
                    System.out.println("--------------------------------");
                    System.out.println("Brand         : " + motorcycle.getBrand()); // tampilkan informasi motor yang dipilih
                    System.out.println("Name          : " + motorcycle.getName());
                    System.out.println("License Plate : " + motorcycle.getLicensePlate());
                    System.out.println("Type          : " + motorcycle.getMotorcycleType());
                    System.out.println("Gas Capacity  : " + motorcycle.getGasCap());
                    System.out.println("Top Speed     : " + motorcycle.getTopSpeed());
                    System.out.println("Wheel(s)      : " + motorcycle.getWheel());
                    System.out.println("Helmet(s)     : " + motorcycle.getHelmet());
                    motorcycle.stand(); // posisikan motor dalam kondisi berdiri
                    System.out.print("Enter the price of the helmet : "); // minta input harga helm
                    int helmet_price = scanner.nextInt();
                    motorcycle.setHelmetPrice(helmet_price); // set harga helm
                    System.out.println("Price : " + motorcycle.getHelmetPrice());
                    System.out.println("--------------------------------");
                }
            } else {
                run = false;
            }
        }
    }
}
