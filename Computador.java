import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Computador {
    String Marca, Color;
    int Precio;


    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }


    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }


    public int getPrecio() {
        return Precio;
    }
    public void setPrecio(int precio) {
        Precio = precio;
    }


    public LinkedList<Computador> LLenarlista (){
        LinkedList<Computador> NuevaListaPC = new LinkedList<>();
    Boolean bandera = true;
    while (bandera) {
        Computador op = new Computador();
        JOptionPane.showInputDialog(null, "Ingrese la marca: ");
        JOptionPane.showInputDialog(null, "Ingrese el color: ");
        JOptionPane.showInputDialog(null, "Ingrese el precio: ");
        NuevaListaPC.add(op);
        
        JOptionPane.showInputDialog(null, "Quiere seguir ingresando los datos? (1: si / 2: no)");

        


    }
    return NuevaListaPC;

}

}

    
