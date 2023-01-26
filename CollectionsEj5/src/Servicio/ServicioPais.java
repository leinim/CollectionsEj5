/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Servicio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class ServicioPais {
    
        Scanner leer = new Scanner(System.in);
    public void crearPaises(HashSet<String> paises){
        String opcion = "";        
        do {
            System.out.println("Ingrese el nombre del pais:");
            String pais = leer.next();            
            paises.add(pais);            
            System.out.println("Desea continuar?S/N");
            opcion = leer.next();            
        } while (opcion.equalsIgnoreCase("S"));
        
        for (String pais : paises){
            System.out.print("[" + pais + "]");                    
        }
        
        
    }
    
    public void eliminarPais(String p, HashSet<String> paises){
        Iterator<String> it = paises.iterator();
        int contador = 0;
        while (it.hasNext()){
            if (it.next().equalsIgnoreCase(p)){
                it.remove();
                contador++;
                for (String pais : paises){
                System.out.print("[" + pais + "]");                    
                }                
            }         
        }
        if (contador == 0){
            System.out.println("El pais no se encuentra registrado");
        }
        
        
    }
}

