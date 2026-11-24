public class SearchingActivity {
    public static void main(String[] args){

        String[] hijab = {"Jersey black", "Pashmina brown", "Chiffon white", "Chiffon offwhite", "Chiffon black", "Instant hijab", "Crinkle offwhite", "Flower-pattern hijab", "Shimmer blue"};
        String search = "Instant hijab";

        for(int i = 0; i < hijab.length; i++) {
            if (hijab[i] == search){
                System.out.print("Amina's hijab is found in index: " + (i));
            }
        }
    }
}
