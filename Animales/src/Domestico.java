public class Domestico extends Animal {
    @Override
    public  void dormir()
    {
        System.out.println("El "+this.nombre+" duerme y hace " + this.getSonido());
    }
    public void displayData()
    {
        System.out.println(this.nombre+ " es un Animal DOMESTICO");
    }
    private int chip;

    public  Domestico(String pais, String sonido, int edad,String nombre,int chip)
    {
        super(pais,sonido,edad,nombre);
        this.chip=chip;
    }
    public int getChip() {
        return chip;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }
}


