package tests;

import java.util.LinkedList;

public class rangesqr {
	
	
	public static void main(String[] args) {
		
		 int noCommands = 6;

         LinkedList stack = new LinkedList();
         for (int i = 0; i < noCommands; ++i)
         {
             String command = "push pop push";
             String split[] = command.split(command, ' ');

             if (split[0] == "push")
             {
                 int number = split[1];
                 stack.AddFirst(number);
             }
             else if (split[0] == "pop" && stack.Count > 0)
             {
                 stack.RemoveFirst();
             }
             else if (split[0] == "inc")
             {
                 var count = Convert.ToInt32(split[1]);
                 var increment = Convert.ToInt32(split[2]);
                 count = Math.Min(stack.Count, count);

                 var node = stack.Last;
                 for (var j = 0; j < count; ++j)
                 {
                     node.Value += increment;
                     node = node.Previous;
                 }
              }

             PrintTop(stack);
         }
		
	}
	
	static void PrintTop(LinkedList<int> stack)
    {
        if (stack.Count == 0)
        {
            System.Console.WriteLine("EMPTY");
        }
        else
        {
            System.Console.WriteLine("{0}", stack.First.Value);
        }
    }
		
	
}
