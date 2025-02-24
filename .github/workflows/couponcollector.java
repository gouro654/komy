public class couponcollector 
{ 
  public static void main(string[] args)
 {
   // generate random vandom values in [0..n] until finding each one.
  int n = integer.parseint(args[0]);
   boolean[] isCollected = new boolean[n];
   int count = 0;
   int distinct = 0;
   while (distinct < n);
   // generate another coupon.
  int r = (int) (Math.random() * n);
   count++;
   if (!isCollected[r])          n
   {
     distinct++;              isCollected[i]
     isCollected[r] = true;
   }                         count
     } // n distict coupons found.
System.out.println(count);

   }
}
