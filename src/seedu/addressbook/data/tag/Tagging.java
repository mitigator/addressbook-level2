package seedu.addressbook.data.tag;

import java.util.ArrayList;

import seedu.addressbook.data.person.Person;
/*
 * Tagging object class, to record list of commands for tags used in session
 */

public class Tagging {

	public static final String _ADD = "+"; 
	public static final String _REMOVE = "-";
	
	public static ArrayList<String> tagHistory;
	
	private String command;
	private Person person;
	private Tag tag;
	
	public Tagging ( String command, Person person, Tag tag ){
		
		if ( command.equalsIgnoreCase("add"))
			command = _ADD;
		else
			command = _REMOVE;
		
		this.person = person;
		this.tag = tag;
		
		addToHistory();
		
	}
	
	public static void initializeHistory(){
		
		if(tagHistory == null)
			tagHistory = new ArrayList<String>();
			
	}
	
	
	private void addToHistory(){
		
		initializeHistory();
		tagHistory.add(toString());
	}
	
	public ArrayList<String> getTagHistory(){
		return tagHistory;
	}
	
	public void clearTagHistory(){
		tagHistory.clear();
	}
	
	@Override
	public String toString(){
		
		StringBuilder builder = new StringBuilder();
		builder.append(command)
			   .append(person.getName())
			   .append(tag);
		
		return builder.toString();
	}
}
