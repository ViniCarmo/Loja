package br.com.project.loja.imposto;

import br.com.project.loja.imposto.Imposto;
import br.com.project.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImposto {
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
