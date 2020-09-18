package empresa;

/**
 *
 * @author valeria
 */
public class QuinzeOuVinteECincoPorCento extends RegraCalculo {

    @Override
    protected int limite() {
        return 2500;
    }

    @Override
    protected double porcentagemAcimaDoLimite() {
        return 0.75;
    }

    @Override
    protected double porcentagemBase() {
        return 0.85;
    }

}
