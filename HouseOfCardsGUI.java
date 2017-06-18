import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class HouseOfCardsGUI extends JFrame
{
	private JPanel contentPane;
	private JPanel mainPanel;
	private JPanel buttonPanel;
	private JMenuBar menuBar;
	private JMenu play,hallOfFame,rules;

	//buttons to test each house when you press to put the car
	private JButton firstHouseBtn;
	private JButton secondHouseBtn;
	private JButton thirdHouseBtn;
	private JButton forthHouseBtn;


	//the labels for the sum of the houses
	private JLabel firstHouseSumlb;
	private JLabel secondHouseSumlb;
	private JLabel thirdHouseSumlb;
	private JLabel forthHouseSumlb;


	private JLabel imageLabel;
	private JLabel deckLabel;
	private ImageIcon image1;
	private ImageIcon deckImage;

	//constructor
	public HouseOfCardsGUI()
	{
		contentPane = new JPanel(new GridLayout(2,2));
		contentPane = (JPanel)getContentPane();

		contentPane.setPreferredSize(new Dimension(1100,550));
		mainPanel = new JPanel();

		firstHouseBtn = new JButton("Targaryen House");
		mainPanel.add(firstHouseBtn);
		secondHouseBtn = new JButton("Stark House");
		mainPanel.add(secondHouseBtn);
		thirdHouseBtn = new JButton("Lannister House");
		mainPanel.add(thirdHouseBtn);
		forthHouseBtn = new JButton("Greyjoy House");
		mainPanel.add(forthHouseBtn);

		contentPane.add(mainPanel, BorderLayout.SOUTH);

		createMenu();

		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setTitle("House of Cards");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//end of constructor

	public void createMenu()
	{
		menuBar = new JMenuBar();

		play = new JMenu();
		play.setToolTipText("Start Playing");
		Image imgPlay = new ImageIcon(this.getClass().getResource("images/game_images/play1.png")).getImage();
		play.setIcon(new ImageIcon(imgPlay));

		hallOfFame = new JMenu();
		hallOfFame.setToolTipText("See the top scores");
		Image imgTrophy = new ImageIcon(this.getClass().getResource("images/game_images/fame1.png")).getImage();
		hallOfFame.setIcon(new ImageIcon(imgTrophy));

		rules = new JMenu();
		rules.setToolTipText("Rules of the game");
		Image imgRules = new ImageIcon(this.getClass().getResource("images/game_images/rules1.png")).getImage();
		rules.setIcon(new ImageIcon(imgRules));


		//put an image in the frame
		image1 = new ImageIcon(getClass().getResource("images/game_images/main.jpg"));
		imageLabel = new JLabel(image1);
		add(imageLabel);

		/*
		//put another image
		deckImage = new ImageIcon(getClass().getResource("images/cards/deck.png"));
		deckLabel = new JLabel(deckImage);
		add(deckLabel);
		*/

		/*
		//add deck image
		deckPanel = new JPanel();
		deckPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		*/

		menuBar.add(play);
		menuBar.add(hallOfFame);
		menuBar.add(rules);

		this.setJMenuBar(menuBar);
	}//end of createMenu method

}//end of class