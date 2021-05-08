
package view;

import Model.Aluno;
import Model.Professor;

public class main {

   public static void main(String[] args) {
  
       Aluno a = new Aluno("Cassiano", "Av Grécia 1200", "30196112", "3598-5853", 1, 2, 2);
       a.DadosAluno();
       
        Aluno b = new Aluno();
       double calcularMedia = Aluno.calcularMedia(0);
        
        Aluno c = new Aluno();
       double tirarCopia = c.tirarCopia(0);
        
        Professor sor = new Professor ("Lúcia", "Livramento 14185", "34775996", "3019-6112", 000,"curso");
        sor.DadosSOR();
         
        Professor sor2 = new Professor();
        sor2.curso = "Curso ADM";
        System.out.println(sor2.toString());
        
        Professor sor3 = new Professor();
       double calcSalario = Professor.calcSalario(0);
          
        Professor s4 = new Professor();
       double tirarCopia1 = s4.tirarCopia(0);
        
             
    }
}