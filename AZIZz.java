import java.util.Scanner;

public class AZIZz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] manth = { { "�����", "����� - January" },
				{ "���", "������ - February"   },
				{ "���� �����", "���� - March"  },
				{ "���� �����", "����� - April"   },
				{ "����� �����", "���� - May"   },
				{ "����� �����", "����� - June"   },
				{ "���", "����� - July"   }, 
				{ "�����", "����� - August" },
				{ "�����", "������ - September" }, 
				{ "�����", "������ - October"    },
				{ "�� ������", "������ - November" },
				{ "�� �����", "������ - December" },
				
		};
		
		System.out.print(" Write the month in Hijri : ");

		Scanner r = new Scanner(System.in);

		String w = (r.next());

		for (int i = 0; i < manth.length; i++) {

			if (w.equals(manth[i][0])) {

				System.out.print(manth[i][1] + " manth");

				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
