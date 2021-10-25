package shopexample.desconto;

import shopexample.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        System.out.println("efetuarCalculo Sem Desconto");
        return BigDecimal.ZERO;
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        System.out.println("deve aplicar Sem Desconto");
        return true; // se cair na "SemDesconto" deve retornar true mesmo.
    }
}
