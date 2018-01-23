package perbankan;
abstract class Account {
    double saldo;
    String nama;
    String pin;
    char jenis;
    
    Account(double saldo, String nama, String pin, char jenis) {
        this.saldo = saldo;
        this.nama = nama;
        this.pin = pin;
        this.jenis = jenis;
    }
    
    double getSaldo() {
        return saldo;
    }
    
    String getNama() {
        return nama;
    }
    
    String getPin() {
        return pin;
    }
    
    char getJenis() {
        return jenis;
    }
}
