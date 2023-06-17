package br.com.arq.tardis.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.arq.tardis.dto.UsersDTO;
import br.com.arq.tardis.service.UsersService;
import lombok.AllArgsConstructor;

@RestController
@ResponseBody
@RequestMapping("/api/users")
@AllArgsConstructor

public class UsersController {
	private final UsersService usersService;

	@PostMapping("/create")
	public ResponseEntity<?> createUser(@RequestBody UsersDTO usersDto) {
		try {
			return ResponseEntity.status(200).body(usersService.createUserService(usersDto));
		} catch (Exception ex) {
			return ResponseEntity.status(500).body("server internal error");

		}
	}

	@GetMapping("/list")
	public ResponseEntity<?> findUser() {
		return ResponseEntity.status(200).body(usersService.findAll());
	}
}
