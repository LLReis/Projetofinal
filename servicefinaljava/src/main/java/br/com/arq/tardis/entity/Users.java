package br.com.arq.tardis.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table (name="users")
public class Users implements Serializable{

	private static final long serialVersionUID = -9090802407423886277L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String password;
	@Column(unique=true)
	private String email;
	private String token;
	private Integer status;
	@OneToOne(mappedBy="users", cascade=CascadeType.ALL)
	private Role role;
	
	
}
