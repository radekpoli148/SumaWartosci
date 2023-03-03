/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumawartosci;

public class SumaWartosci {

    public static void main(String[] args) {
        
        int[] liczby ={1, 12, 41, 12, 51, 12};
        
        int suma = 0;
        
        for(int i=0; i < liczby.length; i++)
        {
            suma = suma + liczby[i];
        }
        System.out.println(suma);
        
        suma = 0;
        for(int liczba: liczby)  // enhanced for
        {
            suma += liczba;
        }
        System.out.println(suma);
    }
    
}
