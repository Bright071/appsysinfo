package MotoVehicle;
/**
 * 
 * �����10.48
 * @author admin
 *
 */
public class Bus extends MotoVehicle{
	private int SeatCount;//��λ
	
	public Bus() {}//�չ�����
	
	//���ι�����
	public Bus(int seatcount) {
		this.SeatCount =seatcount;
	}
	@Override
	public void CalcRent(int days) {
		if(SeatCount>16) {//�ж�
			System.out.println("�ܷ��ã�"+days*1500+"Ԫ");//���㲢������
		}else {
			System.out.println("�ܷ��ã�"+days*800+"Ԫ");//���㲢������
		}
		
	}
}
