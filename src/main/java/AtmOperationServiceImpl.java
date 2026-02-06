import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AtmOperationServiceImpl implements AtmOperationService{

    Atm atm = new Atm();
    Map<Double, String> miniStatement = new LinkedHashMap<>();

    @Override
    public void viewBalance() {
        System.out.println(Constant.BALANCE+atm.getBalance());
    }

    @Override
    public void withdrawalAmount(double amount) {

        if(amount <0) {
            System.out.println(Constant.INVALID_AMT);
            return;
        }
        if(amount <= atm.getBalance()) {
            System.out.println(Constant.WITHDRAWAL_AMOUNT + amount);
            miniStatement.put(amount,Constant.WITHDRAWAL);
            atm.setBalance(atm.getBalance() - amount);
        }
        else {
            System.out.println(Constant.INSUFFICIENT);
        }

    }

    @Override
    public void depositAmount(double amount) {
        if(amount > 0) {
            System.out.println(Constant.DEPOSIT_AMOUNT + amount);
            miniStatement.put(amount,Constant.DEPOSIT);
            atm.setBalance(atm.getBalance() + amount);
        }
        else {
            System.out.println(Constant.INVALID_AMT);
        }
    }

    @Override
    public void viewStatement() {
        for(Map.Entry<Double,String> entry: miniStatement.entrySet())
        {
            System.out.println(entry.getKey() +": "+entry.getValue());
        }
    }
}
