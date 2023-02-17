
import java.util.ArrayList;

/* Estos son los 5 arreglos predefinidos, que sirvan como plantillas.
Y su funcion es, contener los valores de cada "botón". De aquí se toman los valores
que serán agregados a las casillas vacias. Tanto en el destape, como en la generación
de pistas. Y su principal función es la de ser el "arreglo a comparar".
Si el arreglo que almacenó los "datos" del jugador contiene los mismos valores
del arreglo que se eligió(de manera aleatoria), entonces la solución del sudoku
es válida. */
public class ArrayListPlantillas {
    
    
    public String[] ArrayListPlantillas1() {
        String[] alPredt1 = new String[81];
        alPredt1[0] = "8"; alPredt1[3] = "2"; alPredt1[6] = "9";
        alPredt1[1] = "3"; alPredt1[4] = "5"; alPredt1[7] = "1";
        alPredt1[2] = "7"; alPredt1[5] = "4"; alPredt1[8] = "6";
        
        alPredt1[9] = "9"; alPredt1[12] = "6"; alPredt1[15] = "3";
        alPredt1[10] = "2"; alPredt1[13] = "7"; alPredt1[16] = "5";
        alPredt1[11] = "1"; alPredt1[14] = "8"; alPredt1[17] = "4";
        
        alPredt1[18] = "5"; alPredt1[21] = "9"; alPredt1[24] = "2";
        alPredt1[19] = "4"; alPredt1[22] = "3"; alPredt1[25] = "8";
        alPredt1[20] = "6"; alPredt1[23] = "1"; alPredt1[26] = "7";
        
        alPredt1[27] = "5"; alPredt1[30] = "6"; alPredt1[33] = "3";
        alPredt1[28] = "9"; alPredt1[31] = "7"; alPredt1[34] = "4";
        alPredt1[29] = "8"; alPredt1[32] = "2"; alPredt1[35] = "1";
        
        alPredt1[36] = "2"; alPredt1[39] = "1"; alPredt1[42] = "7";
        alPredt1[37] = "4"; alPredt1[40] = "8"; alPredt1[43] = "9";
        alPredt1[38] = "6"; alPredt1[41] = "3"; alPredt1[44] = "5";
        
        alPredt1[45] = "7"; alPredt1[48] = "4"; alPredt1[51] = "8";
        alPredt1[46] = "1"; alPredt1[49] = "5"; alPredt1[52] = "6";
        alPredt1[47] = "3"; alPredt1[50] = "9"; alPredt1[53] = "2";
        
        alPredt1[54] = "7"; alPredt1[57] = "1"; alPredt1[60] = "4";
        alPredt1[55] = "8"; alPredt1[58] = "2"; alPredt1[61] = "6";
        alPredt1[56] = "3"; alPredt1[59] = "5"; alPredt1[62] = "9";
        
        alPredt1[63] = "5"; alPredt1[66] = "4"; alPredt1[69] = "8";
        alPredt1[64] = "1"; alPredt1[67] = "6"; alPredt1[70] = "3";
        alPredt1[65] = "2"; alPredt1[68] = "9"; alPredt1[71] = "7";
        
        alPredt1[72] = "6"; alPredt1[75] = "3"; alPredt1[78] = "1";
        alPredt1[73] = "9"; alPredt1[76] = "7"; alPredt1[79] = "2";
        alPredt1[74] = "4"; alPredt1[77] = "8"; alPredt1[80] = "5";
        
        
        
        return alPredt1;
        
    }
    
    public String[] ArrayListPlantillas2() {
        String[] alPredt2 = new String[81];
        alPredt2[0] = "2"; alPredt2[3] = "3"; alPredt2[6] = "6";
        alPredt2[1] = "8"; alPredt2[4] = "7"; alPredt2[7] = "9";
        alPredt2[2] = "1"; alPredt2[5] = "4"; alPredt2[8] = "5";
        
        alPredt2[9] = "4"; alPredt2[12] = "9"; alPredt2[15] = "1";
        alPredt2[10] = "3"; alPredt2[13] = "5"; alPredt2[16] = "7";
        alPredt2[11] = "6"; alPredt2[14] = "8"; alPredt2[17] = "2";
        
        alPredt2[18] = "5"; alPredt2[21] = "2"; alPredt2[24] = "8";
        alPredt2[19] = "9"; alPredt2[22] = "1"; alPredt2[25] = "3";
        alPredt2[20] = "7"; alPredt2[23] = "6"; alPredt2[26] = "4";
        
        alPredt2[27] = "1"; alPredt2[30] = "9"; alPredt2[33] = "8";
        alPredt2[28] = "2"; alPredt2[31] = "4"; alPredt2[34] = "5";
        alPredt2[29] = "6"; alPredt2[32] = "7"; alPredt2[35] = "3";
        
        alPredt2[36] = "8"; alPredt2[39] = "5"; alPredt2[42] = "7";
        alPredt2[37] = "9"; alPredt2[40] = "6"; alPredt2[43] = "2";
        alPredt2[38] = "3"; alPredt2[41] = "1"; alPredt2[44] = "4";
        
        alPredt2[45] = "7"; alPredt2[48] = "3"; alPredt2[51] = "9";
        alPredt2[46] = "4"; alPredt2[49] = "8"; alPredt2[52] = "6";
        alPredt2[47] = "5"; alPredt2[50] = "2"; alPredt2[53] = "1";
        
        alPredt2[54] = "4"; alPredt2[57] = "5"; alPredt2[60] = "7";
        alPredt2[55] = "6"; alPredt2[58] = "3"; alPredt2[61] = "1";
        alPredt2[56] = "2"; alPredt2[59] = "9"; alPredt2[62] = "8";
        
        alPredt2[63] = "3"; alPredt2[66] = "6"; alPredt2[69] = "2";
        alPredt2[64] = "8"; alPredt2[67] = "1"; alPredt2[70] = "4";
        alPredt2[65] = "5"; alPredt2[68] = "7"; alPredt2[71] = "9";
        
        alPredt2[72] = "1"; alPredt2[75] = "4"; alPredt2[78] = "6";
        alPredt2[73] = "7"; alPredt2[76] = "2"; alPredt2[79] = "5";
        alPredt2[74] = "9"; alPredt2[77] = "8"; alPredt2[80] = "3";
        
        
        
        return alPredt2;
        
    }
    
