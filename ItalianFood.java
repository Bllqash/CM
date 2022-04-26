/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Rawan
 */
public class ItalianFood  extends Food{
        
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
