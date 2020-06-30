/**
 * 
 */
package customerList;

import java.net.Socket;

/**
 * �û���
 * @author �¸� 2019��11��20��
 */
public class Customer {
	private Socket mySocket; // �û���Ӧ��socket����
	private String name; // �ǳ�
	private int id; // id��
	private String password; // ����

	/**
	 * @param id       id��
	 * @param password ����
	 * @param nickname �ǳ�
	 */
	public Customer(int id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
		mySocket = null;
	}

	/**
	 * ��������
	 * @param password ����
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * �����ǳ�
	 * @param nickname �ǳ�
	 */
	public void setName(String nickname) {
		this.name = nickname;
	}

	/**
	 * ����socket
	 * @param s socket����
	 */
	public void setSocket(Socket s) {
		mySocket = s;
	}
	
	/**
	 * ��ȡID
	 * @return �û�ID
	 */
	public int getID() {
		return id;
	}

	/**
	 * ��ȡ����
	 * @return �û�����
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * ��ȡ�ǳ�
	 * @return �û��ǳ�
	 */
	public String getName() {
		return name;
	}

	/**
	 * ��ȡsocket
	 * @return �û���Ӧ��socket
	 */
	public Socket getSocket() {
		return mySocket;
	}

	/**
	 * ��дcampareTo����
	 * @param c ��Ҫ�ȽϵĶ���
	 * @return 1��0��-1�ֱ��ʾ����ȣ�С
	 */
	public int compareTo(Customer c) {
		if (c.getID() < id) {
			return -1;
		} else if (c.getID() > id) {
			return 1;
		} else {
			return 0;
		}
	}

	/**
	 * ��дtoString����
	 */
	public String toString() {
		return id + " " + password + " " + name + " ";
	}
}
