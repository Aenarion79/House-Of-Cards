public class Card
{
	private String face;
	private String suit;
	private int value;


	public Card()
	{
		face = null;
		suit = null;
		value = 0;
	}

	public Card(String face, String suit, int value)
	{
		setFace(face);
		setSuit(suit);
		setValue(value);
	}

	//set methods
	public void setFace(String face)
	{
		this.face = face;
	}

	public void setSuit(String suit)
	{
		this.suit = suit;
	}

	public void setValue(int value)
	{
		if(value > 1 && value <= 11)
		{
			this.value = value;
		}
	}

	//get methods
	public String getFace()
	{
		return face;
	}

	public String getSuit()
	{
		return suit;
	}

	public int getValue()
	{
		return value;
	}

	public String toString()
	{
		return " face of the card: " + getFace() + " ,the suit is: "+ getSuit() + " with value: " + getValue();
	}

}//end of the Card class