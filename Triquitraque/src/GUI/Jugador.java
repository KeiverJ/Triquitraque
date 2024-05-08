/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author keiver
 */
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Jugador {
    
    private String nombre;
    private String marca;
    private Color color;

    public Jugador() {
    }

    public Jugador(String nombre, String marca, Color color) {
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public void configurarJugador(Jugador jugador, String nombre, JLabel labelNombre, JLabel labelFicha) {
        
        if (nombre.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Tienes que poner un nombre de jugador.", "Alerta", JOptionPane.WARNING_MESSAGE);
            
        } 
        
        else {
            
            jugador.setNombre(nombre);
            
            Color colorLabel = color.BLACK;
            
            labelFicha.setForeground(colorLabel);
            labelNombre.setText(jugador.getNombre());
            
        }
        
    }
    
    public Color configurarColorJugador(String colorSeleccionado){
        
        Jugador jugador = new Jugador("", "", Color.BLACK);
        
        Color colorFicha = Color.BLACK;
        
        switch (colorSeleccionado) {
            
            case "Naranja":
                colorFicha = new Color(128, 0, 128);
                break;
            
            case "Morado":
                colorFicha = new Color(128, 0, 128);
                break;
            
            case "Marrón":
                colorFicha = new Color(139,69,19);
                break;
            
            case "Rosado":
                colorFicha = Color.PINK;
                break;
            
            case "Rojo":
                colorFicha = Color.RED;
                break;
                
            case "Azul":
                colorFicha = Color.BLUE;
                break;
                
            case "Verde":
                colorFicha = Color.GREEN;
                break;
                
            case "Amarillo":
                colorFicha = Color.YELLOW;
                break;
                
            default:
                break;
                
        }
        
        return colorFicha;
        
    }
    
}
