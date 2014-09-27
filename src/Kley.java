/**
 * Created by Admin on 27.09.14.
 */
public class Kley {
    public static void main(String[] args) {
        int[] x = {1, 2, 3};
        int[] y = {4, 5, 6};
        int[] z = new int[x.length + y.length];
        int i = 0;
        for (i = 0; i < x.length; i++)
            z[i] = x[i];
        for (int j = 0; j < y.length; j++) {
            z[i] = y[j];
            i++;
        }
        for (int j = 0; j < z.length; j++) {
            System.out.println(z[j]);
        }
    }
}
