
package asignacion1.operaciones;
import javax.swing.*;



public class Asignacion1Operaciones {

    
    public static void main(String[] args) {
        
        
        //Declaro Variables 
        int numeroprimo; //Número a comprobar 
        int numeropalindromo, residuo, invertir = 0 ;
        int numero = 0; //Divisores exactos de un determinado número
        int numero1, numero2, suma, resta, multiplicacion,division,promedio, op;
        int aux ;
        
        
        
        // solicitamos los dos numeros//
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite otro numero"));
        
        // Capturar el dato que su utilizara en el ciclo switch//
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu: " + "\n" + "Digite una opcion " +
        "\n" + "1. Suma" + "\n"+ "2.Resta" + "\n" + "3.Multiplicacion " + "\n" + "4.Division" + "\n" +
         "5. Promedio" + "\n" +  "6.Numero Primo " + "\n" + "7. Numeros Polindromos " + "\n" ));
        
       
        //Ciclo switch//
        switch(op){
            case 1:
                suma = numero1 + numero2;
                JOptionPane.showMessageDialog(null,"La suma de los numeros es " + suma);
            break;
            case 2:
                resta = numero1 - numero2;
                JOptionPane.showMessageDialog(null,"La resta de los numeros es " + resta);
            break;
            case 3:
                multiplicacion = numero1 * numero2;
                JOptionPane.showMessageDialog(null,"La multiplicacion de los numeros es " + multiplicacion);
            break;
            case 4:
                division = numero1 / numero2;
                JOptionPane.showMessageDialog(null,"La division de los numeros es " + division);
            break;
            case 5:
                promedio = (numero1 + numero2)/2;
                JOptionPane.showMessageDialog(null,"El promedio de los numeros es " + promedio);
            break;
            case 6:
                numeroprimo= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
                
             //Proceso
                 for (int i = 1; i <= numeroprimo; i++) {
                     
                    if(numeroprimo%i == 0) {
                        numero++;      
                    }
                }
                
                if(numero ==2) {
                    JOptionPane.showMessageDialog(null," Es un numero primo" );
                } else {
                    JOptionPane.showMessageDialog(null," No es un numero  primo" );
                    } 
            break;
            case 7:
                numeropalindromo= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
                aux = numeropalindromo;
                
                //Proceso
                while (numeropalindromo!=0){
                    residuo = numeropalindromo%10;
                    invertir = invertir*10+residuo;
                    numeropalindromo =numeropalindromo/10;
                }
                
                if(aux==invertir ) {
                    JOptionPane.showMessageDialog(null," Es Polindromo" );
                } else {
                    JOptionPane.showMessageDialog(null," No es Polindromo" );
                    } 
            break; 
            default:
                JOptionPane.showMessageDialog(null,"No existe la opcion digitada");
            }
                
    }  
    
}
