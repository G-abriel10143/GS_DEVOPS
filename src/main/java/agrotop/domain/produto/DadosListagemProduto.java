package agrotop.domain.produto;

import java.time.LocalDateTime;

public record DadosListagemProduto(
			Long id_Produto,
			String nome,
			Categoria categoria,
			LocalDateTime data_validade,
			int quantidade,
			Double preco,
			String fornecedor,
			String descricacao,
			Boolean ativo
		) {
	
		public DadosListagemProduto(Produto produto) {
			this(
					produto.getId_Produto(),
					produto.getNome(),
					produto.getCategoria(),
					produto.getData_validade(),
					produto.getQuantidade(),
					produto.getPreco(),
					produto.getFornecedor(),
					produto.getDescricacao(),
					produto.getAtivo());
		}

}
