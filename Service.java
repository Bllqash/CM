
import java.util.Scanner;

public class Service {

    protected int waitersNum;
    protected boolean screen;
    protected boolean speakers;
    protected int bodyguards;
    protected boolean liveCameras;
    protected boolean valetParking;
    protected Food food;
    Scanner input = new Scanner(System.in);

    public Service(int waitersNum, boolean screen, boolean speakers, int bodyguards, boolean liveCameras, boolean valetParking) {
        this.waitersNum = waitersNum;
        this.screen = screen;
        this.speakers = speakers;
        this.bodyguards = bodyguards;
        this.liveCameras = liveCameras;
        this.valetParking = valetParking;
    }

    public int calculateNumOfWaiters(int guestesNum) {
        return (int) (Math.ceil((guestesNum) / 10));
    }

    public double Price() {

        int priceWaiters = (70 * waitersNum);
        int priceScreen = 500;
        int priceBodyguards = (300 * bodyguards);
        int priceSpeakers = 100;
        int priceLiveCameras = 500;
        int priceValetParking = 1000;

        return priceWaiters + priceScreen + priceBodyguards + priceSpeakers + priceLiveCameras + priceValetParking;
    }

    public void chooseFoodType() {
        System.out.println(food);
        int choice = input.nextInt();
        switch (choice) {
            case 1: {
                food = (ArabicFood) food;
                break;
            }
            case 2: {
                food = (IndianFood) food;
                break;
            }
            case 3: {
                food = (ItalianFood) food;
                break;
            }
            case 4: {
                food = (FrenchFood) food;
                break;
            }
            case 5: {
                food = (ChineseFood) food;
                break;
            }
        }

    }

    @Override
    public String toString() {
        return "1-Screen\n"
                + "2-speakers\n"
                + "3-bodyguards\n"
                + "4-live Cameras\n"
                + "5-valet Parking";
    }

}
