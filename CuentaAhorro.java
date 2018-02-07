package examen2;

public class CuentaAhorro extends Cuenta {

    public CuentaAhorro() {
    }
    
     public CuentaAhorro(String cliente) {
        super(cliente);
    }
    
   

    public CuentaAhorro(String cliente, String tipoCliente, double balance, double tasaInteres) {
        super(cliente, tipoCliente, balance, tasaInteres);
    }
    
    @Override
    public double calcularInteres(int meses) {
        return meses * this.getTasaInteres();
    }

    @Override
    public double depositar(double monto) {
        double total=monto + this.getBalance();
        this.setBalance(total);
        return total;
    }

    public double retirar(double monto) {
        double total=this.getBalance() - monto;
        this.setBalance(total);
         return total;
    }
}
