
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/*
Autor: David Antonio Rodriguez 20141002724
*/
public class Ventana extends JFrame {

    ArrayList alCasillas = new ArrayList();
    String[] alListaNumeros = new String[81];
    String[] alListaNumerosc = new String[81];
    String[] NoTocar = new String[81];
    String[] NoTocarPista = new String[81];
    
    Container contPrincipal;
    JPanel panTablero;
    JPanel panSecundario;
    JPanel panExtra;
    JButton butProbar;
    JButton butDestape;
    JButton butTemp;
    JButton butPista;
    JButton butTerminar;

    JButton butNum1;
    JButton butNum2;
    JButton butNum3;
    JButton butNum4;
    JButton butNum5;
    JButton butNum6;
    JButton butNum7;
    JButton butNum8;
    JButton butNum9;

    String memoria1;
    String memoria2;

    boolean empezo = false;
    boolean entradaDestape = true;
    boolean entradaPista = true;
    boolean jugarDeNuevo = false;
    
    int contadorCicloPistas = 0;
    int contadorIntentos = 0;
    int alt;
    int oportunidadesPist = 0;
    
    public Ventana() {
        super("Sudoku");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setVisible(true);
        //setResizable(false);

       
        butProbar = new JButton("Comprobar");
        butProbar.setBackground(Color.LIGHT_GRAY);
        butDestape = new JButton("Destapar");
        butDestape.setBackground(Color.LIGHT_GRAY);
        butPista = new JButton("Pista");
        butPista.setBackground(Color.LIGHT_GRAY);
        butTerminar = new JButton("Salir");
        butTerminar.setBackground(Color.LIGHT_GRAY);

        panSecundario = new JPanel();
        panSecundario.setLayout(new FlowLayout());
        panSecundario.setBackground(Color.white);
        
        panTablero = new JPanel();
        panTablero.setLayout(new GridLayout(3, 3));

        panExtra = new JPanel();
        panExtra.setLayout(new GridLayout(9, 1));
        
        ManejadorComprobar mc = new ManejadorComprobar();
        butProbar.addActionListener(mc);
        panSecundario.add(butProbar);
        ManejadorDestape md = new ManejadorDestape();
        butDestape.addActionListener(md);
        panSecundario.add(butDestape);
        ManejadorPista mp = new ManejadorPista();
        butPista.addActionListener(mp);
        panSecundario.add(butPista);
        ManejadorTerminar mt = new ManejadorTerminar();
        butTerminar.addActionListener(mt);
        panSecundario.add(butTerminar);
        
        

        //creando los botones numericos 1-9
        //editando el color de los botones y agregandolos al panel corresp.
        butNum1 = new JButton("1");
        butNum1.setBackground(Color.LIGHT_GRAY);
        panExtra.add(butNum1);
        butNum2 = new JButton("2");
        butNum2.setBackground(Color.LIGHT_GRAY);
        panExtra.add(butNum2);
        butNum3 = new JButton("3");
        butNum3.setBackground(Color.LIGHT_GRAY);
        panExtra.add(butNum3);
        butNum4 = new JButton("4");
        butNum4.setBackground(Color.LIGHT_GRAY);
        panExtra.add(butNum4);
        butNum5 = new JButton("5");
        butNum5.setBackground(Color.LIGHT_GRAY);
        panExtra.add(butNum5);
        butNum6 = new JButton("6");
        butNum6.setBackground(Color.LIGHT_GRAY);
        panExtra.add(butNum6);
        butNum7 = new JButton("7");
        butNum7.setBackground(Color.LIGHT_GRAY);
        panExtra.add(butNum7);
        butNum8 = new JButton("8");
        butNum8.setBackground(Color.LIGHT_GRAY);
        panExtra.add(butNum8);
        butNum9 = new JButton("9");
        butNum9.setBackground(Color.LIGHT_GRAY);
        panExtra.add(butNum9);
        //agregando los botones al manejador
        ManejadorNumeros manejadorNumeros = new ManejadorNumeros();
        butNum1.addActionListener(manejadorNumeros);
        butNum2.addActionListener(manejadorNumeros);
        butNum3.addActionListener(manejadorNumeros);
        butNum4.addActionListener(manejadorNumeros);
        butNum5.addActionListener(manejadorNumeros);
        butNum6.addActionListener(manejadorNumeros);
        butNum7.addActionListener(manejadorNumeros);
        butNum8.addActionListener(manejadorNumeros);
        butNum9.addActionListener(manejadorNumeros);

        contPrincipal = getContentPane();
        contPrincipal.add(panSecundario, BorderLayout.NORTH);
        contPrincipal.add(panTablero, BorderLayout.CENTER);
        contPrincipal.add(panExtra, BorderLayout.WEST);
        GenerarBotonesCasillas();
        CuadrosDeDialogo();

    }
   //Aquí se generarán las subcuadriculas y se le añadiran sus 9 botones corres.
    public final void GenerarBotonesCasillas() {

        int n = 0;
        while (n < 9) {
            JPanel jPanelTemporal = new JPanel(new GridLayout(3, 3));
            jPanelTemporal.setBorder(BorderFactory.createLineBorder(Color.black));
            int f = 0;
            while (f < 9) {
                butTemp = new JButton();
                butTemp.setBackground(Color.WHITE);
                jPanelTemporal.add(butTemp);
                alCasillas.add(butTemp);
                // agregando cada boton al arraylist alCasillas
                f++;
            }
            panTablero.add(jPanelTemporal);
            n++;
        }
    }
    //Aquí se manejarán los numeros del 1-9 del lado izquierdo del JFrame
    public class ManejadorNumeros implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton temp = (JButton) e.getSource();
            String s = temp.getText();
            memoria1 = s;
          }
    }
    //Aquí se manejan las casillas que se destaparan aleatoriamente
    public class ManejadorDestape implements ActionListener  {

        @Override
        public void actionPerformed(ActionEvent e)  {
            ArrayListPlantillas alD = new ArrayListPlantillas();
            StringBuilder sB = new StringBuilder();
            String[] sEleccion1 = new String[81];
            
            Random rnd = new Random();
            alt = rnd.nextInt(5);
           
            if(alt == 0) {
              sEleccion1 = alD.ArrayListPlantillas1();  
            } else if(alt == 1 ){
                sEleccion1 = alD.ArrayListPlantillas2();
            } else if(alt == 2) {
                sEleccion1 = alD.ArrayListPlantillas3();
            } else if(alt == 3) {
                sEleccion1 = alD.ArrayListPlantillas4();
            } else if(alt == 4) {
                sEleccion1 = alD.ArrayListPlantillas5();
            }
            int linea = 0;
            int salto=0;
            for(int i =0; i<81;i++){
               System.out.print(sEleccion1[i]+ " ");
               linea++;
               salto++;
               if(linea==3) { 
                  System.out.print("\n");
                  linea=0;
             } if(salto==9){
                 System.out.println("\n");
                 salto=0;
             }
            }
            
            while (entradaDestape) {
           
              for (String x : sEleccion1 ) {
                    sB.append(x);
                    
                    
                } 
                
               //System.out.println(sB.toString());
                Random random = new Random();
                int i = 0;
 // Este valor modifica la cantidad de casillas a destapar.
                int iCasillasDestapadas = 35;
                empezo = true;
             
                while (i < iCasillasDestapadas) { 
                    
                    int aleatorio = random.nextInt(81);
                    JButton butTemp = (JButton) alCasillas.get(aleatorio);
                    String s1 = sB.substring(aleatorio, aleatorio + 1);

                    butTemp.setText(s1);
                    alListaNumeros[aleatorio] = s1;
                    NoTocar[aleatorio] = "1";
                    
                    i++;
                }
                entradaDestape = false;

            }
        } 
    }
 /*Aqui se manejará el boton "Comprobar". Que básicamente lo que realiza
 es comprobar la solución del sudoku implementado un método llamado SonIguales()*/
  
    public class ManejadorComprobar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton temp = (JButton) e.getSource();
            SonIguales();
            
           /* for(int i=0; i < 81; i++) {
               if(alListaNumeros[i]!=null)
                System.out.println(alListaNumeros[i]); 
            }*/
            
            if(jugarDeNuevo) {
               int op = JOptionPane.showConfirmDialog(rootPane, "Desea jugar de nuevo?", 
                        "Sudoku", JOptionPane.YES_NO_OPTION);
                if(op==0) {
                    ManejadorCasillasVacias nVentana = new ManejadorCasillasVacias();
                    nVentana.ManejadoresCasillasVacias();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Si desea volver a jugar"
                            +"\n"+ "presione el boton COMPROBAR", "Sudoku", JOptionPane.PLAIN_MESSAGE);
                }
            }

        }
    }
