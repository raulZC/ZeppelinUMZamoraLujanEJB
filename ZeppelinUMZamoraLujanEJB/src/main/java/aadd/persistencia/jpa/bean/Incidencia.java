package aadd.persistencia.jpa.bean;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "incidencia")

public class Incidencia implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "fecha_creacon", columnDefinition = "DATE")
	private LocalDate fechaCreacion;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "fecha_cierre", columnDefinition = "DATE")
	private LocalDate fechaCierre;
	@Column(name = "comentario_cierre")
	private String comentarioCierre;

	private static final long serialVersionUID = 1L;

	public Incidencia() {
		super();
	}

	// getters y setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFechaCierre() {
		return fechaCierre;
	}

	public void setFechaCierre(LocalDate fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	public String getComentarioCierre() {
		return comentarioCierre;
	}

	public void setComentarioCierre(String comentarioCierre) {
		this.comentarioCierre = comentarioCierre;
	}

}