package lily;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.HashMap;

public class Petals {
    public static <Arraylist> void main(String[] args) {
        System.out.println("hello");
        //example
        int i = 5;
        System.out.println(i * 5);
        int p = 9 % 5;
        System.out.println(p);
        int l = 3;
        l++;
        l--;
        l++;
        ++l;
        System.out.println(l);
        int u = 7;
        i += 2;
        System.out.println(u);
        int a = 4;
        int b = 6;
        System.out.println(a + b);
        // expected
        int y = 4;
        if (y == 5) {
            System.out.println(y);
        } else {
            System.out.println("not equal");
        }
        if (y > 2) {
            System.out.println(y);
        } else {
            System.out.println("less than y");
        }
        if ("hello".equals("hello")) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        if (10 > 8 || 10 < 5 || 10 > 11) {
            System.out.println("one true");
        } else {
            System.out.println("all wrong");
        }
        String aa = "kashifa";
        if (2 < 4) {
            System.out.println(aa);
        } else {
            System.out.println("fail");
        }
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tues");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thurs");
                break;
        }
        int ik = 0;
        do {
            System.out.println(ik);
            ik++;
        }
        while (ik < 0);
        int kk = 1;
        while (kk < 6) {
            System.out.println(kk);
            kk++;
        }
        String name = "kashifa";
        for (int g = name.length() - 1; g >= 0; g--) {
            System.out.println(name.charAt(g));
        }
        String nam = "kashifa";
        for (int gh = nam.length() - 1; gh >= 0; gh--) {
            System.out.println(nam.charAt(gh));
        }
        System.out.println();
        String na = "kashifa";
        for (int gj = na.length() - 1; gj >= 0; gj--)
          {
            System.out.println(na.charAt(gj));
        }
        // for decreasing pyramid star
        for(int li=1; li<5; li++){
          for (int st=4; st>=li;st--)
            {
            System.out.print("*");
        }
        System.out.println();
            for(int lip=1; lip<5; lip++){
                for (int st=4; st>=lip;st--)
                {
                    System.out.print("*"+ "\t" );
                }
                System.out.println();}

           // git init
            //git add README.md
            //git commit -m "first commit"
            //git branch -M main
            //git remote add origin https://github.com/kashifa2/firstProject.git
            //ggit g
        }


}
    }

