package bak.implement;

import java.util.Scanner;

/**
 * 
 * @author jgs ��ٳ��忡�� ���� �� �ȸ��� �޴��� ��Ʈ �޴��̴�. �ֹ��� ��, �ڽ��� ���ϴ� �ܹ��ſ� ���Ḧ �ϳ��� ���, ��Ʈ��
 *         �����ϸ�, ������ �հ迡�� 50���� �� ������ ��Ʈ �޴��� ������ �ȴ�.
 * 
 *         �ܹ��Ŵ� �� 3���� �������, �ߴ�����, �ϴ����Ű� �ְ�, ����� �ݶ�� ���̴� �� ������ �ִ�.
 * 
 *         �ܹ��ſ� ������ ������ �־����� ��, ���� �� ��Ʈ �޴��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 *         �Է� �Է��� �� �ټ� ���̴�. 
 *         ù° �ٿ��� �������,
 *          ��° �ٿ��� �ߴ����� 
 *          ��° �ٿ��� �ϴ������� ������ �־�����. 
 *          ��°      �ٿ��� �ݶ��� ����, 
 *          �ټ�° �ٿ��� ���̴��� ������ �־�����. ��� ������ 100�� �̻�, 2000�� �����̴�.
 * 
 *         ��� ù° �ٿ� ���� �� ��Ʈ �޴��� ������ ����Ѵ�.
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
