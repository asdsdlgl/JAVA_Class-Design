package Hw5;

public class File extends Document{
	private String pathname;
	public String toString(){
		return "Path: "+pathname+"\n"+text;
	}
	public void setPathname(String temp){
		pathname = temp;
	}
	public String getPathname(){
		return pathname;
	}
}
