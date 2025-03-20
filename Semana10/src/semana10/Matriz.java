/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana10;

import javax.swing.JOptionPane;

/**
 *
 * @author Pochilito
 */
public class Matriz {
    
    //Declaracion de variables
    int azuzcartot=0;
    int arroztot=0;
    int lechetot=0;
    int dia=0;
    int produc=0;
    int diasem=0;
    int diaventot=0;
    int prodventot=0;
    
    
    //Matriz 7X3, dias y tipos de producto
    int producto[][]= new int [7][3];
    producto [0][0]= Dia;
    producto [0][1]= Arroz;
    producto [0][2]= Azucar;
    producto [0][3]= Leche;
    producto [1][0]= Lunes;
    producto [2][0]= Martes;
    producto [3][0]= Miercoles;
    producto [4][0]= Jueves;
    producto [5][0]= Viernes;
    producto [6][0]= Sabado;
    producto [7][0]= Domingo;
    
    JOptionPane.showMessageDialog(null, "Dias disponibles (Escriba el numero):\n"+
                                                "Lunes: 1 \n" +
                                                "Martes: 2 \n" +
                                                "Miercoles: 3 \n" +
                                                "Jueves: 4 \n" +
                                                "Viernes: 5 \n" +
                                                "Sabado: 6 \n" +
                                                "Domingo: 7 \n");
   int dia= Integer.parseInt(JOptionPane.showInputDialog(null,"Elija un dia:"))
    
