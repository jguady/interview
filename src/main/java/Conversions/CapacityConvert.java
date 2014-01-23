package Conversions;

public class CapacityConvert {

	
	public double translateCapcity(long capacityInBytes, int unit){	
					
		        	
		        
		        double capacity=0;	
		        switch(unit){	
				case 0://GiB:	
					capacity=(double)capacityInBytes;
					capacity/=(Math.pow(1024,3));
					break;	
				case 1://KiB:	
	
					capacity=(double)capacityInBytes/1024;	
					break;	
				case 2://MiB:	
					capacity=(double)capacityInBytes/1024/1024;	
					break;	
				case 3://PiB:	
					capacity=(double)capacityInBytes/1024/1024/1024/1024/1024;	
					break;	
				case 4://TiB:	
					capacity=(double)capacityInBytes/1024/1024/1024/1024;	
					break;	
				case 5://iB:	
					capacity=capacityInBytes;	
					break;	
				default:	
					capacity=(double)capacityInBytes/1024/1024/1024;	
					break;	
		        }
		        //assumes round off of 2 decimals
				return capacity;
			}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CapacityConvert convert = new CapacityConvert();
		long capacity= 100000001L;
		double val = convert.translateCapcity(capacity, 5);
		System.out.println(val);
		
	}

}
