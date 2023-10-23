/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author mco_a
 */
public class Alienígena extends Personaje {
    private String AtaqBasico;
    private String AtaqEspecial; //RayoCosmico  

    public Alienígena(String AtaqBasico, String AtaqEspecial, String nombre, int vida, int velocidad) {
        super(nombre, vida, velocidad);
        this.AtaqBasico = AtaqBasico;
        this.AtaqEspecial = AtaqEspecial;
    }

    public String getAtaqBasico() {
        return AtaqBasico;
    }

    public void setAtaqBasico(String AtaqBasico) {
        this.AtaqBasico = AtaqBasico;
    }

    public String getAtaqEspecial() {
        return AtaqEspecial;
    }

    public void setAtaqEspecial(String AtaqEspecial) {
        this.AtaqEspecial = AtaqEspecial;
    }
    
}
