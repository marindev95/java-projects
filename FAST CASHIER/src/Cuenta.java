

import java.util.ArrayList;

public class Cuenta {

    /**
     * nombre de la cuenta
     */
    private final String nombreCuenta;

    /**
     * Numero ID de la cuenta
     */
    private final String idCuenta;

    /**
     * Objeto Usuario al que pertenece la cuenta
     */
    private final Usuario propietario;

    /**
     * Lista de transacciones de la cuenta
     */
    private final ArrayList<Transacciones> transacciones;

    //constructor clase Cuenta
    public Cuenta(String nombre, Usuario uPropietario, Banco elBanco) {

        this.nombreCuenta = nombre;
        this.propietario = uPropietario;

        this.idCuenta = uPropietario.getTarjetaID();

        this.transacciones = new ArrayList<>();

    }

    //obtiene el numero Cuenta
    public String obtenerNumeroCuenta() {
        return this.idCuenta;
    }

    //agrega transaccion a la cuenta
    public void agregarTransaccionCuenta(int monto) {

        // create new transaction and add it to our list
        Transacciones nTransacc = new Transacciones(monto, this);
        this.transacciones.add(nTransacc);

    }

    //obtiene el balance e la cuenta y devuelve su valor
    public int getBalance() {

        int balance = 0;
        for (Transacciones t : this.transacciones) {
            balance += t.getMonto();
        }
        return balance;

    }

    //obtiene resumen del Balance
    public String getResumen() {

        int balance = this.getBalance();
        String s;

        s = "Lempiras: " + balance + "\n" + this.nombreCuenta;

        return s;

    }

   //imprime el historial de transacciones
    public void imprimirHistorialTransacciones() {
        Archivo arch = new Archivo();
        String s = "";
        System.out.print("\nHistorial de transacciones \n");
        for (int t = this.transacciones.size() - 1; t >= 0; t--) {
            s = this.transacciones.get(t).obtenerResumenTransaccion();
            arch.escritura(s); //escribe en un file

        }

    }

}
