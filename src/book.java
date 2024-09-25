public class book extends material {
    public person writer;
    public int numberofpages;
    public book(int id,String name,int scores,int relase_year,int price,category category,String type,person writer,int numberofpages)
    {
        super(id,name,scores,relase_year,category,price,type);
        this.writer=writer;
        this.numberofpages=numberofpages;

    }
    public  void  showDetil()
    {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);

        System.out.println("Score: "+getavgscore());
        System.out.println("Relase_year: "+relase_year);
        System.out.println("Type: "+type);
        System.out.print("Writer: "+writer.fristname+"   ");
        System.out.println(writer.lastname);
        System.out.println("Number of pages: "+numberofpages);



    }

}
