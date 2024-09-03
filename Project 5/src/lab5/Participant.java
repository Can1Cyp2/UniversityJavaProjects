package ;

import java.util.Objects;

public class Participant {
    private String name;
    private Registration[] registrations = new Registration[0];

    public void addRegistration(Registration registration){
        if (this.registrations.length >= 5) return;

        Registration newRegistrations[] = new Registration[this.registrations.length + 1];

            for (int x = 0; x < newRegistrations.length; x++){

                if (x == newRegistrations.length - 1) newRegistrations[x] = registration;

                else{
                    newRegistrations[x] = this.registrations[x];
                }

            }
            this.registrations = newRegistrations;
    }


    public void addRegistration(String course){
        if (this.registrations.length >= 5) return;

        Registration newRegistrations[] = new Registration[this.registrations.length + 1];

        for (int x = 0; x < newRegistrations.length; x++){

            if (x == newRegistrations.length - 1) newRegistrations[x] = new Registration(course);

            else{
                newRegistrations[x] = this.registrations[x];
            }
        }

        this.registrations = newRegistrations;
    }


    public Participant(String name){
        this.name = name;
    }


    public int marksOf(String course) {
        for (int x = 0; x < this.registrations.length; x++) {
            if (this.registrations[x].subject.equals(course)) {
                return this.registrations[x].getMarks();
            }
        }
        return -1;
    }

    public String getGPAReport() {
        int length = this.registrations.length;

        if (length == 0)
            return "No GPA available yet for " + this.name;

        float totalGrade = 0;   // All grades
        float avg = 0;  // Average
        String gpaReport = this.name + "'s GPA of {";

        for (int x = 0; x < length; x++){
            this.registrations[x].getGradeReport();
            gpaReport += this.registrations[x].getGradePoint() + " (" + this.registrations[x].getGradeReport()[0]
                    + ")";
            if (x == length - 1) gpaReport += "}";
            else gpaReport += ", ";

            totalGrade += this.registrations[x].getGradePoint();
        }
        avg = totalGrade / length;
        gpaReport += ": " + String.format("%.1f", avg);

        return gpaReport;
    }

    public void updateMarks(String course, int mark) {
        for (int x = 0; x < this.registrations.length; x++) {
            if (this.registrations[x].getTitle().equals(course)) {
                this.registrations[x].setMarks(mark);
            }
        }
    }

    public void clearRegistrations() {
        this.registrations = new Registration[0];
    }

    public Registration[] getRegistrations() {
        return this.registrations;
    }
}
