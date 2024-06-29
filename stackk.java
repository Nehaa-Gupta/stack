import java.util.*;
class Stackk{
    public static void pushBottom(int data, Stack<Integer> s){
        //base
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        //kaam
        int n=s.pop();
        pushBottom(data, s);
        s.push(n);

    }
    public static void reverseStr(String s){
        // //base
        // if(i==s.length()-1){
        //     st.push(s.charAt(i));
        //     return;
        // }
        // //kaam
        // st.push(s.charAt(i));
        // reverseStr(s, i+1, st);
        Stack<Character> s1=new Stack<>();
        int i=0;
        StringBuilder str=new StringBuilder("");
        while(i!=s.length()){
             s1.push(s.charAt(i));
             i++;
        }     
        while(!s1.isEmpty()){
            str.append(s1.pop());
        }
        System.out.println(str);

    }
    public static void print(Stack<Integer> s){
        while(s.isEmpty()!=true){
            System.out.println(s.pop());
            //s.pop();
        }
    }
    public static void reverse(Stack<Integer> s){
        //base
        if(s.isEmpty()){
            return;
        }
        //kaam
        int n=s.pop();
        reverse(s);
        pushBottom(n, s);
    }
    public static void nextGreater(int a[]){
        Stack<Integer> s=new Stack<>();
        int n[]=new int[a.length];
        for (int i=a.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=a[i]){
                s.pop();

            }
            if(s.isEmpty()){
                n[i]=-1;
            }
            else{
                n[i]=s.peek();
            }
            s.push(a[i]);
        }
        for(int i=0;i<a.length;i++){
            System.out.print(n[i]+" ");
        }
    }
    public static boolean parantheses(String str){
        Stack<Character> s= new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='[' || ch=='{' || ch=='('){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if(ch==')'&&s.peek()=='(' || ch=='}'&&s.peek()=='{'||ch==']'&&s.peek()=='['){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        //     else{
        //         if(ch==')'){
        //            if(s.peek()!=')'){ return false;}
        //         }
        //         else if(ch=='}'){
        //             if(s.peek()!='}'){ return false;}
        //         }
        //         else if(ch==']'){
        //             if(s.peek()!=']'){ return false;}
        //          }
        //         s.pop(); 
        //     }
         }
        if(s.isEmpty()){
            return true;
        }
        return false;
    }
    public static boolean duplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=']' && ch!='}' && ch!=')'){
                s.push(ch);
            }
            else{
                // if(s.isEmpty()){
                //     return true;
                // }
                if(ch==')'&&s.peek()=='(' || ch=='}'&&s.peek()=='{'||ch==']'&&s.peek()=='['){
                    return true;
                }
                else{
                    while((s.peek()!='[' && s.peek()!='{' && s.peek()!='(')){
                        s.pop();
                    }
                    s.pop();
                }
            }
        }
        // if(!s.isEmpty()){
        //     return true;
        // }
        return false;
    }
    
    public static void main(String args[]){
        //Stack<Integer> s=new Stack<>();
        //Stack<Character> s1=new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        //print(s);
        //  pushBottom(5,s);
        //System.out.println(s);
        //reverseStr("asdfg");
        //System.out.println(s1);
        //reverse(s);
        //System.out.println(s);
        //print(s);
        // int a[]={6,8,0,1,3};
        // nextGreater(a);
        String s="(a+b)";
        System.out.println(duplicate(s));
    }
}