import java.util.Random;
/**
* Because it is a game of thrones edition: The S = Stark, T = Targaryen, L = Lannister,
* G = Greyjoy. The H = to a special card that doesn't have a value. The numbers are equal
* to the numbers they represent. The A is equal to 11 and the other figures are equal to 10.
*/


public class DeckOfCards
{
	private final int NUMBER_OF_CARDS = 56;
	private String[] suit = new String[] {"S", "T", "L", "G"};
	private String[] face = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "H"};
	private int[] value = new int[]{2,3,4,5,6,7,8,9,10,10,10,10,11,0};
	private Card[] deck;
	private int currentCard = 0;

	public DeckOfCards()
	{
		deck = new Card[NUMBER_OF_CARDS];
		createDeck();
		shuffle(deck);
	}//end of the constructor

	private void createDeck()
	{
		for(int i =0; i < deck.length; i++)
		{
			deck[i] = new Card(face[i%14], suit[i/14],value[i%14]);
		}
	}//end of createDeck method


	//shuffle the cards
	public void shuffle(Card[] deck)
	{
		Card orgPosition, newPosition;
		int randomNumber;

		Random rnd = new Random();

		for(int i = 0; i < deck.length; i++)
		{
			orgPosition = deck[i];
			randomNumber = rnd.nextInt(NUMBER_OF_CARDS);
			deck[i] = deck[randomNumber];
			deck[randomNumber] = orgPosition;
		}
	}//end of shuffle method


	//display the deck
	public void displayDeck()
	{
		for(int i =0; i < deck.length; i++)
		{
			System.out.println(i+1 + "\t" + deck[i]);
		}
	}//end of displayDeck method



	public Card deal()
	{
		return deck[currentCard++];
	}//end of the deal method



	public boolean isDeckEmpty()
	{
		boolean answer = false;

		if(currentCard == (NUMBER_OF_CARDS-1) )
		{
			answer = true;
			return answer;
		}
		return answer;
	}

}//end of the class DeckOfCards