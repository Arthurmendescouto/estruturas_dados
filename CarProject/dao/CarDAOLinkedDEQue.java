package CarProject.dao;

import CarProject.dao.repository.list.DEQueable;
import CarProject.model.Car;
import LinkedDEQue.src.main.java.org.example.LinkedDEQue;

import java.time.LocalDateTime;

public class CarDAOLinkedDEQue implements CarDAO {

    private DEQueable<Car> cars = new LinkedDEQue<>(20);

    // Operações básicas CRUD
    @Override
    public void addCar(Car car) {
        cars.endEnqueue(car);
    }

    @Override
    public Car getCar(String plateLicense) {
        if (cars.isEmpty()) return null;
        Car[] all = getAllCars();
        for (Car c : all) {
            if (c.getLicensePlate().equalsIgnoreCase(plateLicense)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public Car[] getAllCars() {
        if (cars.isEmpty()) return new Car[0];

        Car[] arr = new Car[cars.size()];
        for (int i = 0; i < arr.length; i++) {
            Car removed = cars.dequeue();
            arr[i] = removed;
            cars.endEnqueue(removed);
        }
        return arr;
    }

    @Override
    public void updateCar(Car newCar) {
Car[] all=getAllCars();
    clearAllCars();

        for (Car c :all ) {
if(c.getLicensePlate().equalsIgnoreCase(newCar.getLicensePlate())){
    cars.endEnqueue(newCar);
}else{
    cars.endEnqueue(c);
}
        }
    }

    @Override
    public Car deleteCar(String plateLicense) {
if(cars.isEmpty())   return null;

    Car removedCar=null;
    int size=cars.size();

        for (int i = 0; i <size ; i++) {
            Car c=cars.beginDequeue();
            if(c.getLicensePlate().equalsIgnoreCase(plateLicense)){
                removedCar=c;
            }else {
                cars.endEnqueue(c);
            }
        }
        return removedCar;
    }

    // Operações de consulta específicas para carros
    @Override
    public Car getCarByLicensePlate(String licensePlate) {
return getCar(licensePlate);    }

    @Override
    public Car[] getCarsByMark(String mark) {
DEQueable<Car> results=new LinkedDEQue<>(cars.size());
int size=cars.size();
        for (int i = 0; i < size; i++) {
            Car c=cars.beginDequeue();
            if (c.getMark() != null && c.getMark().equalsIgnoreCase(mark)) {
                results.beginEnqueue(c);

            }
            cars.endEnqueue(c);
        }
        return queueToArray(results);
    }

    @Override
    public Car[] getCarsByModel(String model) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public Car[] getCarsByColor(String color) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public Car[] getCarsByOwner(String owner) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public Car[] getCarsByMomentArrival(LocalDateTime initialMoment, LocalDateTime finalMoment) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    // Operações de análise e estatísticas
    @Override
    public Car getCarByNewestArrival() {
        throw new UnsupportedOperationException("Operação ainda não implementada");
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
return  cars.size();    }

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
return (int) (((double)getTotalCars()/getMaxCapacity())*100);
    }

    @Override
    public boolean isParkingEmpty() {
return cars.isEmpty();    }

    @Override
    public int getMaxCapacity() {
return 20;    }

    @Override
    public int getOccupancyRate() {
if(getMaxCapacity()==0) return 0;
    return  (int) (((double)getOccupancyRate()/getMaxCapacity())*100);
    }

    @Override
    public boolean isParkingFull() {
return cars.size()>=getMaxCapacity();    }

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
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }

    @Override
    public Car[] getCarsWithLongParking(long thresholdHours) {
        throw new UnsupportedOperationException("Operação ainda não implementada");
    }
    private Car[] queueToArray(DEQueable<Car> queue) {
        Car[] resultArrayCars = new Car[queue.size()];
        int index = 0;
        while (!queue.isEmpty()) {
            resultArrayCars[index] = queue.dequeue();
            index++;
        }
        return resultArrayCars;
    }

    private DEQueable<Car> arrayToQueue(Car[] cars) {
        DEQueable<Car> resultQueueCars = new LinkedDEQue<>(20);  // ou a implementação concreta do seu DEQueable
        for (Car car : cars) {
            resultQueueCars.enqueue(car);
        }
        return resultQueueCars;
    }
}