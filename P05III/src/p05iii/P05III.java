/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p05iii;

/**
 *
 * @author sala11
 */
public class P05III {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int Tablero [][] = {{1,0,0,0,0,0,0,0},
                            {0,0,0,0,1,0,0,0},
                            {0,1,0,0,1,0,0,0},
                            {0,0,0,0,1,0,0,0},
                            {0,1,0,0,1,0,0,0},
                            {0,0,0,0,1,0,0,0},
                            {0,0,0,0,1,0,0,0},
                            {1,0,0,0,1,0,0,0}
        };
        
        int DI[], DD[], i, j;
        DI = new int [15];
        DD = new int [15];
        
        for ( i = 0; i < 8; i++) 
            for ( j = 0; j < 8; j++) {
                if (Tablero[i][j]==1) {
                    DD[i-j+7]++;
                    DI[i+j]++;
                }
            }
            
            for ( i = 0; i < 15; i++) 
            System.out.print(DD[i]+"");
                 
    }
    
}
