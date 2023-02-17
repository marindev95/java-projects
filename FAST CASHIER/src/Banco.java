
import java.util.ArrayList;
import java.util.Random;

public class Banco {

    /**
     * el id de Banco
     */
    private String idbanco;

    //usuarios con una cuenta asociada 
    private ArrayList<Usuario> usuarios;

    //cuentas del banco
    private ArrayList<Cuenta> cuentas;

    //crea un nuevo objeto banco
    public Banco(String nombreBanco) {

        this.idbanco = nombreBanco;

        usuarios = new ArrayList<Usuario>();
        cuentas = new ArrayList<Cuenta>();

    }

    //genera el numero de tarjeta y devuelve su valor
    public String getNumeroTarjeta() {

        String uID;
        Random rng = new Random();
        int len = 6;
        boolean nonUnique;

        do {

            uID = "";
            for (int c = 0; c < len; c++) {
                uID += ((Integer) rng.nextInt(10)).toString();
            }

            //busca si este uID no esta asociado a un usuario existente
            nonUnique = false;
            for (Usuario u : this.usuarios) {
                if (uID.compareTo(u.getTarjetaID()) == 0) {
                    nonUnique = true;
                    break;
                }
            }

        } while (nonUnique);

        return uID;
    }

    //crea un nuevo usuario
    public Usuario agregarUsuario(String nombre, String apellido, String pin) {

        // crea un nuevo Objeto Usuario y lo agrega a la lista
        Usuario nuevoUsuario = new Usuario(nombre, apellido, pin, this);
        this.usuarios.add(nuevoUsuario);

        // crea una nueva cuenta de ahorro y la agrega a la lista
        Cuenta nuevaCuenta = new Cuenta("Cuenta de Ahorro", nuevoUsuario, this);
        nuevoUsuario.agregarCuentaUsuario(nuevaCuenta);
        this.cuentas.add(nuevaCuenta);

        return nuevoUsuario;

    }

    //aqui se validara los datos para loguearse
    public Usuario userLogin(String userID, String pin) {

        // busca en la lista de usuarios
        for (Usuario u : this.usuarios) {

            // si coinciden los datos con el objeto Usuario, se devuelve este objeto
            if (userID.equals(u.getTarjetaID()) && u.validarPIN(pin)) {
                return u;
            }
        }

        // si no coinciden retorna null
        return null;

    }

}
