public abstract class Animal {
    protected int edad;
    protected String pais;
    protected String sonido;
    protected String nombre;

    public Animal(String pais, String sonido, int edad, String nombre) //constructor de Animal
    {
        this.pais = pais;
        this.sonido = sonido;
        this.edad=edad;
        this.nombre=nombre;
    }

    public abstract void dormir(); //polimorfismo

    public abstract void displayData(); //polimorfismo
}
