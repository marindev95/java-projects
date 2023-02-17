
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ManejadorCasillasVacias extends Ventana {
/*Parte importante de todo el programa. Aquí están los manejadores para boton 
generado. Es decir, las 81 casillas. Se hizo de esta manera, para tener un mayor control
en cada uno de los botones(casillas). Un código algo pesado, pero bien trabajado.
 */
    public void ManejadoresCasillasVacias() {

        JButton but0 = new JButton();
        but0 = (JButton) alCasillas.get(0);

        but0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                while(alListaNumerosc[0] == null && NoTocar[0] != "1" ){
                    accion(e);
                    NoTocarPista[0] = "1";
                alListaNumeros[0] = memoria2;
                alListaNumerosc[0] = "";
                }
                alListaNumerosc[0] = null;
                
            }
        });

        JButton but1 = new JButton();
        but1 = (JButton) alCasillas.get(1);

        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[1]==null&& NoTocar[1] != "1"){
                    accion(e);
                    NoTocarPista[1] = "1";
                alListaNumeros[1] = memoria2;
                alListaNumerosc[1] = "";
                }
                alListaNumerosc[1] = null;
            }
        });

        JButton but2 = new JButton();
        but2 = (JButton) alCasillas.get(2);

        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[2]==null&& NoTocar[2] != "1"){
                    accion(e);
                    NoTocarPista[2] = "1";
                alListaNumeros[2] = memoria2;
                alListaNumerosc[2] = "";
                }
                alListaNumerosc[2] = null;
            }
        });

        JButton but3 = new JButton();
        but3 = (JButton) alCasillas.get(3);

        but3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[3]==null&& NoTocar[3] != "1"){
                    accion(e);
                    NoTocarPista[3] = "1";
                alListaNumeros[3] = memoria2;
                alListaNumerosc[3] = "";
                }
                alListaNumerosc[3] = null;
            }
        });

        JButton but4 = new JButton();
        but4 = (JButton) alCasillas.get(4);

        but4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[4]==null&& NoTocar[4] != "1"){
                    accion(e);
                    NoTocarPista[4] = "1";
                alListaNumeros[4] = memoria2;
                alListaNumerosc[4] = "";
                }
                alListaNumerosc[4] = null;
            }
        });

        JButton but5 = new JButton();
        but5 = (JButton) alCasillas.get(5);

        but5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[5]==null&& NoTocar[5] != "1"){
                    accion(e);
                    NoTocarPista[5] = "1";
                alListaNumeros[5] = memoria2;
                alListaNumerosc[5] = "";
                }
                alListaNumerosc[5] = null;
            }
        });

        JButton but6 = new JButton();
        but6 = (JButton) alCasillas.get(6);

        but6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[6]==null&& NoTocar[6] != "1"){
                    accion(e);
                    NoTocarPista[6] = "1";
                alListaNumeros[6] = memoria2;
                alListaNumerosc[6] = "";
                }
                alListaNumerosc[6] = null;
            }
        });

        JButton but7 = new JButton();
        but7 = (JButton) alCasillas.get(7);

        but7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[7]==null&& NoTocar[7] != "1"){
                    accion(e);
                    NoTocarPista[7] = "1";
                alListaNumeros[7] = memoria2;
                alListaNumerosc[7] = "";
                }
                alListaNumerosc[7] = null;
            }
        });

        JButton but8 = new JButton();
        but8 = (JButton) alCasillas.get(8);

        but8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[8]==null&& NoTocar[8] != "1"){
                    accion(e);
                    NoTocarPista[8] = "1";
                alListaNumeros[8] = memoria2;
                alListaNumerosc[8] = "";
                }
                alListaNumerosc[8] = null;
            }
        });

        JButton but9 = new JButton();
        but9 = (JButton) alCasillas.get(9);

        but9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[9]==null&& NoTocar[9] != "1"){
                    accion(e);
                    NoTocarPista[9] = "1";
                alListaNumeros[9] = memoria2;
                alListaNumerosc[9] = "";
                }
                alListaNumerosc[9] = null;
            }
        });

        JButton but10 = new JButton();
        but10 = (JButton) alCasillas.get(10);

        but10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[10]==null&& NoTocar[10] != "1"){
                    accion(e);
                    NoTocarPista[10] = "1";
                alListaNumeros[10] = memoria2;
                alListaNumerosc[10] = "";
                }
                alListaNumerosc[10] = null;
            }
        });
        JButton but11 = new JButton();
        but11 = (JButton) alCasillas.get(11);

        but11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[11]==null&& NoTocar[11] != "1"){
                    accion(e);
                    NoTocarPista[11] = "1";
                alListaNumeros[11] = memoria2;
                alListaNumerosc[11] = "";
                }
                alListaNumerosc[11] = null;
            }
        });
        JButton but12 = new JButton();
        but12 = (JButton) alCasillas.get(12);

        but12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[12]==null&& NoTocar[12] != "1"){
                    accion(e);
                    NoTocarPista[12] = "1";
                alListaNumeros[12] = memoria2;
                alListaNumerosc[12] = "";
                }
                alListaNumerosc[12] = null;
            }
        });
        JButton but13 = new JButton();
        but13 = (JButton) alCasillas.get(13);

        but13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[13]==null&& NoTocar[13] != "1"){
                    accion(e);
                    NoTocarPista[13] = "1";
                alListaNumeros[13] = memoria2;
                alListaNumerosc[13] = "";
                }
                alListaNumerosc[13] = null;
            }
        });
        JButton but14 = new JButton();
        but14 = (JButton) alCasillas.get(14);

        but14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[14]==null&& NoTocar[14] != "1"){
                    accion(e);
                    NoTocarPista[14] = "1";
                alListaNumeros[14] = memoria2;
                alListaNumerosc[14] = "";
                }
                alListaNumerosc[14] = null;
            }
        });
        JButton but15 = new JButton();
        but15 = (JButton) alCasillas.get(15);

        but15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[15]==null&& NoTocar[15] != "1"){
                    accion(e);
                    NoTocarPista[15] = "1";
                alListaNumeros[15] = memoria2;
                alListaNumerosc[15] = "";
                }
                alListaNumerosc[15] = null;
            }
        });
        JButton but16 = new JButton();
        but16 = (JButton) alCasillas.get(16);

        but16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[16]==null&& NoTocar[16] != "1"){
                    accion(e);
                    NoTocarPista[16] = "1";
                alListaNumeros[16] = memoria2;
                alListaNumerosc[16] = "";
                }
                alListaNumerosc[16] = null;
            }
        });
        JButton but17 = new JButton();
        but17 = (JButton) alCasillas.get(17);

        but17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[17]==null&& NoTocar[17] != "1"){
                    accion(e);
                    NoTocarPista[17] = "1";
                alListaNumeros[17] = memoria2;
                alListaNumerosc[17] = "";
                }
                alListaNumerosc[17] = null;
            }
        });
        JButton but18 = new JButton();
        but18 = (JButton) alCasillas.get(18);

        but18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[18]==null&& NoTocar[18] != "1"){
                    accion(e);
                    NoTocarPista[18] = "1";
                alListaNumeros[18] = memoria2;
                alListaNumerosc[18] = "";
                }
                alListaNumerosc[18] = null;
            }
        });
        JButton but19 = new JButton();
        but19 = (JButton) alCasillas.get(19);

        but19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[19]==null&& NoTocar[19] != "1"){
                    accion(e);
                    NoTocarPista[19] = "1";
                alListaNumeros[19] = memoria2;
                alListaNumerosc[19] = "";
                }
                alListaNumerosc[19] = null;
            }
        });
        JButton but20 = new JButton();
        but20 = (JButton) alCasillas.get(20);

        but20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[20]==null&& NoTocar[20] != "1"){
                    accion(e);
                    NoTocarPista[20] = "1";
                alListaNumeros[20] = memoria2;
                alListaNumerosc[20] = "";
                }
                alListaNumerosc[20] = null;
            }
        });
        JButton but21 = new JButton();
        but21 = (JButton) alCasillas.get(21);

        but21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[21]==null&& NoTocar[21] != "1"){
                    accion(e);
                    NoTocarPista[21] = "1";
                alListaNumeros[21] = memoria2;
                alListaNumerosc[21] = "";
                }
                alListaNumerosc[21] = null;
            }
        });
        JButton but22 = new JButton();
        but22 = (JButton) alCasillas.get(22);

        but22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[22]==null&& NoTocar[22] != "1"){
                    accion(e);
                    NoTocarPista[22] = "1";
                alListaNumeros[22] = memoria2;
                alListaNumerosc[22] = "";
                }
                alListaNumerosc[22] = null;
            }
        });
        JButton but23 = new JButton();
        but23 = (JButton) alCasillas.get(23);

        but23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[23]==null&& NoTocar[23] != "1"){
                    accion(e);
                    NoTocarPista[23] = "1";
                alListaNumeros[23] = memoria2;
                alListaNumerosc[23] = "";
                }
                alListaNumerosc[23] = null;
            }
        });
        JButton but24 = new JButton();
        but24 = (JButton) alCasillas.get(24);

        but24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[24]==null&& NoTocar[24] != "1"){
                    accion(e);
                    NoTocarPista[24] = "1";
                alListaNumeros[24] = memoria2;
                alListaNumerosc[24] = "";
                }
                alListaNumerosc[24] = null;
            }
        });
        JButton but25 = new JButton();
        but25 = (JButton) alCasillas.get(25);

        but25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[25]==null&& NoTocar[25] != "1"){
                    accion(e);
                    NoTocarPista[25] = "1";
                alListaNumeros[25] = memoria2;
                alListaNumerosc[25] = "";
                }
                alListaNumerosc[25] = null;
            }
        });
        JButton but26 = new JButton();
        but26 = (JButton) alCasillas.get(26);

        but26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[26]==null&& NoTocar[26] != "1"){
                    accion(e);
                    NoTocarPista[26] = "1";
                alListaNumeros[26] = memoria2;
                alListaNumerosc[26] = "";
                }
                alListaNumerosc[26] = null;
            }
        });
        JButton but27 = new JButton();
        but27 = (JButton) alCasillas.get(27);

        but27.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[27]==null&& NoTocar[27] != "1"){
                    accion(e);
                    NoTocarPista[27] = "1";
                alListaNumeros[27] = memoria2;
                alListaNumerosc[27] = "";
                }
                alListaNumerosc[27] = null;
            }
        });
        JButton but28 = new JButton();
        but28 = (JButton) alCasillas.get(28);

        but28.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[28]==null&& NoTocar[28] != "1"){
                    accion(e);
                    NoTocarPista[28] = "1";
                alListaNumeros[28] = memoria2;
                alListaNumerosc[28] = "";
                }
                alListaNumerosc[28] = null;
            }
        });
        JButton but29 = new JButton();
        but29 = (JButton) alCasillas.get(29);

        but29.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[29]==null&& NoTocar[29] != "1"){
                    accion(e);
                    NoTocarPista[29] = "1";
                alListaNumeros[29] = memoria2;
                alListaNumerosc[29] = "";
                }
                alListaNumerosc[29] = null;
            }
        });
        JButton but30 = new JButton();
        but30 = (JButton) alCasillas.get(30);

        but30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[30]==null&& NoTocar[30] != "1"){
                    accion(e);
                    NoTocarPista[30] = "1";
                alListaNumeros[30] = memoria2;
                alListaNumerosc[30] = "";
                }
                alListaNumerosc[30] = null;
            }
        });
        JButton but31 = new JButton();
        but31 = (JButton) alCasillas.get(31);

        but31.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[31]==null&& NoTocar[31] != "1"){
                    accion(e);
                    NoTocarPista[31] = "1";
                alListaNumeros[31] = memoria2;
                alListaNumerosc[31] = "";
                }
                alListaNumerosc[31] = null;
            }
        });
        JButton but32 = new JButton();
        but32 = (JButton) alCasillas.get(32);

        but32.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[32]==null&& NoTocar[32] != "1"){
                    accion(e);
                    NoTocarPista[32] = "1";
                alListaNumeros[32] = memoria2;
                alListaNumerosc[32] = "";
                }
                alListaNumerosc[32] = null;
            }
        });
        JButton but33 = new JButton();
        but33 = (JButton) alCasillas.get(33);

        but33.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[33]==null&& NoTocar[33] != "1"){
                    accion(e);
                    NoTocarPista[33] = "1";
                alListaNumeros[33] = memoria2;
                alListaNumerosc[33] = "";
                }
                alListaNumerosc[33] = null;
            }
        });
        JButton but34 = new JButton();
        but34 = (JButton) alCasillas.get(34);

        but34.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[34]==null&& NoTocar[34] != "1"){
                    accion(e);
                    NoTocarPista[34] = "1";
                alListaNumeros[34] = memoria2;
                alListaNumerosc[34] = "";
                }
                alListaNumerosc[34] = null;
            }
        });
        JButton but35 = new JButton();
        but35 = (JButton) alCasillas.get(35);

        but35.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[35]==null&& NoTocar[35] != "1"){
                    accion(e);
                    NoTocarPista[35] = "1";
                alListaNumeros[35] = memoria2;
                alListaNumerosc[35] = "";
                }
                alListaNumerosc[35] = null;
            }
        });
        JButton but36 = new JButton();
        but36 = (JButton) alCasillas.get(36);

        but36.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[36]==null&& NoTocar[36] != "1"){
                    accion(e);
                    NoTocarPista[36] = "1";
                alListaNumeros[36] = memoria2;
                alListaNumerosc[36] = "";
                }
                alListaNumerosc[36] = null;
            }
        });
        JButton but37 = new JButton();
        but37 = (JButton) alCasillas.get(37);

        but37.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[37]==null&& NoTocar[37] != "1"){
                    accion(e);
                    NoTocarPista[37] = "1";
                alListaNumeros[37] = memoria2;
                alListaNumerosc[37] = "";
                }
                alListaNumerosc[37] = null;
            }
        });
        JButton but38 = new JButton();
        but38 = (JButton) alCasillas.get(38);

        but38.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[38]==null&& NoTocar[38] != "1"){
                    accion(e);
                    NoTocarPista[38] = "1";
                alListaNumeros[38] = memoria2;
                alListaNumerosc[38] = "";
                }
                alListaNumerosc[38] = null;
            }
        });
        JButton but39 = new JButton();
        but39 = (JButton) alCasillas.get(39);

        but39.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[39]==null&& NoTocar[39] != "1"){
                    accion(e);
                    NoTocarPista[39] = "1";
                alListaNumeros[39] = memoria2;
                alListaNumerosc[39] = "";
                }
                alListaNumerosc[39] = null;
            }
        });
        JButton but40 = new JButton();
        but40 = (JButton) alCasillas.get(40);

        but40.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[40]==null&& NoTocar[40] != "1"){
                    accion(e);
                    NoTocarPista[40] = "1";
                alListaNumeros[40] = memoria2;
                alListaNumerosc[40] = "";
                }
                alListaNumerosc[40] = null;
            }
        });
        JButton but41 = new JButton();
        but41 = (JButton) alCasillas.get(41);

        but41.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[41]==null&& NoTocar[41] != "1"){
                    accion(e);
                    NoTocarPista[41] = "1";
                alListaNumeros[41] = memoria2;
                alListaNumerosc[41] = "";
                }
                alListaNumerosc[41] = null;
            }
        });
        JButton but42 = new JButton();
        but42 = (JButton) alCasillas.get(42);

        but42.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[42]==null&& NoTocar[42] != "1"){
                    accion(e);
                    NoTocarPista[42] = "1";
                alListaNumeros[42] = memoria2;
                alListaNumerosc[42] = "";
                }
                alListaNumerosc[42] = null;
            }
        });
        JButton but43 = new JButton();
        but43 = (JButton) alCasillas.get(43);

        but43.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[43]==null&& NoTocar[43] != "1"){
                    accion(e);
                    NoTocarPista[43] = "1";
                alListaNumeros[43] = memoria2;
                alListaNumerosc[43] = "";
                }
                alListaNumerosc[43] = null;
            }
        });
        JButton but44 = new JButton();
        but44 = (JButton) alCasillas.get(44);

        but44.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[44]==null&& NoTocar[44] != "1"){
                    accion(e);
                    NoTocarPista[44] = "1";
                alListaNumeros[44] = memoria2;
                alListaNumerosc[44] = "";
                }
                alListaNumerosc[44] = null;
            }
        });
        JButton but45 = new JButton();
        but45 = (JButton) alCasillas.get(45);

        but45.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[45]==null&& NoTocar[45] != "1"){
                    accion(e);
                    NoTocarPista[45] = "1";
                alListaNumeros[45] = memoria2;
                alListaNumerosc[45] = "";
                }
                alListaNumerosc[45] = null;
            }
        });
        JButton but46 = new JButton();
        but46 = (JButton) alCasillas.get(46);

        but46.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[46]==null&& NoTocar[46] != "1"){
                    accion(e);
                    NoTocarPista[46] = "1";
                alListaNumeros[46] = memoria2;
                alListaNumerosc[46] = "";
                }
                alListaNumerosc[46] = null;
            }
        });
        JButton but47 = new JButton();
        but47 = (JButton) alCasillas.get(47);

        but47.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[47]==null&& NoTocar[47] != "1"){
                    accion(e);
                    NoTocarPista[47] = "1";
                alListaNumeros[47] = memoria2;
                alListaNumerosc[47] = "";
                }
                alListaNumerosc[47] = null;
            }
        });
        JButton but48 = new JButton();
        but48 = (JButton) alCasillas.get(48);

        but48.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[48]==null&& NoTocar[48] != "1"){
                    accion(e);
                    NoTocarPista[48] = "1";
                alListaNumeros[48] = memoria2;
                alListaNumerosc[48] = "";
                }
                alListaNumerosc[48] = null;
            }
        });
        JButton but49 = new JButton();
        but49 = (JButton) alCasillas.get(49);

        but49.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[49]==null&& NoTocar[49] != "1"){
                    accion(e);
                    NoTocarPista[49] = "1";
                alListaNumeros[49] = memoria2;
                alListaNumerosc[49] = "";
                }
                alListaNumerosc[49] = null;
            }
        });
        JButton but50 = new JButton();
        but50 = (JButton) alCasillas.get(50);

        but50.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[50]==null&& NoTocar[50] != "1"){
                    accion(e);
                    NoTocarPista[50] = "1";
                alListaNumeros[50] = memoria2;
                alListaNumerosc[50] = "";
                }
                alListaNumerosc[50] = null;
            }
        });
        JButton but51 = new JButton();
        but51 = (JButton) alCasillas.get(51);

        but51.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[51]==null&& NoTocar[51] != "1"){
                    accion(e);
                    NoTocarPista[51] = "1";
                alListaNumeros[51] = memoria2;
                alListaNumerosc[51] = "";
                }
                alListaNumerosc[51] = null;
            }
        });
        JButton but52 = new JButton();
        but52 = (JButton) alCasillas.get(52);

        but52.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[52]==null&& NoTocar[52] != "1"){
                    accion(e);
                    NoTocarPista[52] = "1";
                alListaNumeros[52] = memoria2;
                alListaNumerosc[52] = "";
                }
                alListaNumerosc[52] = null;
            }
        });
        JButton but53 = new JButton();
        but53 = (JButton) alCasillas.get(53);

        but53.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[53]==null&& NoTocar[53] != "1"){
                    accion(e);
                    NoTocarPista[53] = "1";
                alListaNumeros[53] = memoria2;
                alListaNumerosc[53] = "";
                }
                alListaNumerosc[53] = null;
            }
        });
        JButton but54 = new JButton();
        but54 = (JButton) alCasillas.get(54);

        but54.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[54]==null&& NoTocar[54] != "1"){
                    accion(e);
                    NoTocarPista[54] = "1";
                alListaNumeros[54] = memoria2;
                alListaNumerosc[54] = "";
                }
                alListaNumerosc[54] = null;
            }
        });
        JButton but55 = new JButton();
        but55 = (JButton) alCasillas.get(55);

        but55.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[55]==null&& NoTocar[55] != "1"){
                    accion(e);
                    NoTocarPista[55] = "1";
                alListaNumeros[55] = memoria2;
                alListaNumerosc[55] = "";
                }
                alListaNumerosc[55] = null;
            }
        });
        JButton but56 = new JButton();
        but56 = (JButton) alCasillas.get(56);

        but56.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[56]==null&& NoTocar[56] != "1"){
                    accion(e);
                    NoTocarPista[56] = "1";
                alListaNumeros[56] = memoria2;
                alListaNumerosc[56] = "";
                }
                alListaNumerosc[56] = null;
            }
        });
        JButton but57 = new JButton();
        but57 = (JButton) alCasillas.get(57);

        but57.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[57]==null&& NoTocar[57] != "1"){
                    accion(e);
                    NoTocarPista[57] = "1";
                alListaNumeros[57] = memoria2;
                alListaNumerosc[57] = "";
                }
                alListaNumerosc[57] = null;
            }
        });
        JButton but58 = new JButton();
        but58 = (JButton) alCasillas.get(58);

        but58.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[58]==null&& NoTocar[58] != "1"){
                    accion(e);
                    NoTocarPista[58] = "1";
                alListaNumeros[58] = memoria2;
                alListaNumerosc[58] = "";
                }
                alListaNumerosc[58] = null;
            }
        });
        JButton but59 = new JButton();
        but59 = (JButton) alCasillas.get(59);

        but59.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[59]==null&& NoTocar[59] != "1"){
                    accion(e);
                    NoTocarPista[59] = "1";
                alListaNumeros[59] = memoria2;
                alListaNumerosc[59] = "";
                }
                alListaNumerosc[59] = null;
            }
        });
        JButton but60 = new JButton();
        but60 = (JButton) alCasillas.get(60);

        but60.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[60]==null&& NoTocar[60] != "1"){
                    accion(e);
                    NoTocarPista[60] = "1";
                alListaNumeros[60] = memoria2;
                alListaNumerosc[60] = "";
                }
                alListaNumerosc[60] = null;
            }
        });
        JButton but61 = new JButton();
        but61 = (JButton) alCasillas.get(61);

        but61.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[61]==null&& NoTocar[61] != "1"){
                    accion(e);
                    NoTocarPista[61] = "1";
                alListaNumeros[61] = memoria2;
                alListaNumerosc[61] = "";
                }
                alListaNumerosc[61] = null;
            }
        });
        JButton but62 = new JButton();
        but62 = (JButton) alCasillas.get(62);

        but62.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[62]==null&& NoTocar[62] != "1"){
                    accion(e);
                    NoTocarPista[62] = "1";
                alListaNumeros[62] = memoria2;
                alListaNumerosc[62] = "";
                }
                alListaNumerosc[62] = null;
            }
        });
        JButton but63 = new JButton();
        but63 = (JButton) alCasillas.get(63);

        but63.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[63]==null&& NoTocar[63] != "1"){
                    accion(e);
                    NoTocarPista[63] = "1";
                alListaNumeros[63] = memoria2;
                alListaNumerosc[63] = "";
                }
                alListaNumerosc[63] = null;
            }
        });
        JButton but64 = new JButton();
        but64 = (JButton) alCasillas.get(64);

        but64.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[64]==null&& NoTocar[64] != "1"){
                    accion(e);
                    NoTocarPista[64] = "1";
                alListaNumeros[64] = memoria2;
                alListaNumerosc[64] = "";
                }
                alListaNumerosc[64] = null;
            }
        });
        JButton but65 = new JButton();
        but65 = (JButton) alCasillas.get(65);

        but65.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[65]==null&& NoTocar[65] != "1"){
                    accion(e);
                    NoTocarPista[65] = "1";
                alListaNumeros[65] = memoria2;
                alListaNumerosc[65] = "";
                }
                alListaNumerosc[65] = null;
            }
        });
        JButton but66 = new JButton();
        but66 = (JButton) alCasillas.get(66);

        but66.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[66]==null&& NoTocar[66] != "1"){
                    accion(e);
                    NoTocarPista[66] = "1";
                alListaNumeros[66] = memoria2;
                alListaNumerosc[66] = "";
                }
                alListaNumerosc[66] = null;
            }
        });
        JButton but67 = new JButton();
        but67 = (JButton) alCasillas.get(67);

        but67.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[67]==null&& NoTocar[67] != "1"){
                    accion(e);
                    NoTocarPista[67] = "1";
                alListaNumeros[67] = memoria2;
                alListaNumerosc[67] = "";
                }
                alListaNumerosc[67] = null;
            }
        });
        JButton but68 = new JButton();
        but68 = (JButton) alCasillas.get(68);

        but68.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[68]==null&& NoTocar[68] != "1"){
                    accion(e);
                    NoTocarPista[68] = "1";
                alListaNumeros[68] = memoria2;
                alListaNumerosc[68] = "";
                }
                alListaNumerosc[68] = null;
            }
        });
        JButton but69 = new JButton();
        but69 = (JButton) alCasillas.get(69);

        but69.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[69]==null&& NoTocar[69] != "1"){
                    accion(e);
                    NoTocarPista[69] = "1";
                alListaNumeros[69] = memoria2;
                alListaNumerosc[69] = "";
                }
                alListaNumerosc[69] = null;
            }
        });
        JButton but70 = new JButton();
        but70 = (JButton) alCasillas.get(70);

        but70.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[70]==null&& NoTocar[70] != "1"){
                    accion(e);
                    NoTocarPista[70] = "1";
                alListaNumeros[70] = memoria2;
                alListaNumerosc[70] = "";
                }
                alListaNumerosc[70] = null;
            }
        });
        JButton but71 = new JButton();
        but71 = (JButton) alCasillas.get(71);

        but71.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[71]==null&& NoTocar[71] != "1"){
                    accion(e);
                    NoTocarPista[71] = "1";
                alListaNumeros[71] = memoria2;
                alListaNumerosc[71] = "";
                }
                alListaNumerosc[71] = null;
            }
        });
        JButton but72 = new JButton();
        but72 = (JButton) alCasillas.get(72);

        but72.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[72]==null&& NoTocar[72] != "1"){
                    accion(e);
                    NoTocarPista[72] = "1";
                alListaNumeros[72] = memoria2;
                alListaNumerosc[72] = "";
                }
                alListaNumerosc[72] = null;
            }
        });
        JButton but73 = new JButton();
        but73 = (JButton) alCasillas.get(73);

        but73.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[73]==null&& NoTocar[73] != "1"){
                    accion(e);
                    NoTocarPista[73] = "1";
                alListaNumeros[73] = memoria2;
                alListaNumerosc[73] = "";
                }
                alListaNumerosc[73] = null;
            }
        });
        JButton but74 = new JButton();
        but74 = (JButton) alCasillas.get(74);

        but74.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[74]==null&& NoTocar[74] != "1"){
                    accion(e);
                    NoTocarPista[74] = "1";
                alListaNumeros[74] = memoria2;
                alListaNumerosc[74] = "";
                }
                alListaNumerosc[74] = null;
            }
        });
        JButton but75 = new JButton();
        but75 = (JButton) alCasillas.get(75);

        but75.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[75]==null&& NoTocar[75] != "1"){
                    accion(e);
                    NoTocarPista[75] = "1";
                alListaNumeros[75] = memoria2;
                alListaNumerosc[75] = "";
                }
                alListaNumerosc[75] = null;
            }
        });
        JButton but76 = new JButton();
        but76 = (JButton) alCasillas.get(76);

        but76.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[76]==null&& NoTocar[76] != "1"){
                    accion(e);
                    NoTocarPista[76] = "1";
                alListaNumeros[76] = memoria2;
                alListaNumerosc[76] = "";
                }
                alListaNumerosc[76] = null;
            }
        });
        JButton but77 = new JButton();
        but77 = (JButton) alCasillas.get(77);

        but77.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[77]==null&& NoTocar[77] != "1"){
                    accion(e);
                    NoTocarPista[77] = "1";
                alListaNumeros[77] = memoria2;
                alListaNumerosc[77] = "";
                }
                alListaNumerosc[77] = null;
            }
        });
        JButton but78 = new JButton();
        but78 = (JButton) alCasillas.get(78);

        but78.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[78]==null&& NoTocar[78] != "1"){
                    accion(e);
                    NoTocarPista[78] = "1";
                alListaNumeros[78] = memoria2;
                alListaNumerosc[78] = "";
                }
                alListaNumerosc[78] = null;
            }
        });
        JButton but79 = new JButton();
        but79 = (JButton) alCasillas.get(79);

        but79.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[79]==null&& NoTocar[79] != "1"){
                    accion(e);
                    NoTocarPista[79] = "1";
                alListaNumeros[79] = memoria2;
                alListaNumerosc[79] = "";
                }
                alListaNumerosc[79] = null;
            }
        });
        JButton but80 = new JButton();
        but80 = (JButton) alCasillas.get(80);

        but80.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(alListaNumerosc[80]== null&& NoTocar[80] != "1"){
                    accion(e);
                    NoTocarPista[80] = "1";
                alListaNumeros[80] = memoria2;
                alListaNumerosc[80] = "";
                }
                alListaNumerosc[80] = null;
                System.out.println(alListaNumerosc[80]);
            }
        });
        

    }
//este método es el encargo de realizar la acción de "Escritura en la casilla vacia".
    public void accion(ActionEvent e) {
        JButton temp = (JButton) e.getSource();
        memoria2 = memoria1;
        if(empezo) {
        temp.setText(memoria2);
        temp.setForeground(Color.RED);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Primero debe presionar"
                    + " boton DESTAPAR"
                    , "ERROR", JOptionPane.ERROR_MESSAGE);
        }
       
        
    }
}
