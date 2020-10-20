
/**
 * Write a description of class DiceGame here.
 *
 * @author (Hirotaka Kumagami)
 * @version (02.23.18)
 */
public class DiceGame
{
    public static void main()
    {
        MyRandom diceOne = new MyRandom(1,6);
        MyRandom diceTwo = new MyRandom(1,6);
        int roll = 1;
        int point = 0;
        int total = diceOne.nextRandom() + diceTwo.nextRandom();
        if(roll == 1)
        {
            if(total == 7 || total == 11)
            {
                System.out.println("Roll " + roll + ": Total " + total);
                System.out.println("YOU WIN");
                System.out.println("--------------------------------------------------");
            }
            if(total == 2 || total == 3 || total == 12)
            {
                System.out.println("Roll " + roll + ": Total " + total);
                System.out.println("YOU LOSE");
                System.out.println("--------------------------------------------------");
            }
            if(total == 1 || total == 4 || total == 5 || total == 6 || total == 8 || total == 9 || total == 10)
            {
                point = total;
                System.out.println("Roll "+ roll+ ": Total "+ total);

                roll = 2;
            }

        }
        if(roll == 2)
        {
            for(int i=2; i<100; i++)
            {
                total = diceOne.nextRandom() + diceTwo.nextRandom();
                if(total == point)
                {
                    System.out.println("Roll " + i + ": Total " + total + ": Point " + point);
                    System.out.println("YOU WIN");
                    System.out.println("--------------------------------------------------");
                    i=101;
                }
                if(total == 7)
                {
                    System.out.println("Roll " + i + ": Total " + total + ": Point " + point);
                    System.out.println("YOU LOSE");
                    System.out.println("--------------------------------------------------");
                    i=101;
                }
                if((total!=point)&&(total!=7))
                {
                    System.out.println("Roll " + i + ": Total " + total + ": Point " + point);
                }
            }
        }   
    }
}
