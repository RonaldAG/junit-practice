package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
    A_DESEJAR(new BigDecimal("0.03")),
    BOM(new BigDecimal("0.15")),
    OTIMO(new BigDecimal("0.20"));

    private final BigDecimal tax;

    Desempenho(BigDecimal tax){
        this.tax = tax;
    }

    public BigDecimal getTax() {
        return tax;
    }
}
