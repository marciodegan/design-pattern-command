package shopexample;

import shopexample.orcamento.Orcamento;
import shopexample.pedido.GeraPedido;
import shopexample.pedido.GeraPedidoHandler;
import shopexample.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestesPedidos {

    public static void main(String[] args) {
//        String cliente = args[0];
//        BigDecimal valorOrcamento = new BigDecimal(args[1]);
//        int quantidadeItens = Integer.parseInt(args[2]);

        GeraPedido gerador = new GeraPedido("cliente", BigDecimal.TEN, 5);
        GeraPedidoHandler handler = new GeraPedidoHandler();
        handler.execute(gerador);
    }
}
