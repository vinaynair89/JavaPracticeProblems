package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class RotateArray {
	/*
	static int count_pairs(String numbers, int minimum, int maximum) {
        String[] values=numbers.split(",");
        if(numbers=="")
        	return 0;
        int [] num=new int[values.length];
        int ind=0;
        for(String s:values)
        	try{
        		num[ind]=Integer.parseInt(s);
        		ind++;
        	}
        	catch(Exception e){
        		num[ind]=0;
        		ind++;
        	}
        
        Arrays.sort(num);
        for(int i=0;i<num.length;i++)
        System.out.print(num[i]+" ");
        
        int i=0,j=num.length-1;
        int count=0;
        while(i<=j){
            if((num[i]+num[j])>maximum)
                j--;
            else if((num[i]+num[j])<minimum)
                i++;
            else{
                count++;
                i++;
                j--;
            }
        }
        return count;
        
    }*/
	static List<String> list = new ArrayList<>();
	static void getPalindromes(String s){
	    
	        for(int i = 0; i < s.length(); i++){
				String temp = getPlaindromeFromCenter(s, i, i);
				if(temp.length() > 1){
					list.add(temp);
	            }
	            
	            temp = getPlaindromeFromCenter(s, i, i+1);
	            if(temp.length() > 1){
	            	list.add(temp);
	            };
			}
			
		}
	
		static String getPlaindromeFromCenter(String s, int start, int end){
			while(start >= 0 && end <= s.length()-1 && s.charAt(start) == s.charAt(end)){
				if(start+1 < end){
					String sub = s.substring(start+1, end);
					if(sub.length() > 2){
						list.add(sub);
					}
				}
				start--;
				end++;
			}
			return s.substring(start+1, end);
		}
		
		

	static int count_palindromes(String S) {
	    if(S == null)
				return 0;
	                
	    if(S.length() == 0)
	        return 0;
	    
	    if(S.length() == 1)
	        return 1;
	    
	    getPalindromes(S);
	    return list.size()+S.length();
	}

	
	public static void main(String args[]) throws Exception{
		//afmmp xpsme
		/*String s="spwwz hzcwo";
		int k=1;
		System.out.println(cipher(s,k));*/
		
		String s="";
		
		System.out.println(count_palindromes("abcdedcba"));
		System.out.println(list);
		//System.out.println(count_pairs(numbers,min,max));
		/*String numbers="2000000 30 40 5000 600000 700 80000000";
		int len=7;
		//rotate(numbers,k);
		/*for(int i=0;i<numbers.length;i++){
			System.out.println(numbers[i]);
		}*/
		
		
	}
	
}

/*public static String cipher(String msg, int shift){
String s = "";
int len = msg.length();
for(int x = 0; x < len; x++){
	
	if(msg.charAt(x)!=' '){
    char c = (char)(msg.charAt(x) - 11);
    //System.out.println(c<'z');
    if (c > 'z')
        s += (char)(msg.charAt(x) + (26+11));
    else if (c < 'z')
        s += (char)(msg.charAt(x) - 11);
    	/*else
    	s += (char)(msg.charAt(x) - 11 + 26);
	}
	else
		s+=' ';
   //spwwz hzcwo
}
return s;
}*/


/*
public static String printval(int len,String val){
	String vals[]=val.split(" ");
	long arr[]=new long[len];
	for(int i=0;i<len;i++){
		arr[i] = Long.parseLong(vals[i]);
	}
	
	Arrays.sort(arr);
	int find=0,sind=0;
	
	long min = 0;
	for(int i=1;i<arr.length-1;i++){
		//minDiff = Math.min(minDiff, arr[i]-arr[i-1]);
		long temp = Math.abs(arr[i]-arr[i-1]);
		System.out.println(temp);
		if(min==0){
			min=temp;
		}
		else if(temp<=min){
			min=temp;
			find=i-1;
			sind=i;
			System.out.println(find+" "+sind);
			
		}
	}
	String fin = arr[find]+" "+arr[sind];
	return fin;
}*/
/*
public static void rotate(int nums[],int k){
	
	if(k > nums.length) 
        k=k%nums.length;
 
    int[] result = new int[nums.length];
 
    for(int i=0; i < k; i++){
        result[i] = nums[nums.length-k+i];
    }
 
    int j=0;
    for(int i=k; i<nums.length; i++){
        result[i] = nums[j];
        j++;
    }
 
    System.arraycopy( result, 0, nums, 0, 3 );
}*/

