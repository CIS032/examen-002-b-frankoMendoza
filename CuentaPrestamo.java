package examen2;

public class CuentaPrestamo extends Cuenta {

    public CuentaPrestamo(String cliente) {
        super(cliente);
    }

    public CuentaPrestamo(String cliente, String tipoCliente, double balance, double tasaInteres) {
        super(cliente, tipoCliente, balance, tasaInteres);
    }

    @Override
    public double calcularInteres(int meses) {
        return meses * this.getTasaInteres();
    }

    @Override
    public double depositar(double monto) {
        double total = monto + this.getBalance();
        this.setBalance(total);
        return total;
    }

}
