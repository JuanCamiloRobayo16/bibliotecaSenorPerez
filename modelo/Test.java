package modelo;

import javax.swing.JOptionPane;

public class Test 
{
    public static void main(String[] args)
    {
        
        String nomLibro = JOptionPane.showInputDialog("Digite el nombre del libro: ");
        int numAutor = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de autores del libro: "));
        String nomAutor = JOptionPane.showInputDialog("Digite el nombre del autor principal: ");
        int añoEdicion =Integer.parseInt(JOptionPane.showInputDialog("Digite el año de salida del libro: "));
        String coleccion = JOptionPane.showInputDialog("El libro: "+nomLibro+" pertenece a una colección: *si* o *no*");
        String lujo = JOptionPane.showInputDialog("El libro: "+nomLibro+" es edicion de lujo: *si* o *no* ");
        
        if(numAutor==1)
        {
            if(coleccion.equals("si"))
            {
                String nomColeccion = JOptionPane.showInputDialog("Digite el nombre de la colección: ");
                int numColeccion = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que ocupa en la collecion: "));
                CaracteristicasLibro miCaracteristicasLibro = new CaracteristicasLibro(nomLibro,numAutor,nomAutor,añoEdicion,lujo,coleccion,nomColeccion,numColeccion);
                miCaracteristicasLibro.organizarInformacion1();
                JOptionPane.showMessageDialog(null,("La informacion del libro es: \n"+miCaracteristicasLibro.mostrarInformación()));
            }
            if(coleccion.equals("no"))
            {
                CaracteristicasLibro miCaracteristicasLibro = new CaracteristicasLibro(nomLibro,numAutor,nomAutor,añoEdicion,lujo,coleccion);
                miCaracteristicasLibro.organizarInformacion2();
                JOptionPane.showMessageDialog(null,("La informacion del libro es: \n"+miCaracteristicasLibro.mostrarInformación()));
            } 
        }
        if(numAutor>=2)
        {
            if(coleccion.equals("si"))
            {
                String nomColeccion = JOptionPane.showInputDialog("Digite el nombre de la colección: ");
                int numColeccion = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que ocupa en la collecion: "));
                CaracteristicasLibro miCaracteristicasLibro = new CaracteristicasLibro(nomLibro,numAutor,nomAutor,añoEdicion,lujo,coleccion,nomColeccion,numColeccion);
                miCaracteristicasLibro.organizarInformacion3();
                JOptionPane.showMessageDialog(null,("La informacion del libro es: \n"+miCaracteristicasLibro.mostrarInformación()));
            }
            if(coleccion.equals("no"))
            {
                CaracteristicasLibro miCaracteristicasLibro = new CaracteristicasLibro(nomLibro,numAutor,nomAutor,añoEdicion,lujo,coleccion);
                miCaracteristicasLibro.organizarInformacion4();
                JOptionPane.showMessageDialog(null,("La informacion del libro es: \n"+miCaracteristicasLibro.mostrarInformación()));
            } 
        }
        
        
        
    }
}
