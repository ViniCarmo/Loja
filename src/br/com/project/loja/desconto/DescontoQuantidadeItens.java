package br.com.project.loja.desconto;

import br.com.project.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoQuantidadeItens extends Desconto{
    public DescontoQuantidadeItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }
}