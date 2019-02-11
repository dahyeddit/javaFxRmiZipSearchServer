package rmi.zip.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import rmi.zip.vo.ZipVO;
import util.BuildedSqlMapClient;

public class ZipSearchDaoImpl implements IZipSearchDao{

	//싱글톤만들기 시작
	private static ZipSearchDaoImpl dao;
	private SqlMapClient smc;
	
	private ZipSearchDaoImpl() {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	
	public static ZipSearchDaoImpl getInstance() {
		if(dao==null) dao = new ZipSearchDaoImpl();
		return dao;
	}
	//---------------------------------------------------
	
	@Override
	public List<ZipVO> getZipSearchDong(String dong) {
		List<ZipVO> zipList = null;
		try {
			zipList = smc.queryForList("zip.getZipSearchDong",dong);
		} catch (SQLException e) {
			zipList = null;
			e.printStackTrace();
		}
		return zipList;
	}

	@Override
	public List<ZipVO> getZipSearchCode(String code) {
		List<ZipVO> zipList = null;
		try {
			zipList = smc.queryForList("zip.getZipSearchCode",code);
		} catch (SQLException e) {
			zipList = null;
			e.printStackTrace();
		}
		return zipList;
	}

}
