package vista;
import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------------------
    //Atributos
    //----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    public LibroDeColeccion miLibroDeColeccion;


    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public VentanaPrincipal()
    {
        //Definición del contenedor de la ventana
        setLayout(null);   
        
        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,675,300);
        miPanelEntradaDatos.setBackground(Color.GRAY);
        add(miPanelEntradaDatos);
       
        
        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,310,675,80);
        miPanelOperaciones.setBackground(Color.GRAY);
        add(miPanelOperaciones);
        
        //Creación y adición del PanelOperaciones
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,390,675,280);
        miPanelResultados.setBackground(Color.GRAY);
        add(miPanelResultados);
        
        //Caracteristicas de la ventana
        setTitle("Biblioteca Pérez");
        setSize(700,700);
        //setLocation(10,10);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    //Crear ventana Libro de colección
    public void crearVentanaLibroColeccion()
    {
        miLibroDeColeccion = new LibroDeColeccion();
    }
    
}
