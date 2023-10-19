class Program {

    private static String select(int index, String first, String second) {
        if((index % 2) == 1)
            return first;
        return second;
    }

    private static double select(int index, double first, double second) {
        if((index % 2) == 1)
            return first;
        return second;
    }

    public static void main(String[] args) {
        if(args.length > 0){
            int s = Integer.parseInt(args[0]);
            String ss = select(s, "Monday", "Tuesday");
            System.out.printf("Selected String = %s%n", ss);
            double sd = select(s, 45.6, 32.1);
            System.out.printf("Selected double = %s%n", sd);
            //double ssd = select(s, 19.2, "June");
        }
    }
}