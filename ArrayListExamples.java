package lab3.lab3_package;

/**
 * Класс ArrayListExamples, предназначенный для создания объекта коллекции ArrayList и её методов
 * @author Арсёнов Дмитрий, 7 группа, ММИО
 * @version 1.12.544
 */

import java.util.ArrayList;
import java.util.Random;

public class ArrayListExamples extends Car{
	public ArrayListExamples(String name) {
		super(name);
	};

	ArrayList<Car> cars = new ArrayList<Car>();
	
	Random random = new Random();

	public String carAdd(int n) {         //метод добавления элемментов в ArrayList, n - кол-во элементов
		long start = System.nanoTime();    //переменная start, фиксирующая начало отсчета времени
		for(int i=0; i<n;i++) {
			int index = random.nextInt(names.length);    //выбираем любое имя для поля объекта Car из массива names
			cars.add(new Car(names[index]));       //добавляем новый объект типа Car в ArrayList
		}
		long finish = System.nanoTime();      //переменная finish, фиксирующая конец отсчета времени
		long elapsed = finish - start;        //переменная elapsed, считающая сколько времени занимает данная операция в наносекундах
		String str = "Прошло времени, нс: " + elapsed;      //вывод времени операции
		return str;
		/*System.out.println(cars.size());
		*for(int i=0;i<cars.size();i++)
		*	System.out.println(cars.get(i).getName());    //кусочек кода, который можно копировать в любой метод для наглядного результата в консоли
		*System.out.println("");
		*/
	}
	public String manyCarRemovewithsubList(int startIndex, int endIndex) {    //метод удаления объектов из ArrayList через встроенные методы clear и subList(от одного до другого включительно)
		long start = System.nanoTime();
		cars.subList(startIndex-1, endIndex-1).clear();
		long finish = System.nanoTime();
		long elapsed = finish - start;
		String str = "Прошло времени, нс: " + elapsed;
		return str;
	}
	public String carGet(int index) {       //метод Get, возвращающий объект под указанным индексом
		long start = System.nanoTime();
		cars.get(index-1);
		long finish = System.nanoTime();
		long elapsed = finish - start;
		String str = "Прошло времени, нс: " + elapsed;
		return str;
	}
	public String oneCarRemove(int index) {        //метод remove удаления объекта по указанному индексу
		long start = System.nanoTime();
		cars.remove(index-1);
		long finish = System.nanoTime();
		long elapsed = finish - start;
		String str = "Прошло времени, нс: " + elapsed;
		return str;
	}
	public String removeAllCars() {              //метод removeAll, очищающий ArrayList
		long start = System.nanoTime();
		cars.removeAll(cars);
		long finish = System.nanoTime();
		long elapsed = finish - start;
		String str = "Прошло времени, нс: " + elapsed;
		return str;
	}
	public String carAddToFirst() {        //метод add, добавляющий элемент на первую позицию в ArrayList
		long start = System.nanoTime();
		int index = random.nextInt(names.length);
		cars.add(0,new Car(names[index]));
		long finish = System.nanoTime();
		long elapsed = finish - start;
		String str = "Прошло времени, нс: " + elapsed;
		return str;
	}
	public String carSet(int index) {       //метод set, меняющий элемент под указанным индексом на новый
		long start = System.nanoTime();
		cars.set(index-1,new Car(names[random.nextInt(names.length)]));
		long finish = System.nanoTime();
		long elapsed = finish - start;
		String str = "Прошло времени, нс: " + elapsed;
		return str;
	}
}