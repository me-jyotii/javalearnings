// package LinkedList;
import java.lang.*;

class AccountInformation {
    private int bal;
    private String name;
    private String userId;

    public void setData(int Bal, String Name, String UserId) {
        bal = Bal;
        name = Name;
        userId = UserId;
    }
    public int getBal() {
        return bal;
    }

    // public int getName(){}

    // public int getUserId(){}
}
public class dataHiding {
    public static void main(String[] args) {
        AccountInformation obj = new AccountInformation();
        obj.setData(2500, "Suraj", "Suraj123");
        int rs = obj.getBal();
        System.out.println(rs);
    }
}
