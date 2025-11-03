package CarProject.dao;

import CarProject.dao.repository.list.LinkedList;
import CarProject.dao.repository.list.Listable;
import CarProject.model.Car;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CarDAOLinkedList implements CarDAO {

    private Listable<Car> cars = new LinkedList<>();

    // Operações básicas CRUD
    @Override
    public void addCar(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("Carro não pode ser null");
        }
        String place = car.getLicensePlate();
        if (place == null || place.isEmpty()) {
            throw new IllegalArgumentException("A placa não pode ser nula ou vazia");
        }

        int index = findIndexByPlace(place);
        if (index != -1) { // já existe
            throw new IllegalArgumentException("Já existe um carro com esta placa: " + place);
        }
        cars.append(car);

    }

    @Override
    public Car getCar(String plateLicense) {
        int index = findIndexByPlace(plateLicense);
        if (index == -1) {
            return null;
        }
        return cars.select(index);
    }

    @Override
    public Car[] getAllCars() {
        Car[] all = new Car[cars.size()];
        for (int i = 0; i < all.length; i++) {
            all[i] = cars.select(i);
        }
        return all;
    }

    @Override
    public void updateCar(Car newCar) {
        if (newCar == null) {
            throw new IllegalArgumentException("Carro não pode ser null");
        }
        int index = findIndexByPlace(newCar.getLicensePlate());
        if (index == -1) {
            throw new IllegalArgumentException("Nenhum carro encontrado com este placa: " + newCar.getLicensePlate());
        }
        cars.update(index, newCar);
    }

    @Override
    public Car deleteCar(String plateLicense) {
        int index = findIndexByPlace(plateLicense);
        Car remove = cars.select(index);
        cars.delete(index);
        return remove;
    }

    // Operações de consulta específicas para carros
    @Override
    public Car getCarByLicensePlate(String licensePlate) {
        return getCar(licensePlate);
    }

    @Override
    public Car[] getCarsByMark(String mark) {
        if (mark == null || mark.isEmpty()) {
            throw new IllegalArgumentException("Marca não pode ser nula ou  vazia");
        }
        List<Car> resultList = new ArrayList<>();

        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.select(i);
            if (car.getLicensePlate().equals(mark)) {
                resultList.add(car);
            }
        }
        return resultList.toArray(new Car[0]);
    }

    @Override
    public Car[] getCarsByModel(String model) {
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Modelo não pode ser nulo ou vazio");
        }
        List<Car> resultList = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.select(i);
            if (car.getModel().equals(model)) {
                resultList.add(car);
            }
        }
        return resultList.toArray(new Car[0]);
    }

    @Override
    public Car[] getCarsByColor(String color) {
        if (color == null || color.isEmpty()) {
            throw new IllegalArgumentException("Cor não pode ser nula ou vazio");
        }
        List<Car> resultList = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.select(i);
            if (car.getColor().equals(color)) {
                resultList.add(car);
            }
        }
        return resultList.toArray(new Car[0]);
    }

    @Override
    public Car[] getCarsByOwner(String owner) {
        if (owner == null || owner.isEmpty()) {
            throw new IllegalArgumentException("Proprietário não pode ser nulo ou vazio");
        }
        List<Car> resultList = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.select(i);
            if (car.getOwnerName().equals(owner)) {
                resultList.add(car);
            }
        }
        return resultList.toArray(new Car[0]);
    }

    @Override
    public Car[] getCarsByMomentArrival(LocalDateTime initialMoment, LocalDateTime finalMoment) {
        if (initialMoment == null || finalMoment == null) {
            throw new IllegalArgumentException("Os momentos inicial e final não podem ser nulos");
        }
        List<Car> resultList = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.select(i);
            if (car.getArrived() != null &&
                    (car.getArrived().isEqual(initialMoment) || car.getArrived().isAfter(initialMoment)) &&
                    (car.getArrived().isEqual(finalMoment) || car.getArrived().isBefore(finalMoment))
            ) {
                resultList.add(car);
            }
        }
        return resultList.toArray(new Car[0]);
    }

    @Override
    public Car getCarByNewestArrival() {
if(cars.size()==0 ) return null;
    Car newest=cars.select(0);
        for (int i = 0; i <cars.size() ; i++) {
            Car car = cars.select(i);
            if(car.getArrived()!=null && newest.getArrived() !=null && car.getArrived().isAfter(newest.getArrived())) {
                newest=car;
            }
        }
        return newest;
    }

    @Override
    public Car getCarByOldestArrival() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    // Operações de relatório e estatísticas
    @Override
    public String printCars() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public int getTotalCars() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public String getMostPopularMark() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public String getMostPopularModel() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public String getMostPopularColor() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    // Operações de gerenciamento
    @Override
    public boolean isCarInPlaced(String plateLicense) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public void clearAllCars() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public void removeCarsOlderThan(LocalDateTime date) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public Car[] getCarsByParkingDuration(long minHours, long maxHours) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public int getAvailableSpaces() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public boolean isParkingEmpty() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public int getMaxCapacity() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public int getOccupancyRate() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public boolean isParkingFull() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public long getParkingDuration(String plateLicense) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public void removeCarsByOwner(String owner) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public long getAverageArrivalTime() {
        if (cars.size() == 0) return 0;
        long totalMinutes = 0;
        int count = 0;
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.select(i);
            if (car.getArrived() != null) {
                totalMinutes += car.getArrived().getHour()*60 + car.getArrived().getMinute();
                count++;
            }
        }
        return count == 0?0 : totalMinutes/count;
    }

    @Override
    public Car[] getCarsWithLongParking(long thresholdHours) {
        List<Car> resultList = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now();
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.select(i);
            if (car.getArrived() != null) {
                long hours = java.time.Duration.between(now, car.getArrived()).toHours();
                if (hours > thresholdHours) {
                    resultList.add(car);
                }
            }
        }
        return resultList.toArray(new Car[0]);
    }

    private int findIndexByPlace(String plate) {
        for (int i = 0; i < cars.size(); i++) {
            Car current = cars.select(i);
            if (current.getLicensePlate().equalsIgnoreCase(plate)) {
                return i;
            }
        }
        return -1;
    }
}