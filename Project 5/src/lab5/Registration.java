package ;

public class Registration {

   String subject = "";
    private int marks = 0;
    private Instructor instructor = null;
    private String[] report = {"", ""};
    private int gradePoint = 0;


    public Registration(String subject){
        this.subject = subject;
    }

    public Registration(String subject, Instructor instructor){
        this.subject = subject;
        this.instructor = instructor;
    }


    public String[] getGradeReport(){
        String letter;
        String word;

        // Array of a grade report, first spot is letter grade and second is qualitative description
        String[] report = {"", ""};

        // Finding letter grade
        if (marks >= 90 && marks <= 100){
            letter = "A+";
            word = "Exceptional";
            this.gradePoint = 9;
        }

        else if (marks >= 80){
            letter = "A";
            word = "Excellent";
            this.gradePoint = 8;
        }

        else if (marks >= 70){
            letter = "B";
            word = "Good";
            this.gradePoint = 7;
        }

        else if (marks >= 60){
            letter = "C";
            word = "Competent";
            this.gradePoint = 6;
        }

        else if (marks >= 50){
            letter = "D";
            word = "Passing";
            this.gradePoint = 5;
        }

        else{
            letter = "F";
            word = "Failing";
            this.gradePoint = 0;
        }

        report[0] = letter;
        report[1] = word;

        this.report = report;
        return report;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }

    public int getMarks(){
        return this.marks;
    }


    public String getTitle(){
        return this.subject;
    }

    public String getInformation() {
        if (this.instructor == null){
            return this.subject + " has not yet been assigned an instructor";
        }

        String sentence = this.subject + ", taught by " + this.instructor.getName() + ", is completed with raw marks "
                + this.marks + " (" + this.report[0] + " ; " + this.report[1] + ")";
        return sentence;
    }

    public Instructor getInstructor() {
        return this.instructor;
    }

    public void setInstructor(Instructor person) {
        this.instructor = person;
    }

    public int getGradePoint(){
        return this.gradePoint;
    }
}