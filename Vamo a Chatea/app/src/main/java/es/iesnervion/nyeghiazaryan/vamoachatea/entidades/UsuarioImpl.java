package es.iesnervion.nyeghiazaryan.vamoachatea.entidades;

import es.iesnervion.nyeghiazaryan.vamoachatea.interfaces.Usuario;

public class UsuarioImpl implements Usuario
{
    private int id;
    private String usuario;
    private String contraseia;

    public UsuarioImpl()
    {
        this.id = 0;
        this.usuario = "usuario";
        this.contraseia = "contraseña";
    }

    public UsuarioImpl(int id, String usuario, String contraseia)
    {
        this.id = id;
        this.usuario = usuario;
        this.contraseia = contraseia;
    }

    public UsuarioImpl(UsuarioImpl u)
    {
        this.id = u.id;
        this.usuario = u.usuario;
        this.contraseia = u.contraseia;
    }

    //getters y setters

    public int getId()
    {
        return id;
    }

    public String getUsuario()
    {
        return usuario;
    }

    public void setUsuario(String usuario)
    {
        this.usuario = usuario;
    }

    public String getContraseia()
    {
        return contraseia;
    }

    public void setContraseia(String contraseia)
    {
        this.contraseia = contraseia;
    }
}
