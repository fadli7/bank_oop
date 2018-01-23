package perbankan;

import java.util.ArrayList;
import java.util.HashMap;

public class Bank {
    HashMap<String, Account> hm = new HashMap();
    public Bank() {
        hm.put("2110161020", new Savings(9000000, "Fadli", "123456", 'g'));
        hm.put("2110161088", new Savings(8500000, "Osas", "654321", 's'));
        hm.put("2110161099", new Savings(8000000, "Uvuweve", "111111", 'p'));
    }
    
    public Account getAkun(String x) {
        Savings a = (Savings) hm.get(x);
        return a;
    }
    
    public boolean terdapatNoRekening(String x) {
        return hm.containsKey(x);
    }
}
