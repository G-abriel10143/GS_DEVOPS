package agrotop.domain.cultivo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Table(name = "T_AGROTOP_CULTIVO")
@Entity(name = "Cultivo")
public class Cultivo {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cultivo;
	
	@NotBlank
	private String nome_planta;
	
	@NotBlank
	private String metodo_cultivo;
	
	@NotBlank
	private Integer tempo_crescimento;
	
	private Integer dificuldade;
	
	private float temperatura_minima;
	
	private float temperatura_maxima;
	
	public Cultivo() {
		
	}

	public Cultivo(Long id_cultivo, @NotBlank String nome_planta, @NotBlank String metodo_cultivo,
			@NotBlank Integer tempo_crescimento, Integer dificuldade, float temperatura_minima,
			float temperatura_maxima) {
		super();
		this.id_cultivo = id_cultivo;
		this.nome_planta = nome_planta;
		this.metodo_cultivo = metodo_cultivo;
		this.tempo_crescimento = tempo_crescimento;
		this.dificuldade = dificuldade;
		this.temperatura_minima = temperatura_minima;
		this.temperatura_maxima = temperatura_maxima;
	}


	public Long getId_cultivo() {
		return id_cultivo;
	}


	public void setId_cultivo(Long id_cultivo) {
		this.id_cultivo = id_cultivo;
	}


	public String getNome_planta() {
		return nome_planta;
	}


	public void setNome_planta(String nome_planta) {
		this.nome_planta = nome_planta;
	}


	public String getMetodo_cultivo() {
		return metodo_cultivo;
	}


	public void setMetodo_cultivo(String metodo_cultivo) {
		this.metodo_cultivo = metodo_cultivo;
	}


	public Integer getTempo_crescimento() {
		return tempo_crescimento;
	}


	public void setTempo_crescimento(Integer tempo_crescimento) {
		this.tempo_crescimento = tempo_crescimento;
	}


	public Integer getDificuldade() {
		return dificuldade;
	}


	public void setDificuldade(Integer dificuldade) {
		this.dificuldade = dificuldade;
	}


	public float getTemperatura_minima() {
		return temperatura_minima;
	}


	public void setTemperatura_minima(float temperatura_minima) {
		this.temperatura_minima = temperatura_minima;
	}


	public float getTemperatura_maxima() {
		return temperatura_maxima;
	}


	public void setTemperatura_maxima(float temperatura_maxima) {
		this.temperatura_maxima = temperatura_maxima;
	}
	
}
