import java.util.*;
import java.io.*;
import java.beans.*; 

public class HighScore
{
    public void addHighScore(String name, int min, int sec,int level)
    {
        try{
               String outData="PlayerName: "+name+" Total Time for Levels:"+min+":"+sec+ "(Minutes:Seconds)"+ "Level Reached:*" + level;
               PrintWriter out = new PrintWriter(new FileOutputStream("mazegamesource\\scores.txt",true));
               out.println("");
               out.println(outData);
               out.close();
               System.out.println("hola");
    }//prints the highscore data to scores.txt
        catch(Exception ex){
            System.out.println(ex);
       }//end catch
	    
    }//end addHighScore   
}//end class

