import java.util.*;
/**
     * A class that similar to StringBuilder class and an undo function that will be presented below
     * @authors Avraham and Avihai
     * @version 01/11/22
     */
    public class UndoableStringBuilder {
        private UndoableStringBuilder s = new UndoableStringBuilder();
        private Stack<String> stk = new Stack<String>();
        /**
         *
         * @param str the string we want to initialize into StringBuilder object
         */
        public UndoableStringBuilder(String str) {
            (this.s).append(str);
        }
        /**
         *
         * @throws NullPointerException if we trying to create null StringBuilder
         */
        public UndoableStringBuilder() throws  NullPointerException {
            throw new NullPointerException("You can't build null string");
        }
        /**
         *
         * @param str the string that we want to append to the current StringBuilder we have
         * @return the new StringBuilder that caused by concatenating the two strings
         */
        public UndoableStringBuilder append(String str) {
            if(str==null)
                throw new NullPointerException("You can't append null string");
            s = ((this.s).append(str));
            stk.push(s.toString());
            return s;
        }
        /**
         *
         * @param offset the index that we start to insert the new string in
         * @param str the string that we insert in index "offset" until the string end
         * @return a new StringBuilder after the string insertion in "offset" statring index
         */
        public UndoableStringBuilder insert(int offset, String str) {
            s = (this.s).insert(offset, str);
            stk.push(s.toString());
            return s;
        }
        /**
         *
         * @param start the index that we start to delete the string from
         * @param end the index(not included) we stop deleting the string(until index end-1)
         * @return a new StringBuilder after deleting the string in index start to (end-1)
         */
        public UndoableStringBuilder delete(int start, int end) {
            s = (this.s).delete(start, end);
            stk.push(s.toString());
            return s;
        }
        /**
         *
         * @param start the index that the StringBuilder strat from
         * @param end the index that the StringBuilder will stop but not contain the end itself, until end-1
         * @param str the string that we replace with into the StringBuilder from the index start to end-1
         * @return the full StringBuilder after the changes that created by swapping the string in the indexes that specified
         */
        public UndoableStringBuilder replace(int start,int end, String str) {
            s = (this.s).replace(start, end, str);
            stk.push(s.toString());
            return s;
        }
        /**
         *
         * @return the current StringBuilder reversed
         */
        public UndoableStringBuilder reverse() {
            s = (this.s).reverse();
            stk.push(s.toString());
            return s;
        }
        /**
         *
         * @throws EmptyStackException if we trying to access to empty stack
         */
        public void undo() throws EmptyStackException {
            System.out.println(stk.toString());
            if(stk.isEmpty()) {
                System.err.println("you are trying to access to empty stack");
                throw new EmptyStackException();
            }
            else {
                stk.pop();
            }
        }
        /**
         * @return the concatenation of the StringBuilder
         */
        public String toString() {
            return (this.s).toString();
        }

        public static void main(String[] args) {
            UndoableStringBuilder usb = new UndoableStringBuilder("");
            //		st = st.replace(3, 5, "eat");
            //		st = st.reverse();
            //		st = st.append("avi");
            //		System.out.println(st);
            //		char [] c = {'a', 'e', 'd', 'r', 'i', 'o', 'y', 't', 'b'};
            //          { 0 ,  1 ,  2 ,  3 ,  4 ,  5 ,  6 ,  7 ,  8 }=9
            //		st = st.delete(0, 6);
            //		System.out.println(st.insert(0, "Asd"));
            System.out.println(usb) ;
            usb.append("to be  or not to be") ;
            System.out.println(usb) ;
            usb.replace(3, 6, "eat") ;
            System.out.println(usb) ;
            usb.replace(17, 20, "eat") ;
            System.out.println(usb) ;
            usb.reverse();
            usb.append(null);
            System.out.println(usb);
            //			System.out.println(usb) ;
            //			System.out.println();
            //			usb.undo();
            //			System.out.println(usb) ;
            //			usb.undo();
            //			System.out.println(usb) ;
            //			usb.undo();
            //			System.out.println(usb) ;
            //			usb.undo();
            //			usb.undo();
            //			usb.undo();

        }
    }
