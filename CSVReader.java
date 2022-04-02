package Read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class CSVReader 
{

	public static void main(String[] args) 
	throws IOException
	{
		readCsvUsingScanner("E:\\new\\student-grading-java\\src\\test\\resources\\grades.csv");
	}
	private static void readCsvUsingScanner(String filepath)
	{
		try
		{
			int jh=0,jhm = 0,stm = 0,jhmn = 0,phm = 0,ppm = 0;
			String ay = "",as = "",any = "",amy = "",hgt = "",mju = "",jku="",hy = "",py = "",po = "",sd = "",al = "";
			String rs = "Duke University               ",ty = "University of Florida      ", gh = "Union College                ",jo = "University of California",uh = "Boston University           ";
			Scanner sc = new Scanner(new File(filepath));
			String line = sc.nextLine();
			//System.out.println("  First Name      Second Name        university      Test1     Test2     Test3    Test4    Final     Grade " );
				while(sc.hasNext())
				{ 
					line = sc.nextLine();
					String ary[] = line.split(",");
					String ab = ary[0];
					String at = ary[1];
					String am = ary[2];
					int k = Integer.parseInt(ary[3]);
					int kh = Integer.parseInt(ary[4]);
					int kg = Integer.parseInt(ary[5]);
					int kt = Integer.parseInt(ary[6]);
					int mh = (k + kh + kg + kt);
					int p = mh/4;
					
					if(rs.equals(am) && jhm < mh)
					{
						jhm = mh;
						 any = ary[0];
						 as = ary[1];
					  }
					if(ty.equals(am) && stm < mh)
					{
						stm = mh;
						 mju = ary[0];
						 sd = ary[1]; 
					  }
					if(gh.equals(am) && jhmn < mh)
					{
						jhmn = mh;
						 amy = ary[0];
						 py = ary[1];
					  }
					if(jo.equals(am) && phm < mh)
					{
						phm = mh;
						 jku = ary[0];
						 hy = ary[1];
					  }
					if(uh.equals(am) && ppm < mh)
					{
						ppm = mh;
						hgt  = ary[0];
						 po = ary[1];
					  }
						if(jh < mh)
						{
							jh = mh;
							
							 ay = ary[0];
							 al = ary[1];
						}
						
					if(p < 35)
					{
				        System.out.println(ab + "\t" + at + "\t" + am + "\t" + k +"\t" + kh + "\t" + kg + "\t" + kt + "\t" + mh + "\t F " );
					}
					else if(p >= 35 && p < 50)
					{
						 System.out.println(ab + "\t" + at + "\t" + am + "\t" + k +"\t" + kh + "\t" + kg + "\t" + kt + "\t" + mh + "\t C " );
					}
					else if(p >= 50 && p < 70)
					{
						 System.out.println(ab + "\t" + at + "\t" + am + "\t" + k +"\t" + kh + "\t" + kg + "\t" + kt + "\t" + mh + "\t B " );
					}
					else if(p >= 70 )
					{
						 System.out.println(ab + "\t" + at + "\t" + am + "\t" + k +"\t" + kh + "\t" + kg + "\t" + kt + "\t" + mh + "\t A " );
					}
				}
				System.out.println(" \n " + any + "\t" + as + "\t is the topper in Duke University ");
				System.out.println(" \n " + jku + "\t" + hy + "\t is the topper in University of California ");
				System.out.println(" \n " + amy + "\t" + py + "\t is the topper in Union College " );
				System.out.println(" \n " + hgt + "\t" + po + "\t is the topper in Boston University ");
				System.out.println(" \n " + mju + "\t" + sd + "\t is the topper in University of Florida ");
				System.out.println(" \n\n " + ay + "\t" + al + "\t is the topper of all university ");
				
				
			}

		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

   private static Object Convert(String i)
    {
	return null;
    }
}