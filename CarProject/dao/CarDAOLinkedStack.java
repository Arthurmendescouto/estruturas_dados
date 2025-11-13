package CarProject.dao;

import CarProject.model.Car;
import LinkedStack.src.main.java.org.example.LinkedStack;
import LinkedStack.src.main.java.org.example.Stackable;

import java.time.Duration;
import java.time.LocalDateTime;


public class CarDAOLinkedStack implements CarDAO {

    private Stackable<Car> cars = new LinkedStack<>(20);

    // Operações básicas CRUD
    @Override
    public void addCar(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("Carro não pode ser null");
        }
        if (car.getLicensePlate() == null || car.getLicensePlate().isEmpty()) {
            throw new IllegalArgumentException("A placa não pode ser null ou vazia");
        }
        if (isCarInPlaced(car.getLicensePlate())) {
            throw new IllegalArgumentException("Já existe um carro com esta placa: " + car.getLicensePlate());

        }
        cars.push(car);
    }

    @Override
    public Car getCar(String plateLicense) {
        Stackable<Car> temp = new LinkedStack<>(20);
        Car found = null;

        while (!cars.isEmpty()) {
            Car car = cars.pop();
            if (car.getLicensePlate().equals(plateLicense)) {
                found = car;
            }
            temp.push(car);
        }
        while (!temp.isEmpty()) cars.push(temp.pop());
        return found;
    }

    @Override
    public Car[] getAllCars() {
        Stackable<Car> temp = new LinkedStack<>(20);
        Stackable<Car> aux = new LinkedStack<>(20);

        int count = 0;
        while (!cars.isEmpty()) {
            Car car = cars.pop();
            temp.push(car);
            count++;
        }
        Car[] all = new Car[count];

        for (int i = 0; i < count; i++) {
            Car c = temp.pop();
            cars.push(c);
            all[i] = c;
        }
        return all;
    }

    @Override
    public void updateCar(Car updatedCar) {
        Stackable<Car> temp = new LinkedStack<>(20);
        boolean updated = false;
        while (!cars.isEmpty()) {
            Car c = cars.pop();
            if (!updated && c.getLicensePlate().equalsIgnoreCase(updatedCar.getLicensePlate())) {
                temp.push(updatedCar);
                updated = true;
            } else {
                temp.push(c);
            }
        }
        while (!temp.isEmpty()) {
            cars.push(temp.pop());
        }
    }

    @Override
    public Car deleteCar(String plate) {
        Stackable<Car> temp = new LinkedStack<>(20);
        Car removedCar = null;

        while (!cars.isEmpty()) {
            Car c = cars.pop();
            if (removedCar == null && c.getLicensePlate().equalsIgnoreCase(plate)) {
                removedCar = c;
            } else {
                temp.push(c);
            }
        }


        while (!temp.isEmpty()) {
            cars.push(temp.pop());
        }

        return removedCar;
    }

    // Operações de consulta específicas para carros
    @Override
    public Car getCarByLicensePlate(String licensePlate) {
        if (licensePlate == null || licensePlate.isEmpty()) {
            throw new IllegalArgumentException(" Placa não pode ser null ou vazia.");
        }
        Stackable<Car> temp = new LinkedStack<>(20);
        Car found = null;

        while (!cars.isEmpty()) {
            Car c = cars.pop();
            if (found == null && c.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                found = c;
            }
            temp.push(c);
        }
        while (!temp.isEmpty()) {
            cars.push(temp.pop());
        }
        return found;
    }


    @Override
    public Car[] getCarsByMark(String mark) {
        if (mark == null || mark.isEmpty()) {
            throw new IllegalArgumentException(" Marca não pode ser null ou vazia.");
        }
        Stackable<Car> temp = new LinkedStack<>(20);
        Stackable<Car> result = new LinkedStack<>(20);
        int count = 0;

        while (!cars.isEmpty()) {
            Car c = cars.pop();
            if (c.getMark().equalsIgnoreCase(mark)) {
                result.push(c);
                count++;
            }
            temp.push(c);
        }
        while (!temp.isEmpty()) {
            cars.push(temp.pop());
        }
        Car[] found = new Car[count];
        for (int i = count - 1; i >= 0; i--) {
            found[i] = result.pop();
        }
        return found;
    }

    @Override
    public Car[] getCarsByModel(String model) {
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Modelo não pode ser null ou vazio.");
        }
        Stackable<Car> temp = new LinkedStack<>(20);
        Stackable<Car> result = new LinkedStack<>(20);
        int count = 0;

        while (!cars.isEmpty()) {
            Car c = cars.pop();
            if (c.getModel().equalsIgnoreCase(model)) {
                result.push(c);
                count++;
            }
            temp.push(c);
        }
        while (!temp.isEmpty()) {
            cars.push(temp.pop());
        }
        Car[] found = new Car[count];
        for (int i = count - 1; i >= 0; i--) {
            found[i] = result.pop();
        }
        return found;
    }


    @Override
    public Car[] getCarsByColor(String color) {
        if (color == null || color.isEmpty()) {
            throw new IllegalArgumentException("Cor não pode ser null ou vazia.");
        }

        Stackable<Car> temp = new LinkedStack<>(20);
        Stackable<Car> result = new LinkedStack<>(20);
        int count = 0;

        while (!cars.isEmpty()) {
            Car c = cars.pop();
            if (c.getColor().equalsIgnoreCase(color)) {
                result.push(c);
                count++;
            }
            temp.push(c);
        }
        while (!temp.isEmpty()) {
            cars.push(temp.pop());
        }
        Car[] found = new Car[count];
        for (int i = count - 1; i >= 0; i--) {
            found[i] = result.pop();
        }
        return found;
    }

    @Override
    public Car[] getCarsByOwner(String owner) {
        if (owner == null || owner.isEmpty()) {
            throw new IllegalArgumentException("Proprietário não pode ser null ou vazia.");
        }

        Stackable<Car> temp = new LinkedStack<>(20);
        Stackable<Car> result = new LinkedStack<>(20);
        int count = 0;

        while (!cars.isEmpty()) {
            Car c = cars.pop();
            if (c.getOwnerName().equalsIgnoreCase(owner)) {
                result.push(c);
                count++;
            }
            temp.push(c);
        }
        while (!temp.isEmpty()) {
            cars.push(temp.pop());
        }
        Car[] found = new Car[count];
        for (int i = count - 1; i >= 0; i--) {
            found[i] = result.pop();
        }
        return found;
    }

    @Override
    public Car[] getCarsByMomentArrival(LocalDateTime initialMoment, LocalDateTime finalMoment) {
        if (initialMoment == null || finalMoment == null) {
            throw new IllegalArgumentException("Os momentos inicial e final não podem ser null.");
        }
        Stackable<Car> temp = new LinkedStack<>();
        Stackable<Car> result = new LinkedStack<>(20);
        int count = 0;

        while (!cars.isEmpty()) {
            Car c = cars.pop();
            LocalDateTime arrival = c.getArrived();
            if (arrival != null && (arrival.isEqual(initialMoment) || arrival.isAfter(initialMoment)) && (arrival.isEqual(finalMoment) || arrival.isBefore(finalMoment))) {
                result.push(c);
                count++;
            }
            temp.push(c);
        }
        while (!temp.isEmpty()) {
            cars.push(temp.pop());
        }
        Car[] found = new Car[count];
        for (int i = count - 1; i >= 0; i--) {
            found[i] = result.pop();
        }
        return found;
    }


    // Operações de análise e estatísticas
    @Override
    public Car getCarByNewestArrival() {
        if (cars.isEmpty()) {
            return null;
        }
        Stackable<Car> temp = new LinkedStack<>(20);
        Car newest = null;

        while (!cars.isEmpty()) {
            Car c = cars.pop();

            if (newest == null || c.getArrived().isAfter(newest.getArrived())) {
                newest = c;
            }
            temp.push(c);
        }
        while (!temp.isEmpty()) {
            cars.push(temp.pop());
        }
        return newest;
    }

    @Override
    public Car getCarByOldestArrival() {
        if (cars.isEmpty()) {
            return null;
        }

        Stackable<Car> temp = new LinkedStack<>(20);
        Car oldest = null;

        while (!cars.isEmpty()) {
            Car c = cars.pop();
            if (oldest == null || c.getArrived().isBefore(oldest.getArrived())) {
                oldest = c;
            }
            temp.push(c);
        }
        while (!temp.isEmpty()) {
            cars.push(temp.pop());
        }
        return oldest;
    }

    // Operações de relatório e estatísticas
    @Override
    public String printCars() {
        if (cars.isEmpty()) {
            return "Nenhum carro estacionado.";
        }
        Stackable<Car> temp = new LinkedStack<>(20);
        StringBuilder sb = new StringBuilder();

        while (!cars.isEmpty()) {
            Car c = cars.pop();
            sb.append(c).append("\n");
            temp.push(c);
        }
        while (!temp.isEmpty()) {
            cars.push(temp.pop());
        }
        return sb.toString();
    }


    @Override
    public int getTotalCars() {
        Stackable<Car> temp = new LinkedStack<>(20);
        int count = 0;

        while (!cars.isEmpty()) {
            temp.push(cars.pop());
            count++;
        }
        while (!temp.isEmpty()) {
            cars.push(temp.pop());
        }
        return count;
    }

    @Override
    public String getMostPopularMark() {
        if (cars.isEmpty()) return null;
        Stackable<Car> temp = new LinkedStack<>(20);
        String popular = null;
        int max = 0;

        while (!cars.isEmpty()) {
            Car c = cars.pop();
            int count = 1;
            Stackable<Car> aux = new LinkedStack<>(20);
            while (!temp.isEmpty()) {
                Car t = temp.pop();
                if (t.getMark().equalsIgnoreCase(c.getMark())) count++;
                aux.push(t);
            }
            while (!aux.isEmpty()) {
                temp.push(aux.pop());
            }
            if (count > max) {
                max = count;
                popular = c.getMark();
            }
            temp.push(c);
        }
        while (!temp.isEmpty()) {
            cars.push(temp.pop());

        }
        return popular;
    }

    @Override
    public String getMostPopularModel() {
        if (cars.isEmpty()) return null;

        Stackable<Car> temp = new LinkedStack<>(20);
        String popular = null;
        int max = 0;
        while (!cars.isEmpty()) {
            Car c = cars.pop();
            int count = 1;

            Stackable<Car> aux = new LinkedStack<>(20);
            while (!temp.isEmpty()) {
                Car t = temp.pop();
                if (t.getModel().equalsIgnoreCase(c.getModel())) {
                    count++;
                }
                aux.push(t);
            }
            while (!aux.isEmpty()) {
                temp.push(aux.pop());
            }
            if (count > max) {
                max = count;
                popular = c.getModel();
            }
            temp.push(c);
        }
        while (!temp.isEmpty()) cars.push(temp.pop());
        return popular;

    }

    @Override
    public String getMostPopularColor() {
        if (cars.isEmpty()) return null;

        Stackable<Car> temp = new LinkedStack<>(20);
        String popular = null;
        int max = 0;
        while (!cars.isEmpty()) {
            Car c = cars.pop();
            int count = 1;

            Stackable<Car> aux = new LinkedStack<>(20);
            while (!temp.isEmpty()) {
                Car t = temp.pop();
                if (t.getColor().equalsIgnoreCase(c.getColor())) {
                    count++;
                }
                aux.push(t);
            }
            while (!aux.isEmpty()) {
                temp.push(aux.pop());
            }
            if (count > max) {
                max = count;
                popular = c.getColor();
            }
            temp.push(c);
        }
        while (!temp.isEmpty()) cars.push(temp.pop());
        return popular;
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
        Stackable<Car> temp = new LinkedStack<>(20);
        Stackable<Car> res = new LinkedStack<>(20);
        LocalDateTime now = LocalDateTime.now();
        int count = 0;

        while (!cars.isEmpty()) {
            Car c = cars.pop();
            long h = Duration.between(c.getArrived(), now).toHours();

            if (h >= minHours && h <= maxHours) {
                res.push(c);
                count++;
            }
            temp.push(c);
        }
        while (!temp.isEmpty()) cars.push(temp.pop());

        Car[] r = new Car[count];
        for (int i = count - 1; i >= 0; i--)
            r[i] = res.pop();

        return r;
    }

    @Override
    public int getAvailableSpaces() {
        return 20 - getTotalCars();
    }

    @Override
    public boolean isParkingEmpty() {
        return cars.isEmpty();
    }

    @Override
    public int getMaxCapacity() {
        return 20;
    }

    @Override
    public int getOccupancyRate() {
        return (getTotalCars() * 100) / 20;
    }

    @Override
    public boolean isParkingFull() {
        return getTotalCars() >= 20;
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
if(cars.isEmpty()) return 0;
    Stackable<Car> temp=new LinkedStack<>(20);
    long total=0;
    int count=0;

    while (!cars.isEmpty()){
        Car c=cars.pop();
        total+=c.getArrived().getHour()*60+ c.getArrived().getMinute();
        count++;
        temp.push(c);
    }
    while (!temp.isEmpty()) cars.push(temp.pop());
    return total/count;
    }

    @Override
    public Car[] getCarsWithLongParking(long thresholdHours) {
Stackable<Car> temp=new LinkedStack<>(20);
    Stackable<Car> res= new LinkedStack<>(20);
    LocalDateTime now=LocalDateTime.now();
    int count=0;

    while (!cars.isEmpty()){
        Car c=cars.pop();
        if(Duration.between(c.getArrived(),now).toHours()>thresholdHours){
    res.push(c);
    count++;
        }
        temp.push(c);
    }
    while (!temp.isEmpty()) cars.push(temp.pop());

    Car[] r=new Car[count];
        for (int i =count-1; i >=0 ; i--) {
            r[i]=res.pop();
        }
        return r;
    }
}