

public interface AllHalls {

    Hall halls[] = {new Hall("Moon", 20, "Jeddah", "King Abdulaziz",20 , 2, 13000, 4, 20, 100, 7, 4, 8, true ),
                    new Hall("Mary", 30, "Riyadh", "more", 10, 0, 24000, 7, 30, 120, 5, 9 , 9, true)};

    public Hall[] searchHalls(Hall h);

    public void ReserveHall();

    public String DisplayAllHalls();

    public double price();

}
