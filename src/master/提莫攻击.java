package master;

public class ��Ī���� {
	public static void main(String[] args) {
		int[] a = {1,3,5,7,9,11,13,15};
		int b = 3;
		System.out.println(findPsisonedDuration(a, b));
	}
	public static int findPsisonedDuration(int[] timeSeries,int duration) {
		int result = 0;
		if( duration <= 0 )
			return 0;
		//ֻҪ��Ī������,��ô�ж�ʱ�����һ����Сֵ
		if ( timeSeries.length > 0 )
			result = duration;
		for( int i=1;i<=timeSeries.length-1;i++ ) {
			//������ι�����������,��ô�ж�ʱ��ͻ�ˢ��
			if ( timeSeries[i] - timeSeries[i-1] <= (duration-1) ) {
				result+=(timeSeries[i] - timeSeries[i-1]);
			}else if ( timeSeries[i] - timeSeries[i-1] > (duration-1) ){
				result += duration;
			}
		}
		return result;
		
	}
}
