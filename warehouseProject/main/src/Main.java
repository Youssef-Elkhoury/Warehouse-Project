import personnel.Employee;
import personnel.User;
import stock.Item;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User person1 = new User("jimmy",true);
        User person2 = new User("george",false);
        Employee emp1 = new Employee("Mikel","security");
        Item item1 = new Item("new","cookies",10,new Date());


        //System.out.println(person1);
       // System.out.println(person2);
        //System.out.println(emp1);
        System.out.println(item1);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, Calendar.JUNE, 1);
        Date manualDate = calendar.getTime();

        item1.setManufacturingDate(manualDate);
        System.out.println("Updated Manufacturing Date: " + item1.getManufacturingDate());

    }
}
