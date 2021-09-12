
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David-pc
 */
public class Main {
    
    public static void main(String[] args)
	{
		byte opcion, posicion;
		Banco cuenta = new Banco();
		Scanner entrada = new Scanner(System.in);
		
		do //Bucle que muestra el menú principal.
		{
			System.out.println("\n\n\n\n\t\tB A N C O   J A V A");
			System.out.println("\n\n\n\t\t1. Crear cuenta.");
			System.out.println("\n\n\t\t2. Acceder a cuenta.");
			System.out.println("\n\n\t\t3. Salir.");
			
			System.out.println("\n\n\n\t\tIngrese la opción deseada: ");
			opcion = entrada.nextByte();
			
			switch(opcion)
			{
				case 1: cuenta.setCuenta(entrada); 			
                                break;
				
				case 2: posicion = cuenta.iniciarSesion(entrada);
						
						if(posicion != -1)
							cuenta.menuUsuario(posicion, entrada);
                                                break;
							
				case 3: System.out.println("\n\n\tGracias por usar nuestro banco. ");
                                
			}
			
		}while(opcion != 3);
		
		entrada.close();	
	}

    //fin de menu
}
