package servicios;

public class Bebidas extends Supermercado{
    public Bebidas() {
    }

    public Bebidas(String producto, int precio, double contenido) {
        super(producto, precio, contenido);
    }



    @Override
    public String toString() {
        return "Nombres: " + producto + " /// " + " Litros: " + contenido +" /// "+ " Precio: $" + precio ;
    }
}
