
import java.security.MessageDigest;
import java.util.ArrayList;

public class Usuario {

    /**
     * nombre de usuario
     */
    private String firstName;

    /**
     * apellido de usuario
     */
    private String lastName;

    /**
     * tarjeta de usuario
     */
    private final String tarjetaID;

    /**
     * funcion hash para almacenar pin
     */
    private byte pinHash[];

    /**
     * lista de cuenta para este usuario
     */
    private ArrayList<Cuenta> accounts;

    /**
     * Create new user
     *
     * @param firstName	the user's first name
     * @param lastName	the user's last name
     * @param pin	the user's account pin number (as a String)
     * @param elBanco	the bank that the User is a customer of
     */
    public Usuario(String firstName, String lastName, String pin, Banco elBanco) {

        //agrega el nombre y apellido
        this.firstName = firstName;
        this.lastName = lastName;

        //almacena el pin en una funcion hash MD5. esto para evitar
        //discrepancias con los string
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.pinHash = md.digest(pin.getBytes());
        } catch (Exception e) {
            System.err.println("error : " + e.getMessage());
            System.exit(1);
        }

        // obtiene un numero de tarjeta que se agregar al usuario
        this.tarjetaID = elBanco.getNumeroTarjeta();

        // crea lista vacia de "cuentas"
        this.accounts = new ArrayList<>();

    }

    //retorna el id de la tarjeta
    public String getTarjetaID() {
        return this.tarjetaID;
    }

   //retorna el balance para una cuenta de usuario
    public int getBalanceCuenta() {
        return this.accounts.get(0).getBalance();
    }
    
    

    //imprime el historial de transacciones para una cuenta
    public void imprimirHistorialTran() {
        this.accounts.get(0).imprimirHistorialTransacciones();
    }

    public void agregarCuentaUsuario(Cuenta aCuenta) {
        this.accounts.add(aCuenta);
    }

    //agrega transacciones a una cuenta de usuario
    public void agregarTransaccionUsuario(int monto) {
        if(monto!=0) {
        this.accounts.get(0).agregarTransaccionCuenta(monto);
    }
    }

   //retorna si el PIN es valido o no
    public boolean validarPIN(String aPin) {

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            return MessageDigest.isEqual(md.digest(aPin.getBytes()),
                    this.pinHash);
        } catch (Exception e) {
            System.err.println("error: " + e.getMessage());
            System.exit(1);
        }

        return false;
    }

    public String mostrarResumenCuenta() {
        String s = null;
        System.out.printf("\n\n%s aquí está un pequeño resumen \n", this.firstName);
        for (int a = 0; a < this.accounts.size(); a++) {
            System.out.printf(" %s\n", 
                   s= this.accounts.get(a).getResumen());
        }
       
        return s;
    }
}
