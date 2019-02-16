package fachada;

public class Fachada
{
    private Liquidos liquidos;
    private Asientos asiento;
    private Espejos espejos;
    private Arrancar arrancar;
   
    public Fachada()
    {
        this.liquidos = new Liquidos();
        this.asiento  = new Asientos();
        this.espejos  = new Espejos();
        this.arrancar = new Arrancar();
    }
   
     public void arrancarCoche()
    {
        liquidos.comprobar();
        asiento.comprobar();
        espejos.comprobar();
        arrancar.encenderContacto();
    }
}