package com.democms.model.po;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_article database table.
 *
 */
@Entity
@Table(name="t_article")
public class TArticle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, length=45)
	private String guid;

	@Column(length=45)
	private String arthor;

	@Column(length=1024)
	private String content;

	@Lob
	private String deleted;

	@Temporal(TemporalType.TIMESTAMP)
	private Date editTime;

	@Temporal(TemporalType.TIMESTAMP)
	private Date insertTime;

	private int sort;

	@Column(length=45)
	private String title;

	@Column(length=45)
	private String userid;

	public TArticle() {
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getArthor() {
		return this.arthor;
	}

	public void setArthor(String arthor) {
		this.arthor = arthor;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public Date getEditTime() {
		return this.editTime;
	}

	public void setEditTime(Date editTime) {
		this.editTime = editTime;
	}

	public Date getInsertTime() {
		return this.insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	public int getSort() {
		return this.sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}