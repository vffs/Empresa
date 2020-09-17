package empresa;

import conexao.RegraCalculo;

/**
 *
 * @author valeria
 */
public enum Cargo {
    DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new QuinzeOuVinteECincoPorCento()),
    TESTADOR(new QuinzeOuVinteECincoPorCento());

    private final RegraCalculo regra;

    Cargo(RegraCalculo regra) {
        this.regra = regra;
    }

    public RegraCalculo getRegra() {
        return regra;
    }

}
