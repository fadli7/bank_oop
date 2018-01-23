package perbankan;
public class Savings extends Account {
    public Savings(double saldo, String nomorRekening, String pin, char jenis) {
        super(saldo, nomorRekening, pin, jenis);
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public double setSaldo(double saldo) {
        return super.saldo += saldo;
    }
    
    public void penarikanSaldo(double saldo) {
        super.saldo -= saldo;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getPin() {
        return pin;
    }
    
    public char getJenis() {
        return jenis;
    }
}
