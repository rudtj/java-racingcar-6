package racingcar.domain;

import java.util.List;

public class Race {

    private final int count;
    private final List<Car> cars;
    private int countNum = 0;

    public Race(List<Car> cars, int count) {
        this.cars = cars;
        this.count = count;
    }

    public void increaseCountNum() {
        this.countNum += 1;
    }

    public int getCount() {
        return count;
    }

    public List<Car> getCars() {
        return cars;
    }
}
