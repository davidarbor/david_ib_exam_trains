public class Runner{
    public static void main(String[] args){
        Train t=new Train(1);
        Wagon w=new Wagon(1);
        Address a=new Address("Allston Way", 1980, "yes");
        Address b=new Address("San Pablo Avenue", 450, "no");
        Parcel p=new Parcel(1);
        w.addParcel(p);
        p.setDestAddress(a);
        p.setOriginAddress(b);
        p.setWeight(100);
        Engine e=new Engine(1);
        t.addWagon(w);
        t.addEngine(e);
        t.getNumberOfWagons();
        System.out.println(t.getWeight());
        System.out.println(p.getDestAddress().getStreetName());
        System.out.println(p.getDestAddress().getBuildingNumber());
        System.out.println(p.getDestAddress().getIsBusinessAddress());
        System.out.println(p.getOriginAddress().getStreetName());
        System.out.println(p.getOriginAddress().getBuildingNumber());
        System.out.println(p.getOriginAddress().getIsBusinessAddress());
    }
}