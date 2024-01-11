class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue= new LinkedList<>();
        int n= tickets.length, count=0;
        if(n==1 && k==0)
        return tickets[0];
        for(int i=0; i<n; i++)
        {
            queue.add(tickets[i]);
        }
        boolean flag = true;
        while(flag)
        {
            for(int i=0; i<n && !queue.isEmpty(); i++)
            {
               int temp = queue.poll() -1;
                if(temp ==0 && i==k)
                {
                    flag=false;
                    count++;
                    break;
                }
                queue.add(temp);
                if(temp>=0) count++;
            }
        }
        return count;
    }
}