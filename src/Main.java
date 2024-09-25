import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        person person1 = new person(1,"fırat","kalkan");
        person person2 = new person(2,"ahmet","aksoylu");
        person person3 = new person(3,"sevim","kara");
        person person4 = new person(4,"sedat","kar");
        person person5 = new person(5,"osman","oğlu");
        person person6 = new person(6,"kıvanç","tat");


        category category1= new category(1,"z1","korku ");
        category category2= new category(2,"z2","animasyon ");



        movie e1=new movie(1,"fırat",1,1999,299,category1,"korku",null);
        movie e2=new movie(2,"fırat2",5,1999,492,category1,"korku",null);
        movie e3=new movie(3,"fırat3",2,1999,80,category2,"korku",null);



        e1.addactor(person1);
        e2.addactor(person1);



        book b1=new book(4,"sefer",9,2024,30,category2,"animasyon",person3,284);
        book b2=new book(5,"sefer2",8,2024,830,category2,"animasyon",person3,384);
        book b3=new book(6,"sefer3",7,2024,530,category2,"animasyon",person3,184);


        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen user name girin====");
        String s1=scan.nextLine();
        System.out.print("lütfen user sifre  girin====");
        String s2=scan.nextLine();

        user user=new user(1,s1,s2,"fırat","kalkan");

        netflix n = new netflix();
        n.gir(user);
       if (n.islogin){


           n.addmovie(e1);
           n.addmovie(e2);
           n.addmovie(e3);



           n.addbook(b1);
           n.addbook(b2);
           n.addbook(b3);

           System.out.println("1");
           n.n1();
           System.out.println("2");
           n.n2();
           System.out.println("3");
           n.n3(1);
           System.out.println("4");
           n.n4(1);













       }








    }
}