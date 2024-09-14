public class Salvaje extends Animal{

    private String habitat;

    public  Salvaje(String pais, String sonido, int edad, String nombre,String habitat)
    {
        super(pais, sonido, edad, nombre);
        this.habitat = habitat;
    }

    public void displayData()
    {
        System.out.println(this.nombre+ ": Animal SALVAJE que tiene "+this.edad+" años, del pais "
                +this.pais+ ". Hace el sonido "+this.sonido+" y su habitat es "+this.habitat);
    }

    @Override
    public  void dormir()
    {
        System.out.println("El "+this.nombre+" duerme en la cueva y hace el ruido "+this.sonido);
    }
}
