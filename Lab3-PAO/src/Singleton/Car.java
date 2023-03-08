package Singleton;

//        class Car (name, color, String[] reviews)
//            orice masina noua adaugata o sa aiba 0 reviews
//            1.List all system cars
//            2.add new car in the system
//            3.add new review top the car
//            0.exit aplication
//             all of the above operations will be stored in a singleton service
public class Car
{
    private String Name,Color;
    private String[] reviews;
    public Car()
    {
        Name = "";
        Color = "";
        reviews = new String[0];
    }
    public Car(String name , String color,String[] reviews) {
        Name = name;
        Color = color;
        this.reviews = reviews;
    }

    public String getName() {
        return Name;
    }

    public String getColor() {
        return Color;
    }

    public String[] getReviews() {
        return reviews;
    }
}
