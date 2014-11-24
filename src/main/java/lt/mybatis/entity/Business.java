package lt.mybatis.entity;

import java.math.BigDecimal;

/**
 * Business entity. @author MyEclipse Persistence Tools
 */

public class Business implements java.io.Serializable
{

	// Fields

	private Integer id;
	private String name;
	private BigDecimal x;
	private BigDecimal y;
	private String geom;
	private String geometry;
	private String type;

	// Constructors

	/** default constructor */
	public Business()
	{
	}

	/** full constructor */
	public Business(String name, BigDecimal x, BigDecimal y, String geom, String geometry, String type)
	{
		this.name = name;
		this.x = x;
		this.y = y;
		this.geom = geom;
		this.geometry = geometry;
		this.type = type;
	}

	// Property accessors

	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
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

	public String getGeometry()
	{
		return this.geometry;
	}

	public void setGeometry(String geometry)
	{
		this.geometry = geometry;
	}

	public String getType()
	{
		return this.type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

}