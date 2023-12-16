/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2p1_luiscastro;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lfern
 */
public class Ex2P1_LuisCastro {
static Scanner leer = new Scanner(System.in);
static Scanner leerS = new Scanner(System.in);
static Random rand = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("****Menu****");
        System.out.println("1. Kingdom Hearts Re-Re Coded!");
        System.out.println("Cualquier otro numero termina el programa.");
        System.out.println("Ingrese su opcion.");
        int opcion_menuprin = leer.nextInt();
        while(opcion_menuprin == 1){
            switch(opcion_menuprin){
                case 1:
                    ArrayList<Items> mochila = new ArrayList<>();
                    ArrayList<Personaje>party = new ArrayList<>();
                    ArrayList<Personaje> reservas = new ArrayList<>();
                    boolean personajes_vivos = true;
                    int contador = 0;
                    int cantidad_personajes = 3;
                    
                    String Sora = "Sora";
                    String Donald = "Donald";
                    String Goofy = "Goofy";
                    String Mickey = "Mickey";
                    String Roxas = "Roxas";
                    String Kairi = "Kairi";
                    
                    Personaje Sor = new Personaje(Sora ,300, 300,75, 15);
                    party.add(Sor);
                    Personaje Dona = new Personaje(Donald ,150, 450,45, 10);
                    party.add(Dona);
                    Personaje Goof = new Personaje(Goofy ,450, 100,150, 50);
                    party.add(Goof);
                    Personaje Mick = new Personaje(Mickey ,100, 500,150, 35);
                    reservas.add(Mick);
                    Personaje Rox = new Personaje(Roxas ,300, 300,15, 75);
                    reservas.add(Rox);
                    Personaje Kair = new Personaje(Kairi ,200, 200,50, 15);
                    reservas.add(Kair);
                    
                    String Pocion = "Pocion";
                    String Ether = "Ether";
                    String Elixir = "Elixir";
                    
                    Items Poc = new Items(Pocion,50,0);
                    Items Eth = new Items(Ether,0,50);
                    Items Elix = new Items(Elixir,100,100);
                    
                    mochila.add(Poc);
                    mochila.add(Eth);
                    mochila.add(Elix);
                    
                    while(contador !=20 && personajes_vivos == true){
                        System.out.println("Entraste al cuarto "+(contador+1)+".");
                        int tipo_cuarto = rand.nextInt((5-1)+1)+1;
                        switch(tipo_cuarto){
                            case 1:
                                int cantidad_heartless = rand.nextInt(4-1)+1;
                                System.out.println("Te has encontrado a "+cantidad_heartless+" Heartless!");
                                int vida_h = 75*cantidad_heartless;
                                int danno_h = 25*cantidad_heartless;
                                imprimirArrayPer(party);
                                
                                System.out.println("Elije el personaje!");
                                int persona = leer.nextInt();
                                
                                while(persona > 2 || persona < 0){
                                    System.out.println("Ingrese un numero valido.");
                                    persona = leer.nextInt();
                                }
                                
                                Personaje personajeElegido = party.get(persona);
                                int vida = personajeElegido.getHP();
                                int mana = personajeElegido.getMP();
                                int attack = personajeElegido.getAttackPoints();
                                int defense = personajeElegido.getDefensePoints();
                                
                                System.out.println("****Menu****");
                                System.out.println("1. Attack.");
                                System.out.println("2. Magic.");
                                System.out.println("3. Items.");
                                System.out.println("4. Party.");
                                System.out.println("Ingrese su opcion:");
                                int opcion_menu = leer.nextInt();
                                
                                while(opcion_menu < 1|| opcion_menu > 4){
                                    System.out.println("Opcion invalida:");
                                    System.out.println("****Menu****");
                                    System.out.println("1. Attack.");
                                    System.out.println("2. Magic.");
                                    System.out.println("3. Items.");
                                    System.out.println("4. Party.");
                                    System.out.println("Ingrese de nuevo:");
                                    opcion_menu = leer.nextInt();
                                }
                                
                                while(vida_h > 0){
                                    switch(opcion_menu){
                                        case 1:
                                            System.out.println(personajeElegido.getNombre() + " ha atacado!");
                                            System.out.println(personajeElegido.getNombre() + " ha recibido un golpe.");
                                            vida_h -= attack;
                                            vida -= danno_h-(danno_h * (defense/100));
                                            if(vida_h <=0){
                                                vida_h = 0;    
                                            }
                                            if(vida <= 0){
                                                vida = 0;
                                                System.out.println("Tu personaje ha muerto.");
                                                cantidad_personajes--;
                                                party.remove(personajeElegido);
                                                break;
                                            }
                                            System.out.println("La vida de los heartless es "+vida_h);
                                            personajeElegido.setHP(vida);
                                            personajeElegido.setMP(mana);
                                            break;
                                        case 2:
                                            System.out.println("****Menu Magia****");
                                            System.out.println("1. Blizzard - 50 MP - 50 DMG");
                                            System.out.println("2. Firaga - 25MP - 25 DMG");
                                            System.out.println("3. Gravity - 75 MP - 100DMG");
                                            System.out.println("Ingrese su opcion.");
                                            int opcion_magia = leer.nextInt();
                                            
                                            while(opcion_magia < 1 || opcion_magia > 3){
                                                System.out.println("Opcion invalida:");
                                                System.out.println("****Menu Magia****");
                                                System.out.println("1. Blizzard - 50 MP - 50 DMG");
                                                System.out.println("2. Firaga - 25MP - 25 DMG");
                                                System.out.println("3. Gravity - 75 MP - 100DMG");
                                                System.out.println("Ingrese de nuevo:");
                                                opcion_magia = leer.nextInt();
                                            }
                                            switch(opcion_magia){
                                                case 1:
                                                        if(mana <=50){
                                                            mana = 0;
                                                        }
                                                        System.out.println(personajeElegido.getNombre()+" ha usado Blizzard.");
                                                        System.out.println(personajeElegido.getNombre()+" ha recibido un golpe.");
                                                        vida -= danno_h-(danno_h * (defense/100));
                                                        vida_h -= 50;
                                                        mana -=50;
                                                        if(vida_h <=0){
                                                        vida_h = 0;
                                                        }
                                                        if(vida <= 0){
                                                            vida = 0;
                                                            System.out.println("Tu personaje ha muerto.");
                                                            cantidad_personajes--;
                                                            party.remove(personajeElegido);
                                                            break;
                                                        }
                                                        System.out.println("La vida de los heartless es "+vida_h);
                                                        personajeElegido.setHP(vida);
                                                        personajeElegido.setMP(mana);
                                                    break;
                                                case 2:
                                                        if(mana <=25){
                                                            mana = 0;
                                                        }
                                                        System.out.println(personajeElegido.getNombre()+" ha usado Firaga.");
                                                        System.out.println(personajeElegido.getNombre()+" ha recibido un golpe.");
                                                        vida -= danno_h-(danno_h * (defense/100));
                                                        vida_h -= 25;
                                                        mana -= 25;
                                                        if(vida_h <=0){
                                                            vida_h = 0;
                                                        }
                                                        if(vida <= 0){
                                                            vida = 0;
                                                            System.out.println("Tu personaje ha muerto.");
                                                            cantidad_personajes--;
                                                            party.remove(personajeElegido);
                                                            break;
                                                        }
                                                        System.out.println("La vida de los heartless es "+vida_h);
                                                        personajeElegido.setHP(vida);
                                                        personajeElegido.setMP(mana);
                                                    break;
                                                case 3:
                                                        if(mana <=75){
                                                            mana = 0;
                                                        }
                                                        System.out.println(personajeElegido.getNombre()+" ha usado Gravity.");
                                                        System.out.println(personajeElegido.getNombre()+" ha recibido un golpe.");
                                                        vida -= danno_h-(danno_h * (defense/100));
                                                        vida_h -= 100;
                                                        mana -=75;
                                                        if(vida_h <=0){
                                                        vida_h = 0;
                                                        }
                                                        if(vida <= 0){
                                                            vida = 0;
                                                            System.out.println("Tu personaje ha muerto.");
                                                            cantidad_personajes--;
                                                            party.remove(personajeElegido);
                                                            break;
                                                        }
                                                        System.out.println("La vida de los heartless es "+vida_h);
                                                        personajeElegido.setHP(vida);
                                                        personajeElegido.setMP(mana);
                                                    break;
                                            }
                                            break;
                                        case 3:
                                            if(mochila.size()==0){
                                                System.out.println("No tiene ningun item para usar.");
                                                break;
                                            }
                                            imprimirArray(mochila);
                                            System.out.println("Elija el item: ");
                                            int item_tomado = leer.nextInt();
                                            while(item_tomado >= mochila.size()){
                                                System.out.println("Numero invalido. Ingrese de nuevo.");
                                                item_tomado = leer.nextInt();
                                            }
                                            Items itemElegido = mochila.get(item_tomado);
                                            
                                            int mana_extra = itemElegido.getMP();
                                            int hitpoints_extra = itemElegido.getHP();
                                            
                                            mana += mana_extra;
                                            vida += hitpoints_extra;
                                            
                                            System.out.println(personajeElegido.getNombre()+" uso "+itemElegido+"!");
                                            System.out.println(personajeElegido.getNombre()+" recibio un golpe!");
                                            vida -= danno_h-(danno_h * (defense/100));
                                            if(vida <= 0){
                                                vida = 0;
                                                System.out.println("Tu personaje ha muerto.");
                                                cantidad_personajes--;
                                                party.remove(personajeElegido);
                                                break;
                                            }
                                            mochila.remove(mochila.get(item_tomado));
                                            System.out.println("La vida de los heartless es "+vida_h);
                                            personajeElegido.setHP(vida);
                                            personajeElegido.setMP(mana);
                                            break;
                                        case 4:
                                            imprimirArrayPer(reservas);
                                            System.out.println("Elija el personaje a cambiar:");
                                            int personajereemplazo = leer.nextInt();
                                            while(personajereemplazo > 2 || personajereemplazo < 0){
                                                System.out.println("Ingrese un numero valido.");
                                                personajereemplazo = leer.nextInt();
                                            }
                                            Personaje perso = reservas.get(personajereemplazo);
                                            party.remove(personajeElegido);
                                            party.add(perso);
                                            reservas.remove(perso);
                                            reservas.add(personajeElegido);
                                            System.out.println("El personaje ha sido cambiado antes del ataque.");
                                            System.out.println("La vida de los heartless es "+vida_h);
                                            break;
                                    }//fin switch menu
                                    if(vida_h <=0){
                                        System.out.println("Los heartless han sido derrotados.");
                                        break;
                                    }
                                    if(cantidad_personajes == 0){
                                        personajes_vivos = false;
                                        break;
                                    }
                                    imprimirArrayPer(party);
                                
                                    System.out.println("Elije el personaje!");
                                    persona = leer.nextInt();
                                
                                    while(persona > 2 || persona < 0){
                                        System.out.println("Ingrese un numero valido.");
                                        persona = leer.nextInt();
                                    }   
                                    personajeElegido = party.get(persona);
                                    vida = personajeElegido.getHP();
                                    mana = personajeElegido.getMP();
                                    attack = personajeElegido.getAttackPoints();
                                    defense = personajeElegido.getDefensePoints();
                                    
                                    System.out.println("****Menu****");
                                    System.out.println("1. Attack.");
                                    System.out.println("2. Magic.");
                                    System.out.println("3. Items.");
                                    System.out.println("4. Party.");
                                    System.out.println("Ingrese su opcion:");
                                    opcion_menu = leer.nextInt();
                                
                                    while(opcion_menu < 1|| opcion_menu > 4){
                                        System.out.println("Opcion invalida:");
                                        System.out.println("****Menu****");
                                        System.out.println("1. Attack.");
                                        System.out.println("2. Magic.");
                                        System.out.println("3. Items.");
                                        System.out.println("4. Party.");
                                        System.out.println("Ingrese de nuevo:");
                                        opcion_menu = leer.nextInt();
                                    }
                                }//fin while menu
                                
                                System.out.println("Desea continuar?");
                                leerS.nextLine();
                                break;
                            case 2:
                                System.out.println("Ha encontrado un cofre que contiene una Pocion.");
                                mochila.add(Poc);
                                System.out.println("Desea continuar?");
                                leerS.nextLine();
                                break;
                            case 3:
                                System.out.println("Ha encontrado un cofre que contiene un Ether.");
                                mochila.add(Eth);
                                System.out.println("Desea continuar?");
                                leerS.nextLine();
                                break;
                            case 4:
                                System.out.println("Ha encontrado un cofre que contiene un Elixir.");
                                mochila.add(Elix);
                                System.out.println("Desea continuar?");
                                leerS.nextLine();
                                break;
                            case 5: 
                                System.out.println("Te has encontrado con unos amigos que necesitan ayuda y quieren que les entregues items.");
                                if(mochila.size()==0){
                                    System.out.println("No se ha podido entregar items debido a que su mochila esta vacia.");
                                }else{
                                    int cantidad_perdida = rand.nextInt(mochila.size())+1;
                                    System.out.println("Has decidido dar "+cantidad_perdida+" items.");
                                    for(int i = 0; i < cantidad_perdida; i++){
                                        int indice = rand.nextInt(mochila.size());
                                        mochila.remove(indice);
                                    }
                                }
                                
                                imprimirArray(mochila);
                                System.out.println("Desea continuar?");
                                leerS.nextLine();
                                break;
                        }
                        contador++;
                        
                    }
                    if(contador == 20){
                        System.out.println("Ha logrado llegar al final y completado todos los cuartos.");
                    }
                    if(cantidad_personajes == 0 && personajes_vivos == false){
                        System.out.println("Ha perdido. Todo los miembros de su party han caido.");
                    }
                    break;

            }//fin switch del menu principal
            System.out.println("****Menu****");
            System.out.println("1. Kingdom Hearts Re-Re Coded!");
            System.out.println("Ingrese su opcion.");
            System.out.println("Cualquier otro numero termina el programa.");
            opcion_menuprin = leer.nextInt();
        }// fin while menu principal
    }
    
    public static void imprimirArrayPer(ArrayList<Personaje>n){
        System.out.println("Lista de Personajes: ");
        for (int i = 0; i < n.size(); i++) {
            System.out.println(i+"."+n.get(i));
        }
    } 
    
    public static void imprimirArray(ArrayList<Items>n){
        System.out.println("Lista de items: ");
        for (int i = 0; i < n.size(); i++) {
            System.out.println(i+1+"."+n.get(i));
        }
    }
}
