/**
 * Created by Admin on 27.09.14.
 */
public class Приветствие1 {
    public static void main(String[] args) {
        String[]x={"Петя","Вася","Оля"};
        String[]y= new String [x.length];
        for (int i=0;i<x.length;i++){
           y[i]="Привет "+x[i];
            System.out.println(y[i]);
        }
    }
}
