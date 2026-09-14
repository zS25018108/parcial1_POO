package zoo;

public class Leon extends Animal {
    private double fuerzaRugido;

    public Leon(String nombre, int edad, double peso, double fuerzaRugido){
        super(nombre,edad,peso);
        this.fuerzaRugido = fuerzaRugido;
    }
}
