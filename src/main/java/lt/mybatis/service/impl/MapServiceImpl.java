package lt.mybatis.service.impl;

import lt.mybatis.service.IMapService;

public class MapServiceImpl implements IMapService
{
	// public GeoJsonType getHospitals()
	// {
	// GeoJsonType geoJsonType = new GeoJsonType();
	// geoJsonType.setType("FeatureCollection");
	// GeoJsonFeature geoJsonFeature;
	// List<Hospital> hospitals = mapHDAO.getHospital();
	// for (Hospital hospital : hospitals)
	// {
	// geoJsonFeature = new GeoJsonFeature();
	//
	// }
	// return geoJsonType;
	// // return hospitalHDAO.getHospital();
	// }
	//
	// public GeoJsonType getRoads()
	// {
	// GeoJsonType geoJsonType = new GeoJsonType();
	// geoJsonType.setType("FeatureCollection");
	// GeoJsonFeature geoJsonFeature;
	// List<GeoJsonFeature> geoJsonFeatures = new ArrayList<GeoJsonFeature>();
	// List<Road> roads = mapHDAO.getRoad();
	// for (Road road : roads)
	// {
	// geoJsonFeature = new GeoJsonFeature();
	//
	// // 设置type
	// geoJsonFeature.setType("Feature");
	//
	// // 设置geometry
	//
	// GeoJsonGeometry geoJsonGeometry = new GeoJsonGeometry();
	// String[] astrString = road.getGeometry().split("\"");
	// geoJsonGeometry.setType(astrString[3]);
	//
	// // astrString[6].replaceFirst(":", "")
	// String textString = astrString[6].replaceFirst(":", "");
	// textString = textString.replaceAll("}", "");
	// geoJsonGeometry.setCoordinates(textString);
	//
	// geoJsonFeature.setGeometry(geoJsonGeometry);
	//
	// // 设置properties
	// GeoJsonProperty geoJsonProperty = new GeoJsonProperty();
	// geoJsonProperty.setName(road.getName());
	// geoJsonFeature.setProperties(geoJsonProperty);
	//
	// geoJsonFeatures.add(geoJsonFeature);
	// }
	// geoJsonType.setFeatures(geoJsonFeatures);
	//
	// return geoJsonType;
	// }
	//
	// // 缓冲区分析作为json数据传出
	// public GeoJsonType getBufferFun()
	// {
	//
	// // IMapService service = (IMapService) SpringContextUtil.getBean("mapService");
	// // System.out.println(sdObject);
	//
	// Connection dbConnection = mapHDAO.getConnectionDB();
	// String sql =
	// "SELECT st_asgeojson(fun.geom) as geometry,fun.name as name FROM fun join business on ST_DWithin(fun.geom,business.geom,5000)where business.name='白云商厦'";
	// Statement stmt = null;
	// ResultSet rs = null;
	// GeoJsonType geoJsonType = null;
	//
	// try
	// {
	// stmt = dbConnection.createStatement();
	//
	// rs = stmt.executeQuery(sql);
	//
	// geoJsonType = new GeoJsonType();
	// geoJsonType.setType("FeatureCollection");
	// GeoJsonFeature geoJsonFeature;
	// List<GeoJsonFeature> geoJsonFeatures = new ArrayList<GeoJsonFeature>();
	// int id = 0;
	// while (rs.next())
	// {
	// geoJsonFeature = new GeoJsonFeature();
	//
	// // 设置type
	// geoJsonFeature.setType("Feature");
	//
	// // 设置geometry
	//
	// GeoJsonGeometry geoJsonGeometry = new GeoJsonGeometry();
	//
	// // System.out.print(rs.getString("geometry"));
	// String[] astrString = rs.getString("geometry").split("\"");
	//
	// geoJsonGeometry.setType(astrString[3]);
	//
	// System.out.print(astrString[3]);
	//
	// // astrString[6].replaceFirst(":", "")
	// String textString = astrString[6].replaceFirst(":", "");
	// textString = textString.replaceAll("}", "");
	// geoJsonGeometry.setCoordinates(textString);
	//
	// geoJsonFeature.setGeometry(geoJsonGeometry);
	//
	// // 设置ID
	// geoJsonFeature.setId(id);
	// id++;
	// // 设置properties
	// GeoJsonProperty geoJsonProperty = new GeoJsonProperty();
	// geoJsonProperty.setName(rs.getString("name"));
	// geoJsonFeature.setProperties(geoJsonProperty);
	//
	// geoJsonFeatures.add(geoJsonFeature);
	//
	// }
	// geoJsonType.setFeatures(geoJsonFeatures);
	// stmt.close();
	// } catch (SQLException e)
	// {
	// e.printStackTrace();
	// }
	// return geoJsonType;
	// }
	//

}
