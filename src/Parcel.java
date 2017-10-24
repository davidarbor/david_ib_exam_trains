public class Parcel{
    private int trackingID;
    private double weight;
    private Address destinationAddress;
    private Address originAddress;

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
    public void setDestAddress(Address newDestAddress){
        destinationAddress=newDestAddress;
    }
    public Address getDestAddress(){
        return destinationAddress;
    }
    public void setOriginAddress(Address newOriginAddress){
        originAddress=newOriginAddress;
    }
    public Address getOriginAddress(){
        return originAddress;
    }
}