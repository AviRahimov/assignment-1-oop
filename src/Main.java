public class Main {
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
//        			usb.undo();
        			}
}