public class Main {
    public static void main(String[] args) {
        String city = "Columbus";
        int zip = 43215;
        int[] dailyTemps = {23,54,62,24,10};
        double sum = 0;
        for(int i=0; i<dailyTemps.length; i++){
            sum += dailyTemps[i];
        }
        double avg = sum / dailyTemps.length;
        System.out.println("City : " + city + " Zip Code : " + zip + " Average High Temperature : " + avg);
    }
}