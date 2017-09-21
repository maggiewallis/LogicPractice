
public class LogicDemo
{

	public static void main(String[] args)
	{
		displayNot();
		displayAnd();
		displayOr();
		displayAAndTrue();
		displayAOrTrue();
		displayAAndFalse();
		displayAOrFalse();
		displayAAndNotA();
		displayAOrNotA();
		displayDistributeOr();
		displayDistributeAnd();
		displayDeMorgan1();
		displayDeMorgan2();
	}
	
	public static String getNDashes(int N)
	{
		String result = "";
		for (int i=0; i<N; i++)
			if (i%8 == 0)
				result+= "+";
			else
				result+= "-";
		return result;
	}
	
	/**
	 * displays a truth table of A and not A.
	 * +-------+-------+
	 * | A     | !A    |
	 * +-------+-------+
	 * | false | ????? |
	 * | true  | ????? |
	 * +-------+-------+
	 */
	public static void displayNot()
	{
		System.out.println("##################################################");
		System.out.println("Not");
		System.out.println(getNDashes(17));
		System.out.println("|   A\t| not A\t|");
		System.out.println(getNDashes(17));
			
			for (int i = 0; i < 2; i++)
			{
				boolean A = (i < 1);
				System.out.println("| "+A+"\t| "+!A+"\t|");
			}


		System.out.println(getNDashes(17)); // bottom of chart.
		
	}
	/**
	 * displays a truth table of A, B, and A && B
	 * +-------+-------+-------+
	 * | A     | B     | A&&B  |
	 * +-------+-------+-------+
	 * | false | false | ????? |
	 * | false | true  | ????? |
	 * | true  | false | ????? |
	 * | true  | true  | ????? |
	 * +-------+-------+-------+
	 */
	public static void displayAnd()
	{
		System.out.println("##################################################");
		System.out.println("And");
		System.out.println(getNDashes(25));
		System.out.println("| A\t| B\t| A&&B\t|");
		System.out.println(getNDashes(25));
		
		for (int i = 0; i < 2; i++)
		{
			boolean A = (i < 1);
			for (int j = 0; j < 2; j++)
			{
				boolean B = (j < 1);
				System.out.println("| "+A+"\t|" +B+"\t| "+(A&&B)+"\t|");		

			}
			A = !A;
		}
		
		System.out.println(getNDashes(25));
		//System.out.println("| A\t| B\t| A&&B\t|");

		
	}
	/**
	 * displays a truth table of A, B, and A || B
	 * +-------+-------+-------+
	 * | A     | B     | A||B  |
	 * +-------+-------+-------+
	 * | false | false | ????? |
	 * | false | true  | ????? |
	 * | true  | false | ????? |
	 * | true  | true  | ????? |
	 * +-------+-------+-------+
	 */
	public static void displayOr()
	{
		System.out.println("##################################################");
		System.out.println("Or");
		System.out.println(getNDashes(25));
		System.out.println("| A\t| B\t| A||B\t|");
		System.out.println(getNDashes(25));
		for (int i = 0; i < 2; i++)
		{
			boolean A = (i < 1);
			for (int j = 0; j < 2; j++)
			{
				boolean B = (j < 1);
				System.out.println("| "+A+"\t|" +B+"\t| "+(A||B)+"\t|");		

			}
			A = !A;
		}
		System.out.println(getNDashes(25));

	}
	/**
	 * displays a truth table of A and (A && true).
	 * +-------+-------+
	 * | A     | A&&T  |
	 * +-------+-------+
	 * | false | ????? |
	 * | true  | ????? |
	 * +-------+-------+
	 */
	public static void displayAAndTrue()
	{
		System.out.println("##################################################");
		System.out.println("AAndTrue");
		System.out.println(getNDashes(17));
		System.out.println("| A\t| A&&T\t|");
		System.out.println(getNDashes(17));
		for (int i = 0; i < 2; i++)
		{
			boolean A = (i < 1);
			System.out.println("| "+A+"\t| "+(A&&true)+"\t|");		

			A = !A;
		}
		System.out.println(getNDashes(17));

	}
	/**
	 * displays a truth table of A and (A || true).
	 * +-------+-------+
	 * | A     | A||T  |
	 * +-------+-------+
	 * | false | ????? |
	 * | true  | ????? |
	 * +-------+-------+
	 */
	public static void displayAOrTrue()
	{
		System.out.println("##################################################");
		System.out.println("AOrTrue");
		System.out.println(getNDashes(17));
		System.out.println("| A\t| A||T\t|");
		System.out.println(getNDashes(17));
		for (int i = 0; i < 2; i++)
		{
			boolean A = (i < 1);
			System.out.println("| "+A+"\t| "+(A||true)+"\t|");		

			A = !A;
		}
		System.out.println(getNDashes(17));
	}
	/**
	 * displays a truth table of A and (A && false).
	 * +-------+-------+
	 * | A     | A&&F  |
	 * +-------+-------+
	 * | false | ????? |
	 * | true  | ????? |
	 * +-------+-------+
	 */
	public static void displayAAndFalse()
	{
		System.out.println("##################################################");
		System.out.println("AAndFalse");
		System.out.println(getNDashes(17));
		System.out.println("| A\t| A&&F\t|");
		System.out.println(getNDashes(17));
		for (int i = 0; i < 2; i++)
		{
			boolean A = (i < 1);
			System.out.println("| "+A+"\t| "+(A&&false)+"\t|");		

			A = !A;
		}
		System.out.println(getNDashes(17));
	}
	/**
	 * displays a truth table of A and (A || false).
	 * +-------+-------+
	 * | A     | A||F  |
	 * +-------+-------+
	 * | false | ????? |
	 * | true  | ????? |
	 * +-------+-------+
	 */
	public static void displayAOrFalse()
	{
		System.out.println("##################################################");
		System.out.println("AOrFalse");
		System.out.println(getNDashes(17));
		System.out.println("| A\t| A||F\t|");
		System.out.println(getNDashes(17));
		for (int i = 0; i < 2; i++)
		{
			boolean A = (i < 1);
			System.out.println("| "+A+"\t| "+(A||false)+"\t|");		

			A = !A;
		}
		System.out.println(getNDashes(17));
	}
	/**
	 * displays a truth table of A and (A && !A).
	 * +-------+-------+-------+
	 * | A     | !A    | A&&!A |
	 * +-------+-------+-------+
	 * | false | ????? | ????? |
	 * | true  | ????? | ????? |
	 * +-------+-------+-------+
	 */
	public static void displayAAndNotA()
	{
		System.out.println("##################################################");
		System.out.println("AAndNotA");
		System.out.println(getNDashes(25));
		System.out.println("| A\t| !A\t| A&&!A\t|");
		System.out.println(getNDashes(25));
		for (int i = 0; i < 2; i++)
		{
			boolean A = (i < 1);
			System.out.println("| "+A+"\t|" +!A+"\t| "+(A&&!A)+"\t|");		
			A = !A;
		}
		System.out.println(getNDashes(25));
	}
	/**
	 * displays a truth table of A and (A || !A).
	 * +-------+-------+-------+
	 * | A     | !A    | A||!A |
	 * +-------+-------+-------+
	 * | false | ????? | ????? |
	 * | true  | ????? | ????? |
	 * +-------+-------+-------+
	 */
	public static void displayAOrNotA()
	{
		System.out.println("##################################################");
		System.out.println("AOrNotA");
		System.out.println(getNDashes(25));
		System.out.println("| A\t| !A\t| A||!A\t|");
		System.out.println(getNDashes(25));
		for (int i = 0; i < 2; i++)
		{
			boolean A = (i < 1);
			System.out.println("| "+A+"\t|" +!A+"\t| "+(A||!A)+"\t|");		
			A = !A;
		}
		System.out.println(getNDashes(25));
	}
	
	
	/**
	 * displays a truth table of A, B, C, (B && C), (A || B), (A || C), (A || (B && C))
	 * 
	 * D=B&&C, E = A||B, F = A||C, G = A || (B&&C), H = E && F
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 * | A      | B     | C     | D     | E     | F     | G     | H     |
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 * | false  | false | false | ????? | ????? | ????? | ????? | ????? |
	 * | false  | false | true  | ????? | ????? | ????? | ????? | ????? |
	 * | false  | true  | false | ????? | ????? | ????? | ????? | ????? |
	 * | false  | true  | true  | ????? | ????? | ????? | ????? | ????? |
	 * | true   | false | false | ????? | ????? | ????? | ????? | ????? |
	 * etc..
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 */
	public static void displayDistributeOr()
	{
		System.out.println("##################################################");
		System.out.println("DistributeOr");
		System.out.println(getNDashes(65));
		System.out.println("| A\t| B\t| C\t| D\t| E\t| F\t| G\t| H\t|");
		System.out.println(getNDashes(65));
		
		for (int i = 0; i < 2; i++)
		{
			boolean A = (i < 1);
			for (int j = 0; j < 2; j++)
			{
				boolean B = (j < 1);
				for (int k = 0; k < 2; k++)
				{
					boolean C = (k < 1);
					System.out.println("| "+A+"\t|" +B+"\t| "+C+"\t| "+(B&&C)+"\t|"+(A||B)+"\t|"+(A||C)+"\t|"+(A||(B&&C))+"\t|" + ((A||C)&&(A||B))+"\t|");		
				}

			}
			A = !A;
		}
		
		System.out.println(getNDashes(65));
	}
	
	
	/**
	 * displays a truth table of A, B, C, (B || C), (A && B), (A && C), (A && (B || C))
	 * 
	 * D=B||C, E = A&&B, F = A&&C, G = A && (B||C), H = E || F
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 * | A      | B     | C     | D     | E     | F     | G     | H     |
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 * | false  | false | false | ????? | ????? | ????? | ????? | ????? |
	 * | false  | false | true  | ????? | ????? | ????? | ????? | ????? |
	 * | false  | true  | false | ????? | ????? | ????? | ????? | ????? |
	 * | false  | true  | true  | ????? | ????? | ????? | ????? | ????? |
	 * | true   | false | false | ????? | ????? | ????? | ????? | ????? |
	 * etc..
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 */
	public static void displayDistributeAnd()
	{
		System.out.println("##################################################");
		System.out.println("DistributeAnd");
		System.out.println(getNDashes(65));
		System.out.println("| A\t| B\t| C\t| D\t| E\t| F\t| G\t| H\t|");
		System.out.println(getNDashes(65));
		
		for (int i = 0; i < 2; i++)
		{
			boolean A = (i < 1);
			for (int j = 0; j < 2; j++)
			{
				boolean B = (j < 1);
				for (int k = 0; k < 2; k++)
				{
					boolean C = (k < 1);
					System.out.println("| "+A+"\t|" +B+"\t| "+C+"\t| "+(B||C)+"\t|"+(A&&B)+"\t|"+(A&&C)+"\t|"+(A&&(B||C))+"\t|" + ((A&&C)||(A&&B))+"\t|");		
				}

			}
			A = !A;
		}
		
		System.out.println(getNDashes(65));
	}
	/**
	 * displays a truth table of A, B, !A, !B, (A||B), !(A||B), (!A || !B), (!A && !B)
	 * 
	 * C=(A||B), D = !(A||B), E = (!A || !B), F = (!A && !B)
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 * | A      | B     | !A    | !B    | C     | D     | E     | F     |
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 * | false  | false | false | ????? | ????? | ????? | ????? | ????? |
	 * | false  | false | true  | ????? | ????? | ????? | ????? | ????? |
	 * | false  | true  | false | ????? | ????? | ????? | ????? | ????? |
	 * | false  | true  | true  | ????? | ????? | ????? | ????? | ????? |
	 * | true   | false | false | ????? | ????? | ????? | ????? | ????? |
	 * etc..
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 */
	public static void displayDeMorgan1()
	{
		System.out.println("##################################################");
		System.out.println("DeMorgan1");
		System.out.println(getNDashes(65));
		System.out.println("| A\t| B\t| !A\t| !B\t| C\t| D\t| E\t| F\t|");
		System.out.println(getNDashes(65));
		
		for (int i = 0; i < 2; i++)
		{
			boolean A = (i < 1);
			for (int j = 0; j < 2; j++)
			{
				boolean B = (j < 1);
				System.out.println("| "+A+"\t|" +B+"\t| "+!A+"\t| "+!B+"\t|"+(A||B)+"\t|"+!(A||B)+"\t|"+(!A||!B)+"\t|" + (!A&&!B)+"\t|");		

			}
			A = !A;
		}
		
		System.out.println(getNDashes(65));
	}
	/**
	 * displays a truth table of A, B, !A, !B, (A&&B), !(A&&B), (!A || !B), (!A && !B)
	 * 
	 * C=(A&&B), D = !(A&&B), E = (!A || !B), F = (!A && !B)
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 * | A      | B     | !A    | !B    | C     | D     | E     | F     |
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 * | false  | false | false | ????? | ????? | ????? | ????? | ????? |
	 * | false  | false | true  | ????? | ????? | ????? | ????? | ????? |
	 * | false  | true  | false | ????? | ????? | ????? | ????? | ????? |
	 * | false  | true  | true  | ????? | ????? | ????? | ????? | ????? |
	 * | true   | false | false | ????? | ????? | ????? | ????? | ????? |
	 * etc..
	 * +--------+-------+-------+-------+-------+-------+-------+-------+
	 */
	public static void displayDeMorgan2()
	{
		System.out.println("##################################################");
		System.out.println("DeMorgan2");
		System.out.println(getNDashes(65));
		System.out.println("| A\t| B\t| !A\t| !B\t| C\t| D\t| E\t| F\t|");
		System.out.println(getNDashes(65));
		
		for (int i = 0; i < 2; i++)
		{
			boolean A = (i < 1);
			for (int j = 0; j < 2; j++)
			{
				boolean B = (j < 1);
				System.out.println("| "+A+"\t|" +B+"\t| "+!A+"\t| "+!B+"\t|"+(A&&B)+"\t|"+!(A&&B)+"\t|"+(!A||!B)+"\t|" + (!A&&!B)+"\t|");		

			}
			A = !A;
		}
		System.out.println(getNDashes(65));
	}
	
}
