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
    Funcionario desenvolvedor;
    
    @Before
    public void inicializa(){
        this.calculadora = new CalculadoraDeSalario();
    }
    
    @Test
    public void deveCalcularSalarioDezPorCento() {
               
        this.desenvolvedor = new Funcionario("Mauricio", 1500.0, Cargo.DESENVOLVEDOR);

        double salario = this.calculadora.calculaSalario(this.desenvolvedor);
        assertEquals(1500.0 * 0.9, salario, 0.00001);
    }
    
    @Test
    public void deveCalcularSalarioVintePorCento() {
               
        this.desenvolvedor = new Funcionario("Mauricio", 4000.0, Cargo.DESENVOLVEDOR);

        double salario = this.calculadora.calculaSalario(this.desenvolvedor);
        assertEquals(4000.0 * 0.8, salario, 0.00001);
    }

     @Test
    public void deveCalcularSalarioQuinzePorCento() {
        
        Funcionario dba = new Funcionario("Mauricio", 500.0, Cargo.DBA);
        
        double salario = this.calculadora.calculaSalario(dba);
        assertEquals(500.0 * 0.85, salario, 0.00001);
    }
    
     @Test
    public void deveCalcularSalarioVinteCincoPorCento() {
        
        Funcionario testador = new Funcionario("Mauricio", 3200.0, Cargo.TESTADOR);
        
        double salario = this.calculadora.calculaSalario(testador);
        assertEquals(3200.0 * 0.75, salario, 0.00001);
    }

}
