/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;

/**
 *
 * @author mco_a
 */
public class Disparos {

    //deklarerer nÃ¸dvendige variabler
    public int x, y; //position
    double vx, vy; //hastighed
    boolean friendly; //om man selv har skudt den af eller ej
    java.awt.geom.Ellipse2D e; //en ellipse til at tegne den med
    //konstruktÃ¸ren

    public Disparos(int x, int y, int vx, int vy, boolean friendly) {
        //sÃ¦tter variablerne, som er givet som argumenter
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.friendly = friendly;
        //opretter ellipseobjektet
        e = new java.awt.geom.Ellipse2D.Double(-8, -8, 16, 16);
    }
    //tegnefunktionen, tegner skuddet

    public void paint(java.awt.Graphics2D g) {
        //sÃ¦tter tegneudgangspunktet til x og y posiionen
        g.translate(x, y);
        //hvis det er ens eget skud
        if (friendly) {
            //sÃ¦t farven til gul
            g.setPaint(java.awt.Color.YELLOW);
            //ellers
        } else {
            //sÃ¦t farven til orange
            g.setPaint(java.awt.Color.ORANGE);
        }
        //tegner skuddet udfyldt
        g.fill(e);
        //nulstiller tegneudgangspunktet
        g.translate(-x, -y);
    }
    //run funktionen, bliver kaldt i hvert frame

    public void run() {
        //flytter skuddet i forhold til hastigheden
        x += vx;
        y += vy;
    }
}
