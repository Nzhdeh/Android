package es.iesnervion.nyeghiazaryan.equipodejugadores.clases;

public class Jugador
{
    private int id;
    private String nombre;
    private String apellidos;
    private String nombreEquipo;

    public Jugador()
    {
        this.id=0;
        this.nombre="no name";
        this.apellidos="no name";
        this.nombreEquipo="no name";
    }

    public Jugador(int id,String nombre,String apellidos,String nombreEquipo)
    {
        this.id=id;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.nombreEquipo=nombreEquipo;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }

    public String getNombreEquipo()
    {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo)
    {
        this.nombreEquipo = nombreEquipo;
    }
}
