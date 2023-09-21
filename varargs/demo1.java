package varargs;

/**
 * 
 * Varargs helps in dealing with making use of the function
 * but with adding more parameters to the same function
 * in the future.
 * 
 * Using triple dots in the parameter of the function / method
 * it will store elements in an array.
 * 
 * Then treat it as an array and find out the sum
 * of the elemens we can get from the array.
 */
class Demo {
    public int add(int... n) { // {4,5,6,7,8,9} --> Variable Length Argument.
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        return sum;
    }
}

public class demo1 {
    public static void main(String[] args) {
        Demo d = new Demo();
        int res = d.add(4, 5, 6, 7, 8, 9, 4);
        System.out.print(res);
    }
}
