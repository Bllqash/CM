
import java.util.Scanner;
public class Reserve implements AllHalls {
    
    protected String date;
    protected String name;
    protected long phoneNum;
    protected int guestsNum;
    protected double totalPrice;
    protected Service service;
    protected conferenceType confType;
    protected Hall confHall;
    Scanner input = new Scanner(System.in);
    
    
    
    public Reserve(String date, String name, long phoneNum, int guestsNum) {
        this.date = date;
        this.name = name;
        this.phoneNum = phoneNum;
        this.guestsNum = guestsNum;;
    }


    
    
    public void chooseServeices(){
        System.out.println(service.toString());
        int choice = input.nextInt();
        switch (choice) {
            case 1: {
                
            }
        }
    }
    
    public double totalPrice(){
        foodPrice(guestsNum)
        return totalPrice;
    }
    
    @Override
    public String toString(){
        
    }
    
    @Override
    public Hall[] searchHalls(Hall h){
        
    }
    
    @Override
    public void ReserveHall(){
        
    }
    
    @Override
    public String DisplayAllHalls(){
        
    }
    
    @Override
    public double price(){
        
    }
    
}
