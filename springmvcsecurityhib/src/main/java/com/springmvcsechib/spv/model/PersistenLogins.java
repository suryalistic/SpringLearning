package com.springmvcsechib.spv.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.ToString;

@Entity @Table(name="persistent_logins")
@Data @ToString(callSuper=false)
public class PersistenLogins implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name="USERNAME", unique=true, nullable=false)
	public String username;
	@Id
	public String series;
	@Column(name="TOKEN", unique=true, nullable=false)
	public String token;
	@Temporal(TemporalType.TIMESTAMP)
	public Date lastused;
}
