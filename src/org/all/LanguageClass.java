package org.all;
import org.telgu.Telgu;
public class LanguageClass extends Telgu{

	public void allLanguage()
	{
		System.out.println("all languages");
	}
	
	public static void main(String[] args)
	{
		LanguageClass lc=new LanguageClass();
		lc.allLanguage();
		lc.englishlanguage();
		lc.tamilLanguage();
		lc.telguLanguage();
	}
}
