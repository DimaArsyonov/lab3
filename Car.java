package lab3.lab3_package;

/**
 * Класс Car, предназначенный для заполнения ArrayList и LinkedList
 * @author Арсёнов Дмитрий, 7 группа, ММИО
 * @version 1.0.0
 */

import java.util.Objects;

public class Car {
	protected String name;
	
	/**
	*  Массив names, который содержит имена для полей объектов класса Car
	*
	*/
	static final String[] names = {"Nissan", "Volga", "Lada", "Mitsubishi","Mazda","Daewoo","Ford","Bugatti",
			"Chevrolet","Alfa Romeo","Mercedes","Porsche","Geep","Ferrari","Toyota"};
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Car(String name) {
		this.name = name;
	}
	
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof Car))
			return false;
		Car car = (Car) o;
		return name.equals(car.name);
	}
	
	public int hashCode() {
		return Objects.hash(name);
	}
}
