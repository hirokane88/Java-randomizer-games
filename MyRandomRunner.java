
/**
 * Write a description of class MyRandomRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyRandomRunner
{
    public static void main(){
        MyRandom randObject = new MyRandom(1,100);
        int min= randObject.getTo();
        int max = randObject.getFrom();
        int count = 0;
        for(int i = 0; i <= 10; i++)
        {
            int random = randObject.nextRandom();
            if(max<random)
            {
                max = random;
            }
            if(random<min)
            {
                min = random;
            }
            count = i;
        }
        System.out.println("/" +count + " iterations: Minimum value " + min + ":Maximum value " + max+ "/");
    }  
}

