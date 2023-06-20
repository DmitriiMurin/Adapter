public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        //демонстрация
        System.out.println(calc.mult(5, 2));
        System.out.println(calc.pow(5, 2));
        System.out.println(calc.sum(5, 2));
    }
}