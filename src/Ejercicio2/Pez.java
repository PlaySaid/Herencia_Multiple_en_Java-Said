package Ejercicio2;

public class Pez implements Nadador, Respirador{
    
    @Override
    public void respirar(){
        System.out.println("El pez respira bajo el agua");
        System.out.println("---------------------------");
    }
    
    @Override
    public void nadar(){
        System.out.println("El pez nada bajo el agua");
    }
    
}
