import java.util.*;
class Solution{
	static float simplyBuy(float d,float i,float con){
		float debtnow;
		float temp;
		temp=d*i/100;
		debtnow=d+temp-con;
		
		return debtnow;
	
	

	}
	public static void main(String[] args) {
		float debt,interest,repayment,c=1,finans,extra=0;
		float ans;
		int ppp;
		Scanner sc=new Scanner(System.in);
		debt=(float)sc.nextInt();
		interest=(float)sc.nextInt();
		repayment=(float)sc.nextInt();
		float constant=debt*repayment/100;
		ans=simplyBuy(debt,interest,constant);			
		while(ans>50)
			{
				ans=simplyBuy(ans,interest,constant);	
				//System.out.println(ans+" ");
				if(ans<50)
					extra=ans;
			c++;	

				}
	finans=c*constant+debt/10+extra;
	ppp=(int)finans;
	System.out.println(ppp);

	}
}