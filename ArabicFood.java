
public class ArabicFood extends Food {

    public ArabicFood() {
        mainCourse = new String[]{"Meat Kebab", "Chicken kebab", "Kafta with Yougert", "Shawarma"};
        dessertCourse = new String[]{"Baklawa","Kounafa", "Mahalabia" ,"Umm Ali"};
        appetizersCourse = new String[]{"Hummus","Mutabal","Kebbah","Fattouch","Tabouleh","Rocca salad"};
    }

    @Override
    public double foodPrice(int gustesNum) {
        return gustesNum * 60;
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
