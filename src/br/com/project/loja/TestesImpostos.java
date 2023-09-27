package br.com.project.loja;

import br.com.project.loja.imposto.CalculadoraDeImposto;
import br.com.project.loja.imposto.ICMS;
import br.com.project.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 3);
        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();

        System.out.println(calculadoraDeImposto.calcular(orcamento, new ICMS()));

    }
}

