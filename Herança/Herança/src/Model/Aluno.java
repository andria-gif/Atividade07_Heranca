package Model;

public  class Aluno extends Pessoa{
    
public double n1;
public double n2;
public double n3;


public Aluno(){
        super();             
    }

public Aluno (String nome, String endereco, String cpf, String telefone, double n1,double n2, double n3){
    
       super(nome, endereco, cpf, telefone);
       this.n1= n1;
       this.n1= n2;
       this.n1= n3;
    }
     
    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }
 public double getN2() {
        return n3;
    }

    public void setN2(double n3) {
        this.n3 = n3;
    }
    
    public double getN3() {
        return n3;
    }


    public void setN3(double n3) {
        this.n3 = n3;
    }

    public  static double calcularMedia(double media){  
 
             media = (8+9+9)/3; 
            
        if(media>=7){
             System.out.println("Aluno Aprovado por média\n"+media);
          
          }else System.out.println("Aluno reprovado\n"+media);
            
          return  media;
    }  
  
    @Override
    
    public double tirarCopia(double copia){
      
      double x =  0.50;
      copia = x - 0.40;
      System.out.format("Valor da cópia Aluno %.2f\n",copia);

         return copia ;
     }
   
   public void DadosAluno(){
    

          
      System.out.println("\nNome do Aluno:\n"+this.nome+"\nEndereco:"+this.endereco+"\nCPF:\n"+this.getCpf()+"\nTelefone:\n"+this.telefone);
         
    }   
}