/*Aqui se manejará el botón "Pista". Quien se encarga de generar las pistas en
    en celdas vacias, aleatoriamente.
    */
    public class ManejadorPista implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           if(oportunidadesPist < 3 && entradaPista){
            if (contadorCicloPistas < 3 && empezo) {
                
                ArrayListPlantillas alD = new ArrayListPlantillas();
                StringBuilder sB = new StringBuilder();
                String[] sEleccion1 = new String[1];
                
              if(alt == 0) {
              sEleccion1 = alD.ArrayListPlantillas1();  
            } else if(alt == 1 ){
                sEleccion1 = alD.ArrayListPlantillas2();
            } else if(alt == 2) {
                sEleccion1 = alD.ArrayListPlantillas3();
            } else if(alt == 3) {
                sEleccion1 = alD.ArrayListPlantillas4();
            } else if(alt == 4) {
                sEleccion1 = alD.ArrayListPlantillas5();
            }
                
                for (String x : sEleccion1) {
                    sB.append(x);
                }
                
                Random random = new Random();
                
                int contadorPistas = 0;
                for(int j= 0; j<81 && contadorPistas<1; j++) {
                    
                   int np = random.nextInt(81);
                    
                    JButton butTemp = (JButton) alCasillas.get(np);
                    String s1 = sB.substring(np, np + 1);
                    
                    if(NoTocar[np]!=("1") && NoTocarPista[np]!="1") {
                        
                        butTemp.setText(s1);
                        butTemp.setForeground(Color.BLUE);
                        alListaNumeros[np] = s1;
                        NoTocar[np] = "1";
                        contadorIntentos++;
                        String sT = String.valueOf(3 - contadorIntentos);
                        JOptionPane.showMessageDialog(rootPane, "¡Pista Generada!"
                                + " Intentos Restantes: " + sT, "Sudoku",
                                JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("Pista: " + s1);
                        contadorPistas++;
                        oportunidadesPist++;
                    }
                       
                    
             }
                contadorCicloPistas++;
           
            } else {
                JOptionPane.showMessageDialog(rootPane, "Pistas deshabilitadas"
                ,"ERROR", JOptionPane.ERROR_MESSAGE);
            } 

        } else
               JOptionPane.showMessageDialog(rootPane, "Ya no tiene oportunidades");
        }  
        
    }
    
