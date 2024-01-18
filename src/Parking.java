public class Parking {
    private int rows = 2;
    private int columns = 2;
    private Car matrizCars[][] = new Car[rows][columns];
    private double tariffHour;

    public Parking(double tariffHour) {
        this.tariffHour = tariffHour;
    }

    public boolean parkingCar(Car car, int row, int column) {
        if (row <= rows && column <= columns) {
            if (matrizCars[row][column] == null) {
                matrizCars[row][column] = car;
                return true;
            }else {
                System.out.println("Este espacio está ocupado");
                return false;
            }
        }else {
            System.out.println("Este espacio no existe");
            return false;
        }
    }

    public double parkingTime(Car car, int hours) {
        System.out.println(tariffHour * hours);
        return tariffHour * hours;
    }

    public void showParkingStatus() {
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (matrizCars[row][column] == null) {
                    System.out.print("| |");
                }else {
                    System.out.print("|X|");
                }
            }
            System.out.println();
        }
    }
}
