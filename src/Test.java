public class Test {

    public static void main(String[] args) {
        GenericArrayList<Integer> testList = new GenericArrayList<>();

        testList.add(4);
        testList.add(88);
        testList.add(99);
        testList.add(120);
        testList.add(1600);

        System.out.println("Size: " + testList.size());
        testList.printItems();
        System.out.println("Get 0.: " + testList.get(0));
        System.out.println("Get 5.: " + testList.get(5));

        testList.add(8800);
        System.out.println("Size02.: " + testList.size());
        testList.printItems();

        System.out.println(testList.contains(88));
        System.out.println(testList.contains(8888));

        testList.remove(2);
        testList.printItems();
        //testList.remove(-12);

    }

}
