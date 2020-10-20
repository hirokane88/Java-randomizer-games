
/**
 * Write a description of class SlotMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SlotMachine
{
    public static void main()
    {
        MyRandom first = new MyRandom(1,13);
        MyRandom second = new MyRandom(1,13);
        MyRandom third = new MyRandom(1,13);
        int f = first.nextRandom();
        int s = second.nextRandom();
        int t = third.nextRandom();
        double jackpot = 100;
        int cost = 2;
        double time = 7;
        int casino = 0;
        for(int i=1; i<100000; i++)
        {
            f = first.nextRandom();
            s = second.nextRandom();
            t = third.nextRandom();
            if((f == s)&&(f == t)&&(s == t)&&(f==7))
            {
                int jackSimple = (int)jackpot;
                String j = jackSimple + "";
                int len =j.length();
                String jackFinal = j;
                if(len==4)
                {
                    jackFinal = j.substring(0,1)+","+j.substring(1,4);
                }
                if(len==5)
                {
                    jackFinal = j.substring(0,2)+","+j.substring(2,5);
                }
                if(len==6)
                {
                    jackFinal = j.substring(0,3)+","+j.substring(3,6);
                }
                if(len==7)
                {
                    jackFinal = j.substring(0,1)+","+j.substring(1,4)+","+j.substring(4,7);
                }
                if(len==8)
                {
                    jackFinal = j.substring(0,2)+","+j.substring(2,5)+","+j.substring(5,8);
                }
                if(len==9)
                {
                    jackFinal = j.substring(0,3)+","+j.substring(3,6)+","+j.substring(6,9);
                }
                if(len==10)
                {
                    jackFinal = j.substring(0,1)+","+j.substring(1,4)+","+j.substring(4,7)+","+j.substring(7,10);
                }
                if(len==11)
                {
                    jackFinal = j.substring(0,2)+","+j.substring(2,5)+","+j.substring(5,8)+","+j.substring(8,11);
                }
                if(len==12)
                {
                    jackFinal = j.substring(0,3)+","+j.substring(3,6)+","+j.substring(6,9)+","+j.substring(9,12);
                }
                double minutesS = time/60;
                int minutes = (int)minutesS;
                String m = minutes +"";
                int lenn = m.length();
                String minutesFinal = m;
                if(lenn==4)
                {
                    minutesFinal = m.substring(0,1)+","+m.substring(1,4);
                }
                if(lenn==5)
                {
                    minutesFinal = m.substring(0,2)+","+m.substring(2,5);
                }
                if(lenn==6)
                {
                    minutesFinal = m.substring(0,3)+","+m.substring(3,6);
                }
                if(lenn==7)
                {
                    minutesFinal = m.substring(0,1)+","+m.substring(1,4)+","+m.substring(4,7);
                }
                if(lenn==8)
                {
                    minutesFinal = m.substring(0,2)+","+m.substring(2,5)+","+m.substring(5,8);
                }
                if(lenn==9)
                {
                    minutesFinal = m.substring(0,3)+","+m.substring(3,6)+","+m.substring(6,9);
                }
                if(lenn==10)
                {
                    minutesFinal = m.substring(0,1)+","+m.substring(1,4)+","+m.substring(4,7)+","+m.substring(7,10);
                }
                if(lenn==11)
                {
                    minutesFinal = m.substring(0,2)+","+m.substring(2,5)+","+m.substring(5,8)+","+m.substring(8,11);
                }
                if(lenn==12)
                {
                    minutesFinal = m.substring(0,3)+","+m.substring(3,6)+","+m.substring(6,9)+","+m.substring(9,12);
                }
                cost = i*2;
                casino = cost-jackSimple;
                String c = casino +"";
                int lennn = c.length();
                String finalCasino =c;
                if(lennn==4)
                {
                    finalCasino = c.substring(0,1)+","+c.substring(1,4);
                }
                if(lennn==5)
                {
                    finalCasino = c.substring(0,2)+","+c.substring(2,5);
                }
                if(lennn==6)
                {
                    finalCasino = c.substring(0,3)+","+c.substring(3,6);
                }
                if(lennn==7)
                {
                    finalCasino = c.substring(0,1)+","+c.substring(1,4)+","+c.substring(4,7);
                }
                if(lennn==8)
                {
                    finalCasino = c.substring(0,2)+","+c.substring(2,5)+","+c.substring(5,8);
                }
                if(lennn==9)
                {
                    finalCasino = c.substring(0,3)+","+c.substring(3,6)+","+c.substring(6,9);
                }
                if(lennn==10)
                {
                    finalCasino = c.substring(0,1)+","+c.substring(1,4)+","+c.substring(4,7)+","+c.substring(7,10);
                }
                if(lennn==11)
                {
                    finalCasino = c.substring(0,2)+","+c.substring(2,5)+","+c.substring(5,8)+","+c.substring(8,11);
                }
                if(lennn==12)
                {
                    finalCasino = c.substring(0,3)+","+c.substring(3,6)+","+c.substring(6,9)+","+c.substring(9,12);
                }
                String ii = i +"";
                int llenn = ii.length();
                String spinsFinal = ii;
                if(llenn==4)
                {
                    spinsFinal = ii.substring(0,1)+","+ii.substring(1,4);
                }
                if(llenn==5)
                {
                    spinsFinal = ii.substring(0,2)+","+ii.substring(2,5);
                }
                if(llenn==6)
                {
                    spinsFinal = ii.substring(0,3)+","+ii.substring(3,6);
                }
                if(llenn==7)
                {
                    spinsFinal = ii.substring(0,1)+","+ii.substring(1,4)+","+ii.substring(4,7);
                }
                if(llenn==8)
                {
                    spinsFinal = ii.substring(0,2)+","+ii.substring(2,5)+","+ii.substring(5,8);
                }
                if(llenn==9)
                {
                    spinsFinal = ii.substring(0,3)+","+ii.substring(3,6)+","+ii.substring(6,9);
                }
                if(llenn==10)
                {
                    spinsFinal = ii.substring(0,1)+","+ii.substring(1,4)+","+ii.substring(4,7)+","+ii.substring(7,10);
                }
                if(llenn==11)
                {
                    spinsFinal = ii.substring(0,2)+","+ii.substring(2,5)+","+ii.substring(5,8)+","+ii.substring(8,11);
                }
                if(llenn==12)
                {
                    spinsFinal = ii.substring(0,3)+","+ii.substring(3,6)+","+ii.substring(6,9)+","+ii.substring(9,12);
                }
                System.out.println("YOU WIN: | " + f + "| " + s + "| " + t + "|");
                System.out.println("JACKPOT $" + jackFinal + ": After "+ spinsFinal + " spins: " + minutesFinal + " minutes: Casino Profit $" + finalCasino);
                i = 100000;
            }
            if(((f+"").length()!=1)&&((s+"").length()!=1)&&((t+"").length()!=1))//all 3
            {
                String ff = f+"";
                String ss = s+"";
                String tt = t+"";
                System.out.println("         |" + ff + "|" + ss + "|" + tt + "|");
            }
            if(((f+"").length()!=1)&&((s+"").length()!=1)&&((t+"").length()==1))//1 & 2
            {
                String ff = f+"";
                String ss = s+"";
                System.out.println("         |" + ff + "|" + ss + "| " + t + "|");
            }
            if(((f+"").length()!=1)&&((s+"").length()==1)&&((t+"").length()!=1))//1 & 3
            {
                String ff = f+"";
                String tt = t+"";
                System.out.println("         |" + ff + "| " + s + "|" + tt + "|");
            }
            if(((f+"").length()==1)&&((s+"").length()!=1)&&((t+"").length()!=1))//2 & 3
            {
                String ss = s+"";
                String tt = t+"";
                System.out.println("         | " + f + "|" + ss + "|" + tt + "|");
            }
            if(((f+"").length()!=1)&&((s+"").length()==1)&&((t+"").length()==1))//1
            {
                String ff = f+"";
                System.out.println("         |" + ff + "| " + s + "| " + t + "|");
            }
            if(((f+"").length()==1)&&((s+"").length()!=1)&&((t+"").length()==1))//2
            {
                String ss = s+"";
                System.out.println("         | " + f + "|" + ss + "| " + t + "|");
            }
            if(((f+"").length()==1)&&((s+"").length()==1)&&((t+"").length()!=1))//3
            {
                String tt = t+"";
                System.out.println("         | " + f + "| " + s + "|" + tt + "|");
            }
            if(((f+"").length()==1)&&((s+"").length()==1)&&((t+"").length()==1)&&(i<100000))                                                                //none
            {
                System.out.println("         | " + f + "| " + s + "| " + t + "|");
            }
            jackpot = jackpot + (jackpot/2000);
            time +=60;
        }
    }
}
