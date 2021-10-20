
package secondlist.newpackage;

import java.util.Scanner;


public class Data {
    Scanner ler = new Scanner(System.in);
    int day;
    int mounth;
    int year;
    
    
    int Getdia(int dia){
            System.out.println("Dia -> "+dia);
            return dia;
}
    
    int Getmes(int mes){
            System.out.println("Mês -> "+mes);
            return mes;
}

    int Getano(int ano){
            System.out.println("Ano -> "+ano);
            return ano;
}

    String Getmesextenso(int mes){
        if(mes == 1){
            System.out.println("Mês Janeiro.");
            return "Janeiro";
        } else if(mes == 2){
            System.out.println("Mês Fevereiro.");
            return "fevereiro";
        }else if(mes == 3){
            System.out.println("Mês Março.");
            return "Março";
        }else if(mes == 4){
            System.out.println("Mês Abril.");
            return "Abril";
        }else if(mes == 5){
            System.out.println("Mês Maio.");
            return "Maio";
        }else if(mes == 6){
            System.out.println("Mês Junho.");
            return "Junho";
        }else if(mes == 7){
            System.out.println("Mês Julho.");
            return "Julho";
        }else if(mes == 8){
            System.out.println("Mês Agosto.");
            return "Agosto";
        }else if(mes == 9){
            System.out.println("Mês Setembro.");
            return "Setembro";
        }else if(mes == 10){
            System.out.println("Mês Outubro.");
            return "Outubro";
        }else if(mes == 11){
            System.out.println("Mês Novembro.");
            return "Novembro";
        }else if(mes == 12){
            System.out.println("Mês Dezembro.");
            return "Dezembro";
        }else{
            System.out.println("Erro. Mês inválido");
            return "Erro. Erro. Mês inválido";
        }
        
    
        
      
   
    
                                                                                                
            
}
    
    
    boolean Getbissexto(int anno){
        
        if(anno % 4 == 0){
            
            if(anno % 100 != 0){
                System.out.println("O ano é bissexto.");
                return true;
            } else{
                System.out.println("O ano não é bissexto.");
                return false;
            }
        } else{
            System.out.println("O ano não é bissexto.");
            return false;
        }      
} 
    
    int Construtor(int dia, int mes, int ano){   
        if(ano < 1){
            this.day=1;
            this.mounth=1;
            this.year=1;
            System.out.println("Insira uma data válida. Data alterada. --> 01/01/0001");
        } else{
            if(mes > 12 || mes < 1){
                this.day=1;
                this.mounth=1;
                this.year=1;   
                System.out.println("Insira uma data válida. Data alterada. --> 01/01/0001");
            } else{
                if(dia < 1 || dia > 31){                   
                    this.day=1;
                    this.mounth=1;
                    this.year=1;  
                    System.out.println("Insira uma data válida. Data alterada. --> 01/01/0001");
                }
            }
        }
        
        
        
        
        
        
        
        
        return 1;
        
    }

    
    
    int Compara(int dia1, int dia2, int mes1, int mes2, int ano1, int ano2){
//        igual retorna 0 ||  1 se a data 2 for maior || -1 se a data 1 for maior.

        if(dia1 == dia2){
            if(mes1 == mes2){
                if(ano1 == ano2){
                    System.out.println("Datas IGUAIS. [0]");
                }
            }
        }

        if(ano1 > ano2){
            System.out.println("Primeira data é maior. [-1]");
            return -1;
        }
        else if(ano1 < ano2){
            System.out.println("Segunda data é maior. [1]");
            return 1;
        }
        
        else if(ano1 == ano2){
            if(mes1 > mes2){
                System.out.println("Primeira data é maior. [-1]");               
            }
            if(mes2 < mes1){
                System.out.println("Segunda data é maior. [1]");               
            }
            if(mes2 == mes1){
                if(dia1 > dia2){
                     System.out.println("Primeira data é maior. [-1]");                     
                }
                if(dia2 > dia1){
                    System.out.println("Segunda data é maior. [1]"); 
                }
            
            }
        }
        return 55;
        
        
 

     
        
    }

    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);    
        
        Data data1;    
        data1 = new Data();
        
        
        System.out.println("Insira a primeira Data. ");
        data1.day=ler.nextInt();
        System.out.println("Insira o primeiro Mês. ");
        data1.mounth=ler.nextInt();
        System.out.println("Insira o primeira Ano. ");
        data1.year=ler.nextInt();
        System.out.println("----------------Primeira data----------------");
        System.out.println(" ");
        data1.Construtor(data1.day,data1.mounth,data1.year);       
        data1.Getdia(data1.day);
        data1.Getmes(data1.mounth);
        data1.Getano(data1.year);
        data1.Getmesextenso(data1.mounth);
        data1.Getbissexto(data1.year);
        System.out.println("----------------Primeira data----------------");
//Segundo Objeto//      

        System.out.println("----------------Segunda data----------------");
        System.out.println(" ");
        Data data2;    
        data2 = new Data();       
        System.out.println("Insira a Segunda Data. ");
        data2.day=ler.nextInt();
        System.out.println("Insira o Segundo Mês. ");
        data2.mounth=ler.nextInt();
        System.out.println("Insira o Segundo Ano. ");
        data2.year=ler.nextInt();
         
        data2.Getdia(data2.day);
        data2.Getmes(data2.mounth);
        data2.Getano(data2.year);
        data2.Getmesextenso(data2.mounth);
        data2.Getbissexto(data2.year);
        System.out.println("----------------Segunda data----------------");

        System.out.println("----------------Comparação------------------");
        data2.Compara(data1.day,data2.day,data1.mounth,data2.mounth,data1.year,data2.year);
        
    }
          
    
}
