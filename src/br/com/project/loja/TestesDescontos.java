package br.com.project.loja;

import br.com.project.loja.desconto.CalculadoraDedescontos;
import br.com.project.loja.imposto.CalculadoraDeImposto;
import br.com.project.loja.imposto.ICMS;
import br.com.project.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDedescontos calculadoraDeDescontos = new CalculadoraDedescontos();

        System.out.println(calculadoraDeDescontos.calcular(primeiro));
        System.out.println(calculadoraDeDescontos.calcular(segundo));


    }
}

