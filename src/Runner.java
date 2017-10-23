public class Runner{
    public static void main(String[] args){
        Train t=new Train(1);
        Wagon w=new Wagon(1);
        Parcel p=new Parcel(1);
        w.addParcel(p);
        p.setWeight(100);
        Engine e=new Engine(1);
        t.addWagon(w);
        t.addEngine(e);
        t.getNumberOfWagons();
        System.out.println(t.getWeight());
    }
}