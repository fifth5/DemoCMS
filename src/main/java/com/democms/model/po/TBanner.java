package com.democms.model.po;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;



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
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2") 
	@Column(unique=true, nullable=false,length=45)
	private String  guid;

	private int bannerId;

	@Column(length=45)
	private String bannerName;

	@Column(length=45)
	private String bannerURL;

	@Column(length=45)
	private String bannerViewName;

	@Column(length=45)
	private String resourceID;
	
	public TBanner() {
	}

	public String  getGuid() {
		return this.guid;
	}

	public void setGuid(String  guid) {
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

	public String getResourceID() {
		return resourceID;
	}

	public void setResourceID(String resourceID) {
		this.resourceID = resourceID;
	}

}