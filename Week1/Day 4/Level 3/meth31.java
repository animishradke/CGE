import java.util.Random;
class meth31{
public static int[] generateHeights(){
Random rand=new Random();
int[] heights =new int[11];
for (int i = 0; i &lt; 11; i++) {
heights[i] = rand.nextInt(101) + 150; // Random number between
150 and 250
}
return heights;
}
public static int sumHeights(int[] heights) {
int sum = 0;
for (int height : heights) {
sum += height;
}
return sum;
}
public static double meanHeight(int[] heights) {
return (double) sumHeights(heights) / heights.length;
}
public static int shortestHeight(int[] heights) {
int min = heights[0];

4

for (int height : heights) {
if (height &lt; min) {
min = height;
}
}
return min;
}
public static int tallestHeight(int[] heights) {
int max = heights[0];
for (int height : heights) {
if (height &gt; max) {
max = height;
}
}
return max;
}
public static void main(String[] args) {
int[] heights = generateHeights();
System.out.print(&quot;Player Heights: &quot;);
for (int height : heights) {
System.out.print(height + &quot; &quot;);
}
System.out.println();
System.out.println(&quot;Total Sum of Heights: &quot; + sumHeights(heights));
System.out.println(&quot;Mean Height: &quot; + meanHeight(heights));
System.out.println(&quot;Shortest Height: &quot; + shortestHeight(heights));
System.out.println(&quot;Tallest Height: &quot; + tallestHeight(heights));
}
}