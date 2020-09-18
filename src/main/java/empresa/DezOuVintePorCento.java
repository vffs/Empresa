
package empresa;

/**
 *
 * @author valeria
 */
public class DezOuVintePorCento extends RegraCalculo{

    @Override
    protected int limite() {
       return 3000;
    }

    @Override
    protected double porcentagemAcimaDoLimite() {
       return 0.8;
    }

    @Override
    protected double porcentagemBase() {
        return 0.9;
    }
    
}
