import java.util.Scanner;

public class AtmOptions {

    int accountNumber=123;
    int pin=123;

    AtmOperationService atmOperationService= new AtmOperationServiceImpl();

    public void option()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(Constant.ENTER_ACCOUNT);
        int accountNumberInput=sc.nextInt();

        System.out.print(Constant.ENTER_PIN);
        int pinInput=sc.nextInt();

        if(accountNumber == accountNumberInput && pin == pinInput)
        {
            System.out.println(Constant.SUCCESS);
            while (true){
                System.out.println(Constant.LINE);
                System.out.println(Constant.OPTIONS);
                int input=sc.nextInt();
                switch(input)
                {
                    case 1:atmOperationService.viewBalance();
                            break;
                    case 2: {
                            System.out.println(Constant.ENTER_WITHDRAWAL);
                            double amount = sc.nextDouble();
                            atmOperationService.withdrawalAmount(amount);
                            break;
                            }
                    case 3:{
                            System.out.println(Constant.ENTER_DEPOSIT);
                            double amount = sc.nextDouble();
                            atmOperationService.depositAmount(amount);
                            break;
                        }
                    case 4:atmOperationService.viewStatement();
                            break;
                    case 5:{
                            System.out.println(Constant.END_MSG1);
                            System.out.println(Constant.END_MSG2);
                            System.exit(0);
                    }
                    default: System.out.println(Constant.INVALID_OPTION);
                }
            }
        }
        else {
            System.out.println(Constant.INVALID_LOGIN);
        }
    }

}
