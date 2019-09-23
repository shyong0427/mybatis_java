package pack;

import java.util.List;

public class Main {
	public static void main(String[] args) {
//		ProcessDao dao = new ProcessDao();
//		ProcessDao dao2 = new ProcessDao();
		
//		System.out.println(dao + " " + dao2);
		
		ProcessDao dao = ProcessDao.getInstance();
		ProcessDao dao2 = ProcessDao.getInstance();
		System.out.println(dao + " " + dao2);
		
		try {
			System.out.println("전체자료 출력 ---------------");
			
			List<ProductBean> list = dao.selectdataAll();
			
			for(ProductBean s : list) {
				System.out.println(s.getCode() + " " + s.getSang() + " " + s.getSu() + " " + s.getDan());
			}
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}
}