package modelo;

public class Libro 
{
    protected String nomLibro;
    protected int numAutor;
    protected String nomAutor;
    protected int añoEdicion;
    protected String informacion;
    protected String lujo;
    

    public Libro(String nomLibro, int numAutor, String nomAutor, int añoEdicion, String lujo) 
    {
        this.nomLibro = nomLibro;
        this.numAutor = numAutor;
        this.nomAutor = nomAutor;
        this.añoEdicion = añoEdicion;
        this.lujo = lujo;
     
    }
    
    public String mostrarInformación()
    {
        return this.informacion;
    }
    
  
}
