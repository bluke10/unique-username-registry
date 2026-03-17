//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRegistry registry = new UserRegistry();
        while(true){
            System.out.println("Enter a username:");
            String username = scanner.nextLine();

            if(username.equals("exit")){
                break;
            }

            boolean success = registry.registerUser(username);

            if(success){
                System.out.println("Username addedd successfully");
            }else{
                System.out.println("Username already added");
            }
            registry.displayUsers();
        }
        scanner.close();

    }
}

//            // TIP Press ctrl f9 <shortcut actionId="Debug"/> to start debugging your code wherever debugger is set.
//            // We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
