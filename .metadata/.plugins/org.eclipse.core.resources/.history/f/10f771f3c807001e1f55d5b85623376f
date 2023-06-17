package br.com.arq.tardis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.arq.tardis.dto.UsersDTO;
import br.com.arq.tardis.entity.Role;
import br.com.arq.tardis.entity.Users;
import br.com.arq.tardis.repository.RoleRepository;
import br.com.arq.tardis.repository.UsersRepository;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Service
public class UsersService {
	
	private final UsersRepository usersRepository;
    private final RoleRepository roleRespository;
    
	public Object createUserService(UsersDTO usersDto) {
		try {
	    Role role = usersDto.getRole(); // O Objeto Agrupado ....
	    
		Users resp =  usersRepository.save( usersDto.createEntityUsers());
		 if (resp==null) {
			 throw new IllegalArgumentException("User not saved"); 
		 }
		role.setUsers(resp);
		Role respRole= roleRespository.save(role);
		 if (respRole==null) {
			 throw new IllegalArgumentException("Role not saved");
		 }
		  resp.setRole(respRole);
		  return  resp;
		}catch(Exception ex) {
			throw new IllegalArgumentException("500, Internal Server Error");
		}
	}
	
	
	
	public List<Users> findAll(){
		return usersRepository.findAll();
	}
	
	
	
	
}
