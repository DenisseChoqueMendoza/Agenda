public class Nota
{
    private int id;
    private String hora;
    private String descripcion;
    
    //metodo constructor
    public Nota(int id, String hora, String descripcion)
    {
        this.id = id;
        this.hora = hora;
        this.descripcion = descripcion;
    }
    // metodo get y set
    
    public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getHora()
    {
        return this.hora;
    }
    public void setHora(String hora)
    {
        this.hora = hora;
    }
    public String getDescripcion()
    {
        return this.descripcion;
    }
    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }
    
    public void mostrar()
    {
        System.out.println("...............................");
        System.out.println("Id: "+ getId());
        System.out.println("Hora: "+ getHora());
        System.out.println("Descripción: "+ getDescripcion());
        System.out.println("...............................");
    }
}
