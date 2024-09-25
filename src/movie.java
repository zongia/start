import java.util.ArrayList;

public class movie extends material{
    static ArrayList<movie> movies=new ArrayList<>();
    ArrayList<person> actors = new ArrayList();
    person director;
    public movie(int id,String name,int scores,int relase_year,int price,category category,String type,person director)
    {
        super(id,name,scores,relase_year,category,price,type);
        this.director=director;


    }
    public void addactor(person actor)
    {
        actors.add(actor);
    }
    public  void  showDetil()
    {
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("price: "+price);
        System.out.println("Score: "+getavgscore());
        System.out.println("Relase_year: "+relase_year);
        System.out.println("Type: "+type);

        for (int i=0;i<actors.size();i++) {
            if(i==actors.size()){
            System.out.println(actors.get(i).fristname+"   "+actors.get(i).lastname);
        }
            else{
                System.out.println(actors.get(i).fristname+"   "+actors.get(i).lastname+"-----");
            }
        }


    }


}
