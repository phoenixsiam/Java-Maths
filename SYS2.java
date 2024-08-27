/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicojava;
import java.util.Scanner; //OBJETO SCANNER
/**
 *
 * @author keating VANEGAS 2015
 *///PROGRAMA PARA RESOLVER SISTEMAS DE EC LINEALES CON 2 VARIABLES
//A TRAVES DEL USO DE ARREGLOS MULTIDIMENSIONALES
public class SYS2 {
    
    public static void main (String args[]) {
       
        
        int i=0,j = 0;
        float x,y;
         Scanner S = new Scanner (System.in);
         
         int EC3[][]= new int [2][3]; //AREGLO QUE CONTENDRA EL SISTEMA
         
         
         float DET1=0;
        float DET2 =0;
        
        
        float DETA=0;
         float DETB=0;
         
        //FIN DECLARACIONES
         
         System.out.println("Introduzca el Sistema de Ecuaciones: ");
        
        for (i=0; i< 2; i++) {
                for (j=0; j< 3; j++) 
                        EC3[i][j] = S.nextInt();
                }    
         
                System.out.println("SISTEMA DE ECUACION LINEAL: ");
               
                for (i=0; i< 2; i++) {
                        for (j=0; j< 3; j++) 
                                                                                
                              System.out.print(EC3[i][j] + "  ");
                        
                            System.out.println();
                       
                       
                }    
    
           //    System.out.print("Determinante A de la Matriz: ");
                
             //    System.out.print((EC3[0][2] * EC3[1][1]) - (EC3[0][1]*EC3[1][2]) );
               
                for (i=0;i<2;i++) {
                        for (j=0; j<2;j++)
                                DET1=  ((EC3[0][2] * EC3[1][1]) -( EC3[0][1]*EC3[1][2]));
                }
                       
                           //    System.out.print(DET1 );
                            //       System.out.println();
                                                              
                                 for (i=0;i<2;i++) {
                                        for (j=0; j<2;j++)
                                         DET2=  ((EC3[0][0] * EC3[1][1]) - (EC3[0][1]*EC3[1][0]));
                }
                                
                               // System.out.print("Determinante B de la Matriz: ");
                               //  System.out.println(DET2 ); 
                                     
    x = (DET1 / DET2);
   
    System.out.println();
    System.out.println("X = " + x);
    System.out.print("=======================");
    //FIN PARA VALOR DE X
    
    
    //COMIENZO DE VALOR DE Y
   
  //  System.out.print("Determinante A de la Matriz Y: ");
                                   
                                    for (i=0;i<2;i++) {
                                            for (j=0; j<2;j++)
                                         DETA=  EC3[0][0] * EC3[1][2] - EC3[0][2]*EC3[1][0];
                                         
                                            
                                        //    System.out.print(DETA );
                                          //  System.out.println();
                }
    
                                  
                                     for (i=0;i<2;i++) {
                                            for (j=0; j<2;j++)
                                         DETB=  EC3[0][0] * EC3[1][1] - EC3[0][1]*EC3[1][0];
                                         
                }
              
                                   // System.out.print("Determinante B de la Matriz Y: ");
                                   //  System.out.println(DETB );                  
                                    y = DETA / DETB;
                                   
                                    System.out.print("=======================");
                                    System.out.println();
                                    
                                    System.out.println("Y = " + y);
                                    System.out.print("=======================");
    }
}
