
package Model;

public class Professor extends Pessoa{
    
public static final double SALARIOBRUTOSOR = 3.000;
public static final double INSS = 0.12;
public static  final double IR = 0.15;


public double salario;
public String curso;


public Professor(){
        super();
               
    }

public Professor (String nome, String endereco,String cpf, String telefone,double salario, String curso ){
    
        super(nome, endereco, cpf, telefone);
        
        this.salario = salario;
        this.curso =  curso;
                           
}

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

     public  static final double calcSalario ( double salario){
     double desconto; double desconto2;
     desconto  =   SALARIOBRUTOSOR  *    INSS ;
     salario   =   SALARIOBRUTOSOR  -   desconto;
     desconto2 =   SALARIOBRUTOSOR  *    IR ;
     salario   =   SALARIOBRUTOSOR  -   desconto;
     salario   =   SALARIOBRUTOSOR - desconto - desconto2;
     
     System.out.println("Salario do Professor com os desconto fica em R$\\\n"+salario);
        return salario;  
        
     }
         
    @Override
    public double  tirarCopia(double copia){
       
         double x = 0.50;
         copia = x -0.45;
      
         System.out.format("Valor da cópia para Professor\n%.2f\n",copia);

         return copia ;
    }  
    
    
   
    public void DadosSOR(){
   
   
       System.out.println("\nNome do Professor:\n"+this.nome+"\nEndereco:"+this.endereco+"\nCPF:\n"+this.getCpf()+"\nTelefone:\n"+this.telefone);
 
  }
    
    

@Override
public String toString(){
    return curso+"";


    }
    
}



