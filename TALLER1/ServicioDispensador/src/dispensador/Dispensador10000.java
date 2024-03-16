package dispensador;

public class Dispensador10000 extends DispensadorBase {
    private static final int DENOMINACION = 10000;

    @Override
    public void dispensar(int cantidad) {
        int numBilletes = cantidad / DENOMINACION;
        int resto = cantidad % DENOMINACION;
        System.out.println("Dispensando " + numBilletes + " billetes de $10,000");
        
        if (resto != 0) {
            super.dispensar(resto);
        }
    }
}