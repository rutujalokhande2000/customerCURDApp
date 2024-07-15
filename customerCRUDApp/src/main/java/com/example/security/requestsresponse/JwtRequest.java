package com.example.security.requestsresponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class JwtRequest {
	
	private String jqtToken;
	    private String username;
	    private String password;
		public String getUsername() {
			// TODO Auto-generated method stub
			return null;
		}
		public String getPassword() {
			// TODO Auto-generated method stub
			return null;
		}
	
		}
	


