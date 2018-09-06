package com.brunno.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brunno.cursomc.domain.Categoria;
import com.brunno.cursomc.domain.Cidade;
import com.brunno.cursomc.domain.Cliente;
import com.brunno.cursomc.domain.Endereco;
import com.brunno.cursomc.domain.Estado;
import com.brunno.cursomc.domain.ItemPedido;
import com.brunno.cursomc.domain.Pagamento;
import com.brunno.cursomc.domain.PagamentoComBoleto;
import com.brunno.cursomc.domain.PagamentoComCartao;
import com.brunno.cursomc.domain.Pedido;
import com.brunno.cursomc.domain.Produto;
import com.brunno.cursomc.domain.enums.EstadoPagamento;
import com.brunno.cursomc.domain.enums.TipoCliente;
import com.brunno.cursomc.repositories.CategoriaRepository;
import com.brunno.cursomc.repositories.CidadeRepository;
import com.brunno.cursomc.repositories.ClienteRepository;
import com.brunno.cursomc.repositories.EnderecoRepository;
import com.brunno.cursomc.repositories.EstadoRepository;
import com.brunno.cursomc.repositories.ItemPedidoRepository;
import com.brunno.cursomc.repositories.PagamentoRepository;
import com.brunno.cursomc.repositories.PedidoRepository;
import com.brunno.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


	}
}
