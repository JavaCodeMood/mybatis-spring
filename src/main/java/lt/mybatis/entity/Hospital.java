package lt.mybatis.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Hospital entity. @author MyEclipse Persistence Tools
 */

public class Hospital implements Serializable
{

	// Fields

	private Integer gid;
	private String name;
	private BigDecimal x;
	private BigDecimal y;
	private String geom;

	// Constructors

	/** default constructor */
	public Hospital()
	{
	}

	/** full constructor */
	public Hospital(String name, BigDecimal x, BigDecimal y, String geom)
	{
		this.name = name;
		this.x = x;
		this.y = y;
		this.geom = geom;
	}

	// Property accessors

	public Integer getGid()
	{
		return this.gid;
	}

	public void setGid(Integer gid)
	{
		this.gid = gid;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public BigDecimal getX()
	{
		return this.x;
	}

	public void setX(BigDecimal x)
	{
		this.x = x;
	}

	public BigDecimal getY()
	{
		return this.y;
	}

	public void setY(BigDecimal y)
	{
		this.y = y;
	}

	public String getGeom()
	{
		return this.geom;
	}

	public void setGeom(String geom)
	{
		this.geom = geom;
	}

}