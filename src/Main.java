import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int customerAccount = 100;
        int dipMoney = 1345;
        int bonus = dipMoney/customerAccount;
        int cumScore;
        if (dipMoney < 1000){
            cumScore = customerAccount + dipMoney;
        } else {
            cumScore = customerAccount + dipMoney + bonus;
        }
        System.out.println(cumScore);

    }
}
