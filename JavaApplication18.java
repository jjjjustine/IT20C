/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author ITLAB1-PC22-STUDENT
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                 char [][] oke  = {
            {'*', '*','*'},
            {'*', '*','*','*',},
            {'*', '*','*','*', '*','*'},
        };
          for(int i = 0; i<oke.length; i++){
              for(int j = 0; j<oke[i].length; j++){ 
                  System.out.print(oke[i][j]+ " ");
              }
             System.out.println();
          }
    }
    
}
