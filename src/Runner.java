public class Runner{
    public static void main(String[] args){
        Train t=new Train(1);
        Wagon w=new Wagon(1);
        Engine e=new Engine(1);
        t.addWagon(w);
        t.addEngine(e);
        System.out.println(t.getWeight());
        t.getNumberOfWagons();
    }
}