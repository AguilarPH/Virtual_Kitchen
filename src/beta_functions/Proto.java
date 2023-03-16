package beta_functions;

import java.util.*;

public class Proto {
    public static void main(String[] args){
        Proto proto = new Proto();

        proto.testTryCatch();
        proto.testIterator();
    }

    private  void testTryCatch(){
        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        try {

            if (chars.length < 10) {
                throw (new Exception("My custom message"));
            }
            char lastChar = chars[chars.length - 1];
            System.out.println(lastChar);

            String sub = welcome.substring(10);


        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("Array index problem");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index problems");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    protected void testIterator() {
        List<String> list = new ArrayList<>();
        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        Iterator<String> iterator = list.iterator();

        System.out.println("ArrayList iterator");
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
        System.out.println("");

        System.out.println("ArrayList ForEach");
        for (String value : list) {
            System.out.println(value);
        }
        System.out.println("");

        System.out.println("Method reference");
        list.forEach(System.out::println);
        System.out.printf("\n\n");

        Map<String, String> map = new HashMap<>();
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");

        System.out.println("HashMap iterator");
        Set<String> keys = map.keySet();
        Iterator<String> iterator1 = keys.iterator();

        while (iterator1.hasNext()) {
            String key = iterator1.next();
            System.out.println("The capitol of " + key + " is " + map.get(key));
        }
        System.out.println("");

        System.out.println("HashMap ForEach");
        for (String key : keys) {
            System.out.println("The capitol of " + key + " is " + map.get(key));
        }
        System.out.printf("\n");

    }



}
