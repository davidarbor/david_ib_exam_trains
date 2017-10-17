public class Address{
    public String mStreetName;
    public int mBuildingNumber;
    public String mIsBusinessAddress; //it would be something like (streetName, buildingNumber, "yes")

    public Address(String streetName, int buildingNumber, String isBusinessAddress){
        mStreetName=streetName;
        mBuildingNumber=buildingNumber;
        mIsBusinessAddress=isBusinessAddress;
    }
}
