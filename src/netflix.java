import java.util.ArrayList;

public class netflix
{

    ArrayList<material> list = new ArrayList();
    user credential;
    boolean islogin=false;
    public void gir(user user){
        if (user.password.equals("admin123")&&user.username.equals("admin")){
            islogin=true;
        }
        else {
            System.out.println("yanlış girdiniz");
        }

    }

    public void addmovie(movie movie)
    {
        if (islogin==true){
        list.add(movie);
    }
        else {
            System.out.println("lütfen giriş yapın  ilk");
        }
    }
    public void addbook(book book)
    {
        if (islogin==true){
        list.add(book);
    }
    }
    public void n1()
    {
        int yy=0;
        double y=0;

        for(int i=0;i<list.size();i++){
            if (list.get(i).getavgscore()>y)
            {
                yy=list.get(i).id;
                y=list.get(i).getavgscore();

            }


        }

        if(list.get(yy-1) instanceof movie)
        {
            movie test=(movie)list.get(yy-1);
            test.showDetil();


        }
        else{
            book test=(book)list.get(yy-1);
            test.showDetil();
        }



    }
    public  void n2()
    {
        int yy=0;
        double y=1000000000;
        for (int i=0;i<list.size();i++){
           if (list.get(i) instanceof movie)
           {
               if (list.get(i).getavgscore()<y)
               {
                   yy=list.get(i).id;
                   y=list.get(i).getavgscore();

               }


           }
        }
        if (list.get(yy-1) instanceof movie){
            movie test=(movie)list.get(yy-1);
            test.showDetil();

        }
        else
        {
            book test=(book)list.get(yy-1);
            test.showDetil();

        }


    }
    public void n3(int id)
    {
        int yy=0;
        int y=0;
        for (int i=0;i<list.size();i++){
            if (list.get(i).category.id==id)
            {
                if(list.get(i).price>y)
                {
                    yy=list.get(i).id;
                }


            }

        }
        if (list.get(yy-1) instanceof movie)
        {
            movie test=(movie)list.get(yy-1);
            test.showDetil();


        }
        else
        {
            book test=(book)list.get(yy-1);
            test.showDetil();


        }


    }
    public void n4(int id)
    {
        ArrayList s =new ArrayList();
        for(int i=0;i<list.size();i++){
            if (list.get(i) instanceof movie)
            {
                for (int j=0;j<((movie) list.get(i)).actors.size();j++)
                {
                    if (((movie) list.get(i)).actors.get(j).id==id)
                    {
                        s.add(list.get(i));
                    }

                }


            }

        }

        for(int u=0;u<s.size();u++)
        {
            movie test=(movie)s.get(u);
            test.showDetil();

        }

    }




}