    switch (dia){
            case 1:
                    JOptionPane.showMessageDialog(null, "Elegiste Lunes! Elija un producto (Escriba el numero):\n"+
                                                "Arroz: 1 \n" +
                                                "Azucar: 2 \n" +
                                                "Leche: 3 \n");
                    int produc= Integer.parseInt(JOptionPane.showInputDialog(null,"Que producto quiere añadir:"));
                    switch (produc){
                        case 1:
                        //Arroz
                        producto[1][1]=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de producto:"));
                        break;
                        case 2:
                        //Azucar
                        producto[1][2]=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de producto:"));
                        break;
                        case 3:
                        //Leche
                        producto[1][3]=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de producto:"));
                        break;
}                       default:
                            JOptionPane.showMessageDialog(null, "Dato no valido ");
                break;
            case 2:
                    JOptionPane.showMessageDialog(null, "Elegiste Martes! Elija un producto (Escriba el numero):\n"+
                                                "Arroz: 1 \n" +
                                                "Azucar: 2 \n" +
                                                "Leche: 3 \n");
                    int produc= Integer.parseInt(JOptionPane.showInputDialog(null,"Que producto quiere añadir:"));
                    switch (produc){
                        case 1:
                        //Arroz
                        producto[2][1]=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de producto:"));
                        break;
                        case 2:
                        //Azucar
                        producto[2][2]=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de producto:"));
                        break;
                        case 3:
                        //Leche
                        producto[2][3]=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de producto:"));
                        break;
}                       default:
                            JOptionPane.showMessageDialog(null, "Dato no valido ");
                break;
            case 3:
                    JOptionPane.showMessageDialog(null, "Elegiste Miercoles! Elija un producto (Escriba el numero):\n"+
                                                "Arroz: 1 \n" +
                                                "Azucar: 2 \n" +
                                                "Leche: 3 \n");
                    int produc= Integer.parseInt(JOptionPane.showInputDialog(null,"Que producto quiere añadir:"));
                    switch (produc){
                        case 1:
                        //Arroz
                        producto[3][1]=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de producto:"));
                        break;
                        case 2:
                        //Azucar
                        producto[3][2]=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de producto:"));
                        break;
                        case 3:
                        //Leche
                        producto[3][3]=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de producto:"));
                        break;
}                       default:
                            JOptionPane.showMessageDialog(null, "Dato no valido ");
                break;
            case 4:
                    JOptionPane.showMessageDialog(null, "Elegiste Jueves! Elija un producto (Escriba el numero):\n"+
                                                "Arroz: 1 \n" +
                                                "Azucar: 2 \n" +
                                                "Leche: 3 \n");
                    int produc= Integer.parseInt(JOptionPane.showInputDialog(null,"Que producto quiere añadir:"));
                    switch (produc){
                        case 1:
                        //Arroz
                        producto[4][1]=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de producto:"));
                        break;
                        case 2:
                        //Azucar
                        producto[4][2]=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de producto:"));
                        break;
                        case 3:
                        //Leche
                        producto[4][3]=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de producto:"));
                        break;
}                       default:
                            JOptionPane.showMessageDialog(null, "Dato no valido ");
                break;
            case 5:
                    JOptionPane.showMessageDialog(null, "Elegiste Viernes! Elija un producto (Escriba el numero):\n"+
                                                "Arroz: 1 \n" +
                                                "Azucar: 2 \n" +
                                                "Leche: 3 \n");
                    int produc= Integer.parseInt(JOptionPane.showInputDialog(null,"Que producto quiere añadir:"));
                    switch (produc){
                        case 1:
                        //Arroz
                        producto[5][1]=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de producto:"));
                        break;
                        case 2:
                        //Azucar
                        producto[5][2]=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de producto:"));
                        break;
                        case 3:
                        //Leche
                        producto[5][3]=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de producto:"));
                        break;
}                       default:
                            JOptionPane.showMessageDialog(null, "Dato no valido ");
                break;
            case 6:
                    JOptionPane.showMessageDialog(null, "Elegiste Sabado! Elija un producto (Escriba el numero):\n"+
                                                "Arroz: 1 \n" +
                                                "Azucar: 2 \n" +
                                                "Leche: 3 \n");
                    int produc= Integer.parseInt(JOptionPane.showInputDialog(null,"Que producto quiere añadir:"));
                    switch (produc){
                        case 1:
                        //Arroz
                        producto[6][1]=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de producto:"));
                        break;
                        case 2:
                        //Azucar
                        producto[6][2]=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de producto:"));
                        break;
                        case 3:
                        //Leche
                        producto[6][3]=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de producto:"));
                        break;
}                       default:
                            JOptionPane.showMessageDialog(null, "Dato no valido ");
                break;
            case 1:
                    JOptionPane.showMessageDialog(null, "Elegiste Domingo! Elija un producto (Escriba el numero):\n"+
                                                "Arroz: 1 \n" +
                                                "Azucar: 2 \n" +
                                                "Leche: 3 \n");
                    int produc= Integer.parseInt(JOptionPane.showInputDialog(null,"Que producto quiere añadir:"));
                    switch (produc){
                        case 1:
                        //Arroz
                        producto[7][1]=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de producto:"));
                        break;
                        case 2:
                        //Azucar
                        producto[7][2]=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de producto:"));
                        break;
                        case 3:
                        //Leche
                        producto[7][3]=Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de producto:"));
                        break;
}                       default:
                            JOptionPane.showMessageDialog(null, "Dato no valido ");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Dato no valido ");
        
        }
    
    arroztot = producto [1][1]+producto [2][1]+producto [3][1]+producto [4][1]+producto [5][1]+producto [6][1]+producto [7][1];
    azucartot = producto [1][2]+producto [2][2]+producto [3][2]+producto [4][2]+producto [5][2]+producto [6][2]+producto [7][2];
    lechetot = producto [1][3]+producto [2][3]+producto [3][3]+producto [4][3]+producto [5][3]+producto [6][3]+producto [7][3];
   
    JOptionPane.showMessageDialog(null, "El total de ventas por producto es:\n"+
                                                "Arroz: "+ arroztot + "\n" +
                                                "Azucar: "+ azucartot + "\n" +
                                                "Leche: "+ lechetot + "\n" +
                                                "El dia con mayor cantidad de ventas fue: "+ diasem + " (con un total de " + diaventot " ventas). \n" +
                                                "El producto mas vendido fue: " + prodventot );
    
    
}
