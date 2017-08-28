package com.springmvcsechib.spv.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;
import lombok.ToString;

@Entity @Table(name="APP_USER")
@Data @ToString(callSuper=false)
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@NotEmpty	@Id @Column(name="USER_ID") @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer id;
	@NotEmpty @Column(name="sso_id")
	public String ssoId;
	@NotEmpty @Column(name="password")
	public String password;
	@NotEmpty @Column(name="email")
	public String emailId;
	@NotEmpty @Column(name="first_name")
	public String firstName;
	@NotEmpty @Column(name="last_name")
	public String lastName;
	
	@NotEmpty
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="APP_USER_USER_PROFILE",
			joinColumns={@JoinColumn(referencedColumnName="USER_ID")},
			inverseJoinColumns={@JoinColumn(referencedColumnName="USER_PROFILE_ID")})
	public Set<UserProfile> userProfiles;
}
