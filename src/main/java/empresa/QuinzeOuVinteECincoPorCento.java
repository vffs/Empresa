package empresa;

import conexao.RegraCalculo;

/**
 *
 * @author valeria
 */
public class QuinzeOuVinteECincoPorCento implements RegraCalculo {

    @Override
    public double calcula(Funcionario funcionario) {
        if (funcionario.getSalario() < 2500) {
            return funcionario.getSalario() * 0.85;
        }
        return funcionario.getSalario() * 0.75;
    }

}