    public String[] ArrayListPlantillas3() {
        String[] alPredt3 = new String[81];
        alPredt3[0] = "9"; alPredt3[3] = "8"; alPredt3[6] = "4";
        alPredt3[1] = "1"; alPredt3[4] = "5"; alPredt3[7] = "2";
        alPredt3[2] = "6"; alPredt3[5] = "3"; alPredt3[8] = "7";
        
        alPredt3[9] = "2"; alPredt3[12] = "9"; alPredt3[15] = "8";
        alPredt3[10] = "7"; alPredt3[13] = "1"; alPredt3[16] = "3";
        alPredt3[11] = "4"; alPredt3[14] = "6"; alPredt3[17] = "5";
        
        alPredt3[18] = "5"; alPredt3[21] = "7"; alPredt3[24] = "1";
        alPredt3[19] = "3"; alPredt3[22] = "4"; alPredt3[25] = "6";
        alPredt3[20] = "8"; alPredt3[23] = "2"; alPredt3[26] = "9";
        
        alPredt3[27] = "2"; alPredt3[30] = "6"; alPredt3[33] = "3";
        alPredt3[28] = "4"; alPredt3[31] = "7"; alPredt3[34] = "8";
        alPredt3[29] = "9"; alPredt3[32] = "1"; alPredt3[35] = "9";
        
        alPredt3[36] = "6"; alPredt3[39] = "3"; alPredt3[42] = "1";
        alPredt3[37] = "5"; alPredt3[40] = "2"; alPredt3[43] = "4";
        alPredt3[38] = "7"; alPredt3[41] = "8"; alPredt3[44] = "9";
        
        alPredt3[45] = "8"; alPredt3[48] = "9"; alPredt3[51] = "6";
        alPredt3[46] = "1"; alPredt3[49] = "5"; alPredt3[52] = "2";
        alPredt3[47] = "3"; alPredt3[50] = "4"; alPredt3[53] = "7";
        
        alPredt3[54] = "1"; alPredt3[57] = "7"; alPredt3[60] = "5";
        alPredt3[55] = "9"; alPredt3[58] = "3"; alPredt3[61] = "6";
        alPredt3[56] = "2"; alPredt3[59] = "8"; alPredt3[62] = "4";
        
        alPredt3[63] = "5"; alPredt3[66] = "4"; alPredt3[69] = "7";
        alPredt3[64] = "8"; alPredt3[67] = "6"; alPredt3[70] = "9";
        alPredt3[65] = "3"; alPredt3[68] = "1"; alPredt3[71] = "2";
        
        alPredt3[72] = "4"; alPredt3[75] = "2"; alPredt3[78] = "3";
        alPredt3[73] = "7"; alPredt3[76] = "9"; alPredt3[79] = "8";
        alPredt3[74] = "6"; alPredt3[77] = "5"; alPredt3[80] = "1";
        
        
        
        return alPredt3;
        
    }
    
