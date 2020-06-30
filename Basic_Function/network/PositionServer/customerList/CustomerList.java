/**
 * 
 */
package customerList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * �û������࣬��ʵ��
 * @author �¸� 2019��11��21��
 */
public class CustomerList {
	private static CustomerList list = new CustomerList(); //��ʵ������
	private ArrayList<Customer> cList; //�û�����
	
	/**
	 * ������
	 */
	private CustomerList() {
		cList = new ArrayList<Customer>();
	}
	
	/**
	 * ��ȡ�û�����
	 * @return
	 */
	public ArrayList<Customer> getCustomerList(){
		return cList;
	}
	
	/**
	 * ������û���ID�Զ�����
	 * @param password ����
	 * @param nickname �ǳ�
	 * @return ���ظ��û�
	 */
	public Customer addNewCustomer(String password, String nickname){
		Customer c = new Customer(cList.get(cList.size() - 1).getID() + 1, password, nickname);
		cList.add(c);
		return c;
	}
	
	/**
	 * �û�����
	 */
	public void sortList() {
		cList.sort(new CustomerComparator());
	}
	
	/**
	 * ������������һ���û�
	 * @param id �û���ID
	 * @param password �û�������
	 * @return �ҵ��򷵻��û���δ�ҵ��򷵻�null
	 */
	public Customer searchCustomer(int id, String password) {
		Iterator<Customer> it = cList.iterator();
		while (it.hasNext()) {
			Customer c = it .next();
			if (c.getID() == id && c.getPassword().equals(password)) {
				return c;
			}
		}
		return null;
	}
	
	/**
	 * ��ȡ����ĵ�ʵ������
	 * @return ��ʵ������
	 */
	public static CustomerList getList() {
		return list;
	}
	
	/**
	 * ��дtoString����
	 */
	public String toString() {
		String str = "";
		for (int i = 0; i < cList.size(); i++) {
			str += cList.get(i).toString() + "\n";
		}
		return str;
	}
}
