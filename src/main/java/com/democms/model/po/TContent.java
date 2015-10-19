package com.democms.model.po;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the t_banner database table.
 * 
 */
@Entity
@Table(name="t_content")
public class TContent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	@Column(unique=true, nullable=false,length=45)
	private String  guid;

	@Column(length=45)
	private String contentName;

	@Column(length=45)
	private String contentType;

	@Column(length=45)
	private String arthor;

	@Column(length=45)
	private Date insertTime;

}