public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int popolnenie = 500;
        int present = 100;
        int bonus;

        if (popolnenie > 1000){
            bonus = popolnenie / present;
            System.out.println("Ваш баланс " + bonus +  " бонуса");
        } else {
            bonus = 0;
            System.out.println("Ваш баланс " + bonus +  " бонуса");
        }
    }
}
