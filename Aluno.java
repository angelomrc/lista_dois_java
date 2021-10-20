package secondlist.newpackage;

import java.util.Scanner;

class Aluno {
    String Matricula ;
    String Nome ;
    double ProvaUm ;
    double ProvaDois ;
    double NotaTrabalho ;
    
    
    
    static double Media(double um, double dois, double tres){
        double alok;
        alok = (um+dois+tres)/3;
        return alok;        
    }    
    
    static double Final(double um, double dois, double tres){
        double alok;
        alok = (um+dois+tres)/3;
        return 7-alok;      
    }    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {

                
                
        int cont=-1;
        Scanner ler = new Scanner(System.in);
        while(cont != 0){
            System.out.println("-----------------------------------------");
            System.out.println("[0] Para sair [1] Para continuar");
            System.out.println(" ");
            cont=ler.nextInt();
            if(cont == 0){
                cont=0;
            } else {
                System.out.println(" Matricula disciplina ");
                String discplina=ler.next();
                System.out.println(" Matricula Nome Aluno(a)");
                String noome=ler.next();
                System.out.println("Nota prova 01");
                double prov=ler.nextDouble();
                System.out.println("Nota prova 02");
                double provv=ler.nextDouble();
                System.out.println("Nota Trabalho");
                double trab=ler.nextDouble();

                Aluno c1;
                c1 = new Aluno();
                c1.Matricula=discplina;
                c1.Nome=noome;
                c1.ProvaUm=prov;
                c1.ProvaDois=provv;
                c1.NotaTrabalho=trab;

                System.out.println("Aluno(a),"+c1.Nome+", Da matéria : "+c1.Matricula);
                System.out.println("Sua média é :"+c1.Media(c1.ProvaUm,c1.ProvaDois,c1.NotaTrabalho));
                if((c1.ProvaUm+c1.ProvaDois+c1.NotaTrabalho)/3 < 7){
                    System.out.println("Você precisa de :"+c1.Final(c1.ProvaUm,c1.ProvaDois,c1.NotaTrabalho)+" Para passar.");
                } else{
                    System.out.println(0);
                }
                System.out.println(" ");  

            }     
        }      
    
    }   
}
