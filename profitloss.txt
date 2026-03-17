class profitloss
{
    public static void main(String [] args)
    {
        double cp=129, sp=191;
        double p=sp-cp;
        double pp=(p/cp)*100;
        System.out.printf("The Cost Price is INR "+cp+" and Selling Price is INR "+sp+"\nThe Profit is INR "+p+" and the Profit Percentage is %.2f",pp);
    }
}