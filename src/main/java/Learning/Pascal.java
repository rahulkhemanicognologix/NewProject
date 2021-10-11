package Learning;
public class Pascal {
    public static void main(String args[])
    {
        int r = 4;

        for(int i=0;i<r;i++)
        {
            int s = 1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(s+ " ");
                s = s * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}