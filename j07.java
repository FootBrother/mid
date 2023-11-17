class Dates {
    String[] weeks = new String[7];
    public Dates(){
        weeks[0] = "Sun";
        weeks[1] = "Mon";
        weeks[2] = "Thu";
        weeks[3] = "Wed";
        weeks[4] = "Tus";
        weeks[5] = "Fri";
        weeks[6] = "Sat";
    }

    public String askDate(int day){
        if(day >= 1 && day <=7){
            return weeks[day % 7];
        }
        return "wrong day";
    }
}

public class j07 {
    public static void main(String[] args) {
        Dates aDates = new Dates();
        for (int i = 1; i <= 7; i++) {
            System.out.println(aDates.askDate(i));
        }
    }
}
