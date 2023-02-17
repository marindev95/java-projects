
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.*;

public class ATM extends JFrame implements ActionListener {

    JButton bRegistro = new JButton();
    JButton bIngresar = new JButton();
    JButton bDeposito = new JButton();
    JButton bRetiro = new JButton();
    JButton bHistorial = new JButton();
    JButton bSalir = new JButton();
    JTextPane pane = new JTextPane();

    JButton caratula = new JButton();
    JButton txtregistro = new JButton();
    JButton txtingresar = new JButton();
    JButton txtDeposito = new JButton();
    JButton txtRetiro = new JButton();
    JButton txtHistorial = new JButton();
    JButton txtSalir = new JButton();
    BorderFactory empty;
    Border bor;

    String nombre;
    String apellido;

    int opcion;
    boolean b = true;
    String numTarjeta;

    ImageIcon imagen;
    Icon icono;

    Banco BancoLocal = new Banco("Local");

    public void GUI() {

        setSize(800, 800);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
        setLayout(null);

        //modificacion del background (fondo)
        (getContentPane()).setBackground(new Color(252, 241, 241));
        //modificacion de caratula FAST CASHIER
        caratula.setBounds(250, 50, 300, 80);
        add(caratula);
        bor = empty.createEmptyBorder();
        caratula.setBorder(bor);
        imagen = new ImageIcon("cara.png");
        icono = new ImageIcon(imagen.getImage()
                .getScaledInstance(caratula.getWidth(), caratula.getHeight(),
                        Image.SCALE_DEFAULT));
        caratula.setIcon(icono);

        //boton txtregistro
        txtregistro.setBounds(250, 300, 200, 70);

        imagen = new ImageIcon("txtregistro.png");
        icono = new ImageIcon(imagen.getImage()
                .getScaledInstance(200, 70, Image.SCALE_DEFAULT));
        bor = empty.createEmptyBorder();
        txtregistro.setIcon(icono);
        txtregistro.setBorder(bor);
        txtregistro.setContentAreaFilled(false);
        add(txtregistro);

        //boton txtingresar
        txtingresar.setBounds(250, 500, 200, 70);

        imagen = new ImageIcon("txtingresar.png");
        icono = new ImageIcon(imagen.getImage()
                .getScaledInstance(200, 70, Image.SCALE_DEFAULT));
        bor = empty.createEmptyBorder();
        txtingresar.setIcon(icono);
        txtingresar.setBorder(bor);
        txtingresar.setContentAreaFilled(false);
        add(txtingresar);

        //boton registro
        bRegistro.setBounds(150, 300, 70, 70);

        imagen = new ImageIcon("boton1.png");
        icono = new ImageIcon(imagen.getImage()
                .getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        bor = empty.createEmptyBorder();
        bRegistro.setIcon(icono);
        bRegistro.setContentAreaFilled(false);
        add(bRegistro);

        //evento del boton registro
        bRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Banco bBanco = new Banco("Banco de Deposito");
                JOptionPane.showMessageDialog(rootPane, "Bienvenido al FAST CASHIER", "FAST CASHIER", JOptionPane.INFORMATION_MESSAGE);
                try {
                    nombre = JOptionPane.showInputDialog(rootPane, "Ingrese su nombre", "FAST CASHIER", JOptionPane.INFORMATION_MESSAGE);
                    while (nombre == null) {
                        nombre = JOptionPane.showInputDialog(rootPane, "Ingrese su nombre", "FAST CASHIER", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, "ADIOS", "FAST CASHIER", JOptionPane.ERROR_MESSAGE);

                }
                try {
                    apellido = JOptionPane.showInputDialog(rootPane, "Ingrese su apellido", "FAST CASHIER", JOptionPane.INFORMATION_MESSAGE);
                    while (nombre == null) {
                        apellido = JOptionPane.showInputDialog(rootPane, "Ingrese su apellido", "FAST CASHIER", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, "ADIOS", "FAST CASHIER", JOptionPane.ERROR_MESSAGE);

                }
                String uID;
                Random rng = new Random();
                int len = 4;
                
                
                uID = "";
                for (int c = 0; c < len; c++) {
                    uID += ((Integer) rng.nextInt(10)).toString();
                }

                numTarjeta = (bBanco.agregarUsuario(nombre, apellido, uID)).getTarjetaID();
                JOptionPane.showMessageDialog(rootPane, "Registrado! tarjeta: "
                        + numTarjeta + "\n" + "PIN: " + uID, "FAST CASHIER", JOptionPane.INFORMATION_MESSAGE);
                BancoLocal = bBanco;
            }
        }
        );
        //boton ingresar
        bIngresar.setBounds(150, 500, 70, 70);

        imagen = new ImageIcon("boton1.png");
        icono = new ImageIcon(imagen.getImage()
                .getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        bor = empty.createEmptyBorder();
        bIngresar.setIcon(icono);
        bIngresar.setContentAreaFilled(false);
        add(bIngresar);

        //evento boton ingresar
        bIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Usuario UsuarioActual;
                // permanece en el login hasta que se verifique
                UsuarioActual = ATM.LoginUsuario(BancoLocal);

                // permanece en el menu hasta que usuario se retire
                if (UsuarioActual != null) {
                    MenuGUI(UsuarioActual);
                } else {
                    System.out.println("s");
                }

            }

        }
        );

    }//fin metodo GUI

    public void MenuGUI(Usuario elUsuario) {
        JFrame mGUI = new JFrame("Menu de Usuario");

        mGUI.setSize(800, 800);
        mGUI.setResizable(false);
        mGUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        mGUI.setVisible(true);
        mGUI.setLayout(null);

        elUsuario.mostrarResumenCuenta();

        //modificacion del background (fondo)
        (mGUI.getContentPane()).setBackground(new Color(247, 249, 249));
        //modificacion de caratula FAST CASHIER
        caratula.setBounds(250, 50, 300, 80);
        mGUI.add(caratula);
        bor = empty.createEmptyBorder();
        caratula.setBorder(bor);
        imagen = new ImageIcon("cara.png");
        icono = new ImageIcon(imagen.getImage()
                .getScaledInstance(caratula.getWidth(), caratula.getHeight(),
                        Image.SCALE_DEFAULT));
        caratula.setIcon(icono);
        //boton deposito
        bDeposito.setBounds(150, 200, 70, 70);

        imagen = new ImageIcon("boton1.png");
        icono = new ImageIcon(imagen.getImage()
                .getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        bor = empty.createEmptyBorder();
        bDeposito.setIcon(icono);
        bDeposito.setContentAreaFilled(false);
        mGUI.add(bDeposito);

        //evento del boton deposito
        bDeposito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(mGUI.getContentPane(),"Este es su"
                        + " balance actual:\n"
                        + elUsuario.mostrarResumenCuenta(), "FAST CASHIER",
                        JOptionPane.INFORMATION_MESSAGE);
                
                ATM.DepositoFondos(elUsuario);

            }

        }
        );
        //boton txtdeposito
        txtDeposito.setBounds(250, 200, 200, 70);

        imagen = new ImageIcon("txtdeposito.png");
        icono = new ImageIcon(imagen.getImage()
                .getScaledInstance(200, 70, Image.SCALE_DEFAULT));
        bor = empty.createEmptyBorder();
        txtDeposito.setIcon(icono);
        txtDeposito.setBorder(bor);
        txtDeposito.setContentAreaFilled(false);
        mGUI.add(txtDeposito);

        //boton retiro
        bRetiro.setBounds(150, 300, 70, 70);

        imagen = new ImageIcon("boton1.png");
        icono = new ImageIcon(imagen.getImage()
                .getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        bor = empty.createEmptyBorder();
        bRetiro.setIcon(icono);
        bRetiro.setContentAreaFilled(false);
        mGUI.add(bRetiro);
        //evento del boton retiro
        bRetiro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(mGUI.getContentPane(), "Este es su"
                        + " balance actual:\n"
                        + elUsuario.mostrarResumenCuenta(), "FAST CASHIER",
                        JOptionPane.INFORMATION_MESSAGE);
                ATM.RetiroFondos(elUsuario);
            }

        }
        );
        //boton txtretiro
        txtRetiro.setBounds(250, 300, 200, 70);

        imagen = new ImageIcon("txtretiro.png");
        icono = new ImageIcon(imagen.getImage()
                .getScaledInstance(200, 70, Image.SCALE_DEFAULT));
        bor = empty.createEmptyBorder();
        txtRetiro.setIcon(icono);
        txtRetiro.setBorder(bor);
        txtRetiro.setContentAreaFilled(false);
        mGUI.add(txtRetiro);

        //boton historial
        bHistorial.setBounds(150, 400, 70, 70);

        imagen = new ImageIcon("boton1.png");
        icono = new ImageIcon(imagen.getImage()
                .getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        bor = empty.createEmptyBorder();
        bHistorial.setIcon(icono);
        bHistorial.setContentAreaFilled(false);
        mGUI.add(bHistorial);
        //evento del boton historial
        bHistorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Archivo arch = new Archivo();
                arch.borrartodo(); //borra datos del archivo
                JOptionPane.showMessageDialog(mGUI.getContentPane(), "Se"
                        + " mostrará su historial de transacciones", "FAST CASHIER", JOptionPane.PLAIN_MESSAGE);

                JFrame ventana = new JFrame("HISTORIAL DE TRANSACCIONES");

                ventana.setVisible(true);
                ventana.setResizable(false);
                ventana.setSize(500, 500);
                ventana.setLayout(null);

                pane.setVisible(true);
                pane.setLayout(null);
                pane.setBounds(0, 0, 500, 500);

                ATM.mostrarHistorialTrans(elUsuario);

                pane.setText(arch.leer());

                pane.setEditable(false);
                ventana.add(pane);

            }

        }
        );
        //boton txthistorial
        txtHistorial.setBounds(250, 400, 200, 70);

        imagen = new ImageIcon("txthistorial.png");
        icono = new ImageIcon(imagen.getImage()
                .getScaledInstance(200, 70, Image.SCALE_DEFAULT));
        bor = empty.createEmptyBorder();
        txtHistorial.setIcon(icono);
        txtHistorial.setBorder(bor);
        txtHistorial.setContentAreaFilled(false);
        mGUI.add(txtHistorial);

        //boton salir
        bSalir.setBounds(150, 500, 70, 70);

        imagen = new ImageIcon("boton1.png");
        icono = new ImageIcon(imagen.getImage()
                .getScaledInstance(70, 70, Image.SCALE_DEFAULT));
        bor = empty.createEmptyBorder();
        bSalir.setIcon(icono);
        bSalir.setContentAreaFilled(false);
        mGUI.add(bSalir);
        //evento del boton salir
        bSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                mGUI.dispose();

            }

        }
        );
        //boton txtsalir
        txtSalir.setBounds(250, 500, 200, 70);

        imagen = new ImageIcon("txtsalir.png");
        icono = new ImageIcon(imagen.getImage()
                .getScaledInstance(200, 70, Image.SCALE_DEFAULT));
        bor = empty.createEmptyBorder();
        txtSalir.setIcon(icono);
        txtSalir.setBorder(bor);
        txtSalir.setContentAreaFilled(false);
        mGUI.add(txtSalir);

    } //fin metodo MenuGUI

    public static boolean Bienvenida() {
        System.out.println("\n" + "Bienvenido al ATM");
        System.out.println("Ingrese " + "1" + " para registrarse");
        System.out.println("Ingrese " + "2" + " para acceder a su cuenta");
        return true;
    }

    public static Usuario LoginUsuario(Banco banco) {

        Scanner sc = new Scanner(System.in);
        Usuario Usuariovalido = null;
        String tarjeta;
        String pin;
        int i = 0;
        // 
        do {

            tarjeta = JOptionPane.showInputDialog(null, "Ingrese su TARJETA", "FAST CASHIER", JOptionPane.CLOSED_OPTION);
            if (tarjeta == null) {
                break;
            }
            pin = JOptionPane.showInputDialog(null, "Ingrese su PIN", "FAST CASHIER", JOptionPane.INFORMATION_MESSAGE);
            if (pin == null) {
                break;
            }
            // se valida la tarjeta/pin
            Usuariovalido = banco.userLogin(tarjeta, pin);
            if (Usuariovalido == null) {
                i = JOptionPane.showConfirmDialog(null, "ERROR DE AUTENTIFICACION\n" + "¿Desea intentarlo nuevamente?", "FAST CASHIER", JOptionPane.YES_NO_OPTION);

            } else {
                JOptionPane.showMessageDialog(null, "BIENVENIDO", "FAST CASHIER", JOptionPane.PLAIN_MESSAGE);
                i = 1;
            }

        } while (JOptionPane.YES_NO_OPTION == i && Usuariovalido == null); 	// continue looping until we have a  

        return Usuariovalido;

    }

    public static void RetiroFondos(Usuario elUsuario) {

        int imonto = 0;
        int balanceactual;

        balanceactual = elUsuario.getBalanceCuenta();
        if (balanceactual == 0) {
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente:\n"
                    + "L." + balanceactual, "FAST CASHIER", JOptionPane.ERROR_MESSAGE);

        } else {

            do {
                String monto = "";
                monto = JOptionPane.showInputDialog(null, "Ingrese el monto que "
                        + "desea retirar\n" + "MAX: L." + balanceactual, "FAST CASHIER",
                        JOptionPane.QUESTION_MESSAGE);

                try {
                    while (monto.equals("0")) {
                        JOptionPane.showMessageDialog(null, "Monto debe ser mayor a 0", "FAST CASHIER", JOptionPane.ERROR_MESSAGE);
                        monto = JOptionPane.showInputDialog(null, "Ingrese el monto que "
                                + "desea retirar\n" + "MAX: L." + balanceactual, "FAST CASHIER",
                                JOptionPane.QUESTION_MESSAGE);
                    }
                } catch (NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, "ADIOS", "FAST CASHIER", JOptionPane.PLAIN_MESSAGE);
                    break;
                }

                try {
                    imonto = Integer.parseInt(monto);
                    JOptionPane.showMessageDialog(null,"Retiro : Lempiras "+ monto, "FAST CASHIER", JOptionPane.PLAIN_MESSAGE);
                    while (imonto > balanceactual) {
                        JOptionPane.showMessageDialog(null, "Monto excede su "
                                + "balance" + "MAX: L." + balanceactual, "FAST CASHIER",
                                JOptionPane.ERROR_MESSAGE);
                        monto = JOptionPane.showInputDialog(null, "Ingrese el monto que "
                                + "desea retirar\n" + "MAX: L." + balanceactual, "FAST CASHIER",
                                JOptionPane.QUESTION_MESSAGE);
                        imonto = Integer.parseInt(monto);
                        JOptionPane.showMessageDialog(null,"Retiro : Lempiras "+ monto, "FAST CASHIER", JOptionPane.PLAIN_MESSAGE);
                        
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se ingresó un monto", "FAST CASHIER", JOptionPane.PLAIN_MESSAGE);
                    break;
                }
                break;
            } while (imonto <= 0);
                
            elUsuario.agregarTransaccionUsuario(-1 * imonto);

        }
    }

    public static void DepositoFondos(Usuario elUsuario) {
        int imonto2 = 0;
        do {
            String monto = "";

            monto = JOptionPane.showInputDialog(null, "Ingrese el monto que desea depositar", "FAST CASHIER", JOptionPane.QUESTION_MESSAGE);
            try {
                while (monto.equals("0")) {
                    JOptionPane.showMessageDialog(null, "Monto debe ser mayor a 0", "FAST CASHIER", JOptionPane.ERROR_MESSAGE);
                    monto = JOptionPane.showInputDialog(null, "Ingrese el monto que desea depositar", "FAST CASHIER", JOptionPane.QUESTION_MESSAGE);
                }
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "ADIOS", "FAST CASHIER", JOptionPane.PLAIN_MESSAGE);
                break;
            }

            try {
                imonto2 = Integer.parseInt(monto);
                JOptionPane.showMessageDialog(null,"Deposito: Lempiras "+ monto, "FAST CASHIER", JOptionPane.PLAIN_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "No se ingresó un monto", "FAST CASHIER", JOptionPane.PLAIN_MESSAGE);
                break;
            }

        } while (imonto2 <= 0);

        elUsuario.agregarTransaccionUsuario(imonto2);

    }

    /**
     * Mostrar el historial de transacciones de una cuenta de usuario
     *
     * @param elUsuario	el usuario
     *
     */
    public static void mostrarHistorialTrans(Usuario elUsuario) {

        elUsuario.imprimirHistorialTran();

    }

    public static void main(String[] args) {
        ATM n = new ATM();
        n.GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
