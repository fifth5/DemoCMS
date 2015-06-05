package com.democms.model.po;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_role database table.
 * 
 */
@Entity
@Table(name="t_role")
@NamedQuery(name="TRole.findAll", query="SELECT t FROM TRole t")
public class TRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, length=45)
	private int guid;

	@Column(length=45)
	private String rolename;

	public TRole() {
	}

	public int getGuid() {
		return this.guid;
	}

	public void setGuid(int guid) {
		this.guid = guid;
	}

	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

}