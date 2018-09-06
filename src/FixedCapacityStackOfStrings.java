/* *****************************************************************************
 *  Name:    Alan Turing
 *  NetID:   aturing
 *  Precept: P00
 *
 *  Partner Name:    Ada Lovelace
 *  Partner NetID:   alovelace
 *  Partner Precept: P00
 *
 *  Description:  Prints 'Hello, World' to the terminal window.
 *                By tradition, this is everyone's first program.
 *                Prof. Brian Kernighan initiated this tradition in 1974.
 *
 **************************************************************************** */

public class FixedCapacityStackOfStrings {
    private String[] a;
    private int N;

    FixedCapacityStackOfStrings(int cap) {
        a = new String[cap];
        N = 0;
    }

    void push(String item) {
        a[N++] = item;
    }

    String pop() {
        return a[--N];
    }

    boolean isEmpty() {
        return N == 0;
    }

    int size() {
        return N;
    }

    public static void main(String[] args) {
        FixedCapacityStackOfStrings test = new FixedCapacityStackOfStrings(100);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                test.push(item);
            }
            else if (!test.isEmpty()) {
                StdOut.print(test.pop() + " ");
            }
        }
        StdOut.println("(" + test.size() + " left on stack)");
    }
}
