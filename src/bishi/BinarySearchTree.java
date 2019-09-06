package bishi;

import java.util.Scanner;
import java.util.Stack;

public class BinarySearchTree {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
        小米笔试
     * 给定格式二叉树，输出中序遍历
     * input :1(2(3,4(,5)),6(7,))
     * output:3245176
    ******************************开始写代码******************************/
    //1(2(3,4(,5)),6(7,))
    static String solution(String input) {
        Stack<String> stack = new Stack<>();
        char[] array = input.toCharArray();
        String ret = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '(' || array[i] == ')') {
                continue;
            } else if (array[i] == ',') {
                if (!stack.isEmpty())
                    ret = ret + stack.pop();
                if (!stack.isEmpty() && array[i - 1] != '(')
                    ret = ret + stack.pop();
            }
            else {
                stack.push(String.valueOf(array[i]));
            }
        }

        while (!stack.isEmpty())
            ret = ret + stack.pop();
        return ret;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _input;
        try {
            _input = in.nextLine();
        } catch (Exception e) {
            _input = null;
        }

        res = solution(_input);
        System.out.println(res);
    }
}

