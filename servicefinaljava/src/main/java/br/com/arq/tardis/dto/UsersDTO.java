package br.com.arq.tardis.dto;


import br.com.arq.tardis.entity.Role;
import br.com.arq.tardis.entity.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class UsersDTO {
	
	private Long id;
	private String name;
	private String password;
	private String email;
	private Long idRole;
	private String token;
	private Integer status;
    private String profile;
	private Integer levelRole;
	private Role role;
	

	//Nao serve para gravar com id
	public Users createEntityUsers() {
		 Users users = new Users();
		 users.setName(this.name);
         users.setEmail(this.email);
         users.setPassword(this.password);
         return users;
	}
//    public Role createEntityRole() {
//	  Role role = new Role();
//	  role.setLevelRole(this.levelRole);
//	  role.setProfile(this.profile);
//	  return role;
//  }
   
    public Users updateEntityUsers() {
		 Users users = new Users();
		  users.setId(this.getIdRole());
		  users.setName(this.name);
          users.setEmail(this.email);
          users.setPassword(this.password);
       return users;
	} 
   
 
   
   
}