package com.github.user_mgmt_ms.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("USERS")
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class User {
	@Id
	private String id;
	private String username;
	private String password;
	private String email;
	private String phone;
	public String firstName;
	public String lastName;

}