    public String[] ArrayListPlantillas4() {
        String[] alPredt4 = new String[81];
        alPredt4[0] = "9"; alPredt4[3] = "3"; alPredt4[6] = "6";
        alPredt4[1] = "1"; alPredt4[4] = "8"; alPredt4[7] = "7";
        alPredt4[2] = "4"; alPredt4[5] = "5"; alPredt4[8] = "2";
        
        alPredt4[9] = "6"; alPredt4[12] = "4"; alPredt4[15] = "3";
        alPredt4[10] = "2"; alPredt4[13] = "1"; alPredt4[16] = "9";
        alPredt4[11] = "8"; alPredt4[14] = "7"; alPredt4[17] = "5";
        
        alPredt4[18] = "5"; alPredt4[21] = "9"; alPredt4[24] = "4";
        alPredt4[19] = "7"; alPredt4[22] = "6"; alPredt4[25] = "1";
        alPredt4[20] = "3"; alPredt4[23] = "2"; alPredt4[26] = "8";
        
        alPredt4[27] = "1"; alPredt4[30] = "4"; alPredt4[33] = "8";
        alPredt4[28] = "2"; alPredt4[31] = "3"; alPredt4[34] = "5";
        alPredt4[29] = "6"; alPredt4[32] = "9"; alPredt4[35] = "7";
        
        alPredt4[36] = "8"; alPredt4[39] = "2"; alPredt4[42] = "1";
        alPredt4[37] = "7"; alPredt4[40] = "5"; alPredt4[43] = "3";
        alPredt4[38] = "4"; alPredt4[41] = "6"; alPredt4[44] = "9";
        
        alPredt4[45] = "3"; alPredt4[48] = "1"; alPredt4[51] = "6";
        alPredt4[46] = "9"; alPredt4[49] = "8"; alPredt4[52] = "2";
        alPredt4[47] = "5"; alPredt4[50] = "7"; alPredt4[53] = "4";
        
        alPredt4[54] = "5"; alPredt4[57] = "7"; alPredt4[60] = "2";
        alPredt4[55] = "9"; alPredt4[58] = "6"; alPredt4[61] = "4";
        alPredt4[56] = "3"; alPredt4[59] = "1"; alPredt4[62] = "8";
        
        alPredt4[63] = "7"; alPredt4[66] = "5"; alPredt4[69] = "9";
        alPredt4[64] = "8"; alPredt4[67] = "4"; alPredt4[70] = "6";
        alPredt4[65] = "1"; alPredt4[68] = "2"; alPredt4[71] = "3";
        
        alPredt4[72] = "2"; alPredt4[75] = "8"; alPredt4[78] = "7";
        alPredt4[73] = "4"; alPredt4[76] = "3"; alPredt4[79] = "5";
        alPredt4[74] = "6"; alPredt4[77] = "9"; alPredt4[80] = "1";
        
        
        
        return alPredt4;
        
    }
    
    public String[] ArrayListPlantillas5() {
        String[] alPredt5 = new String[81];
        alPredt5[0] = "1"; alPredt5[3] = "7"; alPredt5[6] = "9";
        alPredt5[1] = "4"; alPredt5[4] = "6"; alPredt5[7] = "2";
        alPredt5[2] = "5"; alPredt5[5] = "8"; alPredt5[8] = "3";
        
        alPredt5[9] = "3"; alPredt5[12] = "4"; alPredt5[15] = "7";
        alPredt5[10] = "2"; alPredt5[13] = "9"; alPredt5[16] = "5";
        alPredt5[11] = "8"; alPredt5[14] = "1"; alPredt5[17] = "6";
        
        alPredt5[18] = "7"; alPredt5[21] = "2"; alPredt5[24] = "4";
        alPredt5[19] = "6"; alPredt5[22] = "5"; alPredt5[25] = "8";
        alPredt5[20] = "9"; alPredt5[23] = "3"; alPredt5[26] = "1";
        
        alPredt5[27] = "4"; alPredt5[30] = "8"; alPredt5[33] = "5";
        alPredt5[28] = "7"; alPredt5[31] = "3"; alPredt5[34] = "1";
        alPredt5[29] = "6"; alPredt5[32] = "9"; alPredt5[35] = "2";
        
        alPredt5[36] = "2"; alPredt5[39] = "5"; alPredt5[42] = "9";
        alPredt5[37] = "8"; alPredt5[40] = "1"; alPredt5[43] = "6";
        alPredt5[38] = "3"; alPredt5[41] = "4"; alPredt5[44] = "7";
        
        alPredt5[45] = "1"; alPredt5[48] = "6"; alPredt5[51] = "8";
        alPredt5[46] = "9"; alPredt5[49] = "2"; alPredt5[52] = "3";
        alPredt5[47] = "5"; alPredt5[50] = "7"; alPredt5[53] = "4";
        
        alPredt5[54] = "3"; alPredt5[57] = "2"; alPredt5[60] = "6";
        alPredt5[55] = "9"; alPredt5[58] = "8"; alPredt5[61] = "5";
        alPredt5[56] = "7"; alPredt5[59] = "4"; alPredt5[62] = "1";
        
        alPredt5[63] = "6"; alPredt5[66] = "1"; alPredt5[69] = "8";
        alPredt5[64] = "4"; alPredt5[67] = "3"; alPredt5[70] = "7";
        alPredt5[65] = "2"; alPredt5[68] = "5"; alPredt5[71] = "9";
        
        alPredt5[72] = "5"; alPredt5[75] = "9"; alPredt5[78] = "3";
        alPredt5[73] = "1"; alPredt5[76] = "7"; alPredt5[79] = "4";
        alPredt5[74] = "8"; alPredt5[77] = "6"; alPredt5[80] = "2";
        
        
        
        return alPredt5;
        
    }
    
}
