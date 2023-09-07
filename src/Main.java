public class Main {
    public static void main(String[] args) {

        int pred1 = 0;
        int pred2 = 1;

        System.out.print(pred1 + " " + pred2 + " ");

        for (int i = 2; i < 20; i++) {
            int Fibonacci = pred1 + pred2;
            System.out.print(Fibonacci + " ");
            pred1 = pred2;
            pred2 = Fibonacci;
        }

    }
}