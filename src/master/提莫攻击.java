package master;

public class 提莫攻击 {
	public static void main(String[] args) {
		int[] a = {1,3,5,7,9,11,13,15};
		int b = 3;
		System.out.println(findPsisonedDuration(a, b));
	}
	public static int findPsisonedDuration(int[] timeSeries,int duration) {
		int result = 0;
		if( duration <= 0 )
			return 0;
		//只要提莫攻击了,那么中毒时间就有一个最小值
		if ( timeSeries.length > 0 )
			result = duration;
		for( int i=1;i<=timeSeries.length-1;i++ ) {
			//如果两段攻击是连续的,那么中毒时间就会刷新
			if ( timeSeries[i] - timeSeries[i-1] <= (duration-1) ) {
				result+=(timeSeries[i] - timeSeries[i-1]);
			}else if ( timeSeries[i] - timeSeries[i-1] > (duration-1) ){
				result += duration;
			}
		}
		return result;
		
	}
}
