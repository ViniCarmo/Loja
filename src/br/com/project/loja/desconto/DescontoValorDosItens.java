package br.com.project.loja.desconto;

import br.com.project.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoValorDosItens extends Desconto {

    public DescontoValorDosItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));

    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return null;
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}