package shopexample;

import shopexample.desconto.CalculadoraDeDescontos;

import shopexample.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println("Total de Desconto: " + calculadora.calcular(orcamento1));
        System.out.println("Total de Desconto: " + calculadora.calcular(orcamento2));
    }
}
