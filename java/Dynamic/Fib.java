package Dynamic;

public class Fib {
    public int fib(int n) {
        int p = 0, q = 1, r = 0;
        for (int i = 0; i < n; i++) {
            r = p + q;
            q = p;
            p = r;
        }
        return r;
    }
}
