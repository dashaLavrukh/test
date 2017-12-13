import java.util.ArrayList;
import java.util.Collections;


public class MassSort {

    public static ArrayList mass = new ArrayList();

    public static ArrayList sort(ArrayList mass) {
        Collections.sort(mass);
        return mass;
    }

    public static void sortWithException(ArrayList mass){
        mass.get(6);
    }

    public static void main(String[] args) {
        mass.add(3);
        mass.add(2);
        mass.add(4);
        mass.add(1);
        mass.add(5);
        System.out.println("Исходный массив:   " + mass);
        mass = sort(mass);
        System.out.println("Новый массив:      " + mass);
    }
}
