package runner;

import test.Solution;

public class Test {

    public static void main(String[] args) {
     Solution solution = new Solution();
     Solution.ClassTwo classTwo = solution.new ClassTwo();
        System.out.println(classTwo.getTime());




    }
}
