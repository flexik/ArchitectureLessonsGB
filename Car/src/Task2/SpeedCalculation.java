package Task2;

/** Создал абстрактный класс Vehicle, который содержит общую логику транспортных средств
* Классы Car и Bus переопределяют его метод в соответствии с требованиями каждого типа.
* Класс SpeedCalculation использует полиморфизм и вызывает метод у переданного объекта Vehicle,
* что позволяет добавлять новые типы тр. средств, не изменяя код класса.
* Таким образом, класс SpeedCalculation соответствует принципу открытости/закрытости (OCP)
*/
public class SpeedCalculation {
    
    public double calculateAllowedSpeed(Vehicle vehicle){
        return vehicle.calculateAllowedSpeed();
    }

}
