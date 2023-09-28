package br.com.project.loja.desconto;

import br.com.project.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDedescontos {

    public BigDecimal calcular(Orcamento orcamento) {
      Desconto desconto = new DescontoQuantidadeItens(
                      new DescontoValorDosItens(
                                new SemDesconto()));


        return desconto.calcular(orcamento);
    }
}

