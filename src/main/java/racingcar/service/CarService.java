package racingcar.service;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars;

    public void createCar(final List<String> carName) {
        cars = new ArrayList<>();
        for (String name : carName) {
            cars.add(Car.create(name));
        }
    }

    private int getMaxPosition() {
        int max = -1;
        for (Car car : cars) {
            if (max< car.getPosition()) {
                max = car.getPosition();
            }
        }
        return max;
    }

    public List<String> getMaxCarName() {
        int maxPosition = getMaxPosition();
        List<String> carName = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                carName.add(car.getName());
            }
        }
        return carName;
    }
}
