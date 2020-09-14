package teste;

import empresa.CalculadoraDeSalario;
import empresa.Cargo;
import empresa.Funcionario;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author valeria
 */
public class CalculadoraDeSalarioTest {

    @Test
    public void deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite() {
        //cenário do desconto de 10% se salario for menor que 3.000,00
        CalculadoraDeSalario calculadora = new CalculadoraDeSalario();

        Funcionario desenvolvedor = new Funcionario("Mauricio", 1500.0, Cargo.DESENVOLVEDOR);

        double salario = calculadora.calculaSalario(desenvolvedor);
        assertEquals(1500.0 * 0.9, salario, 0.00001);
    }
    
    @Test
    public void deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite() {
        //cenário do desconto de 20% se salario for maior que 3.000,00
        CalculadoraDeSalario calculadora = new CalculadoraDeSalario();

        Funcionario desenvolvedor = new Funcionario("Mauricio", 4000.0, Cargo.DESENVOLVEDOR);

        double salario = calculadora.calculaSalario(desenvolvedor);
        assertEquals(4000.0 * 0.8, salario, 0.00001);
    }

    
}