/*
InputStreamReader fin=new InputStreamReader(System.in);
BufferedReader bf=new BufferedReader(fin);
//int n=Integer.parseInt(bf.readLine());
String s=bf.readLine();
StringBuilder sb=new StringBuilder();
int k=1;
char c;
for(int i=0;i<s.length();i++){
    int j=(int)s.charAt(i);
    if((char)j=='-'){
        c=(char)j;
    }else
    {int g=k%26;
     if(j<=90){
         j+=g;
         if(j>90){
             int m=j-90;
             j=64+m;
             c=(char)j;
         }else{
             c=(char)j;
         }
         //captials
     }else{
         //small
         j+=g;
         if(j>122){
             int m=j-122;
             j=96+m;
             c=(char)j;
         }else{
             c=(char)j;
         }
     }
    }
    sb.append(c);
}
System.out.println(sb.toString());
*/

//System.out.println(printval(len,numbers));


/*static public int maxHistogram(int input[]) {
Deque<Integer> stack = new LinkedList<Integer>();
int maxArea = 0;
int area = 0;
int i;
for (i = 0; i < input.length;) {
	if (stack.isEmpty() || input[stack.peekFirst()] <= input[i]) {
		stack.offerFirst(i++);
	} else {
		int top = stack.pollFirst();
		// if stack is empty means everything till i has to be
		// greater or equal to input[top] so get area by
		// input[top] * i;
		if (stack.isEmpty()) {
			area = input[top] * i;
		}
		// if stack is not empty then everythin from i-1 to input.peek()
		// + 1
		// has to be greater or equal to input[top]
		// so area = input[top]*(i - stack.peek() - 1);
		else {
			area = input[top] * (i - stack.peekFirst() - 1);
		}
		if (area > maxArea) {
			maxArea = area;
		}
	}
}
while (!stack.isEmpty()) {
	int top = stack.pollFirst();
	// if stack is empty means everything till i has to be
	// greater or equal to input[top] so get area by
	// input[top] * i;
	if (stack.isEmpty()) {
		area = input[top] * i;
	}
	// if stack is not empty then everything from i-1 to input.peek() +
	// 1
	// has to be greater or equal to input[top]
	// so area = input[top]*(i - stack.peek() - 1);
	else {
		area = input[top] * (i - stack.peekFirst() - 1);
	}
	if (area > maxArea) {
		maxArea = area;
	}
}
return maxArea;
}

static int area(int width, int height, String water) {

int[][] arr = new int[width][height];
for (int[] a : arr)
	Arrays.fill(a, 1);
String[] vals = water.split("\\|");
int[][] plots = new int[vals.length][2];
int pos = 0;
for (String val : vals) {
	String[] xy = val.split(",");
	if (xy[0].trim().matches("-?\\d+(\\.\\d+)?")
			&& Integer.parseInt(xy[0].trim()) < width)
		plots[pos][0] = Integer.parseInt(xy[0].trim());
	if (xy[1].trim().matches("-?\\d+(\\.\\d+)?")
			&& Integer.parseInt(xy[1].trim()) < width)
		plots[pos][1] = Integer.parseInt(xy[1].trim());
	pos++;
}

for (int[] pt : plots) {
	arr[pt[0]][pt[1]] = 0;
}
return maximum(arr);
}

public static int maximum(int input[][]) {
int temp[] = new int[input[0].length];
int maxArea = 0;
int area = 0;
for (int i = 0; i < input.length; i++) {
	for (int j = 0; j < temp.length; j++) {
		if (input[i][j] == 0) {
			temp[j] = 0;
		} else {
			temp[j] += input[i][j];
		}
	}
	area = maxHistogram(temp);
	if (area > maxArea) {
		maxArea = area;
	}
}
return maxArea;
}*/
