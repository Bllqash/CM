
public class IndianFood  extends Food{
    
    public IndianFood() {
        mainCourse = new String[] {"Chicken 65","Biryani", "chicken butter","Reshmi kabab"};
        dessertCourse = new String[] { "Gulaab jamman"};
        appetizersCourse = new String[] {"Butter nan"};
    }
   
    public double foodPrice(int gustesNum){
        return 1;
    }
 public void DisplayCourse() {
        for (int i = 0; i < mainCourse.length; i++) {
            System.out.println(mainCourse[i]);
        }
        for (int i = 0; i < dessertCourse.length; i++) {
            System.out.println(dessertCourse[i]);
        }
        for (int i = 0; i < appetizersCourse.length; i++) {
            System.out.println(appetizersCourse[i]);
        }
    }

    @Override
    public void addcourse() {
    }
}
