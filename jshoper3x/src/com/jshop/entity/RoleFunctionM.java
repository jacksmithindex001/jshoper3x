package com.jshop.entity;

// Generated 2014-8-31 17:32:38 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * RoleFunctionM generated by hbm2java
 */
@Entity
@Table(name = "role_function_m", catalog = "jshoper3")
public class RoleFunctionM implements java.io.Serializable {

	private String id;
	private String roleid;
	private String functionid;

	public RoleFunctionM() {
	}

	public RoleFunctionM(String id, String roleid, String functionid) {
		this.id = id;
		this.roleid = roleid;
		this.functionid = functionid;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "ROLEID", nullable = false, length = 20)
	public String getRoleid() {
		return this.roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	@Column(name = "FUNCTIONID", nullable = false, length = 20)
	public String getFunctionid() {
		return this.functionid;
	}

	public void setFunctionid(String functionid) {
		this.functionid = functionid;
	}

}
