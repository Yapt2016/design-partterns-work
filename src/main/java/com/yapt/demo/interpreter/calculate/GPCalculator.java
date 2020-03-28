package com.yapt.demo.interpreter.calculate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class GPCalculator {
    private Stack<IArithmeticInterpreter> stack = new Stack<IArithmeticInterpreter>();

    public GPCalculator(String expression) {
        this.parse(expression);
    }

    private void parse(String expression) {
        List<String> elements = process(expression);
        IArithmeticInterpreter leftExpr, rightExpr;

        for (int i = 0; i < elements.size() ; i++) {
            String operator = elements.get(i);
            if (OperatorUtil.isOperator(operator)){
                leftExpr = this.stack.pop();
                rightExpr = this.stack.pop();
                System.out.println("出栈: " + leftExpr.interpret() + " 和 " + rightExpr.interpret());
                this.stack.push(OperatorUtil.getInterpreter(leftExpr, rightExpr,operator));
                System.out.println("应用运算符: " + operator);
            } else{
                NumInterpreter numInterpreter = new NumInterpreter(Integer.valueOf(elements.get(i)));
                this.stack.push(numInterpreter);
                System.out.println("入栈: " + numInterpreter.interpret());
            }
        }
    }


    /**
     * 将中缀表达式转成后缀表达式对应的list
     * @param str
     * @return
     */
    public static List<String> process(String str) {
        String[] array = str.split(" ");
        // 符号栈
        Stack<String> stack = new Stack<String>();
        //存储中间结果的list
        List<String> list = new ArrayList<String>();

        //遍历 array
        for(String item : array) {
            System.out.println("输入的字符:"+item);
            //如果是一个数字，就加入到list
            if(item.matches("\\d+")) {
                list.add(item);
            } else if (item.equals("(")) {
                stack.push(item);
            } else if (item.equals(")")) {
                // 如果是右括号，则依次弹出stack栈顶的运算符，并压入 list,直到遇到左括号为止，此时将这一对括号丢弃
                while(!stack.peek().equals("(")) {
                    list.add(stack.pop());
                }
                // 将左括号 弹出，消除小括号
                stack.pop();
            } else {
                // 当 item 的优先级小于或等于栈顶运算符，将stack栈顶的运算符弹出并压入list中
                while(stack.size() != 0 && OperatorUtil.getValue(stack.peek()) >= OperatorUtil.getValue(item)) {
                    list.add(stack.pop());
                }
                //还需要将 item 压入 栈中
                stack.push(item);
            }
            System.out.println("符号栈结果:"+stack);
            System.out.println("后缀式结果:"+list);
            System.out.println("***********************************************");
        }
        //将stack中剩余的运算符依次弹出加入list
        while(stack.size()!=0) {
            list.add(stack.pop());
        }
        return list;
    }


    public int calculate() {
        return this.stack.pop().interpret();
    }
}