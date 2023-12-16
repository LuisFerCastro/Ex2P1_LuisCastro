/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_luiscastro;

import java.util.ArrayList;

/**
 *
 * @author lfern
 */
public class Items {
    String nombre;
    int HP;
    int MP;

    public Items(String nombre, int HP, int MP) {
        this.nombre = nombre;
        this.HP = HP;
        this.MP = MP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    @Override
    public String toString() {
        return  "Nombre=" + nombre + ", HP=" + HP + ", MP=" + MP;
    }
     
}
