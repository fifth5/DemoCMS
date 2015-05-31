package com.democms.model.po;

import java.io.Serializable;

import javax.persistence.*;



/**
 * The persistent class for the t_banner database table.
 * 
 */
@Entity
@Table(name="t_banner")
@NamedQuery(name="TBanner.findAll", query="SELECT t FROM TBanner t")
public class TBanner implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private Integer  guid;

	private int bannerId;

	@Column(length=45)
	private String bannerName;

	@Column(length=45)
	private String bannerURL;

	@Column(length=45)
	private String bannerViewName;

	public TBanner() {
	}

	public Integer  getGuid() {
		return this.guid;
	}

	public void setGuid(Integer  guid) {
		this.guid = guid;
	}

	public int getBannerId() {
		return this.bannerId;
	}

	public void setBannerId(int bannerId) {
		this.bannerId = bannerId;
	}

	public String getBannerName() {
		return this.bannerName;
	}

	public void setBannerName(String bannerName) {
		this.bannerName = bannerName;
	}

	public String getBannerURL() {
		return this.bannerURL;
	}

	public void setBannerURL(String bannerURL) {
		this.bannerURL = bannerURL;
	}

	public String getBannerViewName() {
		return this.bannerViewName;
	}

	public void setBannerViewName(String bannerViewName) {
		this.bannerViewName = bannerViewName;
	}

}