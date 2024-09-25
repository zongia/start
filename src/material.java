import java.lang.reflect.Array;
import java.util.ArrayList;

public  abstract class  material {
    public int  id;
    public String name;
    public ArrayList scores=new ArrayList();
    public int relase_year;
    category category;
    public int price;
    public  String type;
    public material(int id,String name,int scores,int relase_year,category category,int price,String type)
    {
        this.id=id;
        this.name=name;
        this.scores.add(scores);
        this.relase_year=relase_year;
        this.category=category;
        this.price=price;
        this.type=type;


    }
    public  void addscore(int score)
    {
        scores.add(score);

    }
    public double getavgscore()
    {
        int avgscore=0;
        for (int i=0;i<scores.size();i++)
        {
            avgscore+=(int)scores.get(i);

        }
        avgscore=avgscore/scores.size();
        return avgscore;

    }

}
