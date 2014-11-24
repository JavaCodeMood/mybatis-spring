package lt.mybatis.entity;

/**
 * Community entity. @author MyEclipse Persistence Tools
 */

public class Community implements java.io.Serializable
{

	// Fields

	private Integer id;
	private String name;
	private String geom;
	private String geometry;
	private String type;

	// Constructors

	/** default constructor */
	public Community()
	{
	}

	/** full constructor */
	public Community(String name, String geom, String geometry, String type)
	{
		this.name = name;
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