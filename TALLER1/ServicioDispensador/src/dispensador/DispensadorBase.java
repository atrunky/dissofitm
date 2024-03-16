package dispensador;

public abstract class DispensadorBase implements IDispensador {
    protected DispensadorBase siguiente;

    public void establecerSiguiente(DispensadorBase siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void dispensar(int cantidad) {
        if (siguiente != null) {
            siguiente.dispensar(cantidad);
        } else {
            System.out.println("No se puede dispensar la cantidad solicitada");
        }
    }
}