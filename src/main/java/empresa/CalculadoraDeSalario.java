
package empresa;

/**
 *
 * @author valeria
 */
public class CalculadoraDeSalario {

    public double calculaSalario(Funcionario desenvolvedor) {
        if(desenvolvedor.getSalario() > 3000.00){
            return 3200.00;
        }
        return 1350.0;
    }
    
}
