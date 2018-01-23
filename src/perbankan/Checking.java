package perbankan;
public class Checking extends Account {
    public Checking(double saldo, String nomorRekening, String pin, char jenis) {
        super(saldo, nomorRekening, pin, jenis);
    }
    
    public double getSaldo() {
        return saldo;
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
