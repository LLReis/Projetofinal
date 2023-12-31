package br.com.arq.tardis.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="role")
public class Role implements Serializable {
	
	private static final long serialVersionUID = -8059011812600246445L;
	@Id
	private Long id;
	private String profile;
	private Integer levelRole;
	@OneToOne
	@JoinColumn(columnDefinition ="users_id", referencedColumnName="id")
	private Users users;
}
