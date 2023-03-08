package Singleton;

public class SingletonService {
    private Car[] cars = new Car[0];
    private SingletonService(){}

    private static class SingletonHolder{
        private static final SingletonService INSTANCE = new SingletonService();
    }

    public static SingletonService getInstance(){
        return SingletonHolder.INSTANCE;
    }

    // methods.....
    public void listAllCars()
    {
        for(int i=0; i<cars.length;i++)
            System.out.println(cars[i].getName());
    }
    public void addCar(Car c)
    {
        Car[] newCars= new Car[cars.length+1];
        for(int i=0;i<cars.length;i++)
            newCars[i]=cars[i];
        newCars[newCars.length-1] = c;
        cars =newCars;
    }
    public void addReviewForCar(String carName, String newReview)
    {
        for(int i=0;i<cars.length;i++)
        if(cars[i].getName().equals(carName))
        {
            String[] newReviews = new String[cars[i].getReviews().length+1];
            for (int j=0;j< cars[i].getReviews().length;j++)
                newReviews[j]=cars[i].getReviews()[j];
            newReviews[newReviews.length-1]=newReview;
            cars[i] = new Car(carName,cars[i].getColor(), newReviews);
            return;
        }
        System.out.println("Car: " +carName+" not found!");System.out.println();

    }
    public void showReviewsForCar(String carName)
    {
        for(int i=0;i<cars.length;i++)
            if(cars[i].getName().equals(carName))
            {
                if(cars[i].getReviews().length==0)
                    System.out.println("This cars does not have reviews yet!");
                else
                {
                    System.out.println("Reviews:");
                    for (int j = 0; j < cars[i].getReviews().length; j++)
                        System.out.println("    " + j + ": " + cars[i].getReviews()[j]);
                        System.out.println();
                }
                return;
            }

        System.out.println("Car: " + carName + " not found!");System.out.println();
    }
}