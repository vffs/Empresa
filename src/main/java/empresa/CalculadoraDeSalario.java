
package empresa;

/**
 *
 * @author valeria
 */
public class CalculadoraDeSalario {

    public double calculaSalario(Funcionario funcionario) {
        
        if(funcionario.getCargo().equals(Cargo.DESENVOLVEDOR)){
            if(funcionario.getSalario() > 3000.00){
            return 3200.00;
        }
        return 1350.0;
        }
        
      return 425.00;  
    }
    
}
