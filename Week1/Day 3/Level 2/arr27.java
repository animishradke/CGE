import java.util.Scanner;

class arr27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of persons:");
		int num=scanner.nextInt();
		if(num<=0){
		System.out.println("Invalid input:");
		return;
		}
		
	double[][] personData = new double[num][3];
    String[] weightStatus = new String[num];
		
		for(int i=0;i<num;i++){
		System.out.println("Enter the weight(kg) for person"+(i+1)+":");
		personData[i][0]=scanner.nextDouble();
		
		
		System.out.println("Enter the height(kg) of person"+(i+1)+":");
		personData[i][1]=scanner.nextDouble();
		
		
		personData[i][2]=personData[i][0]/(personData[i][1]*personData[i][1]);
		
		if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
		}
		System.out.println("\nBMI results:");
		System.out.println("-----");
		System.out.println("%-10s %-10s %-10s %-15s\n","weight(kg)","height(m)","BMI","Status");
		System.out.println("----");
		
		for (int i = 0; i < num; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
		
		
		
		  scanner.close();
    }
}