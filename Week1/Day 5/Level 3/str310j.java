import java.util.Scanner;
public class str310 {
public static String[] initializeDeck() {
String[] suits = { &quot;Hearts&quot;, &quot;Diamonds&quot;, &quot;Clubs&quot;, &quot;Spades&quot; };
String[] ranks = { &quot;2&quot;, &quot;3&quot;, &quot;4&quot;, &quot;5&quot;, &quot;6&quot;, &quot;7&quot;, &quot;8&quot;, &quot;9&quot;, &quot;10&quot;,
&quot;Jack&quot;, &quot;Queen&quot;, &quot;King&quot;, &quot;Ace&quot; };
int numOfCards = suits.length * ranks.length;
String[] deck = new String[numOfCards];
int index = 0;
for (String suit : suits) {
for (String rank : ranks) {
deck[index++] = rank + &quot; of &quot; + suit;
}
}
return deck;
}
public static String[] shuffleDeck(String[] deck) {
int n = deck.length;
for (int i = 0; i &lt; n; i++) {
int randomCardNumber = i + (int) (Math.random() * (n - i));
String temp = deck[i];
deck[i] = deck[randomCardNumber];
deck[randomCardNumber] = temp;
}
return deck;
}

22
public static String[][] distributeCards(String[] deck, int numCards,
int numPlayers) {
if (numCards &gt; deck.length || numPlayers * (numCards / numPlayers)
&gt; deck.length) {
return null;
}
int cardsPerPlayer = numCards / numPlayers;
String[][] players = new String[numPlayers][cardsPerPlayer];
int index = 0;
for (int i = 0; i &lt; numPlayers; i++) {
for (int j = 0; j &lt; cardsPerPlayer; j++) {
players[i][j] = deck[index++];
}
}
return players;
}
public static void printPlayers(String[][] players) {
if (players == null) {
System.out.println(&quot;Cannot distribute cards fairly.&quot;);
return;
}
for (int i = 0; i &lt; players.length; i++) {
System.out.println(&quot;Player &quot; + (i + 1) + &quot; has:&quot;);
for (int j = 0; j &lt; players[i].length; j++) {
System.out.println(&quot; &quot; + players[i][j]);
}
System.out.println();
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String[] deck = initializeDeck();
deck = shuffleDeck(deck);
System.out.print(&quot;Enter total number of cards to distribute: &quot;);
int numCards = sc.nextInt();
System.out.print(&quot;Enter number of players: &quot;);
int numPlayers = sc.nextInt();

23
String[][] players = distributeCards(deck, numCards, numPlayers);
printPlayers(players);
sc.close();
}
}