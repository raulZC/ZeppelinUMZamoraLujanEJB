package aadd.persistencia.jpa.bean;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "plato")
@NamedQueries({
		@NamedQuery(name = "Plato.findPlatosDisponiblesByRestaurante", query = " SELECT p FROM Plato p WHERE p.disponibilidad = true and p.restaurante.id = :restaurante ") })
public class Plato implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "titulo")
	private String titulo;
	@Column(name = "descripcion")
	@Lob
	private String descripcion;
	@Column(name = "precio")
	private Double precio;
	@Column(name = "disponibilidad")
	private boolean disponibilidad;
	@ManyToOne
	@JoinColumn(name = "restaurante")
	private Restaurante restaurante;

	private static final long serialVersionUID = 1L;

	public Plato() {
		super();
	}

	// getters y setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

}