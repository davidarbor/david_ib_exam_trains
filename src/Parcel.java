public class Parcel{
    private int trackingID;
    private double weight;
    public Address destinationAddress;
    public Address originAddress;

    public Parcel(int ID){
        trackingID=ID;
        weight=0;
    }
    public void setWeight(double newWeight){
        weight=newWeight;
    }
    public double getWeight(){
        return weight;
    }
}