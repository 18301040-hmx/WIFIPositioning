/**
 * 
 */
package customerList;

import java.util.Comparator;

/**
 * �û��Ƚ�����
 * @author �¸� 2019��11��21��
 */
public class CustomerComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		return c1.compareTo(c2);
	}
}
