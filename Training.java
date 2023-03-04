// class Box {
//     int width; // 상자의 가로
//     int length; // 상자의 세로
//     int height; // 상자의 높이
// }

// public class Training {
//     public static void main(String[] args) {
//         Box box = new Box();

//         box.width = 20;
//         box.length = 20;
//         box.height = 30;

//         System.out.println("상자의 가로, 세로, 높이는 " + box.width + ", "
//         + box.length + ", " + box.height + "입니다.");
//     }
// }

// -------------------------------------------------------------------------

class Car {
    String color;
    int gear;
    int speed;

    @Override
    public String toString() {
        return "Car [color = " + color + ", speed = " + speed + ", gear = " + gear + "]";
    }

    void changeGear(int gear) {
        this.gear = gear;
    }

    void speedUp() {
        this.speed += 10;
    }

    void speedDown() {
        this.speed -= 10;
    }
}

public class Training {
    public static void main(String[] args) {
        Car car = new Car();
        car.changeGear(1);
        car.speedUp();
        System.out.println(car);
    }
}