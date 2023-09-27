package br.com.project.loja.imposto;

import br.com.project.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto{

    public BigDecimal calcular(Orcamento orcamento) {
            return orcamento.getValor().multiply(new BigDecimal("0.6"));
    }
}
