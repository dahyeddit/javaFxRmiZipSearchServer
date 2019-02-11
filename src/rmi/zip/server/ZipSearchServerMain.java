package rmi.zip.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import rmi.zip.service.IZipSearchService;
import rmi.zip.service.ZipSearchServiceImpl;

public class ZipSearchServerMain {
	public static void main(String[] args) {
		try {
			IZipSearchService zipService = new ZipSearchServiceImpl();
			
			Registry reg = LocateRegistry.createRegistry(9988);
			
			//클라이언트에서 컨트롤러에서 서비스객체 생성할때 reg.lookup할떄 써줘란
			reg.rebind("zipSearch", zipService);
			
			System.out.println("서버 준비 완료...");
			
			
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
