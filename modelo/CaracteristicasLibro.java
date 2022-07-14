package modelo;

public class CaracteristicasLibro extends Libro
{
    protected String nomColeccion;
    protected int numColeccion;

    public CaracteristicasLibro(String nomLibro,int numAutor, String nomAutor, int añoEdicion, String lujo, String coleccion,String nomColeccion, int numColeccion) 
    {
        super(nomLibro,numAutor, nomAutor, añoEdicion, lujo);
        this.nomColeccion = nomColeccion;
        this.numColeccion = numColeccion;
    }

    public CaracteristicasLibro(String nomLibro,int numAutor, String nomAutor, int añoEdicion, String lujo, String coleccion) 
    {
        super(nomLibro,numAutor, nomAutor, añoEdicion, lujo);
    }
    
    public void organizarInformacion1()
    {
        informacion = nomLibro + "\n" +nomAutor + "\n" + añoEdicion + "\nLa edicion "+lujo+" es de lujo"+"\nColección: "+nomColeccion+" #"+numColeccion;
    }
    
    public void organizarInformacion2()
    {
        informacion = nomLibro + "\n" +nomAutor + "\n" + añoEdicion + "\nLa edicion "+lujo+" es de lujo"+"\nEl libro no pertenece a ninguna colección";
    }

    public void organizarInformacion3()
    {
        informacion = nomLibro + "\n" +nomAutor + " y otros..." + "\n" + añoEdicion + "\nLa edicion "+lujo+" es de lujo"+"\nColección: "+nomColeccion+" #"+numColeccion;
    }
    public void organizarInformacion4()
    {
        informacion = nomLibro + "\n" +nomAutor + " y otros... " + "\n" + añoEdicion + "\nLa edicion "+lujo+" es de lujo"+"\nEl libro no pertenece a ninguna colección";
    }
}
