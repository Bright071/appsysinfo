package MotoVehicle;
/**
 * 
 * 这个是10.48
 * @author admin
 *
 */
public class Bus extends MotoVehicle{
	private int SeatCount;//座位
	
	public Bus() {}//空构造体
	
	//传参构造体
	public Bus(int seatcount) {
		this.SeatCount =seatcount;
	}
	@Override
	public void CalcRent(int days) {
		if(SeatCount>16) {//判断
			System.out.println("总费用："+days*1500+"元");//计算并输出结果
		}else {
			System.out.println("总费用："+days*800+"元");//计算并输出结果
		}
		
	}
}
