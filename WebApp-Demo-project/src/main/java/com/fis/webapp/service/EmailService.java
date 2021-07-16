package com.fis.webapp.service;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
	String name;
	String domain;
	String username;
	public EmailService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmailService(String name, String domain, String username) {
		super();
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((domain == null) ? 0 : domain.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmailService other = (EmailService) obj;
		if (domain == null) {
			if (other.domain != null)
				return false;
		} else if (!domain.equals(other.domain))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	public String getDomain()
	{
		return name.substring(name.indexOf("@")+1);
	}
	public void setDomain(String domain)
	{
		this.domain=domain;
	}
	public String getUsername()
	{
		int index=name.indexOf("@");
		return name.substring(0,index);
	}
	public void setUsername(String username)
	{
		this.username=username;
	}
	

}
