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
public class Personaje {
    String nombre;
    int HP;
    int MP;
    int AttackPoints;
    int DefensePoints;

    public Personaje(String nombre, int HP, int MP, int AttackPoints, int DefensePoints) {
        this.nombre = nombre;
        this.HP = HP;
        this.MP = MP;
        this.AttackPoints = AttackPoints;
        this.DefensePoints = DefensePoints;
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

    public int getAttackPoints() {
        return AttackPoints;
    }

    public void setAttackPoints(int AttackPoints) {
        this.AttackPoints = AttackPoints;
    }

    public int getDefensePoints() {
        return DefensePoints;
    }

    public void setDefensePoints(int DefensePoints) {
        this.DefensePoints = DefensePoints;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + "\n HP=" + HP + "\n MP=" + MP + "\n AttackPoints=" + AttackPoints + "\n DefensePoints=" + DefensePoints+"\n";
    }
      
}
