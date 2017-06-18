import java.util.*;

public class House
{
	private boolean isOpen;
	private String houseSuit;
	private int housePoints;
	private int totalSum = 0;
	private int totalCardsInHouse = 0;
	private int myTotalReward =0;
	final int WIN_NUMBER = 31;
	final int TOTAL_HOUSE_CARDS = 6;
	private List<Card> cardsInHouse;


	public House(String houseSuit)
	{
		isOpen = true;
		cardsInHouse = new ArrayList<Card>();
		setHousePoints(houseSuit);
	}

	//setHousePoints initializes the values of the houses
	public void setHousePoints(String houseSuit)
	{
		switch(houseSuit)
		{
			case "G":
				this.houseSuit = houseSuit;
				housePoints = 10;
				break;
			case "L":
				this.houseSuit = houseSuit;
				housePoints = 20;
				break;
			case "S":
				this.houseSuit = houseSuit;
				housePoints = 30;
				break;
			case "T":
				this.houseSuit = houseSuit;
				housePoints = 40;
				break;
		}
	}//end of setHousePoints method

	//get methods
	public String getHouseSuit()
	{
		return houseSuit;
	}

	public int getHousePoints()
	{
		return housePoints;
	}

	//add card method
	public void addCard(Card card)
	{
		if(isHouseOpen())
		{
			//if the card inserted is a RIGHT Joker, then a reward is added and the house is cleared
			if(isJoker(card))
			{
				setReward(100);
				cardsInHouse.clear();
			}
			else
			{
				cardsInHouse.add(card);
				System.out.println("cards stored in the house- "+this.getHouseSuit()+" - :"+checkSlots()+" ...Total Sum is: "+this.totalSum+"\nCard inserted=> FACE: "+card.getFace()+" SUIT: "+card.getSuit()+"\n");
			}
		}
		else
		{
			System.out.println("The House - "+this.getHouseSuit()+" - is Closed!  ...Total Sum is: "+this.totalSum);


		}
	}

	//check whether the max sum or max cards in the cardList is exceeded
	private boolean isHouseOpen()
	{
		totalSum = checkSum();
		totalCardsInHouse = checkSlots();
		//boolean answer = true;

		if(totalSum > WIN_NUMBER || totalCardsInHouse >= TOTAL_HOUSE_CARDS)
		{
			isOpen = false;
		}
		else if(totalSum == WIN_NUMBER)
		{
			setReward(housePoints);
			cardsInHouse.clear();
		}
		return isOpen;
	}

	//return the total sum of the house
	private int checkSum()
	{
		int sum =0;
		if(cardsInHouse != null)
		{
			for(int i=0; i < cardsInHouse.size(); i++)
			{
				sum += cardsInHouse.get(i).getValue();
			}
		}
		return sum;
	}//end of checkSum method

	//return the total number of card slots available in the house
	private int checkSlots()
	{
		int numberOfCardsInHouse = 0;
		for(int i=0; i < cardsInHouse.size(); i++)
		{
			numberOfCardsInHouse++;
		}
		return numberOfCardsInHouse;
	}

	//Add reward points to the player
	private void setReward(int amount)
	{
		myTotalReward += amount;
	}

	//return the total amount of points collected
	public int getReward()
	{
		return myTotalReward;
	}

	//Check whether the card added is the right/wrong Joker
	private boolean isJoker(Card card)
	{
		if((card.getFace() == "H") && (card.getSuit() == this.getHouseSuit()))
		{
			System.out.println("\nRight Joker Found!: face-> "+card.getFace()+" and suit-> "+card.getSuit());
			return true;
		}
		else if((card.getFace() == "H") && (card.getSuit() != this.getHouseSuit()))
		{
			System.out.println("\nWRONG Joker Found!: face-> "+card.getFace()+" and suit-> "+card.getSuit());

			//Close the house when a Wrong Joker is inserted in the house
			isOpen = false;
			return false;
		}
		else
		{
			return false;
		}
	}//end of isJoker method



}//end of class House
