public class Domestico extends Animal {

    private int chip;

    public  Domestico(String pais, String sonido, int edad,String nombre,int chip)
    {
        super(pais, sonido, edad, nombre);
        this.chip = chip;
    }
    @Override
    public  void dormir()
    {
        System.out.println("El "+this.nombre+" duerme en la cama y hace " + this.sonido);
    }
    public void displayData()
    {
        System.out.println(this.nombre+ ": Animal DOMESTICO que tiene "+this.edad+" años, del pais "
                +this.pais+ ". Hace el sonido "+this.sonido+" y su chip es "+this.chip);
    }

}


