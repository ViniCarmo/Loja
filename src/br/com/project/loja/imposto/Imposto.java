package br.com.project.loja.imposto;

import br.com.project.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular (Orcamento orcamento);

}
