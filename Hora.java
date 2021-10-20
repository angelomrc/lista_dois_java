
package secondlist.newpackage;

import java.util.Scanner;


public class Hora {
    Scanner ler = new Scanner(System.in);    
    
    
    int hoora;
    int minuto;
    int segundo;


    int Gethora(int hora){
            System.out.println("Hora -> "+hora);
            return hora;
}
    
    int Getminuto(int minuto){
            System.out.println("Minuto -> "+minuto);
            return minuto;
}

    int Getsegundo(int segundo){
            System.out.println("Segundo -> "+segundo);
            return segundo;
}
   
    void Gethoracompleta(int hora, int minuto, int segundo){
            System.out.println("SÃO --> ["+hora+":"+minuto+":"+segundo+"] Horas.");         
}

    int Construtor(int hora, int minuto, int segundo){
        if(hora > 23 || hora < 0){
            System.out.println("Hora inválida. Hora alterada.");
            this.hoora=0;
            this.minuto=0;
            this.segundo=0;
        } else if(minuto > 60 || minuto < 0){
            System.out.println("Hora inválida. Hora alterada.");
            this.hoora=0;
            this.minuto=0;
            this.segundo=0;
        } else if(segundo > 60 || segundo <0){
            System.out.println("Hora inválida. Hora alterada.");
            this.hoora=0;
            this.minuto=0;
            this.segundo=0;      
        }
        
        return 1;
    }
    
    
    
    int Compara(int hora1, int hora2, int min1, int min2, int seg1, int seg2){
        
        if(hora1 == hora2 || min1 == min2 || seg1 == seg2){
            System.out.println("Horas iguais [0]");
            return 0;
        } else{
            
            
            int primeiro = (3600*hora1)+(60*min1)+seg1;
            int segundoo = (3600*hora2)+(60*min2)+seg2;
            if(primeiro > segundoo){
                System.out.println(primeiro-segundoo+" Segundos de diferença. ");
                return primeiro-segundoo;
            } else{
                System.out.println(segundoo-primeiro+" Segundos de diferença. ");
                return segundoo-primeiro;
            }
        }
     
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {     
        Scanner ler = new Scanner(System.in);    
        
        Hora hora1;    
        hora1 = new Hora();
        
        
        System.out.println("Insira a primeira Hora(s). ");
        hora1.hoora=ler.nextInt();
        System.out.println("Insira o primeiro Minuto(s). ");
        hora1.minuto=ler.nextInt();
        System.out.println("Insira o primeiro Segundo(s). ");
        hora1.segundo=ler.nextInt();
        System.out.println(" ");
        System.out.println("----------------Primeira Hora----------------");
        
        
        hora1.Construtor(hora1.hoora,hora1.minuto,hora1.segundo);   

        hora1.Gethora(hora1.hoora);
        hora1.Getminuto(hora1.minuto);
        hora1.Getsegundo(hora1.segundo);
        hora1.Gethoracompleta(hora1.hoora,hora1.minuto,hora1.segundo);
       
        System.out.println("----------------Primeira Hora----------------");
        
        //Segundo Objeto//      

        System.out.println("----------------Segunda Hora----------------");
        System.out.println(" ");
        
        Hora hora2;    
        hora2 = new Hora();
        
        System.out.println("Insira a Segunda Hora(s). ");
        hora2.hoora=ler.nextInt();
        System.out.println("Insira o Segundo Minuto(s). ");
        hora2.minuto=ler.nextInt();
        System.out.println("Insira o Segundo Segundo(s). kkk ??? ");
        hora2.segundo=ler.nextInt();
        System.out.println(" ");
        
        hora2.Gethora(hora2.hoora);
        hora2.Getminuto(hora2.minuto);
        hora2.Getsegundo(hora2.segundo);
        hora2.Gethoracompleta(hora2.hoora,hora2.minuto,hora2.segundo);
        
        System.out.println("----------------Comparação------------------");
        hora2.Compara(hora1.hoora,hora2.hoora,hora1.minuto,hora2.minuto,hora1.segundo,hora2.segundo);     
    }
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    



}
           
    
       
        
        
        
        
   
 
    
    
