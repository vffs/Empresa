package teste;

import empresa.CalculadoraDeSalario;
import empresa.Cargo;
import empresa.Funcionario;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author valeria
 */

public class CalculadoraDeSalarioTest {
    CalculadoraDeSalario calculadora;
    
    @Before
    public void inicializa(){
        this.calculadora = new CalculadoraDeSalario();
    }
    
    @Test
    public void deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite() {
        //cenário do desconto de 10% se salario for menor que 3.000,00
       
        Funcionario desenvolvedor = new Funcionario("Mauricio", 1500.0, Cargo.DESENVOLVEDOR);

        double salario = calculadora.calculaSalario(desenvolvedor);
        assertEquals(1500.0 * 0.9, salario, 0.00001);
    }
    
    @Test
    public void deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite() {
        //cenário do desconto de 20% se salario for maior que 3.000,00
       
        Funcionario desenvolvedor = new Funcionario("Mauricio", 4000.0, Cargo.DESENVOLVEDOR);

        double salario = calculadora.calculaSalario(desenvolvedor);
        assertEquals(4000.0 * 0.8, salario, 0.00001);
    }

     @Test
    public void deveCalcularSalarioParaDBAsComSalarioAbaixoDoLimite() {
        
        Funcionario dba = new Funcionario("Mauricio", 500.0, Cargo.DBA);
        
        double salario = calculadora.calculaSalario(dba);
        assertEquals(500.0 * 0.85, salario, 0.00001);
    }

}
