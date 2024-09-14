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


    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }



    public abstract void dormir();

    public abstract void displayData();
}
