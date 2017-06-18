public class CardTester
{
	public static void main(String[] args)
	{

		DeckOfCards a = new DeckOfCards();
		House g = new House("T");

		System.out.println("All the steps are displayed \n When a Right Joker is found, the house's points restart from 0 \n---------------------------------\n");

		g.addCard(a.deal());
		g.addCard(a.deal());
		g.addCard(a.deal());
		g.addCard(a.deal());
		g.addCard(a.deal());
		g.addCard(a.deal());
		g.addCard(a.deal());
		g.addCard(a.deal());

		System.out.println("\nTOTAL REWARD FROM THE HOUSE "+g.getHouseSuit()+" : "+g.getReward());

		//System.out.println("cards stored in the house- "+g.getHouseSuit()+" - :"+g.checkSlots());
		//System.out.println("cards stored in the house- "+b.getHouseSuit()+" - :"+b.checkSlots());

		/*System.out.println(g.getHouseSuit()+"  "+g.getHousePoints());
		a.displayDeck();
		System.out.println(a.deal().toString());
		System.out.println(a.deal().toString());
*/

	}
}