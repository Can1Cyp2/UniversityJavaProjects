package ;

import java.util.Arrays;

public class OnlineSchool {
    private Participant[] participants = new Participant[0];


    public Participant[] getParticipants(String course) {
        int len = 0;    // Length of the new participants in the course

        // Go through every participant
        for (int x = 0; x < this.participants.length; x++) {

            // Go through every participant's registered courses
            for (int y = 0; y < this.participants[x].getRegistrations().length; y++) {

                // If the given course is equal to the participant's course add 1 to the size of the new participant's length
                if (this.participants[x].getRegistrations()[y].getTitle().equals(course)) {
                    len++;
                }
            }
        }

        // Create a new course participants array
        Participant[] courseParticipants = new Participant[len];

        // Initialize courseParticipants array based on the found courses
        int k = 0;
        for (int i = 0; i < this.participants.length; i++) {
            for (int j = 0; j < this.participants[i].getRegistrations().length; j++) {
                if (participants[i].getRegistrations()[j].getTitle().equals(course)) {
                    courseParticipants[k] = this.participants[i];
                    k++;
                }
            }
        }

        return courseParticipants;
    }




    public void addParticipant(Participant participant) {
        int length = this.participants.length + 1;

        if (length >= 100) return;

        Participant[] newParticipants = new Participant[length];
        for (int x = 0; x < length; x++){
                if (x == length - 1) newParticipants[x] = participant;
                else newParticipants[x] = this.participants[x];
        }

        this.participants = newParticipants;
    }
}
