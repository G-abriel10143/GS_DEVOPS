package agrotop.domain.distribuicao;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Table(name = "T_AGROTOP_DESTRIBUICAO")
@Entity(name = "Destribuicao")
public class Distribuicao {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_destribuicao;
	
	private Integer quantidade_distribuida;
	
	@NotNull
	private LocalDateTime data_distribuicao;
	
	@NotNull
	private Double preco_unitario;
	
	private int total_vendido;
	
	public Distribuicao() {
		
	}

	public Distribuicao(Long id_destribuicao, Integer quantidade_distribuida, @NotNull LocalDateTime data_distribuicao,
			@NotNull Double preco_unitario, int total_vendido) {
		super();
		this.id_destribuicao = id_destribuicao;
		this.quantidade_distribuida = quantidade_distribuida;
		this.data_distribuicao = data_distribuicao;
		this.preco_unitario = preco_unitario;
		this.total_vendido = total_vendido;
	}

	public Long getId_destribuicao() {
		return id_destribuicao;
	}

	public void setId_destribuicao(Long id_destribuicao) {
		this.id_destribuicao = id_destribuicao;
	}

	public Integer getQuantidade_distribuida() {
		return quantidade_distribuida;
	}

	public void setQuantidade_distribuida(Integer quantidade_distribuida) {
		this.quantidade_distribuida = quantidade_distribuida;
	}

	public LocalDateTime getData_distribuicao() {
		return data_distribuicao;
	}

	public void setData_distribuicao(LocalDateTime data_distribuicao) {
		this.data_distribuicao = data_distribuicao;
	}

	public Double getPreco_unitario() {
		return preco_unitario;
	}

	public void setPreco_unitario(Double preco_unitario) {
		this.preco_unitario = preco_unitario;
	}

	public int getTotal_vendido() {
		return total_vendido;
	}

	public void setTotal_vendido(int total_vendido) {
		this.total_vendido = total_vendido;
	}
}
