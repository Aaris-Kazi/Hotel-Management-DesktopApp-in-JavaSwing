import java.util.Date;
import java.text.SimpleDateFormat;
class Test{
    public static void main(String[] args){
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateBeforeString = "2014-01-31";
        String dateAfterString = "2014-02-02";
        try {
            Date dateBefore = myFormat.parse(dateBeforeString);
            Date dateAfter = myFormat.parse(dateAfterString);
            long difference = dateAfter.getTime() - dateBefore.getTime();
            float daysBetween = difference / (1000 * 60 * 60 * 24);
            int days = (int) daysBetween;
            System.out.println("Number of Days between dates: "+days);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}