package projetointegrador.mah.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


	@Entity
	@Table(name = "postagem")
	public class Postagem {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;

		@NotNull
		@Size(min = 5, max = 100)
		private String usuario;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		public String getComentario() {
			return comentario;
		}

		public void setComentario(String comentario) {
			this.comentario = comentario;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public Tema getTema() {
			return tema;
		}

		public void setTema(Tema tema) {
			this.tema = tema;
		}

		@NotNull
		@Size(min = 10, max = 500)
		private String comentario;

		@Temporal(TemporalType.TIMESTAMP)
		private Date date = new java.sql.Date(System.currentTimeMillis());

		@ManyToOne
		@JsonIgnoreProperties("postagem")
		private Tema tema;

	
	}
