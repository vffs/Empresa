
package empresa;

import conexao.RegraCalculo;

/**
 *
 * @author valeria
 */
public class DezOuVintePorCento implements RegraCalculo{

    @Override
    public double calcula(Funcionario funcionario) {
        if(funcionario.getSalario() > 3000){
            return funcionario.getSalario() * 0.8;
        }
        return funcionario.getSalario() * 0.9;
    }
    
}
