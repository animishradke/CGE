import java.util.*;
public class meth37 {
public static int generateOTP() {
return (int)(100000 + Math.random() * 900000);
}
public static int[] generateMultipleOTPs(int count) {
int[] otps = new int[count];

17

for (int i = 0; i &lt; count; i++) {
otps[i] = generateOTP();
}
return otps;
}
public static boolean areOTPsUnique(int[] otps) {
Set&lt;Integer&gt; set = new HashSet&lt;&gt;();
for (int otp : otps)
set.add(otp);
return set.size() == otps.length;
}
public static void main(String[] args) {
int[] otpArray = generateMultipleOTPs(10);
System.out.println(&quot;Generated OTPs:&quot;);
for (int otp : otpArray)
System.out.println(otp);
boolean unique = areOTPsUnique(otpArray);
System.out.println(&quot;\nAre all OTPs unique? &quot; + unique);
}
}