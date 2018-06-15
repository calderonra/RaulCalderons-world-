/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;
import Jugador.Jugador;
import Unidades.CostoUnidades;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Raul Calderon
 */
public class MetodosDeVehiculo {
    public static ArrayList <vehiculo> vehiculos1 = new ArrayList();
    public static ArrayList <vehiculo> vehiculos2= new ArrayList();
    

    
    public static void mostrarEstrcutura1(){
        int i =1;
        for(vehiculo e : vehiculos1){
            System.out.println(i+" "+e.toString());
            i++;
        }
    }
    
    public static void crearVehiculoPersa(Jugador player) {
        CostoUnidades cs = new CostoUnidades();
        cs.setCostovehiculos(100);
        int costo = cs.getCostosolados();
        int aux = 0;
        int juga = 0;

        aux = player.getOro();

        System.out.println("¿Que tipo de unidad desea crear? ");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        if (in.equalsIgnoreCase("carro") && aux >= costo) {
            aux = player.getMadera() - costo;
            vehiculos1.add(new vehiculo("carro", 150, 150, 2, 10));
            player.setMadera(aux);
        } else if (in.equalsIgnoreCase("super carro") && costo == 100) {
            vehiculos1.add(new vehiculo("ss", 100, 100, 2, 100));
        } else if (in.equalsIgnoreCase("carro") && aux <= costo) {
            System.out.println("Recursos insuficientes :0!");

        }
    }
    
 public static void crearVehiculoMaya(Jugador player) {
        CostoUnidades cs = new CostoUnidades();
        cs.setCostovehiculos(100);
        int costo = cs.getCostosolados();
        int aux = 0;
        int juga = 0;
        aux = player.getOro();
        System.out.println("¿Que tipo de unidad desea crear? ");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        if (in.equalsIgnoreCase("carro") && aux >= costo) {
            aux = player.getMadera() - costo;
            vehiculos1.add(new vehiculo("carro", 150, 150, 2, 10));
            player.setMadera(aux);
        } else if (in.equalsIgnoreCase("super carro") && costo == 100) {
            vehiculos1.add(new vehiculo("ss", 100, 100, 2, 100));
        } else if (in.equalsIgnoreCase("carro") && aux <= costo) {
            System.out.println("Recursos insuficientes :0!");

        }
    }    
 
 public static void creaVehiculoTeuton(Jugador player) {
        CostoUnidades cs = new CostoUnidades();
        cs.setCostovehiculos(100);
        int costo = cs.getCostosolados();
        int aux = 0;
        int juga = 0;
        aux = player.getOro();
        System.out.println("¿Que tipo de unidad desea crear? ");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        if (in.equalsIgnoreCase("carro") && aux >= costo) {
            aux = player.getMadera() - costo;
            vehiculos1.add(new vehiculo("carro", 150, 150, 2, 10));
            player.setMadera(aux);
        } else if (in.equalsIgnoreCase("super carro") && costo == 100) {
            vehiculos1.add(new vehiculo("ss", 100, 100, 2, 100));
        } else if (in.equalsIgnoreCase("carro") && aux <= costo) {
            System.out.println("Recursos insuficientes :0!");

        }
    }
 public static void mostrarUnidades2() {
        int i = 1;
        for (vehiculo u : vehiculos2) {
            System.out.println(i + " " + u.toString());
            i++;
        }
    }
  
    public static void crearVehiculoPersa2(Jugador player) {
        CostoUnidades cs = new CostoUnidades();
        cs.setCostovehiculos(100);
        int costo = cs.getCostosolados();
        int aux = 0;
        int juga = 0;

        aux = player.getOro();

        System.out.println("¿Que tipo de unidad desea crear? ");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        if (in.equalsIgnoreCase("carro") && aux >= costo) {
            aux = player.getMadera() - costo;
            vehiculos2.add(new vehiculo("carro", 150, 150, 2, 10));
            player.setMadera(aux);
        } else if (in.equalsIgnoreCase("super carro") && costo == 100) {
            vehiculos2.add(new vehiculo("ss", 100, 100, 2, 100));
        } else if (in.equalsIgnoreCase("carro") && aux <= costo) {
            System.out.println("Recursos insuficientes :0!");

        }
    }
    
 public static void crearVehiculoMaya2(Jugador player) {
        CostoUnidades cs = new CostoUnidades();
        cs.setCostovehiculos(100);
        int costo = cs.getCostosolados();
        int aux = 0;
        int juga = 0;
        aux = player.getOro();
        System.out.println("¿Que tipo de unidad desea crear? ");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        if (in.equalsIgnoreCase("carro") && aux >= costo) {
            aux = player.getMadera() - costo;
            vehiculos2.add(new vehiculo("carro", 150, 150, 2, 10));
            player.setMadera(aux);
        } else if (in.equalsIgnoreCase("super carro") && costo == 100) {
            vehiculos2.add(new vehiculo("ss", 100, 100, 2, 100));
        } else if (in.equalsIgnoreCase("carro") && aux <= costo) {
            System.out.println("Recursos insuficientes :0!");

        }
    }    
 
 public static void creaVehiculoTeuton2(Jugador player) {
        CostoUnidades cs = new CostoUnidades();
        cs.setCostovehiculos(100);
        int costo = cs.getCostosolados();
        int aux = 0;
        int juga = 0;
        aux = player.getOro();
        System.out.println("¿Que tipo de unidad desea crear? ");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        if (in.equalsIgnoreCase("carro") && aux >= costo) {
            aux = player.getMadera() - costo;
            vehiculos2.add(new vehiculo("carro", 150, 150, 2, 10));
            player.setMadera(aux);
        } else if (in.equalsIgnoreCase("super carro") && costo == 100) {
            vehiculos2.add(new vehiculo("ss", 100, 100, 2, 100));
        } else if (in.equalsIgnoreCase("carro") && aux <= costo) {
            System.out.println("Recursos insuficientes :0!");

        }
    }
 public static void ataque1() {
        int vidafinal = 0;

        int aux = vehiculos1.get(0).getVida();
        int atk1 = vehiculos1.get(0).getAtk();
        int aux2 = vehiculos2.get(0).getVida();
        System.out.println("Tus puntos de ataque: " + atk1);
        System.out.println("vida del enemigo: " + aux2);

        vidafinal = aux2 - atk1;
        System.out.println("La vida que va a quedar el enemigo es de:" + vidafinal);
        if (vidafinal <= 0) {
            vehiculos2.remove(0);
        } else if (vidafinal > 0) {
            vehiculos2.get(0).setVida(vidafinal);
            System.out.println("atacando al soldado");
        }

    }

    public static void ataque2() {
        int vidafinal = 0;

        int aux = vehiculos2.get(0).getVida();
        int atk1 = vehiculos2.get(0).getAtk();
        int aux2 = vehiculos1.get(0).getVida();
        System.out.println("Tus puntos de ataque: " + atk1);
        System.out.println("vida del enemigo: " + aux2);

        vidafinal = aux2 - atk1;
        System.out.println("La vida que va a quedar el enemigo es de:" + vidafinal);
        if (vidafinal <= 0) {
            vehiculos1.remove(0);
        } else if (vidafinal > 0) {
            vehiculos1.get(0).setVida(vidafinal);
            System.out.println("atacando al soldado");
        }
    }
 
}
