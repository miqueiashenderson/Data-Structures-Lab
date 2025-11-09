package forma;

import java.util.Scanner;

public class Formas {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        Forma formaCalculavel = null;
        
        System.out.println("Digite a forma que você quer calcular (triangulo, retangulo, circulo, quadrado):");
        String forma =  sc.nextLine().toLowerCase();
        
        if (forma.equals("triangulo")){
            System.out.println("Digite a base do triangulo: ");
            double base = sc.nextDouble();
            System.out.println("Digite a altura do triangulo: ");
            double altura = sc.nextDouble();
            
            formaCalculavel = new Triangulo(base, altura);
            
        } else if (forma.equals("retangulo")){
            System.out.println("Digite a base do retangulo: ");
            double base = sc.nextDouble();
            System.out.println("Digite a altura do retangulo: ");
            double altura = sc.nextDouble();
            
            formaCalculavel = new Retangulo(base, altura);
            
        } else if (forma.equals("circulo")){
            System.out.println("Digite o raio do circulo: ");
            double raio = sc.nextDouble();
            
            formaCalculavel = new Circulo(raio);
            
        } else if (forma.equals("quadrado")){
            System.out.println("Digite o lado do quadrado: ");
            double lado = sc.nextDouble();
            
            formaCalculavel = new Quadrado(lado);
        
        } 
        
        if (formaCalculavel != null) {
            System.out.println("A área da forma é: " + formaCalculavel.area());
        } else {
            System.out.println("Forma não encontrada!");
        }
        
        sc.close();
    }
}
