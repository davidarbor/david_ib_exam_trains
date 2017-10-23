public class Wagon extends RollingStock{
    private Parcel[] mParcels;
    private int mParcelCount;

    public Wagon(int ID){
        super(ID, 32000); // Empty wagon weighs 32000 kilograms
        mParcels=new Parcel[100];
        mParcelCount=0;
    }

    // Accessor methods
    public int getWagonID(){
        return this.getID();
    }
    public void addParcel(Parcel newParcel){
        mParcelCount++;
        mParcels[mParcelCount]=newParcel;
    }
    public double getWeight(){
        int weightOfParcels=0;
        for(int i=0; i<mParcels.length; i++){
            if(mParcels[i]!=null){
                weightOfParcels+=mParcels[i].getWeight();
            }
        }
        return super.getWeight()+weightOfParcels;
    }
// Other methods
}