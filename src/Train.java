public class Train{
    private Engine[] mEngines;
    private Wagon[] mWagons;
    private int mEngineCount;
    private int mWagonCount;
    private int mTrainNumber;
    private double mWeight; // Total weight in kilograms

    public Train(int number){
        mTrainNumber=number;
        mEngines=new Engine[6]; // The train can have up to 6 engines
        mEngineCount=0;
        mWagons=new Wagon[100]; // The train can have up to 100 wagons
        mWagonCount=0;
        mWeight=0;
    }
    public void addEngine(Engine newEngine){
        mEngineCount++;
        mEngines[mEngineCount]=newEngine;
    }
    public Engine removeEngine(){
        mEngineCount--;
        return mEngines[mEngineCount];
    }
    public void addWagon(Wagon newWagon){
        mEngineCount++;
        mWagons[mWagonCount]=newWagon;
    }
    public Wagon removeWagon(){
        mWagonCount--;
        return mWagons[mWagonCount];
    }
    public double getWeight(){
        double weightOfEngines=mEngineCount*120000;
        double weightOfWagons=mWagonCount*32000;
        mWeight=weightOfEngines+weightOfWagons;
        return mWeight;
    }
}