
public class ChineseFood extends Food {

    public ChineseFood() {
        mainCourse = new String[]{"Spring roll", "Chinese noodles", "Kung Pao Chicken",
             "Sweet and savory chicken pieces", "Rolled pancakes","Fried rice", "Mongolian meat"
        };
    }

    @Override
    public double foodPrice(int gustesNum) {
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
