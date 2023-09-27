package br.com.project.loja.desconto;

import br.com.project.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {
    public SemDesconto() {
        super(null);
    }

    public BigDecimal calcular(Orcamento orcamento) {
            if (orcamento.getQuantidadeItens() > 5) {
                return orcamento.getValor().multiply(new BigDecimal("0.1"));
            }
            return BigDecimal.ZERO;
        }
    }

