package rmi.zip.dao;

import java.util.List;

import rmi.zip.vo.ZipVO;

public interface IZipSearchDao {
	/**
	 * 동이름을 문자열로 받아서 해당 데이터를 검색하는 메서드
	 * @param dong 검색할 동이름
	 * @return 검색된 우편번호정보를 갖는 List
	 */
	public List<ZipVO> getZipSearchDong(String dong);

	/**
	 * 우편번호의 일부분을 매개변수로 받아서 해당 데이터를 검색하는 메서드
	 * @param code 검색할 우편번호 일부분
	 * @return 검색된 우편번호정보 갖는 List
	 */
	public List<ZipVO> getZipSearchCode(String code);


}
