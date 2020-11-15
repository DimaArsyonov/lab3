package lab3.lab3_package;

/**
 * Класс Main, предназначенный для создания объекта коллекции ArrayList и её методов
 * @author Арсёнов Дмитрий, 7 группа, ММИО
 * @version 1.12.544
 */



import javax.swing.JTable;          
import java.awt.Dimension;            //Импорт библиотек для создания таблицы 
import javax.swing.JFrame;
import javax.swing.JScrollPane;


public class Main {

	public static void main(String[] args) {
		/**
		*  Создание объектов классов ArrayListExamples и LinkedListExamples
		*/
		ArrayListExamples obj1 = new ArrayListExamples(null);
		
		LinkedListExamples obj2 = new LinkedListExamples(null);
		
		String[] columnNames = {          //определяем названия столбцов в таблице
				"Name of method",
				"Number of elems/index of elem",
				"Time"
		};
		String [][] data = {                  //определяем действия над объектами и записи в таблице
				{"ArrayList","",""},
				{"Add","100000",obj1.carAdd(100000)},
				{"Get elem","50000", obj1.carGet(50000)},
				{"Get first elem","", obj1.carGet(1)},
				{"Get last elem","", obj1.carGet(100000)},
				{"Add first elem","",obj1.carAddToFirst()},
				{"Set elem","50000", obj1.carSet(50000)},
				{"Remove many elems", "3", obj1.manyCarRemovewithsubList(1,3)},
				{"Remove one elem","2", obj1.oneCarRemove(2)},
				{"Remove all elems","",obj1.removeAllCars()},
				{"LinkedList","",""},
				{"Add","100000",obj2.carAdd(100000)},
				{"Get elem","50000", obj2.carGet(50000)},
				{"Get first elem","", obj2.getFirstElem()},
				{"Get last elem","", obj2.getLastElem()},
				{"Add first elem","",obj2.carAddToFirst()},
				{"Set elem","50000", obj2.carSet(50000)},
				{"Remove many elems", "3", obj2.manyCarRemovewithsubList(1,3)},
				{"Remove one elem","2", obj2.oneCarRemove(2)},
				{"Remove all elems","",obj2.removeAllCars()},
		};
		JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      //создание фрейма и таблицы
		JTable tb = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(tb);
         
        frame.getContentPane().add(scrollPane);             //задание размеров таблицы и вывод ее на экран
        frame.setPreferredSize(new Dimension(450, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}

}
