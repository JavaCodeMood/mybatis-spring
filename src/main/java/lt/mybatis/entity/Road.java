package lt.mybatis.entity;

import java.math.BigDecimal;

/**
 * Road entity. @author MyEclipse Persistence Tools
 */

public class Road implements java.io.Serializable
{

	// Fields

	private Integer id;
	private String name;
	private BigDecimal shapeLeng;
	private BigDecimal shapeLe1;
	private String geom;
	private String geometry;
	private String type;

	// Constructors

	/** default constructor */
	public Road()
	{
	}

	/** full constructor */
	public Road(String name, BigDecimal shapeLeng, BigDecimal shapeLe1, String geom, String geometry, String type)
	{
		this.name = name;
		this.shapeLeng = shapeLeng;
		this.shapeLe1 = shapeLe1;
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

	public BigDecimal getShapeLeng()
	{
		return this.shapeLeng;
	}

	public void setShapeLeng(BigDecimal shapeLeng)
	{
		this.shapeLeng = shapeLeng;
	}

	public BigDecimal getShapeLe1()
	{
		return this.shapeLe1;
	}

	public void setShapeLe1(BigDecimal shapeLe1)
	{
		this.shapeLe1 = shapeLe1;
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