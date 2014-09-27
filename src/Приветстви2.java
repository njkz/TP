/**
 * Created by Admin on 27.09.14.
 */
public class Приветстви2 {
    public static void main(String[] args) {
        String[] x = {"Петя", "Вася", "Оля"};
        String[] q = priv(x);
        for (int i = 0; i < q.length; i++) {
            System.out.println(q[i]);
        }
    }

    public static String[] priv(String[] y) {
        String[] w = new String[y.length];
        for (int i = 0; i < w.length; i++) w[i] = "Привет " + y[i];
        return w;
    }
}
