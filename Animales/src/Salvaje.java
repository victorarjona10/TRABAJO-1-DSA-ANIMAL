public class Salvaje extends Animal{
    @Override
    public  void dormir()
    {
        System.out.println("El "+this.nombre+" duerme en la cueva y hace el ruido "+this.getSonido());
    }
    public void displayData()
    {
        System.out.println(this.nombre + " es un Animal SALVAJE");
    }
    private String habitat;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public  Salvaje(String pais, String sonido, int edad, String nombre,String habitat)
    {
        super(pais,sonido,edad,nombre);
        this.habitat=habitat;
    }

    private String alimentacion;
}
