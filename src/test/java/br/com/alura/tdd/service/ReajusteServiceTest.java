package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    @Test
    public void reajusteDeveSerTresPorcentoQuandoDesenhoForADesejar(){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));

        service.reajuste(funcionario, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("1030.0000"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveSerQuinzePorcentoQuandoDesempenhoForBOM(){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000.00"));

        service.reajuste(funcionario, Desempenho.BOM);

        assertEquals(new BigDecimal("1150.0000"), funcionario.getSalario());
    }

}
