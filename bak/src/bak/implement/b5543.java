package bak.implement;

import java.util.Scanner;

/**
 * 
 * @author jgs 상근날드에서 가장 잘 팔리는 메뉴는 세트 메뉴이다. 주문할 때, 자신이 원하는 햄버거와 음료를 하나씩 골라, 세트로
 *         구매하면, 가격의 합계에서 50원을 뺀 가격이 세트 메뉴의 가격이 된다.
 * 
 *         햄버거는 총 3종류 상덕버거, 중덕버거, 하덕버거가 있고, 음료는 콜라와 사이다 두 종류가 있다.
 * 
 *         햄버거와 음료의 가격이 주어졌을 때, 가장 싼 세트 메뉴의 가격을 출력하는 프로그램을 작성하시오.
 * 
 *         입력 입력은 총 다섯 줄이다. 
 *         첫째 줄에는 상덕버거,
 *          둘째 줄에는 중덕버거 
 *          셋째 줄에는 하덕버거의 가격이 주어진다. 
 *          넷째      줄에는 콜라의 가격, 
 *          다섯째 줄에는 사이다의 가격이 주어진다. 모든 가격은 100원 이상, 2000원 이하이다.
 * 
 *         출력 첫째 줄에 가장 싼 세트 메뉴의 가격을 출력한다.
 */
public class b5543 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sanduck=scan.nextInt();
		int jungduck=scan.nextInt();
		int haduck=scan.nextInt();
		int cola=scan.nextInt();
		int sida=scan.nextInt();
		
		int sangDuckSet= (sanduck+cola >sanduck+sida ?sanduck+sida : sanduck+cola );
		int jungDuckSet=(jungduck+cola >jungduck+sida ?jungduck+sida : jungduck+cola );
		int haDuckSet=(haduck+cola >haduck+sida ?haduck+sida : haduck+cola );

		int result=0;
		
		if(sangDuckSet<=jungDuckSet && sangDuckSet<=haDuckSet){
			result=sangDuckSet;
		}
		
		else if(jungDuckSet<=sangDuckSet && jungDuckSet<=haDuckSet){
			result=jungDuckSet;
		}
		else{
			result=haDuckSet;
		}
		
		System.out.println(result-50);
		
		
		
		
		
	}

}
