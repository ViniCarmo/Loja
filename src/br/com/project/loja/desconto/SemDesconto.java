package br.com.project.loja.desconto;

import br.com.project.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {
    public SemDesconto() {
        super(null);
    }

    public BigDecimal calcular(Orcamento orcamento) {

            return BigDecimal.ZERO;
        }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return null;
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return true;
    }
}

