package Main;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
         Scanner op=new Scanner (System.in);
      int opcion;
        arbol.Insertar(arbol.getRaiz(), "Ana", 1997);
        arbol.Insertar(arbol.getRaiz(), "Roberto", 1982);
        arbol.Insertar(arbol.getRaiz(), "Cristal", 1993);
        arbol.Insertar(arbol.getRaiz(), "Gustavo", 1986);
        arbol.Insertar(arbol.getRaiz(), "Martha", 1990);
        arbol.Insertar(arbol.getRaiz(), "Fernando", 1981);
        arbol.Insertar(arbol.getRaiz(), "Carmen", 1970);
        arbol.Insertar(arbol.getRaiz(), "Joseline", 2003);
        arbol.Insertar(arbol.getRaiz(), "Alicia", 2009);
        arbol.Insertar(arbol.getRaiz(), "Cesar", 2005);
        arbol.Insertar(arbol.getRaiz(), "Ramiro", 2001);
        arbol.Insertar(arbol.getRaiz(), "Lalo", 2002);
      do{
     System.out.println("           ***********DATOS INGRESADOS**********");
     System.out.println("         ******Operaciones con arbol binario******");
     
     System.out.println("\n   1.-¿Quien es la persona más pequeña y que edad tiene?\n"
                       +"   2.-¿Quien es la persona más grande y que edad tiene?:\n"
                       +"   3.-¿Cuántos años de diferencia tienen la persona mas grande y la mas chica?:\n"
                       +"   4.-¿Cuantos participantes hay?:\n"
                       +"   5.-¿Cuánto es la suma de los participantes:?\n"
                       +"   6.-¿Cuál es el promedio de edad de los participantes?\n"
                       +"   7.- Mostrar Altura:\n"
                       +"   8.- Mostrar en Pre-Orden\n"
                       +"   9.-Mostrar en In-Orden\n"
                       +"   10.-Mostrar en Post-Orden\n"
                       +"   11.-Salir\n"
                 +"Elige alguna de las siguientes opciones");
          opcion=op.nextInt();
           switch(opcion){
                     case 1:
                         System.out.println("");
                         System.out.println("1.*Persona mas pequeña y edad*:");
                         System.out.println(arbol.EdadMin());
                         System.out.println("");
                        break;
                     case 2:
                         System.out.println("");
                         System.out.println("2.*Persona mas grande y edad*:");
                         System.out.println(arbol.EdadMax());
                         System.out.println("");
                          break;
                      case 3:
                         System.out.println("");
                         System.out.println("3.*Diferencia persona mas grande y chica*:");
                         System.out.println(""+ arbol.Diferencia() + " años" +""); 
                         System.out.println("");
                          break;
                      case 4:
                         System.out.println("");
                         System.out.println("4.*Participantes que hay*:");
                         System.out.println(arbol.getNumeroDeNodos());
                         System.out.println("");
                          break;
                     case 5:
                         System.out.println("");
                         System.out.println("5.*Suma de los participantes*:");
                         System.out.println(arbol.getSumaEdades());
                         System.out.println("");
                          break;
                     case 6:
                         System.out.println("");
                         System.out.println("6.*Promedio de los participantes*:");
                         System.out.println(arbol.getPromedioEdad());
                         System.out.println("");
                          break;
                     case 7:
                         System.out.println("");
                         System.out.println("7.*Altura*:");
                         System.out.println(arbol.Altura(arbol.getRaiz()));
                         System.out.println("");
                          break;
                     case 8:
                         System.out.println("");
                         System.out.println("8.*Pre-Orden*:");
                         arbol.PreOrden(arbol.getRaiz());
                         System.out.println("");
                         break;
                     case 9:
                         System.out.println("");
                         System.out.println("9.*In-Orden*:");
                         arbol.InOrden(arbol.getRaiz());
                         System.out.println("");
                           break;
                     case 10:
                         System.out.println("");
                         System.out.println("10.*Post-Orden*:");
                         arbol.PostOrden(arbol.getRaiz());
                         System.out.println("");
                         break;
                     case 11:
                         System.out.println("El programa a FINALIZADO............");
                         break;
                      default:
                          System.out.println("Opcion INCORRECTA");
                       }
      }while (opcion !=11);    
    } 
}
