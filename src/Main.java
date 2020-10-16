public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int popolnenie = 1500;
        int present = 100;

        int bonus = popolnenie / present;
        System.out.println("Ваш баланс " + bonus +  " бонуса");

        popolnenie = 500;
        bonus = 0;
        System.out.println("Ваш баланс " + bonus +  " бонуса");
    }
}
