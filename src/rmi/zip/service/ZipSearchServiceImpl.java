package rmi.zip.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import rmi.zip.dao.IZipSearchDao;
import rmi.zip.dao.ZipSearchDaoImpl;
import rmi.zip.vo.ZipVO;

// RMI용
public class ZipSearchServiceImpl extends UnicastRemoteObject implements IZipSearchService{

	// 리모트용이라서 싱글톤 해줄필요없당
	private IZipSearchDao dao;
	
	// 생성자
	public ZipSearchServiceImpl() throws RemoteException {
		dao = ZipSearchDaoImpl.getInstance();
	}
	//---------------------------------------------------------------------
	
	@Override
	public List<ZipVO> getZipSearchDong(String dong) throws RemoteException {
		return dao.getZipSearchDong(dong);
	}

	@Override
	public List<ZipVO> getZipSearchCode(String code) throws RemoteException {
		// TODO Auto-generated method stub
		return dao.getZipSearchCode(code);
	}
	
}
