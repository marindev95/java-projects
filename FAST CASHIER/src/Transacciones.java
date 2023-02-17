
import java.util.Date;

public class Transacciones {

    /**
     * el monto de la transaccion
     */
    private int monto;

    /**
     * fecha y hora de la transaccion
     */
    private Date fechayhora;

    /**
     * la cuenta en la cual se efectua la transaccion
     */
    private Cuenta cuentaActual;

    //crea la nueva transaccion
    public Transacciones(int monto, Cuenta estaCuenta) {

        this.monto = monto;
        this.cuentaActual = estaCuenta;
        this.fechayhora = new Date();

    }

    //obtiene el monto de la transaccion
    public int getMonto() {
        return this.monto;
    }
    
    //obtiene un resumen de la transaccion y lo devuelve como cadena
    public String obtenerResumenTransaccion() {

        String s;

        s = "Lempiras: " + monto + "\n" + (this.fechayhora.toString());

        return s;
    }

}
