public class SortingActivity {
    public static void main(String[] args){

        String[] subjects = {"CCC101", "PEDO11", "ISY101", "GEC101"};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday"};

        for(int subject = 0; subject < 5; subject++) {
            for(int i = 0; i < subjects.length; i++){
                if (getSubjectNumber(subjects[i]) == subject) {
                    System.out.println(days[i] + ": " + subjects[i]);
                }
            }
        }
    }
    static int getSubjectNumber(String subject) {
        switch (subject) {
            case "CCC101":
                return 0;
            case "PEDO11":
                return 1;
            case "ISY101":
                return 2;
            case "GEC101":
                return 3;
            case "GEC104":
                return 4;
            default:
                return 5;
        }
    }
}
