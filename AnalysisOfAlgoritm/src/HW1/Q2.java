package HW1;
import java.util.concurrent.TimeUnit;
public class Q2 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

		
			long list[]=new long[7];
			list[0]=TimeUnit.MICROSECONDS.convert(1, TimeUnit.SECONDS);
			list[1]=TimeUnit.MICROSECONDS.convert(1, TimeUnit.MINUTES);
			list[2]=TimeUnit.MICROSECONDS.convert(1, TimeUnit.HOURS);
			list[3]=TimeUnit.MICROSECONDS.convert(1, TimeUnit.DAYS);
			list[4]=TimeUnit.MICROSECONDS.convert(30, TimeUnit.DAYS);
			list[5]=TimeUnit.MICROSECONDS.convert(365, TimeUnit.DAYS);
			list[6]=TimeUnit.MICROSECONDS.convert(36524, TimeUnit.DAYS);

			long x=10000;

			while(x*(Math.log(x)/Math.log(2))<=list[1]) {
				 x++;
			}
			
			long b=1;		
			while(factoriel(b)<list[5]) {
				b++;
			}
			System.out.println(b-1);

			System.out.println(x-1);
				}
		
		
		public static long factoriel(long n) {
			long r=1;
			for(int i=1;i<=n;i++) {
				r=r*i;
			}
			
			return r;
				
		}

			}