package ques_02;
import java.util.Scanner;
public class PersonalFriend extends Person {
	
		public String hobby;
		public String friendshipType;
		public PersonalFriend(String name,String contact, String address,String hobby,String friendshipType) {
			super(name, contact, address);
			this.hobby=hobby;
			this.friendshipType=friendshipType;
		}
		public String DisplayPer() {
			super.DisplayPer();
			return super.DisplayPer()+"\nHobby: "+hobby+"\nFriendship Type: "+friendshipType;	
		}
		public void AddnewPer() {
			super.AddNewPer();
			Scanner s=new Scanner(System.in);
			System.out.println("Enter hobby: ");
			hobby=sc.nextLine();
			System.out.println("Enter Friendship Type: ");
			friendshipType=sc.nextLine();
			}
	}

