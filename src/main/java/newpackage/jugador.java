/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author 34603
 */
public class jugador {
    String nombre; // Nombre del jugador de fútbol
    int votos; // Votos recibidos en la aplicación
    int id; // Número único identificativo

    public jugador(String nombre, int votos, int id) {
        this.nombre = nombre;
        this.votos = votos;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVotos() {
        return votos;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "jugador{" + "nombre=" + nombre + ", votos=" + votos + ", id=" + id + '}';
    }
    
        
}
