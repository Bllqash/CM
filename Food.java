
public abstract class Food {
 String[] mainCourse;
 String[] dessertCourse;
 String[] appetizersCourse;
 String[] order;
 
    public abstract void addcourse();
    
    public abstract double foodPrice(int gustesNum);
    
 @Override
    public String toString(){
        return "Choose Food type\n" + 
                "1-Arabic\n" +
                "2-Indian\n" + 
                "3-Italian\n" + 
                "4-French\n" +
                "5-Chinese";
    }
    
}
