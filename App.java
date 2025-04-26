import java.util.Scanner;
import Account.Account;

public class App {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        String name = "Pablo";
        String account = "1256";
        Integer money = 120000;
        String name2 = "Andrea";
        String account2 = "1378";
        Integer money2 = 200000;
        Account Pablo = new Account(
                name,
                account,
                money);

        Account Andrea = new Account(
                name2,
                account2,
                money2);

        Account SelectedAccount = args[1].equals(Pablo.getName()) ? Pablo : Andrea;

        System.out.println("Bienvenido, " + SelectedAccount.getName());
        System.out.println(
                "Número de cuenta: " + SelectedAccount.getAccount());
        System.out.println("Titular: " + SelectedAccount.getName());

        Integer option = 0;
        while (option != 4) {
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Ver Saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opción (1-4): ");

            option = Scanner.nextInt();

            if (option == 1) {
                System.out.println(
                        "Saldo Actual: " + SelectedAccount.getMoney());
                option = 0;
            }
            if (option == 2) {
                SelectedAccount.addMoney(Scanner.nextInt());
                option = 0;
            }
            if (option == 3) {
                SelectedAccount.retriveMoney(Scanner.nextInt());
                option = 0;
            }


        }

        Scanner.close();
    }

}