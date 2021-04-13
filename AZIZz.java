import java.util.Scanner;

public class AZIZz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] manth = { { "ãÍÑøã", "íäÇíÑ - January" },
				{ "ÕİÑ", "İÈÑÇíÑ - February"   },
				{ "ÑÈíÚ ÇáÃæá", "ãÇÑÓ - March"  },
				{ "ÑÈíÚ ÇáÂÎÑ", "ÃÈÑíá - April"   },
				{ "ÌãÇÏì ÇáÃæá", "ãÇíæ - May"   },
				{ "ÌãÇÏì ÇáÂÎÑ", "íæäíæ - June"   },
				{ "ÑÌÈ", "íæáíæ - July"   }, 
				{ "ÔÚÈÇä", "ÃÛÓØÓ - August" },
				{ "ÑãÖÇä", "ÓÈÊãÈÑ - September" }, 
				{ "ÔæøÇá", "ÃßÊæÈÑ - October"    },
				{ "Ğæ ÇáŞÚÏÉ", "äæİãÈÑ - November" },
				{ "Ğæ ÇáÍÌÉ", "ÏíÓãÈÑ - December" },
				
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
