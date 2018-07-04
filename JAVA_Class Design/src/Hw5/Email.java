package Hw5;

public class Email extends Document{
	private String sender;
	private String recipient;
	private String title;
	public String toString(){
		String ans = "From: "+getSender()+"\nTo: "+getRecipient()+"\nTitle: "+getTitle()+"\n"+text;
		return ans;
	}
	public void setSender(String temp){
		sender = temp;
	}
	public String getSender(){
		return sender;
	}
	public void setRecipient(String temp){
		recipient = temp;
	}
	public String getRecipient(){
		return recipient;
	}
	public void setTile(String temp){
		title = temp;
	}
	public String getTitle(){
		return title;
	}
}
