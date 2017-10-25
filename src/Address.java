public class Address{
    private String mStreetName;
    private int mBuildingNumber;
    private String mIsBusinessAddress;

    public Address(String streetName, int buildingNumber, String isBusinessAddress){
        mStreetName=streetName;
        mBuildingNumber=buildingNumber;
        mIsBusinessAddress=isBusinessAddress;
    }

    public void setStreetName(String newStreetName){
        mStreetName=newStreetName;
    }
    public String getStreetName(){
        return mStreetName;
    }
    public void setBuildingNumber(int newBuildingNumber){
        mBuildingNumber=newBuildingNumber;
    }
    public int getBuildingNumber(){
        return mBuildingNumber;
    }
    public void setIsBusinessAdd(String newIsBusinessAddress){
        mIsBusinessAddress=newIsBusinessAddress;
    }
    public String getIsBusinessAdd(){
        return mIsBusinessAddress;
    }
}