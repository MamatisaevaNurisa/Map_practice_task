import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {



        User user = new User();
        user.setName("Nurisa");
        user.setSurname("Zharmamat kyzy ");
        Map<User, BankAccount> map = new HashMap<>();


       transaction(map,user,5000);
        System.out.println(map);

        BankAccount bankAccount = new BankAccount(400);
        bankAccount.addBalance(100);
        bankAccount.takeMoney(200);
        System.out.println(bankAccount);


    }
    public static void transaction(Map <User,BankAccount> map, User user  ,int balance) {
        map.put(user, new BankAccount(balance));
    }
}