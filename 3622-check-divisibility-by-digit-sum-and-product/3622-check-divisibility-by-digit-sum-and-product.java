class Solution {
    public boolean checkDivisibility(int n) {
        return solve(n);
    }
    public boolean solve(int n)
    {
        int temp = n;
        int sum = 0;
        int prod = 1;
        while(n!=0)
        {
            int ld = n%10;
            sum=sum+ld;
            prod = prod *ld;
            n=n/10;
        }
        
        if((temp) % (sum+prod) == 0)
        {
            return true;
        }
        return false;
    }
}