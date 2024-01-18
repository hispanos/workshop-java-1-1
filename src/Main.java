public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("CAR111", "FORD", "2011");
        Car car2 = new Car("CAR222", "SUZUKI", "2002");
        Car car3 = new Car("CAR333", "TOYOTA", "2007");
        Car car4 = new Car("CAR444", "TOYOTA", "2024");

        Parking parking = new Parking(2000);
        parking.parkingCar(car1, 1, 0);
        parking.parkingCar(car2, 0, 0);
        parking.parkingCar(car3, 0, 0);
        parking.parkingTime(car1, 4);
        parking.parkingTime(car2, 3);
        parking.showParkingStatus();
    }
}