package racingcar.domain;

public class Car {

    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public static Car create(final String name) {
        return new Car(name);
    }

    public void move(final int distance) {
        if (distance >= 4) {
            position += 1;
        }
    }

    public boolean isSamePosition(final Car differentCar) {
        return this.position == differentCar.position;
    }

    public int comparePosition(Car differentCar) {
        return Integer.compare(this.position, differentCar.position);
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
