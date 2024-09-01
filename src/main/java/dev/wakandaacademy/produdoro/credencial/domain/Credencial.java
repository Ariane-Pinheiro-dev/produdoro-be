package dev.wakandaacademy.produdoro.credencial.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collation = "Credencial")
public class Credencial {
	@MongoId(targetType = FieldType.STRING)
	@Getter
	private String usuario;
	private String senha;

	public Credencial(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = new BCryptPasswordEncoder().encode(senha);

	}
	
	public String getPassword() {
		return senha;
	}
    
    
}