
/**
 * Write a description of class Lottery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lottery
{
    public static void main()
    {
        System.out.println("You have $50,000,000 dollars and decide to spend");
        System.out.println("all your money on powerball loterry tickets.");
        System.out.println("The jackpot is $500,000,000.");
        System.out.println("                                                ");
        System.out.println("Results...");
        System.out.println("                                                ");
        MyRandom numOne = new MyRandom(1,24);
        MyRandom numTwo = new MyRandom(1,23);
        MyRandom numThree = new MyRandom(1,22);
        MyRandom numFour = new MyRandom(1,21);
        MyRandom numFive = new MyRandom(1,20);
        MyRandom powerBall = new MyRandom(1,6); 
        int f = numOne.nextRandom();
        int s = numTwo.nextRandom();
        int t = numThree.nextRandom();
        int fo = numFour.nextRandom();
        int fi = numFive.nextRandom();
        int pow = powerBall.nextRandom();
        int cost = 0;
        int z = 10;
        for(int i =0; i<25000000; i++)
        {
            int yF = numOne.nextRandom();
            int yS = numTwo.nextRandom();
            int yT = numThree.nextRandom();
            int yFo = numFour.nextRandom();
            int yFi = numFive.nextRandom();
            int yPow = powerBall.nextRandom();
            if((f==yF)&&(s==yS)&&(t==yT)&&(fo==yFo)&&(fi==yFi)&&(pow==yPow))
            {
                cost = i*2;
                String c = cost +"";
                int len = c.length();
                String finalCost ="";
                if(len==4)
                {
                    finalCost = c.substring(0,1)+","+c.substring(1,4);
                }
                if(len==5)
                {
                    finalCost = c.substring(0,2)+","+c.substring(2,5);
                }
                if(len==6)
                {
                    finalCost = c.substring(0,3)+","+c.substring(3,6);
                }
                if(len==7)
                {
                    finalCost = c.substring(0,1)+","+c.substring(1,4)+","+c.substring(4,7);
                }
                if(len==8)
                {
                    finalCost = c.substring(0,2)+","+c.substring(2,5)+","+c.substring(5,8);
                }
                if(len==9)
                {
                    finalCost = c.substring(0,3)+","+c.substring(3,6)+","+c.substring(6,9);
                }
                if(len==10)
                {
                    finalCost = c.substring(0,1)+","+c.substring(1,4)+","+c.substring(4,7)+","+c.substring(7,10);
                }
                if(len==11)
                {
                    finalCost = c.substring(0,2)+","+c.substring(2,5)+","+c.substring(5,8)+","+c.substring(8,11);
                }
                if(len==12)
                {
                    finalCost = c.substring(0,3)+","+c.substring(3,6)+","+c.substring(6,9)+","+c.substring(9,12);
                }
                String ii = i +"";
                int lenn = ii.length();
                String spinsFinal = "";
                if(lenn==4)
                {
                    spinsFinal = ii.substring(0,1)+","+ii.substring(1,4);
                }
                if(lenn==5)
                {
                    spinsFinal = ii.substring(0,2)+","+ii.substring(2,5);
                }
                if(lenn==6)
                {
                    spinsFinal = ii.substring(0,3)+","+ii.substring(3,6);
                }
                if(lenn==7)
                {
                    spinsFinal = ii.substring(0,1)+","+ii.substring(1,4)+","+ii.substring(4,7);
                }
                if(lenn==8)
                {
                    spinsFinal = ii.substring(0,2)+","+ii.substring(2,5)+","+ii.substring(5,8);
                }
                if(lenn==9)
                {
                    spinsFinal = ii.substring(0,3)+","+ii.substring(3,6)+","+ii.substring(6,9);
                }
                if(lenn==10)
                {
                    spinsFinal = ii.substring(0,1)+","+ii.substring(1,4)+","+ii.substring(4,7)+","+ii.substring(7,10);
                }
                if(lenn==11)
                {
                    spinsFinal = ii.substring(0,2)+","+ii.substring(2,5)+","+ii.substring(5,8)+","+ii.substring(8,11);
                }
                if(lenn==12)
                {
                    spinsFinal = ii.substring(0,3)+","+ii.substring(3,6)+","+ii.substring(6,9)+","+ii.substring(9,12);
                }
                int profit = 50000000-cost;
                String profitS = profit+"";
                int profitL = profitS.length();
                String profitFinal = "";
                if(profitL==4)
                {
                    profitFinal = profitS.substring(0,1)+","+profitS.substring(1,4);
                }
                if(profitL==5)
                {
                    profitFinal = profitS.substring(0,2)+","+profitS.substring(2,5);
                }
                if(profitL==6)
                {
                    profitFinal = profitS.substring(0,3)+","+profitS.substring(3,6);
                }
                if(profitL==7)
                {
                    profitFinal = profitS.substring(0,1)+","+profitS.substring(1,4)+","+profitS.substring(4,7);
                }
                if(profitL==8)
                {
                    profitFinal = profitS.substring(0,2)+","+profitS.substring(2,5)+","+profitS.substring(5,8);
                }
                if(profitL==9)
                {
                    profitFinal = profitS.substring(0,3)+","+profitS.substring(3,6)+","+profitS.substring(6,9);
                }
                if(profitL==10)
                {
                    profitFinal = profitS.substring(0,1)+","+profitS.substring(1,4)+","+profitS.substring(4,7)+","+profitS.substring(7,10);
                }
                if(profitL==11)
                {
                    profitFinal = profitS.substring(0,2)+","+profitS.substring(2,5)+","+profitS.substring(5,8)+","+profitS.substring(8,11);
                }
                if(profitL==12)
                {
                    profitFinal = profitS.substring(0,3)+","+profitS.substring(3,6)+","+profitS.substring(6,9)+","+profitS.substring(9,12);
                }

                System.out.println("YOU WON THE LOTTERY!"); 
                System.out.println("JACKPOT : |$500,000,000|");//highest single ever is 758,700,000
                System.out.println("Tickets Bought : |" + spinsFinal+"|"); 
                System.out.println("Cost   : |-$"+ finalCost+"|");
                System.out.println("Profit : | $"+ profitFinal+"|");
                System.out.println("--------------------------------------------------");
                i=999999999;
                z=20;
            }
        }
        if(z==10)
        {
            System.out.println("BANKRUPT : -$50,000,000");
            System.out.println("--------------------------------------------------");
        }
    }
}

