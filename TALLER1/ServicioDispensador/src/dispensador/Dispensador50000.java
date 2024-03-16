package dispensador;

public class Dispensador50000 extends DispensadorBase {
    private static final int DENOMINACION = 20000;

    @Override
    public void dispensar(int cantidad) {
        int numBilletes = cantidad / DENOMINACION;
        int resto = cantidad % DENOMINACION;
        System.out.println("Dispensando " + numBilletes + " billetes de $20,000");
        
        if (resto != 0) {
            super.dispensar(resto);
        }
    }
}
