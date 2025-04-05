class Vehicle {
String ownerName;
String vehicleType;
static double registrationFee = 1500.0;
Vehicle(String ownerName, String vehicleType) {
this.ownerName = ownerName;
this.vehicleType = vehicleType;
}
void displayVehicleDetails() {
System.out.println(&quot;Owner Name: &quot; + ownerName);
System.out.println(&quot;Vehicle Type: &quot; + vehicleType);
System.out.println(&quot;Registration Fee: $&quot; + registrationFee);
}
static void updateRegistrationFee(double newFee) {
registrationFee = newFee;
}
}