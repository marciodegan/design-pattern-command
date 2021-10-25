package shopexample.pedido;

import shopexample.orcamento.Orcamento;
import shopexample.pedido.acao.EnviarEmailPedido;
import shopexample.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    // construtor com injecao de dependencias: repository, service, etc.

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        EnviarEmailPedido email = new EnviarEmailPedido();
        SalvarPedidoNoBancoDeDados salvar = new SalvarPedidoNoBancoDeDados();

        email.executar(pedido);
        salvar.executar(pedido);

    }
}
