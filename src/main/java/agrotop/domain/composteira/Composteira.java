package agrotop.domain.composteira;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Table(name = "T_AGROTOP_COMPOSTEIRA")
@Entity(name = "Composteira")
public class Composteira {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Composteira;
	
	private Integer quantidade;
	
	@NotNull
	private LocalDateTime data_descarte;
	
	@NotBlank
	private String tipo_descarte;
	
	@NotBlank
	private String motivo_descarte;
	
	public Composteira() {
		
	}

	public Composteira(Long id_Composteira, Integer quantidade, @NotNull LocalDateTime data_descarte,
			@NotBlank String tipo_descarte, @NotBlank String motivo_descarte) {
		super();
		this.id_Composteira = id_Composteira;
		this.quantidade = quantidade;
		this.data_descarte = data_descarte;
		this.tipo_descarte = tipo_descarte;
		this.motivo_descarte = motivo_descarte;
	}

	public Long getId_Composteira() {
		return id_Composteira;
	}

	public void setId_Composteira(Long id_Composteira) {
		this.id_Composteira = id_Composteira;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDateTime getData_descarte() {
		return data_descarte;
	}

	public void setData_descarte(LocalDateTime data_descarte) {
		this.data_descarte = data_descarte;
	}

	public String getTipo_descarte() {
		return tipo_descarte;
	}

	public void setTipo_descarte(String tipo_descarte) {
		this.tipo_descarte = tipo_descarte;
	}

	public String getMotivo_descarte() {
		return motivo_descarte;
	}

	public void setMotivo_descarte(String motivo_descarte) {
		this.motivo_descarte = motivo_descarte;
	}
}
