package vista;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Color;




public class PanelEntradaDatos extends JPanel
{
    //Atributos
    private ImageIcon iImagen;
    private JLabel lbImagen;
    private JLabel lbNomLib;
    private JLabel lbNomAutor;
    private JLabel lbNomAutores;
    private JLabel lbAnioEdicion;
    private JLabel lbTipoEdicion;
    private JTextField tfNomLib;
    private JTextField tfNomAutor;
    private JTextField tfNomAutores;
    private JTextField tfAnioEdicion;
    private JComboBox cbTipoEdicion;
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("Biblioteca.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,20,260,260);
        add(lbImagen);
        
        //Creación y adición de etiquetas
        lbNomLib = new JLabel("Nombre del libro: ");
        lbNomLib.setBounds(276,30,250,30);
        add(lbNomLib);
        
        lbNomAutor = new JLabel("Nombre del autor principal: ");
        lbNomAutor.setBounds(276,80,250,30);
        add(lbNomAutor);
        
        lbNomAutores = new JLabel("Nombre de los demás autores: ");
        lbNomAutores.setBounds(276,130,250,30);
        add(lbNomAutores);

        lbAnioEdicion = new JLabel("Año de edición: ");
        lbAnioEdicion.setBounds(276,180,250,30);
        add(lbAnioEdicion);

        lbTipoEdicion = new JLabel("Seleccione si es o no una edición de lujo: ");
        lbTipoEdicion.setBounds(276,230,250,30);
        add(lbTipoEdicion);
        
        //Creación y adición de campos de texto
        tfNomLib = new JTextField();
        tfNomLib.setBounds(526, 30, 120, 30);
        add(tfNomLib);
        
        tfNomAutor = new JTextField();
        tfNomAutor.setBounds(526, 80, 120, 30);
        add(tfNomAutor);

        tfNomAutores = new JTextField();
        tfNomAutores.setBounds(526, 130, 120, 30);
        add(tfNomAutores);

        tfAnioEdicion = new JTextField();
        tfAnioEdicion.setBounds(526, 180, 120, 30);
        add(tfAnioEdicion);

        //Creacuin e insercion del combo
        cbTipoEdicion = new JComboBox();
        String[] lista ={"Si","No"};

        for(int i=0; i<lista.length;i++)
        {
            cbTipoEdicion.addItem(lista[i]);
        }
        cbTipoEdicion.setBounds(526, 230, 120, 30);
        add(cbTipoEdicion);
    

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.RED);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getNomLib()
    {
        return (String) tfNomLib.getText();
    }

    public String getNomAutor()
    {
        return (String) tfNomAutor.getText();
    }

    public String getNomAutores()
    {
        return tfNomAutores.getText();
    }
    
    public String getAnioEdicion()
    {
        return tfAnioEdicion.getText();
    }

    public String getTipoEdicion()
    {
        return (String) cbTipoEdicion.getSelectedItem();
    }


    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfNomLib.setText("");
        tfNomAutor.setText("");
        tfNomAutores.setText("");
        tfAnioEdicion.setText("");
    }

}