//Aqui se maneja el boton salir. Sale o se mantiene dentro del programa.
    public class ManejadorTerminar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
          int iConfirmar =   JOptionPane.showConfirmDialog(rootPane, "¿Deseas salir del juego?", 
                    "Sudoku", JOptionPane.YES_NO_OPTION);
          if(iConfirmar == 0) {
              JOptionPane.showMessageDialog(rootPane, "Es una lástima que te vayas", 
                    "Sudoku", JOptionPane.PLAIN_MESSAGE);
              System.exit(0);
          } 
        }
        }
    
/*Este método se encarga de comparar dos arreglos. Uno será el arreglo predefinido
    que en este caso funciona como "plantilla". El otro arreglo es el que almacenó
    todos los valores que colocó el usuario en las casillas vacias. También almacenó
    las casillas destapas aleatoriamente y las pistas. */
    public void SonIguales() {
        
        ArrayListPlantillas alPlantilla = new ArrayListPlantillas();
        StringBuffer cadena = new StringBuffer();
        StringBuffer cadena2 = new StringBuffer();
        String[] sEleccion1 = new String[1];
                
          
            if(alt == 0) {
              sEleccion1 = alPlantilla.ArrayListPlantillas1();  
            } else if(alt == 1 ){
                sEleccion1 = alPlantilla.ArrayListPlantillas2();
            } else if(alt == 2) {
                sEleccion1 = alPlantilla.ArrayListPlantillas3();
            } else if(alt == 3) {
                sEleccion1 = alPlantilla.ArrayListPlantillas4();
            } else if(alt == 4) {
                sEleccion1 = alPlantilla.ArrayListPlantillas5();
            }
        

        for (String x : sEleccion1) {
            cadena = cadena.append(x);
        }
        String s = cadena.toString();
        //System.out.println(s);
        for (String x : alListaNumeros) {

            cadena2 = cadena2.append(x);
        }
        String s2 = cadena2.toString();
        
        //System.out.println(s2); 

        
        if (s.equals(s2)) {
                    JOptionPane.showMessageDialog(rootPane, "Felicidades Ganador", 
                    "Sudoku", JOptionPane.INFORMATION_MESSAGE);
                    jugarDeNuevo = true;
                    entradaPista = false;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Aún hay casillas vacías o " +"\n" 
                    + "casillas con digitos erroneos",
                    "Sudoku", JOptionPane.OK_OPTION);
           
        }
        
    }
//Genera los cuadros de dialogo al inicio del programa
    final void CuadrosDeDialogo() {
        JOptionPane.showMessageDialog(rootPane, "Empecemos",
                "Sudoku", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(rootPane, "Para empezar a jugar, presiona el"
                + " boton DESTAPAR." , "Sudoku", JOptionPane.INFORMATION_MESSAGE);    
    }

    public static void main(String[] args) {
        ManejadorCasillasVacias mv = new ManejadorCasillasVacias();
        mv.ManejadoresCasillasVacias();
        mv.setVisible(true);

    }

    }


