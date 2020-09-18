
package empresa;

/**
 *
 * @author valeria
 */

public abstract class RegraCalculo {
    
   public double calcula(Funcionario funcionario){
        if(funcionario.getSalario() > limite()){
            return funcionario.getSalario() * porcentagemAcimaDoLimite();
        }
        return funcionario.getSalario() * porcentagemBase();
    }
    
    protected abstract int limite();
    
    protected abstract double porcentagemAcimaDoLimite();
    
    protected abstract double porcentagemBase();
}
