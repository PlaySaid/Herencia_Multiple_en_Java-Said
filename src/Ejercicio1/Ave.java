package Ejercicio1;

public class Ave implements Cantante, Volador{
    
    @Override
    public void cantar(){
        System.out.println("El ave canta.");
        System.out.println("");
    }
    
    @Override
    public void volar(){
        System.out.println("El ave vuela!");
    }
}
