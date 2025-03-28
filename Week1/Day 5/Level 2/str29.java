import java.util.Scanner;
public class str29 {
public static String getComputerChoice() {
int random = (int)(Math.random() * 3); // 0, 1, or 2
switch (random) {
case 0: return &quot;rock&quot;;
case 1: return &quot;paper&quot;;
case 2: return &quot;scissors&quot;;
}
return &quot;&quot;;
}
// Determine winner between player and computer
public static String findWinner(String player, String computer) {
if (player.equals(computer)) {

return &quot;Draw&quot;;
}
if ((player.equals(&quot;rock&quot;) &amp;&amp; computer.equals(&quot;scissors&quot;)) ||
(player.equals(&quot;scissors&quot;) &amp;&amp; computer.equals(&quot;paper&quot;)) ||
(player.equals(&quot;paper&quot;) &amp;&amp; computer.equals(&quot;rock&quot;))) {
return &quot;Player&quot;;
} else {
return &quot;Computer&quot;;
}
}
// Method to calculate win statistics
public static String[][] calculateStatistics(String[] winners, int
totalGames) {
int playerWins = 0, computerWins = 0, draws = 0;
for (String win : winners) {
if (win.equals(&quot;Player&quot;)) playerWins++;
else if (win.equals(&quot;Computer&quot;)) computerWins++;
else draws++;
}
double playerPercent = (playerWins * 100.0) / totalGames;
double computerPercent = (computerWins * 100.0) / totalGames;
double drawPercent = (draws * 100.0) / totalGames;
String[][] stats = {
{&quot;Player&quot;, String.valueOf(playerWins), String.format(&quot;%.2f%%&quot;,
playerPercent)},
{&quot;Computer&quot;, String.valueOf(computerWins),
String.format(&quot;%.2f%%&quot;, computerPercent)},
{&quot;Draw&quot;, String.valueOf(draws), String.format(&quot;%.2f%%&quot;,
drawPercent)}
};
return stats;
}
// Method to display all results and final stats
public static void displayResults(String[][] results, String[][] stats)
{

21

System.out.printf(&quot;%-10s%-15s%-15s%-10s%n&quot;, &quot;Game&quot;, &quot;Player
Choice&quot;, &quot;Computer Choice&quot;, &quot;Winner&quot;);
System.out.println(&quot;-----------------------------------------------
--------------&quot;);
for (int i = 0; i &lt; results.length; i++) {
System.out.printf(&quot;%-10d%-15s%-15s%-10s%n&quot;, i + 1,
results[i][0], results[i][1], results[i][2]);
}
System.out.println(&quot;\n===== Summary Stats =====&quot;);
System.out.printf(&quot;%-10s%-10s%-15s%n&quot;, &quot;Entity&quot;, &quot;Wins&quot;, &quot;Win %&quot;);
System.out.println(&quot;----------------------------------&quot;);
for (String[] row : stats) {
System.out.printf(&quot;%-10s%-10s%-15s%n&quot;, row[0], row[1], row[2]);
}
}
// Main method
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter number of games to play: &quot;);
int numGames = scanner.nextInt();
scanner.nextLine(); // consume newline
String[][] gameResults = new String[numGames][3]; // player,
computer, winner
String[] winnerRecord = new String[numGames];
for (int i = 0; i &lt; numGames; i++) {
System.out.print(&quot;Game &quot; + (i + 1) + &quot; - Enter your choice
(rock/paper/scissors): &quot;);
String playerChoice = scanner.nextLine().toLowerCase();
// Validate input
while (!(playerChoice.equals(&quot;rock&quot;) ||
playerChoice.equals(&quot;paper&quot;) || playerChoice.equals(&quot;scissors&quot;))) {
System.out.print(&quot;Invalid input. Enter again
(rock/paper/scissors): &quot;);
playerChoice = scanner.nextLine().toLowerCase();
}

22

String computerChoice = getComputerChoice();
String winner = findWinner(playerChoice, computerChoice);
gameResults[i][0] = playerChoice;
gameResults[i][1] = computerChoice;
gameResults[i][2] = winner;
winnerRecord[i] = winner;
}
String[][] stats = calculateStatistics(winnerRecord, numGames);
displayResults(gameResults, stats);
scanner.close();
}
}