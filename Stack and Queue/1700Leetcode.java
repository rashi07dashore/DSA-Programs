class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n= students.length;
        Stack<Integer> sand = new Stack<>();
        Queue<Integer> stud = new LinkedList<>();
        for(int i=0; i<n; i++)
        {
            stud.add(students[i]); //queue of students
            sand.push(sandwiches[(n-1)-i]);  //stack mai reverse mai push hoga
        }
        int count=0;
        while(!stud.isEmpty())
        {
            int s = stud.poll();
            if(sand.peek()==s)
            {
                count=0;
                sand.pop();
            }
            else
            {
                stud.add(s);
                count++;
            }
            if(count==stud.size())        //looping again and again then break
            break;
        }
        return stud.size();   //students left to eat lunch
        
    }
}