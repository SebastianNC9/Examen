/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author sebax
 */
public class Elemento {
    private int MasaA;
    private int NumAtomico;
    private String SimAtomico;
    private String nombre;
    private String color;
    public static ArrayList<Elemento> elementos = new ArrayList<>();
    
    public Elemento(){
    }
    public Elemento(int MasaA,int NumAtomico, String SimAtomico, String nombre, String color){
        this.MasaA = MasaA;
        this.NumAtomico = NumAtomico;
        this.SimAtomico = SimAtomico;
        this.nombre = nombre;
        this.color =  color;
    }
    public int getMasaA() {
        return MasaA;
    }

    public void setMasaA(int MasaA) {
        this.MasaA = MasaA;
    }

    public int getNumAtomico() {
        return NumAtomico;
    }

    public void setNumAtomico(int NumAtomico) {
        this.NumAtomico = NumAtomico;
    }

    public String getSimAtomico() {
        return SimAtomico;
    }

    public void setSimAtomico(String SimAtomico) {
        this.SimAtomico = SimAtomico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public static void llenarElementos(){
        insertarElemento((int) 1.00794,1,"H","Hidrogeno","Morado");
        insertarElemento((int) 22.98976,11,"Na","Sodio","Naranja");
        insertarElemento((int) 44.95591,21,"Sc","Escandio","Amarillo-Verde");
        insertarElemento((int) 69.723,31,"Ga","Galio","Amarillo");
        insertarElemento((int) 92.90638,41,"Nb","Niobio","Amarillo-Verde");
        
    }
    public static void insertarElemento(int MasaA,int NumAtomico, String SimAtomico, String nombre, String color){
        elementos.add(new Elemento(MasaA, NumAtomico, SimAtomico, nombre, color));
    }
    public static void eliminarElemento(int posicion){ // código
        elementos.remove(posicion);
    }
    public static void ActualizarElemento(int recNo, int MasaA,int NumAtomico, String SimAtomico, String nombre, String color){
        elementos.get(recNo).setMasaA(MasaA);
        elementos.get(recNo).setNumAtomico(NumAtomico);
        elementos.get(recNo).setSimAtomico(SimAtomico);
        elementos.get(recNo).setNombre(nombre);
        elementos.get(recNo).setColor(color);
    }
    
}
