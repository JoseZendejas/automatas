/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Josenator2
 */
public class Simbolo {
    
    
    String Cadena;
    int num_linea;

    public String getCadena() {
        return Cadena;
    }

    public void setCadena(String Cadena) {
        this.Cadena = Cadena;
    }

    public int getNum_linea() {
        return num_linea;
    }

    public void setNum_linea(int num_linea) {
        this.num_linea = num_linea;
    }

    public Simbolo(String Cadena, int num_linea) {
        this.Cadena = Cadena;
        this.num_linea = num_linea;
    }
    
    
    
}
