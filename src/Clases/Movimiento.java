/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;
/**
 *
 * @author mco_a
 */
public class Movimiento {
    private Timer alienMoveTimer;
    private JLabel NaveA; // Asegúrate de que NaveA esté definido y configurado en tu proyecto

    public Movimiento(JLabel NaveA) {
        this.NaveA = NaveA;
        iniciarMovimiento();
    }
    
    private void iniciarMovimiento() {

        // Crea un temporizador para el movimiento automático de la nave alienígena
        alienMoveTimer = new Timer(100, new ActionListener() {
            int alienX = NaveA.getX();
            int direction = 1; // 1: derecha, -1: izquierda

            public void actionPerformed(ActionEvent e) {
                
                if (direction == 1) {
                    alienX += 5;
                    if (alienX > NaveA.getParent().getWidth() - NaveA.getWidth()) {
                        direction = -1;
                    }
                } else {
                    alienX -= 5;
                    if (alienX < 0) {
                        direction = 1;
                    }
                }
                NaveA.setLocation(alienX, NaveA.getY());
            }
        });

        // Inicia el temporizador para que la nave alienígena comience a moverse automáticamente
        alienMoveTimer.start();
    }
}
