package Hw5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String mode = input.nextLine();
		String type = input.nextLine();
		if(type.equals("Document")){
			String content = input.nextLine();
			Document document = new Document();
			document.setText(content);
			if(mode.equals("A")){
				System.out.print(document.toString());
			}else if(mode.equals("B")){
				String compare = input.nextLine();
				if(document.toString().indexOf(compare)>=0){
					System.out.print(true);
				}else{
					System.out.print(false);
				}
			}else if(mode.equals("C")){
				String change = input.nextLine();
				String temp = input.nextLine();
				if(change.equals("text")){
					document.setText(temp);
					System.out.print(document.toString());
				}
			}
		}
		if(type.equals("Email")){
			String sender = input.nextLine();
			String recipient = input.nextLine();
			String title = input.nextLine();
			String textbody = input.nextLine();
			Email email = new Email();
			email.setSender(sender);
			email.setRecipient(recipient);
			email.setTile(title);
			email.setText(textbody);
			if(mode.equals("A")){
				System.out.print(email.toString());
			}else if(mode.equals("B")){
				String compare = input.nextLine();
				if(email.toString().indexOf(compare)>=0){
					System.out.print(true);
				}else{
					System.out.print(false);
				}
			}else if(mode.equals("C")){
				String change = input.nextLine();
				String temp = input.nextLine();
				if(change.equals("text")){
					email.setText(temp);
				}else if(change.equals("sender")){
					email.setSender(temp);
				}else if(change.equals("recipient")){
					email.setRecipient(temp);
				}else if(change.equals("title")){
					email.setTile(temp);
				}
				System.out.print(email.toString());
			}
		}
		if(type.equals("File")){
			String path = input.nextLine();
			String content = input.nextLine();
			File file = new File();
			file.setPathname(path);
			file.setText(content);
			if(mode.equals("A")){
				System.out.print(file.toString());
			}else if(mode.equals("B")){
				String compare = input.nextLine();
				if(file.toString().indexOf(compare)>=0){
					System.out.print(true);
				}else{
					System.out.print(false);
				}
			}else if(mode.equals("C")){
				String change = input.nextLine();
				String temp = input.nextLine();
				if(change.equals("text")){
					file.setText(temp);
				}else if(change.equals("pathname")){
					file.setPathname(temp);
				}
				System.out.print(file.toString());
			}
			
		}

	}

}
