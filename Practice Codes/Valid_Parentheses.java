import java.util.Stack;
public class Valid_Parentheses
{
    public boolean isValid(String str)
    {
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray())
        {
            if(ch == '(' || ch == '[' || ch == '{')
            {
                stack.push(ch);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char top = stack.pop();
                if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '['))
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args)
    {
        String s1 = "()";
        String s2 = "({})";
        String s3 = "(})";
        String s4 = "({[]})";
        String s5 = "[{]}()";

        Valid_Parentheses VP = new Valid_Parentheses();
        System.out.println(VP.isValid(s1));
        System.out.println(VP.isValid(s2));
        System.out.println(VP.isValid(s3));
        System.out.println(VP.isValid(s4));
        System.out.println(VP.isValid(s5));
    }
}
