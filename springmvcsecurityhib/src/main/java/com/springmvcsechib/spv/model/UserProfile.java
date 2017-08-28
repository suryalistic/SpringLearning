package com.springmvcsechib.spv.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;
import lombok.ToString;

@Entity @Table(name="USER_PROFILE")
@Data @ToString(callSuper=false)
public class UserProfile implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id @Column(name="USER_PROFILE_ID") @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer Id;
	@NotEmpty @Column(name="type")
	public String type;
}
