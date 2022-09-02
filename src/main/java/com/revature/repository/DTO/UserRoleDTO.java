package com.revature.repository.DTO;

import java.util.Objects;

public class UserRoleDTO {

	private Integer role_id;
	
	private Integer role_type;

	public UserRoleDTO(Integer role_id, Integer role_type) {
		super();
		this.role_id = role_id;
		this.role_type = role_type;
	}

	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}

	public Integer getRole_type() {
		return role_type;
	}

	public void setRole_type(Integer role_type) {
		this.role_type = role_type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(role_id, role_type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserRoleDTO other = (UserRoleDTO) obj;
		return Objects.equals(role_id, other.role_id) && Objects.equals(role_type, other.role_type);
	}

	@Override
	public String toString() {
		return "UserRoleDTO [role_id=" + role_id + ", role_type=" + role_type + "]";
	}
	
	
	
	
}
