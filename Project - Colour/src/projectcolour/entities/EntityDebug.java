package projectcolour.entities;

/**
 * @author Tom
 */

public class EntityDebug {

	private String label;
	private String value;

	public EntityDebug(String Label, String Value){
		label = Label;
		value = Value;
	}

	public String getLabel(){
		return label;
	}

	public void setLabel(String Label){
		label = Label;
	}

	public String getValue(){
		return value;
	}

	public void setValue(String Value){
		value = Value;
	}

	public String getCombinedMessage(){
		return label + value;
	}
}