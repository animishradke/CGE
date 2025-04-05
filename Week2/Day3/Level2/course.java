class Course {
String courseName;
int duration; // in months
double fee;
static String instituteName = &quot;ABC Institute&quot;;
Course(String courseName, int duration, double fee) {
this.courseName = courseName;
this.duration = duration;
this.fee = fee;
}
void displayCourseDetails() {
System.out.println(&quot;Institute: &quot; + instituteName);
System.out.println(&quot;Course Name: &quot; + courseName);
System.out.println(&quot;Duration: &quot; + duration + &quot; months&quot;);
System.out.println(&quot;Fee: $&quot; + fee);
}
static void updateInstituteName(String newName) {
instituteName = newName;
}
}